package calendarresourcesserviceoverride;

import com.liferay.calendar.model.CalendarResource;
import com.liferay.calendar.service.CalendarResourceLocalServiceWrapper;

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
public class CalendarResourcesServiceOverride extends CalendarResourceLocalServiceWrapper {
	@Override
	public CalendarResource createCalendarResource(long calendarResourceId) {
		System.out.println("hello data ");
		return super.createCalendarResource(calendarResourceId);
	}

	public CalendarResourcesServiceOverride() {
		super(null);
	}

	@Override
	public CalendarResource addCalendarResource(long userId, long groupId, long classNameId, long classPK, String classUuid, String code, Map<Locale, String> nameMap, Map<Locale, String> descriptionMap, boolean active, ServiceContext serviceContext) throws PortalException {
		System.out.println("addCalendarResource Name "+nameMap);
		return super.addCalendarResource(userId, groupId, classNameId, classPK, classUuid, code, nameMap, descriptionMap, active, serviceContext);
	}

	@Override
	public CalendarResource addCalendarResource(CalendarResource calendarResource) {
		System.out.println("addCalendarResource "+calendarResource.getName());
		return super.addCalendarResource(calendarResource);
	}
}