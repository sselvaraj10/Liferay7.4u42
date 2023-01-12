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
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.*;
import java.io.File;
import java.util.List;

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

        List<Guestbook> guestbookList = GuestbookLocalServiceUtil.getGuestbooks(backgroundTask.getGroupId());
        String[] columnNames = { "UserId","GroupId", "GuestbookId","Name","Created Date"};

        final String COMMA = ",";


        StringBundler sb = new StringBundler();

        for (String columnName : columnNames) {

            sb.append(getCSVFormattedValue(columnName));

            sb.append(COMMA);

        }
        sb.setIndex(sb.index() - 1);
        sb.append(CharPool.NEW_LINE);
        for(Guestbook guestbook : guestbookList)
        {
            sb.append(getCSVFormattedValue(String.valueOf(guestbook.getUserId())));
            sb.append(COMMA);
            sb.append(getCSVFormattedValue(String.valueOf(guestbook.getGroupId())));
            sb.append(COMMA);
            sb.append(getCSVFormattedValue(String.valueOf(guestbook.getGuestbookId())));
            sb.append(COMMA);
            sb.append(getCSVFormattedValue(guestbook.getName()));
            sb.append(COMMA);
            sb.append(getCSVFormattedValue(String.valueOf(guestbook.getCreateDate())));
            sb.append(COMMA);

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
