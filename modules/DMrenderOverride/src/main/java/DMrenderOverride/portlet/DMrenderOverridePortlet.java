package DMrenderOverride.portlet;

//
////import com.liferay.document.library.web.internal.display.context.DLAdminDisplayContext;
//import com.liferay.document.library.web.internal.display.context.*;
////import com.liferay.document.library.web.internal.display.context.DLAdminDisplayContextProvider;
////import com.liferay.document.library.web.internal.helper.DLTrashHelper;
////import com.liferay.document.library.web.internal.constants.DLWebKeys;
//
//import com.liferay.document.library.constants.DLPortletKeys;
////import com.liferay.document.library.web.internal.display.context.DLAdminManagementToolbarDisplayContext;
////import com.liferay.document.library.web.internal.portlet.toolbar.contributor.DLPortletToolbarContributorRegistry;
//
//import javax.portlet.PortletException;
//import javax.portlet.RenderRequest;
//import javax.portlet.RenderResponse;
//
////import com.liferay.document.library.web.internal.display.context.DLAdminDisplayContextProvider;
//import com.liferay.document.library.web.internal.helper.DLTrashHelper;
//import com.liferay.document.library.web.internal.portlet.toolbar.contributor.DLPortletToolbarContributorRegistry;
//import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
////import com.liferay.portal.kernel.util.Portal;
import com.liferay.document.library.constants.DLPortletKeys;
import com.liferay.document.library.web.internal.display.context.DLAdminDisplayContext;
import com.liferay.document.library.web.internal.display.context.DLAdminDisplayContextProvider;
import com.liferay.document.library.web.internal.helper.DLTrashHelper;
import com.liferay.document.library.web.internal.portlet.toolbar.contributor.DLPortletToolbarContributorRegistry;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.Portal;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * @author root322
 */
@Component(
		property = {
				"javax.portlet.name=" + DLPortletKeys.DOCUMENT_LIBRARY,
				"javax.portlet.name=" + DLPortletKeys.DOCUMENT_LIBRARY_ADMIN,
				"javax.portlet.name=" + DLPortletKeys.MEDIA_GALLERY_DISPLAY,
				"mvc.command.name=/document_library/search",
				"service.ranking:Integer=1000"
		},
		service = MVCRenderCommand.class
)
public class DMrenderOverridePortlet implements MVCRenderCommand {



	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		System.out.println("render override222");

		DLAdminDisplayContext dlAdminDisplayContext =
				_dlAdminDisplayContextProvider.getDLAdminDisplayContext(
						_portal.getHttpServletRequest(renderRequest),
						_portal.getHttpServletResponse(renderResponse));

		System.out.println("render dl admin output: "+dlAdminDisplayContext);
		System.out.println("asasa" +dlAdminDisplayContext.getSearchContainer().getResults().get(0));
//
//		renderRequest.setAttribute(
//				DLAdminDisplayContext.class.getName(), dlAdminDisplayContext);
//		renderRequest.setAttribute(
//				DLAdminManagementToolbarDisplayContext.class.getName(),
//				_dlAdminDisplayContextProvider.
//						getDLAdminManagementToolbarDisplayContext(
//								_portal.getHttpServletRequest(renderRequest),
//								_portal.getHttpServletResponse(renderResponse),
//								dlAdminDisplayContext));
//
//		renderRequest.setAttribute(
//				DLWebKeys.DOCUMENT_LIBRARY_PORTLET_TOOLBAR_CONTRIBUTOR,
//				_dlPortletToolbarContributorRegistry.
//						getDLPortletToolbarContributor());
//		renderRequest.setAttribute(
//				DLWebKeys.DOCUMENT_LIBRARY_TRASH_HELPER, _dlTrashHelper);
		System.out.println("render overasjhajshas22");

		
		System.out.println("render overasjhajshas22");
		System.out.println("render overasjhajshas22");

		return mvcRenderCommand.render(renderRequest, renderResponse);
	}

	@Reference
	private DLAdminDisplayContextProvider _dlAdminDisplayContextProvider;

	@Reference
	private DLPortletToolbarContributorRegistry
			_dlPortletToolbarContributorRegistry;

	@Reference
	private DLTrashHelper _dlTrashHelper;

	@Reference
	private Portal _portal;

	@Reference(
			target = "(component.name=com.liferay.document.library.web.internal.portlet.action.SearchMVCRenderCommand)")
	protected MVCRenderCommand mvcRenderCommand;
}