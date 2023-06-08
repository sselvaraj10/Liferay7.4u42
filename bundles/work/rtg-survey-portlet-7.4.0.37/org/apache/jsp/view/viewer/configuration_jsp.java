package org.apache.jsp.view.viewer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.search.ResultRow;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.template.TemplateHandler;
import com.liferay.portal.kernel.template.TemplateHandlerRegistryUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PropertiesUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.util.TextFormatter;
import com.liferay.portal.kernel.util.UnicodeFormatter;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.GroupConstants;
import com.liferay.portal.kernel.model.LayoutConstants;
import com.liferay.portal.kernel.repository.model.FileVersion;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.service.ClassNameLocalServiceUtil;
import com.liferay.portal.kernel.service.LayoutLocalServiceUtil;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.util.portlet.PortletProps;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFileShortcut;
import com.liferay.document.library.kernel.service.DLAppServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.document.library.util.DLURLHelperUtil;
import com.liferay.dynamic.data.mapping.model.DDMTemplate;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import javax.portlet.PortletSession;
import javax.portlet.WindowState;
import de.rtg.portlet.survey.SurveyViewerPortlet;
import de.rtg.portlet.survey.export.util.ExportFormats;
import de.rtg.portlet.survey.model.QuestionType;
import de.rtg.portlet.survey.model.Survey;
import de.rtg.portlet.survey.model.Answer;
import de.rtg.portlet.survey.model.Question;
import de.rtg.portlet.survey.model.Result;
import de.rtg.portlet.survey.model.AnsweredQuestion;
import de.rtg.portlet.survey.service.SurveyLocalServiceUtil;
import de.rtg.portlet.survey.service.QuestionLocalServiceUtil;
import de.rtg.portlet.survey.service.AnswerLocalServiceUtil;
import de.rtg.portlet.survey.service.ResultLocalServiceUtil;
import de.rtg.portlet.survey.service.AnsweredQuestionLocalServiceUtil;
import de.rtg.portlet.survey.surveyutil.SurveyNameComparator;
import de.rtg.portlet.survey.service.permission.SurveyModelPermission;
import de.rtg.portlet.survey.service.permission.SurveyPermission;
import de.rtg.portlet.survey.util.SurveyFileUtil;

public final class configuration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/view/viewer/init.jsp");
    _jspx_dependants.add("/view/viewer/../init.jsp");
    _jspx_dependants.add("/view/viewer/config_previews.jspf");
    _jspx_dependants.add("/view/viewer/theme_selection.jspf");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      //  liferay-theme:defineObjects
      com.liferay.taglib.theme.DefineObjectsTag _jspx_th_liferay$1theme_defineObjects_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.theme.DefineObjectsTag.class) : new com.liferay.taglib.theme.DefineObjectsTag();
      _jspx_th_liferay$1theme_defineObjects_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1theme_defineObjects_0.setParent(null);
      int _jspx_eval_liferay$1theme_defineObjects_0 = _jspx_th_liferay$1theme_defineObjects_0.doStartTag();
      if (_jspx_th_liferay$1theme_defineObjects_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1theme_defineObjects_0);
        _jspx_th_liferay$1theme_defineObjects_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1theme_defineObjects_0);
      _jspx_th_liferay$1theme_defineObjects_0.release();
      com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay = null;
      com.liferay.portal.kernel.model.Company company = null;
      com.liferay.portal.kernel.model.User user = null;
      com.liferay.portal.kernel.model.User realUser = null;
      com.liferay.portal.kernel.model.Contact contact = null;
      com.liferay.portal.kernel.model.Layout layout = null;
      java.util.List layouts = null;
      java.lang.Long plid = null;
      com.liferay.portal.kernel.model.LayoutTypePortlet layoutTypePortlet = null;
      java.lang.Long scopeGroupId = null;
      com.liferay.portal.kernel.security.permission.PermissionChecker permissionChecker = null;
      java.util.Locale locale = null;
      java.util.TimeZone timeZone = null;
      com.liferay.portal.kernel.model.Theme theme = null;
      com.liferay.portal.kernel.model.ColorScheme colorScheme = null;
      com.liferay.portal.kernel.theme.PortletDisplay portletDisplay = null;
      java.lang.Long portletGroupId = null;
      themeDisplay = (com.liferay.portal.kernel.theme.ThemeDisplay) _jspx_page_context.findAttribute("themeDisplay");
      company = (com.liferay.portal.kernel.model.Company) _jspx_page_context.findAttribute("company");
      user = (com.liferay.portal.kernel.model.User) _jspx_page_context.findAttribute("user");
      realUser = (com.liferay.portal.kernel.model.User) _jspx_page_context.findAttribute("realUser");
      contact = (com.liferay.portal.kernel.model.Contact) _jspx_page_context.findAttribute("contact");
      layout = (com.liferay.portal.kernel.model.Layout) _jspx_page_context.findAttribute("layout");
      layouts = (java.util.List) _jspx_page_context.findAttribute("layouts");
      plid = (java.lang.Long) _jspx_page_context.findAttribute("plid");
      layoutTypePortlet = (com.liferay.portal.kernel.model.LayoutTypePortlet) _jspx_page_context.findAttribute("layoutTypePortlet");
      scopeGroupId = (java.lang.Long) _jspx_page_context.findAttribute("scopeGroupId");
      permissionChecker = (com.liferay.portal.kernel.security.permission.PermissionChecker) _jspx_page_context.findAttribute("permissionChecker");
      locale = (java.util.Locale) _jspx_page_context.findAttribute("locale");
      timeZone = (java.util.TimeZone) _jspx_page_context.findAttribute("timeZone");
      theme = (com.liferay.portal.kernel.model.Theme) _jspx_page_context.findAttribute("theme");
      colorScheme = (com.liferay.portal.kernel.model.ColorScheme) _jspx_page_context.findAttribute("colorScheme");
      portletDisplay = (com.liferay.portal.kernel.theme.PortletDisplay) _jspx_page_context.findAttribute("portletDisplay");
      portletGroupId = (java.lang.Long) _jspx_page_context.findAttribute("portletGroupId");
      out.write('\n');
      out.write('\n');
      //  portlet:defineObjects
      com.liferay.taglib.portlet.DefineObjectsTag _jspx_th_portlet_defineObjects_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.DefineObjectsTag.class) : new com.liferay.taglib.portlet.DefineObjectsTag();
      _jspx_th_portlet_defineObjects_0.setPageContext(_jspx_page_context);
      _jspx_th_portlet_defineObjects_0.setParent(null);
      int _jspx_eval_portlet_defineObjects_0 = _jspx_th_portlet_defineObjects_0.doStartTag();
      if (_jspx_th_portlet_defineObjects_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_defineObjects_0);
        _jspx_th_portlet_defineObjects_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_defineObjects_0);
      _jspx_th_portlet_defineObjects_0.release();
      javax.portlet.ActionRequest actionRequest = null;
      javax.portlet.ActionResponse actionResponse = null;
      javax.portlet.EventRequest eventRequest = null;
      javax.portlet.EventResponse eventResponse = null;
      com.liferay.portal.kernel.portlet.LiferayPortletRequest liferayPortletRequest = null;
      com.liferay.portal.kernel.portlet.LiferayPortletResponse liferayPortletResponse = null;
      javax.portlet.PortletConfig portletConfig = null;
      java.lang.String portletName = null;
      javax.portlet.PortletPreferences portletPreferences = null;
      java.util.Map portletPreferencesValues = null;
      javax.portlet.PortletSession portletSession = null;
      java.util.Map portletSessionScope = null;
      javax.portlet.RenderRequest renderRequest = null;
      javax.portlet.RenderResponse renderResponse = null;
      javax.portlet.ResourceRequest resourceRequest = null;
      javax.portlet.ResourceResponse resourceResponse = null;
      actionRequest = (javax.portlet.ActionRequest) _jspx_page_context.findAttribute("actionRequest");
      actionResponse = (javax.portlet.ActionResponse) _jspx_page_context.findAttribute("actionResponse");
      eventRequest = (javax.portlet.EventRequest) _jspx_page_context.findAttribute("eventRequest");
      eventResponse = (javax.portlet.EventResponse) _jspx_page_context.findAttribute("eventResponse");
      liferayPortletRequest = (com.liferay.portal.kernel.portlet.LiferayPortletRequest) _jspx_page_context.findAttribute("liferayPortletRequest");
      liferayPortletResponse = (com.liferay.portal.kernel.portlet.LiferayPortletResponse) _jspx_page_context.findAttribute("liferayPortletResponse");
      portletConfig = (javax.portlet.PortletConfig) _jspx_page_context.findAttribute("portletConfig");
      portletName = (java.lang.String) _jspx_page_context.findAttribute("portletName");
      portletPreferences = (javax.portlet.PortletPreferences) _jspx_page_context.findAttribute("portletPreferences");
      portletPreferencesValues = (java.util.Map) _jspx_page_context.findAttribute("portletPreferencesValues");
      portletSession = (javax.portlet.PortletSession) _jspx_page_context.findAttribute("portletSession");
      portletSessionScope = (java.util.Map) _jspx_page_context.findAttribute("portletSessionScope");
      renderRequest = (javax.portlet.RenderRequest) _jspx_page_context.findAttribute("renderRequest");
      renderResponse = (javax.portlet.RenderResponse) _jspx_page_context.findAttribute("renderResponse");
      resourceRequest = (javax.portlet.ResourceRequest) _jspx_page_context.findAttribute("resourceRequest");
      resourceResponse = (javax.portlet.ResourceResponse) _jspx_page_context.findAttribute("resourceResponse");
      out.write('\n');
      out.write('\n');

List<String> questionTypes = new ArrayList<String>();
for (QuestionType type : QuestionType.values()) {
	questionTypes.add(type.getValue(), type.name());
}

String defaultTheme = "liferay_7";

List<String> ratingIcons = new ArrayList<String>();
ratingIcons.add("thumbs-up");
ratingIcons.add("star");
ratingIcons.add("heart");

      out.write('\n');
      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.taglibs.standard.tag.rt.core.SetTag.class) : new org.apache.taglibs.standard.tag.rt.core.SetTag();
      _jspx_th_c_set_0.setPageContext(_jspx_page_context);
      _jspx_th_c_set_0.setParent(null);
      _jspx_th_c_set_0.setVar("csvFormat");
      _jspx_th_c_set_0.setValue( ExportFormats.CSV );
      int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
      if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_set_0);
        _jspx_th_c_set_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_set_0);
      _jspx_th_c_set_0.release();
      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.taglibs.standard.tag.rt.core.SetTag.class) : new org.apache.taglibs.standard.tag.rt.core.SetTag();
      _jspx_th_c_set_1.setPageContext(_jspx_page_context);
      _jspx_th_c_set_1.setParent(null);
      _jspx_th_c_set_1.setVar("xlsFormat");
      _jspx_th_c_set_1.setValue( ExportFormats.XLS );
      int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
      if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_set_1);
        _jspx_th_c_set_1.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_set_1);
      _jspx_th_c_set_1.release();
      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.taglibs.standard.tag.rt.core.SetTag.class) : new org.apache.taglibs.standard.tag.rt.core.SetTag();
      _jspx_th_c_set_2.setPageContext(_jspx_page_context);
      _jspx_th_c_set_2.setParent(null);
      _jspx_th_c_set_2.setVar("xlsxFormat");
      _jspx_th_c_set_2.setValue( ExportFormats.XLSX );
      int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
      if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_set_2);
        _jspx_th_c_set_2.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_set_2);
      _jspx_th_c_set_2.release();
      out.write('\n');
      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.taglibs.standard.tag.rt.core.SetTag.class) : new org.apache.taglibs.standard.tag.rt.core.SetTag();
      _jspx_th_c_set_3.setPageContext(_jspx_page_context);
      _jspx_th_c_set_3.setParent(null);
      _jspx_th_c_set_3.setVar("TYPE_GROUP");
      _jspx_th_c_set_3.setValue(QuestionType.GROUP.getValue() );
      int _jspx_eval_c_set_3 = _jspx_th_c_set_3.doStartTag();
      if (_jspx_th_c_set_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_set_3);
        _jspx_th_c_set_3.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_set_3);
      _jspx_th_c_set_3.release();
      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.taglibs.standard.tag.rt.core.SetTag.class) : new org.apache.taglibs.standard.tag.rt.core.SetTag();
      _jspx_th_c_set_4.setPageContext(_jspx_page_context);
      _jspx_th_c_set_4.setParent(null);
      _jspx_th_c_set_4.setVar("TYPE_FREETEXT");
      _jspx_th_c_set_4.setValue(QuestionType.FREETEXT.getValue() );
      int _jspx_eval_c_set_4 = _jspx_th_c_set_4.doStartTag();
      if (_jspx_th_c_set_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_set_4);
        _jspx_th_c_set_4.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_set_4);
      _jspx_th_c_set_4.release();
      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.taglibs.standard.tag.rt.core.SetTag.class) : new org.apache.taglibs.standard.tag.rt.core.SetTag();
      _jspx_th_c_set_5.setPageContext(_jspx_page_context);
      _jspx_th_c_set_5.setParent(null);
      _jspx_th_c_set_5.setVar("TYPE_MULTIPLE_CHOICE");
      _jspx_th_c_set_5.setValue(QuestionType.MULTIPLE_CHOICE.getValue() );
      int _jspx_eval_c_set_5 = _jspx_th_c_set_5.doStartTag();
      if (_jspx_th_c_set_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_set_5);
        _jspx_th_c_set_5.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_set_5);
      _jspx_th_c_set_5.release();
      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.taglibs.standard.tag.rt.core.SetTag.class) : new org.apache.taglibs.standard.tag.rt.core.SetTag();
      _jspx_th_c_set_6.setPageContext(_jspx_page_context);
      _jspx_th_c_set_6.setParent(null);
      _jspx_th_c_set_6.setVar("TYPE_YES_NO");
      _jspx_th_c_set_6.setValue(QuestionType.YES_NO.getValue() );
      int _jspx_eval_c_set_6 = _jspx_th_c_set_6.doStartTag();
      if (_jspx_th_c_set_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_set_6);
        _jspx_th_c_set_6.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_set_6);
      _jspx_th_c_set_6.release();
      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.taglibs.standard.tag.rt.core.SetTag.class) : new org.apache.taglibs.standard.tag.rt.core.SetTag();
      _jspx_th_c_set_7.setPageContext(_jspx_page_context);
      _jspx_th_c_set_7.setParent(null);
      _jspx_th_c_set_7.setVar("TYPE_SCALE");
      _jspx_th_c_set_7.setValue(QuestionType.SCALE.getValue() );
      int _jspx_eval_c_set_7 = _jspx_th_c_set_7.doStartTag();
      if (_jspx_th_c_set_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_set_7);
        _jspx_th_c_set_7.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_set_7);
      _jspx_th_c_set_7.release();
      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.taglibs.standard.tag.rt.core.SetTag.class) : new org.apache.taglibs.standard.tag.rt.core.SetTag();
      _jspx_th_c_set_8.setPageContext(_jspx_page_context);
      _jspx_th_c_set_8.setParent(null);
      _jspx_th_c_set_8.setVar("TYPE_MATRIX");
      _jspx_th_c_set_8.setValue(QuestionType.MATRIX.getValue() );
      int _jspx_eval_c_set_8 = _jspx_th_c_set_8.doStartTag();
      if (_jspx_th_c_set_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_set_8);
        _jspx_th_c_set_8.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_set_8);
      _jspx_th_c_set_8.release();
      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.taglibs.standard.tag.rt.core.SetTag.class) : new org.apache.taglibs.standard.tag.rt.core.SetTag();
      _jspx_th_c_set_9.setPageContext(_jspx_page_context);
      _jspx_th_c_set_9.setParent(null);
      _jspx_th_c_set_9.setVar("TYPE_DATE");
      _jspx_th_c_set_9.setValue(QuestionType.DATE.getValue() );
      int _jspx_eval_c_set_9 = _jspx_th_c_set_9.doStartTag();
      if (_jspx_th_c_set_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_set_9);
        _jspx_th_c_set_9.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_set_9);
      _jspx_th_c_set_9.release();
      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_10 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.taglibs.standard.tag.rt.core.SetTag.class) : new org.apache.taglibs.standard.tag.rt.core.SetTag();
      _jspx_th_c_set_10.setPageContext(_jspx_page_context);
      _jspx_th_c_set_10.setParent(null);
      _jspx_th_c_set_10.setVar("TYPE_FILEUPLOAD");
      _jspx_th_c_set_10.setValue(QuestionType.FILEUPLOAD.getValue() );
      int _jspx_eval_c_set_10 = _jspx_th_c_set_10.doStartTag();
      if (_jspx_th_c_set_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_set_10);
        _jspx_th_c_set_10.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_set_10);
      _jspx_th_c_set_10.release();
      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_11 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.taglibs.standard.tag.rt.core.SetTag.class) : new org.apache.taglibs.standard.tag.rt.core.SetTag();
      _jspx_th_c_set_11.setPageContext(_jspx_page_context);
      _jspx_th_c_set_11.setParent(null);
      _jspx_th_c_set_11.setVar("TYPE_EMAIL");
      _jspx_th_c_set_11.setValue(QuestionType.EMAIL.getValue() );
      int _jspx_eval_c_set_11 = _jspx_th_c_set_11.doStartTag();
      if (_jspx_th_c_set_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_set_11);
        _jspx_th_c_set_11.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_set_11);
      _jspx_th_c_set_11.release();
      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_12 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.taglibs.standard.tag.rt.core.SetTag.class) : new org.apache.taglibs.standard.tag.rt.core.SetTag();
      _jspx_th_c_set_12.setPageContext(_jspx_page_context);
      _jspx_th_c_set_12.setParent(null);
      _jspx_th_c_set_12.setVar("TYPE_RATING");
      _jspx_th_c_set_12.setValue(QuestionType.RATING.getValue() );
      int _jspx_eval_c_set_12 = _jspx_th_c_set_12.doStartTag();
      if (_jspx_th_c_set_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_set_12);
        _jspx_th_c_set_12.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_set_12);
      _jspx_th_c_set_12.release();
      out.write('\n');
      out.write('\n');
      out.write('\n');
	
	long surveyId = GetterUtil.getLong(portletPreferences.getValue("surveyId", null), 0);
	
	HttpServletRequest servletRequest = PortalUtil.getOriginalServletRequest(PortalUtil
			.getHttpServletRequest(renderRequest));
	long requestSurveyId = ParamUtil.getLong(servletRequest, "surveyId", 0);
	if (requestSurveyId == 0) {
		requestSurveyId = ParamUtil.getLong(renderRequest, "surveyId", 0);
	}
	
	Survey survey = null;
	if (requestSurveyId != 0) {
		survey = SurveyLocalServiceUtil.fetchSurvey(requestSurveyId);

		if (survey != null) {
			surveyId = requestSurveyId;
		}
	}

	if (survey == null && surveyId != 0) {
		survey = SurveyLocalServiceUtil.fetchSurvey(surveyId);
	}

	String languageParameter = ParamUtil.getString(request, "surveyLanguage");
	
	Locale surveyLocale = themeDisplay.getLocale();
	if (Validator.isNotNull(languageParameter)) {
		surveyLocale = LocaleUtil.fromLanguageId(languageParameter);
	} else if (survey != null && !ArrayUtil.contains(survey.getAvailableLanguageIds(), surveyLocale.toString())) {
		surveyLocale = survey.getDefaultLocale();
	}

      out.write('\n');
      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_13 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.taglibs.standard.tag.rt.core.SetTag.class) : new org.apache.taglibs.standard.tag.rt.core.SetTag();
      _jspx_th_c_set_13.setPageContext(_jspx_page_context);
      _jspx_th_c_set_13.setParent(null);
      _jspx_th_c_set_13.setVar("survey");
      _jspx_th_c_set_13.setValue(survey );
      int _jspx_eval_c_set_13 = _jspx_th_c_set_13.doStartTag();
      if (_jspx_th_c_set_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_set_13);
        _jspx_th_c_set_13.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_set_13);
      _jspx_th_c_set_13.release();
      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_14 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.taglibs.standard.tag.rt.core.SetTag.class) : new org.apache.taglibs.standard.tag.rt.core.SetTag();
      _jspx_th_c_set_14.setPageContext(_jspx_page_context);
      _jspx_th_c_set_14.setParent(null);
      _jspx_th_c_set_14.setVar("surveyLocale");
      _jspx_th_c_set_14.setValue(surveyLocale );
      int _jspx_eval_c_set_14 = _jspx_th_c_set_14.doStartTag();
      if (_jspx_th_c_set_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_set_14);
        _jspx_th_c_set_14.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_set_14);
      _jspx_th_c_set_14.release();
      out.write('\n');
      out.write('\n');

	String displayStyle = GetterUtil.getString(portletPreferences.getValue("displayStyle", StringPool.BLANK));
	long displayStyleGroupId = GetterUtil.getLong(portletPreferences.getValue("displayStyleGroupId", null),
			scopeGroupId);
	
	String cssTheme = GetterUtil.getString(portletPreferences.getValue("cssTheme", defaultTheme));
	String themePath = new StringBuilder(themeDisplay.getURLPortal())
		.append("/o/rtg-survey-portlet/css/themes/").append(cssTheme).append(".css").toString();
	
	String surveyDisplayStyle = "";
	long surveyDisplayStyleGroupId = scopeGroupId;
	
	if (surveyId != 0) {
		surveyDisplayStyle = displayStyle;
		surveyDisplayStyleGroupId = displayStyleGroupId;
	}

      out.write('\n');
      out.write('\n');
      //  liferay-portlet:actionURL
      com.liferay.taglib.portlet.ActionURLTag _jspx_th_liferay$1portlet_actionURL_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ActionURLTag.class) : new com.liferay.taglib.portlet.ActionURLTag();
      _jspx_th_liferay$1portlet_actionURL_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1portlet_actionURL_0.setParent(null);
      _jspx_th_liferay$1portlet_actionURL_0.setPortletConfiguration(true);
      _jspx_th_liferay$1portlet_actionURL_0.setVar("configurationURL");
      int _jspx_eval_liferay$1portlet_actionURL_0 = _jspx_th_liferay$1portlet_actionURL_0.doStartTag();
      if (_jspx_th_liferay$1portlet_actionURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_actionURL_0);
        _jspx_th_liferay$1portlet_actionURL_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_actionURL_0);
      _jspx_th_liferay$1portlet_actionURL_0.release();
      java.lang.String configurationURL = null;
      configurationURL = (java.lang.String) _jspx_page_context.findAttribute("configurationURL");
      out.write('\n');
      out.write('\n');
      //  liferay-portlet:resourceURL
      com.liferay.taglib.portlet.ResourceURLTag _jspx_th_liferay$1portlet_resourceURL_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ResourceURLTag.class) : new com.liferay.taglib.portlet.ResourceURLTag();
      _jspx_th_liferay$1portlet_resourceURL_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1portlet_resourceURL_0.setParent(null);
      _jspx_th_liferay$1portlet_resourceURL_0.setVar("previewURL");
      _jspx_th_liferay$1portlet_resourceURL_0.setId("getTemplatePreview");
      int _jspx_eval_liferay$1portlet_resourceURL_0 = _jspx_th_liferay$1portlet_resourceURL_0.doStartTag();
      if (_jspx_th_liferay$1portlet_resourceURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_resourceURL_0);
        _jspx_th_liferay$1portlet_resourceURL_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_resourceURL_0);
      _jspx_th_liferay$1portlet_resourceURL_0.release();
      java.lang.String previewURL = null;
      previewURL = (java.lang.String) _jspx_page_context.findAttribute("previewURL");
      out.write("\n");
      out.write("\n");
      out.write("<div style=\"margin: 0 30px 100px;\">\n");
      out.write("\t");
      if (_jspx_meth_aui_input_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t");
      if (_jspx_meth_aui_input_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\n");
      out.write("\t<link class=\"current-theme-css\" rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(themePath);
      out.write("\" />\n");
      out.write("\t\n");
      out.write("\t<div class=\"survey-field\">\n");
      out.write("\t\t");
      //  aui:form
      com.liferay.taglib.aui.FormTag _jspx_th_aui_form_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.FormTag.class) : new com.liferay.taglib.aui.FormTag();
      _jspx_th_aui_form_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_form_0.setParent(null);
      _jspx_th_aui_form_0.setAction(configurationURL);
      _jspx_th_aui_form_0.setMethod("post");
      _jspx_th_aui_form_0.setName("fm_survey");
      int _jspx_eval_aui_form_0 = _jspx_th_aui_form_0.doStartTag();
      if (_jspx_eval_aui_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t");
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_2.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_2.setName(Constants.CMD);
        _jspx_th_aui_input_2.setType("hidden");
        _jspx_th_aui_input_2.setValue(Constants.UPDATE);
        int _jspx_eval_aui_input_2 = _jspx_th_aui_input_2.doStartTag();
        if (_jspx_th_aui_input_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_2);
          _jspx_th_aui_input_2.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_2);
        _jspx_th_aui_input_2.release();
        out.write("\n");
        out.write("\t\t\n");
        out.write("\t\t\t");
        //  aui:fieldset
        com.liferay.taglib.aui.FieldsetTag _jspx_th_aui_fieldset_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.FieldsetTag.class) : new com.liferay.taglib.aui.FieldsetTag();
        _jspx_th_aui_fieldset_0.setPageContext(_jspx_page_context);
        _jspx_th_aui_fieldset_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_fieldset_0.setLabel("survey-configuration");
        int _jspx_eval_aui_fieldset_0 = _jspx_th_aui_fieldset_0.doStartTag();
        if (_jspx_eval_aui_fieldset_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t\t\t\t\n");
          out.write("\t\t\t\t");
          out.write("<h4>");
          if (_jspx_meth_liferay$1ui_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_0, _jspx_page_context))
            return;
          out.write("</h4>\n");
          out.write("\n");
          out.write("<div class=\"preview-container\">\n");
          out.write("\t<div class=\"template-preview\">\n");
          out.write("\t\t");
          if (_jspx_meth_liferay$1ui_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_0, _jspx_page_context))
            return;
          out.write(":<br />\n");
          out.write("\t\t\n");
          out.write("\t\t<img class=\"template-preview\" src=\"\" />\n");
          out.write("\t</div>\n");
          out.write("\t\n");
          out.write("\t<div class=\"theme-preview ");
          out.print(cssTheme );
          out.write("\">\n");
          out.write("\t\t");
          if (_jspx_meth_liferay$1ui_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_0, _jspx_page_context))
            return;
          out.write(":<br />\n");
          out.write("\t\t\n");
          out.write("\t\t<div class=\"ui-widget-header\"></div>\n");
          out.write("\t\t<div class=\"ui-state-active\"></div>\n");
          out.write("\t\t<div class=\"ui-state-default\"></div>\n");
          out.write("\t\t<div class=\"ui-state-hover\"></div>\n");
          out.write("\t\t<div class=\"ui-widget-content\"></div>\n");
          out.write("\t</div>\n");
          out.write("\t\n");
          out.write("\t<div style=\"clear: both\"></div>\n");
          out.write("</div>");
          out.write("\n");
          out.write("\t\t\t\t\n");
          out.write("\t\t\t\t<div class=\"display-template\">\n");
          out.write("\t\t\n");
          out.write("\t\t\t\t\t");

						TemplateHandler surveyTemplateHandler = TemplateHandlerRegistryUtil.getTemplateHandler(Survey.class
										.getName());
					
          out.write("\n");
          out.write("\t\t\n");
          out.write("\t\t\t\t\t");
          //  liferay-ddm:template-selector
          com.liferay.dynamic.data.mapping.taglib.servlet.taglib.TemplateSelectorTag _jspx_th_liferay$1ddm_template$1selector_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.dynamic.data.mapping.taglib.servlet.taglib.TemplateSelectorTag.class) : new com.liferay.dynamic.data.mapping.taglib.servlet.taglib.TemplateSelectorTag();
          _jspx_th_liferay$1ddm_template$1selector_0.setPageContext(_jspx_page_context);
          _jspx_th_liferay$1ddm_template$1selector_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
          _jspx_th_liferay$1ddm_template$1selector_0.setClassName(surveyTemplateHandler.getClassName());
          _jspx_th_liferay$1ddm_template$1selector_0.setDisplayStyle(surveyDisplayStyle);
          _jspx_th_liferay$1ddm_template$1selector_0.setDisplayStyleGroupId(surveyDisplayStyleGroupId);
          _jspx_th_liferay$1ddm_template$1selector_0.setRefreshURL(PortalUtil.getCurrentURL(request));
          _jspx_th_liferay$1ddm_template$1selector_0.setShowEmptyOption(false);
          int _jspx_eval_liferay$1ddm_template$1selector_0 = _jspx_th_liferay$1ddm_template$1selector_0.doStartTag();
          if (_jspx_th_liferay$1ddm_template$1selector_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ddm_template$1selector_0);
            _jspx_th_liferay$1ddm_template$1selector_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ddm_template$1selector_0);
          _jspx_th_liferay$1ddm_template$1selector_0.release();
          out.write("\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\t\t\t\t\n");
          out.write("\t\t\t\t");

String[] themeNames = new String[] {
		"liferay_7",
		"humanity",
		"flat_blue",
		"flat_green"
	};

          out.write('\n');
          out.write('\n');
          //  c:set
          org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_15 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.taglibs.standard.tag.rt.core.SetTag.class) : new org.apache.taglibs.standard.tag.rt.core.SetTag();
          _jspx_th_c_set_15.setPageContext(_jspx_page_context);
          _jspx_th_c_set_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
          _jspx_th_c_set_15.setVar("cssTheme");
          _jspx_th_c_set_15.setValue(cssTheme);
          int _jspx_eval_c_set_15 = _jspx_th_c_set_15.doStartTag();
          if (_jspx_th_c_set_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_set_15);
            _jspx_th_c_set_15.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_set_15);
          _jspx_th_c_set_15.release();
          out.write('\n');
          out.write('\n');
          //  aui:select
          com.liferay.taglib.aui.SelectTag _jspx_th_aui_select_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.SelectTag.class) : new com.liferay.taglib.aui.SelectTag();
          _jspx_th_aui_select_0.setPageContext(_jspx_page_context);
          _jspx_th_aui_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
          _jspx_th_aui_select_0.setName("preferences--cssTheme--");
          _jspx_th_aui_select_0.setShowEmptyOption(false);
          _jspx_th_aui_select_0.setCssClass("survey-theme-select");
          int _jspx_eval_aui_select_0 = _jspx_th_aui_select_0.doStartTag();
          if (_jspx_eval_aui_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_aui_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_aui_select_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_aui_select_0.doInitBody();
            }
            do {
              out.write('\n');
              out.write('	');
              //  c:forEach
              org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class) : new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
              _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
              _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
              _jspx_th_c_forEach_0.setItems(themeNames);
              _jspx_th_c_forEach_0.setVar("theme");
              int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
              try {
                int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
                if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    out.write("\n");
                    out.write("\t\t");
                    if (_jspx_meth_aui_option_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
                      return;
                    out.write('\n');
                    out.write('	');
                    int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                }
                if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  return;
                }
              } catch (Throwable _jspx_exception) {
                while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
                  out = _jspx_page_context.popBody();
                _jspx_th_c_forEach_0.doCatch(_jspx_exception);
              } finally {
                _jspx_th_c_forEach_0.doFinally();
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_forEach_0);
                _jspx_th_c_forEach_0.release();
              }
              out.write('\n');
              int evalDoAfterBody = _jspx_th_aui_select_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_aui_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_aui_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_select_0);
            _jspx_th_aui_select_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_select_0);
          _jspx_th_aui_select_0.release();
          out.write("\n");
          out.write("\t\t\t\n");
          out.write("\t\t\t\t");

					List<Survey> scopeSurveys = ListUtil.copy(SurveyLocalServiceUtil.findByG_P(themeDisplay.getScopeGroupId(), false));
					List<Survey> globalSurveys = ListUtil.copy(SurveyLocalServiceUtil.findByG_P(themeDisplay.getCompanyGroupId(), false));
					Collections.sort(scopeSurveys, new SurveyNameComparator());
					Collections.sort(globalSurveys, new SurveyNameComparator());
				
          out.write("\n");
          out.write("\t\t\t\n");
          out.write("\t\t\t\t");
          //  c:set
          org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_16 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.taglibs.standard.tag.rt.core.SetTag.class) : new org.apache.taglibs.standard.tag.rt.core.SetTag();
          _jspx_th_c_set_16.setPageContext(_jspx_page_context);
          _jspx_th_c_set_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
          _jspx_th_c_set_16.setVar("prefSurveyId");
          _jspx_th_c_set_16.setValue(GetterUtil.getLong(portletPreferences.getValue("surveyId", null), 0));
          int _jspx_eval_c_set_16 = _jspx_th_c_set_16.doStartTag();
          if (_jspx_th_c_set_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_set_16);
            _jspx_th_c_set_16.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_set_16);
          _jspx_th_c_set_16.release();
          out.write("\n");
          out.write("\t\t\t\n");
          out.write("\t\t\t\t");
          //  aui:select
          com.liferay.taglib.aui.SelectTag _jspx_th_aui_select_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.SelectTag.class) : new com.liferay.taglib.aui.SelectTag();
          _jspx_th_aui_select_1.setPageContext(_jspx_page_context);
          _jspx_th_aui_select_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
          _jspx_th_aui_select_1.setName("preferences--surveyId--");
          _jspx_th_aui_select_1.setLabel("survey-to-show");
          _jspx_th_aui_select_1.setShowEmptyOption(true);
          int _jspx_eval_aui_select_1 = _jspx_th_aui_select_1.doStartTag();
          if (_jspx_eval_aui_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_aui_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_aui_select_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_aui_select_1.doInitBody();
            }
            do {
              out.write("\n");
              out.write("\t\t\t\t\t<optgroup label=\"Global\">\n");
              out.write("\t\t\t\t\t\t");
              //  c:forEach
              org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class) : new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
              _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
              _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_1);
              _jspx_th_c_forEach_1.setItems(globalSurveys);
              _jspx_th_c_forEach_1.setVar("survey");
              int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
              try {
                int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
                if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t");
                    if (_jspx_meth_aui_option_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
                      return;
                    out.write("\n");
                    out.write("\t\t\t\t\t\t");
                    int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                }
                if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  return;
                }
              } catch (Throwable _jspx_exception) {
                while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
                  out = _jspx_page_context.popBody();
                _jspx_th_c_forEach_1.doCatch(_jspx_exception);
              } finally {
                _jspx_th_c_forEach_1.doFinally();
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_forEach_1);
                _jspx_th_c_forEach_1.release();
              }
              out.write("\n");
              out.write("\t\t\t\t\t</optgroup>\n");
              out.write("\t\t\t\t\t<optgroup label=\"");
              out.print(themeDisplay.getScopeGroupName() );
              out.write("\">\n");
              out.write("\t\t\t\t\t\t");
              //  c:forEach
              org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class) : new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
              _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
              _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_1);
              _jspx_th_c_forEach_2.setItems(scopeSurveys);
              _jspx_th_c_forEach_2.setVar("survey");
              int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
              try {
                int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
                if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t");
                    if (_jspx_meth_aui_option_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
                      return;
                    out.write("\n");
                    out.write("\t\t\t\t\t\t");
                    int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                }
                if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  return;
                }
              } catch (Throwable _jspx_exception) {
                while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
                  out = _jspx_page_context.popBody();
                _jspx_th_c_forEach_2.doCatch(_jspx_exception);
              } finally {
                _jspx_th_c_forEach_2.doFinally();
                if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_c_forEach_2);
                _jspx_th_c_forEach_2.release();
              }
              out.write("\n");
              out.write("\t\t\t\t\t</optgroup>\n");
              out.write("\t\t\t\t");
              int evalDoAfterBody = _jspx_th_aui_select_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_aui_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_aui_select_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_select_1);
            _jspx_th_aui_select_1.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_select_1);
          _jspx_th_aui_select_1.release();
          out.write("\n");
          out.write("\t\t\t\t\n");
          out.write("\t\t\t\t");
          //  aui:input
          com.liferay.taglib.aui.InputTag _jspx_th_aui_input_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
          _jspx_th_aui_input_3.setPageContext(_jspx_page_context);
          _jspx_th_aui_input_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
          _jspx_th_aui_input_3.setType("checkbox");
          _jspx_th_aui_input_3.setName("preferences--showResults--");
          _jspx_th_aui_input_3.setLabel("show-survey-results");
          _jspx_th_aui_input_3.setChecked(GetterUtil.getBoolean(portletPreferences.getValue("showResults", null), false) );
          _jspx_th_aui_input_3.setWrapperCssClass("show-survey-results");
          int _jspx_eval_aui_input_3 = _jspx_th_aui_input_3.doStartTag();
          if (_jspx_th_aui_input_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_3);
            _jspx_th_aui_input_3.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_3);
          _jspx_th_aui_input_3.release();
          out.write("\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_liferay$1ui_icon$1help_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_aui_button$1row_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_fieldset_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t");
        }
        if (_jspx_th_aui_fieldset_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_fieldset_0);
          _jspx_th_aui_fieldset_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_fieldset_0);
        _jspx_th_aui_fieldset_0.release();
        out.write("\n");
        out.write("\t\t");
      }
      if (_jspx_th_aui_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_form_0);
        _jspx_th_aui_form_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_form_0);
      _jspx_th_aui_form_0.release();
      out.write("\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      if (_jspx_meth_aui_script_0(_jspx_page_context))
        return;
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_aui_input_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:input
    com.liferay.taglib.aui.InputTag _jspx_th_aui_input_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
    _jspx_th_aui_input_0.setPageContext(_jspx_page_context);
    _jspx_th_aui_input_0.setParent(null);
    _jspx_th_aui_input_0.setCssClass("preview-url");
    _jspx_th_aui_input_0.setName("previewUrl");
    _jspx_th_aui_input_0.setType("hidden");
    _jspx_th_aui_input_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${previewURL}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_aui_input_0 = _jspx_th_aui_input_0.doStartTag();
    if (_jspx_th_aui_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_0);
      _jspx_th_aui_input_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_0);
    _jspx_th_aui_input_0.release();
    return false;
  }

  private boolean _jspx_meth_aui_input_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:input
    com.liferay.taglib.aui.InputTag _jspx_th_aui_input_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
    _jspx_th_aui_input_1.setPageContext(_jspx_page_context);
    _jspx_th_aui_input_1.setParent(null);
    _jspx_th_aui_input_1.setName("surveyType");
    _jspx_th_aui_input_1.setType("hidden");
    _jspx_th_aui_input_1.setValue(new String("survey"));
    int _jspx_eval_aui_input_1 = _jspx_th_aui_input_1.doStartTag();
    if (_jspx_th_aui_input_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_1);
      _jspx_th_aui_input_1.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_1);
    _jspx_th_aui_input_1.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
    _jspx_th_liferay$1ui_message_0.setKey("survey-config-preview");
    int _jspx_eval_liferay$1ui_message_0 = _jspx_th_liferay$1ui_message_0.doStartTag();
    if (_jspx_th_liferay$1ui_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_0);
      _jspx_th_liferay$1ui_message_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_0);
    _jspx_th_liferay$1ui_message_0.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
    _jspx_th_liferay$1ui_message_1.setKey("display-template");
    int _jspx_eval_liferay$1ui_message_1 = _jspx_th_liferay$1ui_message_1.doStartTag();
    if (_jspx_th_liferay$1ui_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_1);
      _jspx_th_liferay$1ui_message_1.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_1);
    _jspx_th_liferay$1ui_message_1.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_2(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_2.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
    _jspx_th_liferay$1ui_message_2.setKey("css-theme");
    int _jspx_eval_liferay$1ui_message_2 = _jspx_th_liferay$1ui_message_2.doStartTag();
    if (_jspx_th_liferay$1ui_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_2);
      _jspx_th_liferay$1ui_message_2.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_2);
    _jspx_th_liferay$1ui_message_2.release();
    return false;
  }

  private boolean _jspx_meth_aui_option_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:option
    com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
    _jspx_th_aui_option_0.setPageContext(_jspx_page_context);
    _jspx_th_aui_option_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_aui_option_0.setLabel((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("theme-${theme}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_aui_option_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${theme}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_aui_option_0.setSelected(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${theme eq cssTheme}", boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_aui_option_0 = _jspx_th_aui_option_0.doStartTag();
    if (_jspx_th_aui_option_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_0);
      _jspx_th_aui_option_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_0);
    _jspx_th_aui_option_0.release();
    return false;
  }

  private boolean _jspx_meth_aui_option_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:option
    com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
    _jspx_th_aui_option_1.setPageContext(_jspx_page_context);
    _jspx_th_aui_option_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_aui_option_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${survey.surveyId}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_aui_option_1.setSelected(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${survey.surveyId == prefSurveyId}", boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_aui_option_1 = _jspx_th_aui_option_1.doStartTag();
    if (_jspx_eval_aui_option_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${survey.nameDefaultLocale}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    }
    if (_jspx_th_aui_option_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_1);
      _jspx_th_aui_option_1.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_1);
    _jspx_th_aui_option_1.release();
    return false;
  }

  private boolean _jspx_meth_aui_option_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:option
    com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.OptionTag.class) : new com.liferay.taglib.aui.OptionTag();
    _jspx_th_aui_option_2.setPageContext(_jspx_page_context);
    _jspx_th_aui_option_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_aui_option_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${survey.surveyId}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_aui_option_2.setSelected(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${survey.surveyId == prefSurveyId}", boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_aui_option_2 = _jspx_th_aui_option_2.doStartTag();
    if (_jspx_eval_aui_option_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${survey.nameDefaultLocale}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    }
    if (_jspx_th_aui_option_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_2);
      _jspx_th_aui_option_2.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_option_2);
    _jspx_th_aui_option_2.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_icon$1help_0(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:icon-help
    com.liferay.taglib.ui.IconHelpTag _jspx_th_liferay$1ui_icon$1help_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.IconHelpTag.class) : new com.liferay.taglib.ui.IconHelpTag();
    _jspx_th_liferay$1ui_icon$1help_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_icon$1help_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
    _jspx_th_liferay$1ui_icon$1help_0.setMessage("help-show-survey-results");
    int _jspx_eval_liferay$1ui_icon$1help_0 = _jspx_th_liferay$1ui_icon$1help_0.doStartTag();
    if (_jspx_th_liferay$1ui_icon$1help_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon$1help_0);
      _jspx_th_liferay$1ui_icon$1help_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_icon$1help_0);
    _jspx_th_liferay$1ui_icon$1help_0.release();
    return false;
  }

  private boolean _jspx_meth_aui_button$1row_0(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_fieldset_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:button-row
    com.liferay.taglib.aui.ButtonRowTag _jspx_th_aui_button$1row_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonRowTag.class) : new com.liferay.taglib.aui.ButtonRowTag();
    _jspx_th_aui_button$1row_0.setPageContext(_jspx_page_context);
    _jspx_th_aui_button$1row_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
    int _jspx_eval_aui_button$1row_0 = _jspx_th_aui_button$1row_0.doStartTag();
    if (_jspx_eval_aui_button$1row_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_aui_button_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_button$1row_0, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("\t\t\t\t");
    }
    if (_jspx_th_aui_button$1row_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button$1row_0);
      _jspx_th_aui_button$1row_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button$1row_0);
    _jspx_th_aui_button$1row_0.release();
    return false;
  }

  private boolean _jspx_meth_aui_button_0(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_button$1row_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:button
    com.liferay.taglib.aui.ButtonTag _jspx_th_aui_button_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonTag.class) : new com.liferay.taglib.aui.ButtonTag();
    _jspx_th_aui_button_0.setPageContext(_jspx_page_context);
    _jspx_th_aui_button_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_button$1row_0);
    _jspx_th_aui_button_0.setType("submit");
    int _jspx_eval_aui_button_0 = _jspx_th_aui_button_0.doStartTag();
    if (_jspx_th_aui_button_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_0);
      _jspx_th_aui_button_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button_0);
    _jspx_th_aui_button_0.release();
    return false;
  }

  private boolean _jspx_meth_aui_script_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:script
    com.liferay.taglib.aui.ScriptTag _jspx_th_aui_script_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ScriptTag.class) : new com.liferay.taglib.aui.ScriptTag();
    _jspx_th_aui_script_0.setPageContext(_jspx_page_context);
    _jspx_th_aui_script_0.setParent(null);
    int _jspx_eval_aui_script_0 = _jspx_th_aui_script_0.doStartTag();
    if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_aui_script_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_aui_script_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\tAUI().ready(function() {\n");
        out.write("\t\tsetTimeout(survey.viewer.initConfig.bind(survey.viewer), 1000);\n");
        out.write("\t});\n");
        int evalDoAfterBody = _jspx_th_aui_script_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_aui_script_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_script_0);
      _jspx_th_aui_script_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_script_0);
    _jspx_th_aui_script_0.release();
    return false;
  }
}
