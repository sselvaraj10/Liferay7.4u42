package calendarrenderoverride.portlet;

import com.liferay.calendar.constants.CalendarPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.annotations.RenderMethod;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.IOException;

/**
 * @author root
 */
@Component(
		immediate = true,
		property = {
				"javax.portlet.name=" + CalendarPortletKeys.CALENDAR,
				"service.ranking:Integer=1000"
		},
		service = Portlet.class
)
public class CalendarRenderOverridePortlet extends MVCPortlet{
	@RenderMethod(portletNames = "com.liferay.calendar.web.internal.portlet.CalendarPortlet")
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException, IOException {
		System.out.println("render metthod for calendar");
		super.render(renderRequest,renderResponse);
		//return mvcRenderCommand.render(renderRequest, renderResponse);
	}

	@Reference(
			target = "(component.name=com.liferay.calendar.web.internal.portlet.CalendarPortlet)")
	protected MVCRenderCommand mvcRenderCommand;
}