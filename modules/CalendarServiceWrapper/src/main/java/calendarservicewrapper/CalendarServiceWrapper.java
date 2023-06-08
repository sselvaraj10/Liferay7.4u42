package calendarservicewrapper;

import com.liferay.calendar.model.Calendar;
import com.liferay.calendar.service.CalendarLocalServiceWrapper;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.service.component.annotations.Component;

import java.util.Locale;
import java.util.Map;

/**
 * @author root
 */
@Component(
		immediate = true,
		property = {
		},
		service = ServiceWrapper.class
)
public class CalendarServiceWrapper extends CalendarLocalServiceWrapper {

	public CalendarServiceWrapper() {
		super(null);
	}

	@Override
	public Calendar addCalendar(long userId, long groupId, long calendarResourceId, Map<Locale, String> nameMap, Map<Locale, String> descriptionMap, String timeZoneId, int color, boolean defaultCalendar, boolean enableComments, boolean enableRatings, ServiceContext serviceContext) throws PortalException {
		System.out.println("add calender method");
		return super.addCalendar(userId, groupId, calendarResourceId, nameMap, descriptionMap, timeZoneId, color, defaultCalendar, enableComments, enableRatings, serviceContext);
	}
}