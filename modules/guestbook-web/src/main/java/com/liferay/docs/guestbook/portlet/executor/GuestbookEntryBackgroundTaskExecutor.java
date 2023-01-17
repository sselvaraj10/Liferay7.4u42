package com.liferay.docs.guestbook.portlet.executor;

import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.docs.guestbook.model.Entry;
import com.liferay.docs.guestbook.model.Guestbook;
import com.liferay.docs.guestbook.service.EntryLocalServiceUtil;
import com.liferay.docs.guestbook.service.GuestbookLocalServiceUtil;
import com.liferay.petra.string.CharPool;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.backgroundtask.*;
import com.liferay.portal.kernel.backgroundtask.display.BackgroundTaskDisplay;
import com.liferay.portal.kernel.backgroundtask.display.BackgroundTaskDisplayFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.util.*;
import org.apache.commons.lang.SerializationUtils;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.*;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Component(
        immediate = true,
        property = {"background.task.executor.class.name=com.liferay.docs.guestbook.portlet.executor.GuestbookEntryBackgroundTaskExecutor"}, // Without this property osgi will not register this as background executor/handler
        service = BackgroundTaskExecutor.class
)
public class GuestbookEntryBackgroundTaskExecutor extends BaseBackgroundTaskExecutor {
    public static final Log LOGGER = LogFactoryUtil
            .getLog(GuestbookEntryBackgroundTaskExecutor.class);

    @Reference
    CounterLocalService counterLocalService;

    @Override
    public BackgroundTaskResult execute(BackgroundTask backgroundTask)
            throws Exception {

        Map<String, Serializable> data = backgroundTask.getTaskContextMap();
        List<Guestbook> guestbookList = GuestbookLocalServiceUtil.getGuestbooks(backgroundTask.getGroupId());
      //  String[] columnNames = { "UserId","GroupId", "GuestbookId","Name","Created Date"};
      //  String[] columnNames = new String[data.size()];

        String [] columnNames = (String[]) data.get("data");
        for(String s : columnNames) {
            System.out.println("Byests : " + s);
        }
//        String st = new String(repr);
//        System.out.println("Bytes data: :  "+st);


//        String s = new String((String) data.get("data"));
//        System.out.println("FSgfsgfags:  "+s);
//        for(Map.Entry<String, Serializable> m : data.entrySet())
//        {
//            System.out.println(m.getKey()+" :key   val: "+m.getValue());
//        }
//        for (int i = 0; i < columnNames.length; i++) {
//            columnNames[i] = (String) data.get(i);
//            System.out.println("col name :"+columnNames[i]);
//        }
        final String COMMA = ",";


        StringBundler sb = new StringBundler();

        for (String columnName : columnNames) {
           if(columnName!=null) {
               sb.append(getCSVFormattedValue(columnName));

               sb.append(COMMA);
           }

        }
        sb.setIndex(sb.index() - 1);
        sb.append(CharPool.NEW_LINE);
        for(Guestbook guestbook : guestbookList)
        {
            if(Arrays.stream(columnNames).anyMatch("UserId"::equals)) {
                sb.append(getCSVFormattedValue(String.valueOf(guestbook.getUserId())));
                sb.append(COMMA);
                System.out.println("userid");
            }
            if(Arrays.stream(columnNames).anyMatch("GroupId"::equals)) {
                sb.append(getCSVFormattedValue(String.valueOf(guestbook.getGroupId())));
                sb.append(COMMA);
                System.out.println("GroupId");
            }
            if(Arrays.stream(columnNames).anyMatch("GuestbookId"::equals)) {
                sb.append(getCSVFormattedValue(String.valueOf(guestbook.getGuestbookId())));
                sb.append(COMMA);
                System.out.println("GuestbookId");
            }
            if(Arrays.stream(columnNames).anyMatch("Name"::equals)) {
                sb.append(getCSVFormattedValue(guestbook.getName()));
                sb.append(COMMA);
                System.out.println("Name");
            }
            if(Arrays.stream(columnNames).anyMatch("UserName"::equals)) {
                sb.append(getCSVFormattedValue(String.valueOf(guestbook.getUserName())));
                sb.append(COMMA);
                System.out.println("UserName");
            }
            if(Arrays.stream(columnNames).anyMatch("Created Date"::equals)) {
                sb.append(getCSVFormattedValue(String.valueOf(guestbook.getCreateDate())));
                sb.append(COMMA);
                System.out.println("Created Date");
            }


            sb.setIndex(sb.index() - 1);

            sb.append(CharPool.NEW_LINE);
        }



        byte[] bytes = sb.toString().getBytes();

        StringBundler sb2 = new StringBundler(4);

        sb2.append(StringUtil.replace("GuestbookData", CharPool.SPACE, CharPool.UNDERLINE));
        sb2.append(StringPool.DASH);/*  www.  j  a v  a2s  . co  m*/
        sb2.append(Time.getTimestamp());
        sb2.append(".csv");

        File file =  FileUtil.createTempFile();
        FileUtil.write(file,bytes);

        BackgroundTaskManagerUtil.addBackgroundTaskAttachment(backgroundTask.getUserId(), backgroundTask.getBackgroundTaskId(), sb2.toString(), file);

        BackgroundTaskResult backgroundTaskResult = new BackgroundTaskResult(
                BackgroundTaskConstants.STATUS_SUCCESSFUL);
        backgroundTaskResult.setStatusMessage("Export Successfully");


        GuestbookEntryMessageSenderUtil guestbookMessageSenderUtil = new GuestbookEntryMessageSenderUtil();
        guestbookMessageSenderUtil.sendNotification(BackgroundTaskConstants.STATUS_SUCCESSFUL);
        return BackgroundTaskResult.SUCCESS;
    }
    protected String getCSVFormattedValue(String value) {
        StringBundler sb = new StringBundler(3);
        sb.append(CharPool.QUOTE);
        sb.append(StringUtil.replace(value, CharPool.QUOTE,
                StringPool.DOUBLE_QUOTE));
        sb.append(CharPool.QUOTE);
        return sb.toString();
    }

    @Override
    public boolean isSerial() {
        return true;
    }

    @Override
    public BackgroundTaskDisplay getBackgroundTaskDisplay(BackgroundTask backgroundTask) {
        return BackgroundTaskDisplayFactoryUtil.getBackgroundTaskDisplay(backgroundTask);
    }

    @Override
    public BackgroundTaskExecutor clone() {
        return this;
    }
}
