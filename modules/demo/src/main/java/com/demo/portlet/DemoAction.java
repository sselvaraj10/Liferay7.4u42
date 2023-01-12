package com.demo.portlet;

import com.demo.constants.DemoPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;

/**
 * @author root322
 */
@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + DemoPortletKeys.DEMO,
                "mvc.command.name=/actionCommand"
        },
        service = MVCActionCommand.class
)
public class DemoAction implements MVCActionCommand {
    @Override
    public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
        System.out.println("action method call ");
        return false;
    }
}
