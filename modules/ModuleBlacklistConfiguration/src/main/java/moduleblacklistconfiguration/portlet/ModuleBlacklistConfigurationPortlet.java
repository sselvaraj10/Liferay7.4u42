package moduleblacklistconfiguration.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.PortletLocalServiceUtil;
import com.liferay.portal.kernel.service.PortletPreferencesLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import moduleblacklistconfiguration.constants.ModuleBlacklistConfigurationPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.*;

import moduleblacklistservice.service.PortletLocalService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.IOException;
import java.util.List;

/**
 * @author root322
 */
@Component(
	immediate = true,
	property = {
			"com.liferay.portlet.add-default-resource=true",
			"com.liferay.portlet.display-category=category.hidden",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=ModuleBlacklistConfiguration",
			"com.liferay.portlet.layout-cacheable=true",
			"com.liferay.portlet.private-request-attributes=false",
			"com.liferay.portlet.private-session-attributes=false",
			"com.liferay.portlet.render-weight=50",
			"com.liferay.portlet.use-default-template=true",
			"javax.portlet.display-name=PanelAppDemo",
			"javax.portlet.expiration-cache=0",
			"javax.portlet.init-param.template-path=/",
			"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ModuleBlacklistConfigurationPortletKeys.MODULEBLACKLISTCONFIGURATION,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)

public class ModuleBlacklistConfigurationPortlet extends MVCPortlet {
	private PortletLocalService _portletLocalService;

	@Reference(unbind = "-")
	protected void setGuestbookService(PortletLocalService portletLocalService) {
		_portletLocalService = (PortletLocalService) portletLocalService;
	}
	moduleblacklistservice.service.PortletLocalServiceUtil portletBlackListLocalServiceUtil ;

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(
					Portlet.class.getName(), renderRequest);
			ThemeDisplay themeDisplay  =(ThemeDisplay)renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
			List<com.liferay.portal.kernel.model.Portlet> portlets = PortletLocalServiceUtil.getPortlets(232,PortletLocalServiceUtil.getPortletsCount());
			renderRequest.setAttribute("portlets", portlets);

		} catch (PortalException e) {
			throw new RuntimeException(e);
		}
		super.render(renderRequest,renderResponse);
	}


	@ProcessAction(name = "activatePortlet")
	public void activatePortlet(ActionRequest request, ActionResponse response) throws PortletException, PortalException {
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				Portlet.class.getName(), request);
		String portletID = ParamUtil.getString(request,"portletId");
		boolean activate = ParamUtil.getBoolean(request, "active");
		ThemeDisplay themeDisplay  =(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		List<moduleblacklistservice.model.Portlet> existportlet = _portletLocalService.getPortlet(themeDisplay.getSiteGroupId(),portletID);
		if(existportlet.size()!=0)
		{
			moduleblacklistservice.model.Portlet portlet=existportlet.get(0);
			portlet.setActive(activate);
			_portletLocalService.updatePortlet(portlet);
		}
		else {
			_portletLocalService.addPortlet(themeDisplay.getUserId(), themeDisplay.getSiteGroupId(), portletID, activate, serviceContext);
		}
	}

}