package com.liferay.docs.guestbook.portlet.executor;


import com.liferay.docs.guestbook.portlet.constants.GuestbookPortletKeys;
import com.liferay.petra.portlet.url.builder.PortletURLBuilder;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.background.task.model.BackgroundTask;
import com.liferay.portal.background.task.service.BackgroundTaskLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.UserNotificationEvent;
import com.liferay.portal.kernel.notifications.BaseUserNotificationHandler;
import com.liferay.portal.kernel.notifications.UserNotificationHandler;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringUtil;
import org.osgi.service.component.annotations.Component;

import javax.portlet.PortletRequest;
import java.util.Locale;

@Component(
        immediate = true,
        property = {"javax.portlet.name=" + GuestbookPortletKeys.GUESTBOOK_ADMIN},
        service = UserNotificationHandler.class
)
public class ExportImportUserNotificationHandler extends BaseUserNotificationHandler {

    public ExportImportUserNotificationHandler() {
        setOpenDialog(true);
        setPortletId(GuestbookPortletKeys.GUESTBOOK_ADMIN);
    }

    @Override
    protected String getBody(UserNotificationEvent userNotificationEvent, ServiceContext serviceContext) throws Exception {



        JSONObject jsonObject = JSONFactoryUtil.createJSONObject(
                userNotificationEvent.getPayload());

        String message = "Guestbook Export Process Finished Successfully";

        return message;
    }
    @Override
    protected String getLink(UserNotificationEvent userNotificationEvent, ServiceContext serviceContext) throws Exception {
        JSONObject jsonObject = JSONFactoryUtil.createJSONObject(
                userNotificationEvent.getPayload());

        long backgroundTaskId = jsonObject.getLong("backgroundTaskId");

        BackgroundTask backgroundTask =
                BackgroundTaskLocalServiceUtil.fetchBackgroundTask(backgroundTaskId);

        if (backgroundTask == null) {
            return StringPool.BLANK;
        }

        return PortletURLBuilder.create(
                PortletURLFactoryUtil.create(
                        serviceContext.getRequest(),
                        GuestbookPortletKeys.GUESTBOOK_ADMIN,
                        PortletRequest.RENDER_PHASE)
        ).setMVCPath(
                "/guestbookwebportlet/view_export_import.jsp"
        ).setBackURL(
                serviceContext.getCurrentURL()
        ).setParameter(
                "backgroundTaskId", backgroundTaskId
        ).buildString();
    }
}
