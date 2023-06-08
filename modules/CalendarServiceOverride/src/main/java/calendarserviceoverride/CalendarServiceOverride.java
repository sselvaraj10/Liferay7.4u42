package calendarserviceoverride;

import com.liferay.calendar.model.CalendarBooking;
import com.liferay.calendar.model.CalendarResource;
import com.liferay.calendar.service.CalendarBookingLocalServiceWrapper;

import com.liferay.calendar.service.CalendarResourceLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.*;

import org.osgi.service.component.annotations.Component;

import java.util.*;

/**
 * @author root
 */
@Component(
		immediate = true,
		property = {
		},
		service = ServiceWrapper.class
)
public class CalendarServiceOverride extends CalendarBookingLocalServiceWrapper {

	public CalendarServiceOverride() {
		super(null);
	}

	@Override
	public CalendarBooking addCalendarBooking(long userId, long calendarId, long[] childCalendarIds, long parentCalendarBookingId, long recurringCalendarBookingId, Map<Locale, String> titleMap, Map<Locale, String> descriptionMap, String location, long startTime, long endTime, boolean allDay, String recurrence, long firstReminder, String firstReminderType, long secondReminder, String secondReminderType, ServiceContext serviceContext) throws PortalException {
		String[] roleName = (String[]) serviceContext.getExpandoBridgeAttributes().get("Send Invitations");
		List<User> siteUsers;
		if(!Arrays.toString(roleName).contains("ALL")) {
			Role role = RoleLocalServiceUtil.getRole(serviceContext.getCompanyId(), roleName[0]);
			siteUsers = UserLocalServiceUtil.getRoleUsers(role.getRoleId());
		}else {
			siteUsers = UserLocalServiceUtil.getGroupUsers(serviceContext.getScopeGroupId());
		}
		long classNameId = ClassNameLocalServiceUtil.getClassNameId("com.liferay.portal.kernel.model.User");
		int length = childCalendarIds.length;
		if(childCalendarIds.length == 0){
			childCalendarIds = new long[siteUsers.size()];
		}
		else{
			long[] newChildCalendarIds = new long[childCalendarIds.length + siteUsers.size()];
			System.arraycopy(childCalendarIds, 0, newChildCalendarIds, 0, childCalendarIds.length);
			childCalendarIds = newChildCalendarIds;
		}
		int index = 0;
		for(User siteUser : siteUsers){
			CalendarResource calendarResource = CalendarResourceLocalServiceUtil.fetchCalendarResource(classNameId,siteUser.getUserId());
			if(calendarResource == null){
				Map<Locale,String> userMap = new HashMap<>();
				userMap.put(serviceContext.getLocale(),siteUser.getFullName());
				calendarResource = CalendarResourceLocalServiceUtil.addCalendarResource(userId,serviceContext.getScopeGroupId(),classNameId,siteUser.getUserId(),null,null,userMap,null,true,serviceContext);
			}
			if(length == 0){
				childCalendarIds[index] = calendarResource.getDefaultCalendar().getCalendarId();
			}
			else {
				long resourceCalendarId = calendarResource.getDefaultCalendar().getCalendarId();
				if( Arrays.stream(childCalendarIds).anyMatch(value -> value == resourceCalendarId))
				{
					continue;
				}
				childCalendarIds[length] = calendarResource.getDefaultCalendar().getCalendarId();
				length++;
			}
			index++;
		}
		CalendarBooking calendarBooking = super.addCalendarBooking(userId, calendarId, childCalendarIds, parentCalendarBookingId, recurringCalendarBookingId, titleMap, descriptionMap, location, startTime, endTime, allDay, recurrence, firstReminder, firstReminderType, secondReminder, secondReminderType, serviceContext);
		return calendarBooking;
	}
}