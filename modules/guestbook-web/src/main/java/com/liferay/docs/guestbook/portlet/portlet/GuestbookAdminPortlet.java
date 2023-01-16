package com.liferay.docs.guestbook.portlet.portlet;


import com.liferay.docs.guestbook.model.Entry;
import com.liferay.docs.guestbook.model.Guestbook;
import com.liferay.docs.guestbook.portlet.constants.GuestbookPortletKeys;
import com.liferay.docs.guestbook.portlet.executor.GuestbookEntryBackgroundTaskExecutor;
import com.liferay.docs.guestbook.service.GuestbookLocalService;
import com.liferay.petra.string.CharPool;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.backgroundtask.BackgroundTask;
import com.liferay.portal.kernel.backgroundtask.BackgroundTaskManagerUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.portlet.PortletResponseUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.*;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component(
        immediate = true,
        property = {
                "com.liferay.portlet.display-category=category.hidden",
                "com.liferay.portlet.scopeable=true",
                "javax.portlet.display-name=Guestbooks",
                "javax.portlet.expiration-cache=0",
                "javax.portlet.init-param.portlet-title-based-navigation=true",
                "javax.portlet.init-param.template-path=/",
                "javax.portlet.init-param.view-template=/guestbookadminportlet/view.jsp",
                "javax.portlet.name=" + GuestbookPortletKeys.GUESTBOOK_ADMIN,
                "javax.portlet.resource-bundle=content.Language",
                "javax.portlet.security-role-ref=administrator",
                "javax.portlet.supports.mime-type=text/html",
                "mvc.command.name=/exportEntry",
                "com.liferay.portlet.add-default-resource=true"
        },
        service = Portlet.class
)

public class GuestbookAdminPortlet extends MVCPortlet {


        public void addGuestbook(ActionRequest request, ActionResponse response)
                throws PortalException {

                ServiceContext serviceContext = ServiceContextFactory.getInstance(
                        Guestbook.class.getName(), request);

                String name = ParamUtil.getString(request, "name");

                try {
                        _guestbookLocalService.addGuestbook(
                                serviceContext.getUserId(), name, serviceContext);
                        SessionMessages.add(request, "guestbookAdded");

                }
                catch (PortalException pe) {

                        Logger.getLogger(GuestbookAdminPortlet.class.getName()).log(
                                Level.SEVERE, null, pe);
                        SessionErrors.add(request, pe.getClass().getName());

                        response.setRenderParameter(
                                "mvcPath", "/guestbookadminportlet/edit_guestbook.jsp");
                }
        }

        private GuestbookLocalService _guestbookLocalService;

        @Reference(unbind = "-")
        protected void setGuestbookService(GuestbookLocalService guestbookLocalService) {
                _guestbookLocalService = (GuestbookLocalService) guestbookLocalService;
        }
        public void updateGuestbook(ActionRequest request, ActionResponse response)
                throws PortalException {

                ServiceContext serviceContext = ServiceContextFactory.getInstance(
                        Guestbook.class.getName(), request);

                String name = ParamUtil.getString(request, "name");
                long guestbookId = ParamUtil.getLong(request, "guestbookId");

                try {
                        _guestbookLocalService.updateGuestbook(
                                serviceContext.getUserId(), guestbookId, name,"hello", serviceContext);

                        SessionMessages.add(request, "guestbookUpdated");


                } catch (PortalException pe) {

                        Logger.getLogger(GuestbookAdminPortlet.class.getName()).log(
                                Level.SEVERE, null, pe);
                        SessionErrors.add(request, pe.getClass().getName());

                        response.setRenderParameter(
                                "mvcPath", "/guestbookadminportlet/edit_guestbook.jsp");
                }
        }

//        public void deleteGuestbook(ActionRequest request, ActionResponse response)
//                throws PortalException {
//
//                System.out.println("delete noob");
//                ServiceContext serviceContext = ServiceContextFactory.getInstance(
//                        Guestbook.class.getName(), request);
//                System.out.println("Service Context is : "+ serviceContext);
//                long guestbookId = ParamUtil.getLong(request, "guestbookId");
//                System.out.println("guestboodID: "+guestbookId);
//                System.out.println("object: "+_guestbookLocalService);
//                 Guestbook book=   _guestbookLocalService.deleteGuestbook(guestbookId, serviceContext);
//                System.out.println("book value: "+book.getName());
//        }

        @ProcessAction(name = "deleteGuestbook")
        public void deleteGuestbook(ActionRequest request, ActionResponse response)
                throws PortalException {

                ServiceContext serviceContext = ServiceContextFactory.getInstance(
                        Guestbook.class.getName(), request);

                long guestbookId = ParamUtil.getLong(request, "guestbookId");

//                try {
//                        _guestbookLocalService.deleteGuestbook(guestbookId, serviceContext);
//                }
//                catch (PortalException pe) {
//
//                        Logger.getLo4vgger(GuestbookAdminPortlet.class.getName()).log(
//                                Level.SEVERE, null, pe);
//                }
                System.out.println("dleteedd guest: "+guestbookId);
                System.out.println(_guestbookLocalService);
                _guestbookLocalService.deleteGuestbook(guestbookId,serviceContext);
                SessionMessages.add(request, "guestbookDeleted");

        }
        public String exportData(ActionRequest request,ActionResponse response)
        {
                System.out.println("Hello Export");
                String userId = ParamUtil.getString(request, "UserId");
            System.out.println("u: "+userId);
                String groupId = ParamUtil.getString(request, "GroupId");
                String name = ParamUtil.getString(request, "Name");
                String userName = ParamUtil.getString(request, "UserName");
                String createdDate = ParamUtil.getString(request, "Created Date");


                ThemeDisplay themeDisplay  =(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
                ServiceContext serviceContext = null;
                try {
                        serviceContext = ServiceContextFactory.getInstance(
                                Entry.class.getName(), request);
                       List<String> data = new ArrayList<String>();
                        Map<String, Serializable> taskContextMap = new HashMap<>();
                        if(userId!=null)
                        {
                                data.add(userId);
                                System.out.println("Userid: "+userId);
                        }
                        if (groupId!=null) {
                                data.add(groupId);
                                System.out.println("groupId: "+groupId);
                        }
                        if (name!=null) {
                                data.add(name);
                                System.out.println("Name: "+name);
                        }
                        if (userName!=null) {
                                data.add(userName);
                                System.out.println("useername: "+userName);
                        }
                       if (createdDate!=null) {
                                data.add(createdDate);
                                System.out.println("useername: "+createdDate);

                        }
//                        else {
//                                taskContextMap.put("companyId", themeDisplay.getCompanyId());
//                                taskContextMap.put("language", themeDisplay.getLanguageId());
//                                taskContextMap.put("groupId", themeDisplay.getScopeGroupId());
//                        }
                        System.out.println("asas");
                        taskContextMap.put("data", (Serializable) data);
                        BackgroundTask backgroundTask = BackgroundTaskManagerUtil.addBackgroundTask(themeDisplay.getUserId(),
                                themeDisplay.getScopeGroupId(), GuestbookEntryBackgroundTaskExecutor.class.getName(), GuestbookEntryBackgroundTaskExecutor.class.getName(), taskContextMap, serviceContext);

                        request.setAttribute("backgroundTaskId",
                                backgroundTask.getBackgroundTaskId());
                }
                catch (Exception e)
                {
                        throw new RuntimeException(e);
                }
                //LiferayWindowState.isPopUp(request.)
                return "/view.jsp";
        }

        public static String[] columnNames = { "UserId", "FirstName", "LastName","EmailAddress", "Screen Name" };
        public static final String CSV_SEPARATOR = ",";
        @Override
        public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws IOException, PortletException {
                ServiceContext serviceContext = null;
                try {
            serviceContext = ServiceContextFactory.getInstance(
                    Guestbook.class.getName(), resourceRequest);
            System.out.println("service ");
            long backgroundTaskId = ParamUtil.getLong(resourceRequest, "backgroundTaskId");
            System.out.println("backgroundTaskId  :  "+backgroundTaskId);

            BackgroundTask backgroundTask1 = BackgroundTaskManagerUtil.getBackgroundTask(backgroundTaskId);
            System.out.println("BaCKgroundTask Resources: " + backgroundTask1);
            List<FileEntry> fileEntryList = backgroundTask1.getAttachmentsFileEntries();
            System.out.println("files Resources: " + fileEntryList);
            System.out.println("Resources file count: " + backgroundTask1.getAttachmentsFileEntriesCount());

            FileEntry file = fileEntryList.get(0);
            InputStream output = file.getContentStream();

                String contentType = ContentTypes.APPLICATION_TEXT;
                PortletResponseUtil.sendFile(resourceRequest, resourceResponse,
                        file.getFileName(), output, contentType);

                                }
                                catch (Exception e)
                                {
                                        throw new RuntimeException(e);
                                }
                super.serveResource(resourceRequest, resourceResponse);
}

        protected String getCSVFormattedValue(String value) {
                StringBundler sb = new StringBundler();
                sb.append(CharPool.QUOTE);
                sb.append(StringUtil.replace(value, CharPool.QUOTE,
                        StringPool.DOUBLE_QUOTE));
                sb.append(CharPool.QUOTE);
                return sb.toString();
        }
}
