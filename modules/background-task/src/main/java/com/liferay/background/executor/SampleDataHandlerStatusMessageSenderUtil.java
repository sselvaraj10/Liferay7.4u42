package com.liferay.background.executor;

import com.liferay.background.vo.BackgroundTaskVO;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.exportimport.constants.ExportImportPortletKeys;
import com.liferay.portal.background.task.model.BackgroundTask;
import com.liferay.portal.background.task.service.BackgroundTaskLocalService;
import com.liferay.portal.background.task.service.BackgroundTaskLocalServiceUtil;
import com.liferay.portal.kernel.backgroundtask.BackgroundTaskThreadLocal;
import com.liferay.portal.kernel.backgroundtask.constants.BackgroundTaskConstants;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactory;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.messaging.DestinationNames;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageBusUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.UserNotificationDeliveryConstants;
import com.liferay.portal.kernel.model.UserNotificationEvent;
import com.liferay.portal.kernel.notifications.UserNotificationDefinition;
import com.liferay.portal.kernel.notifications.UserNotificationDeliveryType;
import com.liferay.portal.kernel.service.*;
import com.liferay.portal.kernel.util.GetterUtil;
import org.osgi.service.component.annotations.Reference;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * 
 * @author vipin.bardia
 * @version 1.0
 */
public class SampleDataHandlerStatusMessageSenderUtil {

	public  void sendStatusMessage(BackgroundTaskVO messageContent) throws Exception {
		// Leave if no background task
		if (!BackgroundTaskThreadLocal.hasBackgroundTask()) {
			return;
		}

		// Message Creation
		Message message = createMessage(messageContent);

		// Send message to message bus
		MessageBusUtil.sendMessage(DestinationNames.MESSAGE_BUS_DEFAULT_RESPONSE,
				message);
//		MessageBusUtil.sendMessage(DestinationNames.LIVE_USERS,
//				message);
//		MessageBusUtil.sendMessage(DestinationNames.BACKGROUND_TASK,
//				message);
//		MessageBusUtil.sendMessage(DestinationNames.MESSAGE_BUS_MESSAGE_STATUS,
//				message);
//		MessageBusUtil.sendMessage(DestinationNames.MAIL,
//				message);
//		MessageBusUtil.sendMessage(DestinationNames.MESSAGE_BUS_DEFAULT_RESPONSE,
//				message);
//		MessageBusUtil.sendMessage(DestinationNames.MAIL_SYNCHRONIZER,
//				message);

		_sendNotification(BackgroundTaskConstants.STATUS_SUCCESSFUL);

	}
	 void _sendNotification(int status) throws Exception {
		long backgroundTaskId = BackgroundTaskThreadLocal.getBackgroundTaskId();
		System.out.println("Task is: "+backgroundTaskId);
//		BackgroundTask backgroundTask =
//				_backgroundTaskLocalService.getBackgroundTask(backgroundTaskId);
////		BackgroundTask backgroundTask =
////				_backgroundTaskLocalService.getBackgroundTask(backgroundTaskId);
////
//		Map<String, Serializable> taskContextMap =
//				backgroundTask.getTaskContextMap();
////
//		long exportImportConfigurationId = GetterUtil.getLong(
//				taskContextMap.get("exportImportConfigurationId"));
		// ServiceContextThreadLocal.getServiceContext();
//		 ExportImportUserNotificationHandler exportImportUserNotificationHandler = new ExportImportUserNotificationHandler();
//		 UserNotificationEventLocalServiceUtil.sendUserNotificationEvents(
			//	20125, "BackgroundTaskPortlet", 10002, _getPayloadJSONObject(backgroundTaskId, status));
		 User user = UserLocalServiceUtil.getUser(BackgroundTaskLocalServiceUtil.getBackgroundTask(backgroundTaskId).getUserId());

		 sendNotification(user, _getPayloadJSONObject(backgroundTaskId, status));
	}
	public JSONObject _getPayloadJSONObject(
			long backgroundTaskId, int status) {

		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();

		jsonObject.put(
				"backgroundTaskId", backgroundTaskId
		).put(
				"status", status
		);

		return jsonObject;
	}

	protected static Message createMessage(BackgroundTaskVO messageContent) {

		System.out.println("Background task Message creation");


		Message message = new Message();
		message.put("backgroundTaskId",
				BackgroundTaskThreadLocal.getBackgroundTaskId());
		
		message.put("totalNodes", messageContent.getTotalNodes());
/*

		message.put("nodesImported", messageContent.getNodesImported());

		message.put("nodesWithProblem", messageContent.getNodesWithProblem());
*/

		return message;
	}


	private void sendNotification(User user, JSONObject payload) throws PortalException {
		ExportImportUserNotificationHandler hndlr = new ExportImportUserNotificationHandler();
		//UserNotificationManagerUtil.addUserNotificationHandler(hndlr);

//		if(UserNotificationManagerUtil.fetchUserNotificationDefinition(
//				hndlr.getPortletId(),
//				ClassNameLocalServiceUtil.getClassNameId(hndlr.getClass().getName()),
//				UserNotificationDeliveryConstants.TYPE_WEBSITE) == null)
//		{
//
//			UserNotificationDefinition def =
//					new UserNotificationDefinition(
//							hndlr.getPortletId(),
//							ClassNameLocalServiceUtil.getClassNameId(
//									hndlr.getClass().getName()
//							),
//							0,
//							"Receive notification when this " +
//									"portlet does something INCREDIBLE." );
//
//			def.addUserNotificationDeliveryType(
//					new UserNotificationDeliveryType(
//							"Website",
//							UserNotificationDeliveryConstants.TYPE_WEBSITE,
//							true,
//							true)
//			);
//
////			UserNotificationManagerUtil.addUserNotificationDefinition(
////					hndlr.getPortletId(),
////					def);
//		}


		UserNotificationEvent notification =
				UserNotificationEventLocalServiceUtil.createUserNotificationEvent(
						CounterLocalServiceUtil.increment()
				);

		notification.setCompanyId(user.getCompanyId());
		notification.setUserId(user.getUserId());
		notification.setPayload(payload.toString());
		notification.setDeliveryType(UserNotificationDeliveryConstants.TYPE_WEBSITE);
		notification.setTimestamp(new Date().getTime());
		notification.setArchived(false);
		notification.setDelivered(true);
		notification.setType(hndlr.getPortletId());

		UserNotificationEventLocalServiceUtil.addUserNotificationEvent(notification);
	}
}

