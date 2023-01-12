package searchjspdm.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import org.osgi.service.component.annotations.Component;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;

@Component(
        immediate = true,
        property = {
                "mvc.command.name=/actionCommand"
        },
        service = MVCActionCommand.class
)
public class CommandClass implements MVCActionCommand {
    @Override
    public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
        System.out.println("action method call ");

        return false;
    }
}
