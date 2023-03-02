package moduleblacklistconfiguration.application.list;

import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.application.list.constants.PanelCategoryKeys;
import com.liferay.portal.kernel.model.Portlet;
import moduleblacklistconfiguration.constants.ModuleBlacklistConfigurationPortletKeys;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
        immediate = true,
        property = {
                "panel.app.order:Integer=300",
                "panel.category.key=" + PanelCategoryKeys.SITE_ADMINISTRATION_CONFIGURATION
        },
        service = PanelApp.class
)

public class SitePanelApp extends BasePanelApp {
    @Override
    public String getPortletId() {
        return ModuleBlacklistConfigurationPortletKeys.MODULEBLACKLISTCONFIGURATION;
    }
    @Override
    @Reference(
            target = "(javax.portlet.name=" + ModuleBlacklistConfigurationPortletKeys.MODULEBLACKLISTCONFIGURATION + ")",
            unbind = "-"
    )
    public void setPortlet(Portlet portlet) {
        super.setPortlet(portlet);
    }
}
