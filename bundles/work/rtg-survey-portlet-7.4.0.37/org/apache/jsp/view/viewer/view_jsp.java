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

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:length", org.apache.taglibs.standard.functions.Functions.class, "length", new Class[] {java.lang.Object.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/view/viewer/init.jsp");
    _jspx_dependants.add("/view/viewer/../init.jsp");
    _jspx_dependants.add("/view/viewer/language_selection.jspf");
    _jspx_dependants.add("/view/viewer/survey_result.jspf");
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
	String themePath = new StringBuilder(request.getContextPath()).append("/css/themes/")
			.append(cssTheme).append(".css").toString();

      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(themePath);
      out.write("\" />\n");
      out.write("\n");
      out.write("<div class=\"");
      out.print(cssTheme );
      out.write("\">\n");
      out.write("\t");
      out.write("\n");
      out.write("\t\t");
if (
surveyId > 0 && !SurveyPermission.contains(permissionChecker, surveyId, ActionKeys.VIEW) ) {
      out.write("\n");
      out.write("\t\t\t<div class=\"alert alert-error\">\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_liferay$1ui_message_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t");
      //  liferay-ui:error
      com.liferay.taglib.ui.ErrorTag _jspx_th_liferay$1ui_error_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.ErrorTag.class) : new com.liferay.taglib.ui.ErrorTag();
      _jspx_th_liferay$1ui_error_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_error_0.setParent(null);
      _jspx_th_liferay$1ui_error_0.setKey("error-processing-file");
      int _jspx_eval_liferay$1ui_error_0 = _jspx_th_liferay$1ui_error_0.doStartTag();
      if (_jspx_th_liferay$1ui_error_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_0);
        _jspx_th_liferay$1ui_error_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_error_0);
      _jspx_th_liferay$1ui_error_0.release();
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t");
}
else if (
Validator.isNotNull(displayStyle) && displayStyleGroupId != 0 && surveyId > 0 ) {
      out.write("\n");
      out.write("\t\t\t");

				Map<String, Object> contextObjects = new HashMap<String, Object>();
	
				List<Survey> surveys = new ArrayList<Survey>();
				
				if (surveyId != 0) {
					surveys.add(survey);
				}
				
				Result oldResult = null;
				
				if (themeDisplay.isSignedIn() && !survey.isMultipleSubmissions()) {
					List<Result> oldResults = ResultLocalServiceUtil.findByS_U(survey.getSurveyId(), user.getUserId());
	
					if (oldResults.size() >= 1) {
						oldResult = oldResults.get(0);
					}
				} else if (!survey.isMultipleSubmissions()) {
					Object attribute = portletSession.getAttribute(SurveyViewerPortlet.RESULT_ID_SESSION_KEY + survey.getSurveyId(), PortletSession.APPLICATION_SCOPE);
					
					if (attribute != null) {
						long resultId = (Long) attribute;
						oldResult = ResultLocalServiceUtil.fetchResult(resultId);
					}
				}
				
				contextObjects.put("surveyLocale", surveyLocale);
				contextObjects.put("oldResult", oldResult);
				
				Date now = new Date();
			
      out.write("\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t");
if (
surveyId != 0 && (now.before(survey.getStartDate())
										|| (survey.getEndDate() != null && now.after(survey.getEndDate())))) {
      out.write("\n");
      out.write("\t\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_liferay$1ui_message_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t");
}
else if (
surveyId != 0) {
      out.write("\n");
      out.write("\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
if (
!GetterUtil.getBoolean(portletPreferences.getValue("showResults", null), false) ) {
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");
      //  portlet:actionURL
      com.liferay.taglib.portlet.ActionURLTag _jspx_th_portlet_actionURL_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ActionURLTag.class) : new com.liferay.taglib.portlet.ActionURLTag();
      _jspx_th_portlet_actionURL_0.setPageContext(_jspx_page_context);
      _jspx_th_portlet_actionURL_0.setParent(null);
      _jspx_th_portlet_actionURL_0.setVar("submitSurveyURL");
      _jspx_th_portlet_actionURL_0.setName("submitSurvey");
      int _jspx_eval_portlet_actionURL_0 = _jspx_th_portlet_actionURL_0.doStartTag();
      if (_jspx_eval_portlet_actionURL_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t");
        //  portlet:param
        com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
        _jspx_th_portlet_param_0.setPageContext(_jspx_page_context);
        _jspx_th_portlet_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_actionURL_0);
        _jspx_th_portlet_param_0.setName("surveyLanguage");
        _jspx_th_portlet_param_0.setValue(languageParameter);
        int _jspx_eval_portlet_param_0 = _jspx_th_portlet_param_0.doStartTag();
        if (_jspx_th_portlet_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_0);
          _jspx_th_portlet_param_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_0);
        _jspx_th_portlet_param_0.release();
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
      }
      if (_jspx_th_portlet_actionURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_0);
        _jspx_th_portlet_actionURL_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_actionURL_0);
      _jspx_th_portlet_actionURL_0.release();
      java.lang.String submitSurveyURL = null;
      submitSurveyURL = (java.lang.String) _jspx_page_context.findAttribute("submitSurveyURL");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_15 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.taglibs.standard.tag.rt.core.SetTag.class) : new org.apache.taglibs.standard.tag.rt.core.SetTag();
      _jspx_th_c_set_15.setPageContext(_jspx_page_context);
      _jspx_th_c_set_15.setParent(null);
      _jspx_th_c_set_15.setVar("availableTranslations");
      _jspx_th_c_set_15.setValue(survey.getAvailableLanguageIds() );
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
if (
((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty availableTranslations && fn:length(availableTranslations) gt 1}", boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0)).booleanValue()) {
      out.write('\n');
      out.write('	');
      //  portlet:renderURL
      com.liferay.taglib.portlet.RenderURLTag _jspx_th_portlet_renderURL_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.RenderURLTag.class) : new com.liferay.taglib.portlet.RenderURLTag();
      _jspx_th_portlet_renderURL_0.setPageContext(_jspx_page_context);
      _jspx_th_portlet_renderURL_0.setParent(null);
      _jspx_th_portlet_renderURL_0.setVar("translateURL");
      int _jspx_eval_portlet_renderURL_0 = _jspx_th_portlet_renderURL_0.doStartTag();
      if (_jspx_th_portlet_renderURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_renderURL_0);
        _jspx_th_portlet_renderURL_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_renderURL_0);
      _jspx_th_portlet_renderURL_0.release();
      java.lang.String translateURL = null;
      translateURL = (java.lang.String) _jspx_page_context.findAttribute("translateURL");
      out.write("\n");
      out.write("\n");
      out.write("\t<ul class=\"survey-translations\">\n");
      out.write("\t\t<li>\n");
      out.write("\t\t\t");
      if (_jspx_meth_liferay$1ui_message_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t</li>\n");
      out.write("\t\n");
      out.write("\t\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t</ul>\n");
}
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\t\t\t");
      //  aui:form
      com.liferay.taglib.aui.FormTag _jspx_th_aui_form_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.FormTag.class) : new com.liferay.taglib.aui.FormTag();
      _jspx_th_aui_form_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_form_0.setParent(null);
      _jspx_th_aui_form_0.setAction(submitSurveyURL);
      _jspx_th_aui_form_0.setMethod("post");
      _jspx_th_aui_form_0.setName("fm_survey");
      _jspx_th_aui_form_0.setDynamicAttribute(null, "enctype", new String("multipart/form-data"));
      int _jspx_eval_aui_form_0 = _jspx_th_aui_form_0.doStartTag();
      if (_jspx_eval_aui_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
        //  aui:input
        com.liferay.taglib.aui.InputTag _jspx_th_aui_input_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.InputTag.class) : new com.liferay.taglib.aui.InputTag();
        _jspx_th_aui_input_0.setPageContext(_jspx_page_context);
        _jspx_th_aui_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_aui_input_0.setType("hidden");
        _jspx_th_aui_input_0.setName("surveyId");
        _jspx_th_aui_input_0.setValue(surveyId);
        int _jspx_eval_aui_input_0 = _jspx_th_aui_input_0.doStartTag();
        if (_jspx_th_aui_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_0);
          _jspx_th_aui_input_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_input_0);
        _jspx_th_aui_input_0.release();
        out.write("\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t\t\t\t\t");
        //  liferay-ddm:template-renderer
        com.liferay.dynamic.data.mapping.taglib.servlet.taglib.TemplateRendererTag _jspx_th_liferay$1ddm_template$1renderer_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.dynamic.data.mapping.taglib.servlet.taglib.TemplateRendererTag.class) : new com.liferay.dynamic.data.mapping.taglib.servlet.taglib.TemplateRendererTag();
        _jspx_th_liferay$1ddm_template$1renderer_0.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1ddm_template$1renderer_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_form_0);
        _jspx_th_liferay$1ddm_template$1renderer_0.setDisplayStyle(displayStyle);
        _jspx_th_liferay$1ddm_template$1renderer_0.setClassName(Survey.class.getName());
        _jspx_th_liferay$1ddm_template$1renderer_0.setDisplayStyleGroupId(displayStyleGroupId);
        _jspx_th_liferay$1ddm_template$1renderer_0.setEntries(surveys);
        _jspx_th_liferay$1ddm_template$1renderer_0.setContextObjects(contextObjects);
        int _jspx_eval_liferay$1ddm_template$1renderer_0 = _jspx_th_liferay$1ddm_template$1renderer_0.doStartTag();
        if (_jspx_th_liferay$1ddm_template$1renderer_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ddm_template$1renderer_0);
          _jspx_th_liferay$1ddm_template$1renderer_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ddm_template$1renderer_0);
        _jspx_th_liferay$1ddm_template$1renderer_0.release();
        out.write("\n");
        out.write("\t\t\t\t\t\t\t");
      }
      if (_jspx_th_aui_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_form_0);
        _jspx_th_aui_form_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_form_0);
      _jspx_th_aui_form_0.release();
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
}
else {
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");
      out.write("<div id=\"question-container\" class=\"survey-result\">\n");
      out.write("\t");
      //  liferay-portlet:resourceURL
      com.liferay.taglib.portlet.ResourceURLTag _jspx_th_liferay$1portlet_resourceURL_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.ResourceURLTag.class) : new com.liferay.taglib.portlet.ResourceURLTag();
      _jspx_th_liferay$1portlet_resourceURL_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1portlet_resourceURL_0.setParent(null);
      _jspx_th_liferay$1portlet_resourceURL_0.setId("getSurveyResults");
      _jspx_th_liferay$1portlet_resourceURL_0.setVar("getSurveyResultsURL");
      int _jspx_eval_liferay$1portlet_resourceURL_0 = _jspx_th_liferay$1portlet_resourceURL_0.doStartTag();
      if (_jspx_th_liferay$1portlet_resourceURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_resourceURL_0);
        _jspx_th_liferay$1portlet_resourceURL_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_resourceURL_0);
      _jspx_th_liferay$1portlet_resourceURL_0.release();
      java.lang.String getSurveyResultsURL = null;
      getSurveyResultsURL = (java.lang.String) _jspx_page_context.findAttribute("getSurveyResultsURL");
      out.write("\n");
      out.write("\t\n");
      out.write("\t<ul id=\"result-container\">\n");
      out.write("\t\t");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class) : new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
      _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_1.setParent(null);
      _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${survey.questions}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_1.setVar("surveyQuestion");
      int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
        if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("\t\t\t");
if (
((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${surveyQuestion.parentId == 0}", boolean.class, (PageContext)_jspx_page_context, null)).booleanValue()) {
            out.write("\n");
            out.write("\t\t\t\t");
            out.write("\n");
            out.write("\t\t\t\t\t");
if (
((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${surveyQuestion.type == 0 or surveyQuestion.type == 5}", boolean.class, (PageContext)_jspx_page_context, null)).booleanValue()) {
            out.write("\n");
            out.write("\t\t\t\t\t\t<li class=\"question result-container ui-widget ui-widget-content ui-corner-all\">\n");
            out.write("\t\t\t\t\t\t\t<div class=\"question-header ui-widget-header ui-corner-all\">\n");
            out.write("\t\t\t\t\t\t\t\t<span class=\"question-text\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${surveyQuestion.getText(surveyLocale)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</span>\n");
            out.write("\t\t\t\t\t\t\t</div>\n");
            out.write("\t\t\t\t\t\t\n");
            out.write("\t\t\t\t\t\t\t<ul class=\"child-questions\">\n");
            out.write("\t\t\t\t\t\t\t\t");
            //  c:forEach
            org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class) : new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
            _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
            _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
            _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${surveyQuestion.childQuestions}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
            _jspx_th_c_forEach_2.setVar("childQuestion");
            int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
            try {
              int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
              if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t\t");
                  //  liferay-util:include
                  com.liferay.taglib.util.IncludeTag _jspx_th_liferay$1util_include_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.IncludeTag.class) : new com.liferay.taglib.util.IncludeTag();
                  _jspx_th_liferay$1util_include_0.setPageContext(_jspx_page_context);
                  _jspx_th_liferay$1util_include_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
                  _jspx_th_liferay$1util_include_0.setPage("/view/viewer/question_result.jsp");
                  _jspx_th_liferay$1util_include_0.setServletContext( application );
                  int _jspx_eval_liferay$1util_include_0 = _jspx_th_liferay$1util_include_0.doStartTag();
                  if (_jspx_eval_liferay$1util_include_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t\t");
                    if (_jspx_meth_liferay$1util_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1util_include_0, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
                      return;
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t\t");
                    if (_jspx_meth_liferay$1util_param_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1util_include_0, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
                      return;
                    out.write("\n");
                    out.write("\t\t\t\t\t\t\t\t\t");
                  }
                  if (_jspx_th_liferay$1util_include_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_include_0);
                    _jspx_th_liferay$1util_include_0.release();
                    return;
                  }
                  if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_include_0);
                  _jspx_th_liferay$1util_include_0.release();
                  out.write("\n");
                  out.write("\t\t\t\t\t\t\t\t");
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
            out.write("\t\t\t\t\t\t\t</ul>\n");
            out.write("\t\t\t\t\t\t</li>\n");
            out.write("\t\t\t\t\t");
            out.write("\n");
            out.write("\t\t\t\t\t");
}
else {
            out.write("\n");
            out.write("\t\t\t\t\t\t");
            //  liferay-util:include
            com.liferay.taglib.util.IncludeTag _jspx_th_liferay$1util_include_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.IncludeTag.class) : new com.liferay.taglib.util.IncludeTag();
            _jspx_th_liferay$1util_include_1.setPageContext(_jspx_page_context);
            _jspx_th_liferay$1util_include_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
            _jspx_th_liferay$1util_include_1.setPage("/view/viewer/question_result.jsp");
            _jspx_th_liferay$1util_include_1.setServletContext( application );
            int _jspx_eval_liferay$1util_include_1 = _jspx_th_liferay$1util_include_1.doStartTag();
            if (_jspx_eval_liferay$1util_include_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              if (_jspx_meth_liferay$1util_param_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1util_include_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
                return;
              out.write("\n");
              out.write("\t\t\t\t\t\t\t");
              if (_jspx_meth_liferay$1util_param_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1util_include_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
                return;
              out.write("\n");
              out.write("\t\t\t\t\t\t");
            }
            if (_jspx_th_liferay$1util_include_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_include_1);
              _jspx_th_liferay$1util_include_1.release();
              return;
            }
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_include_1);
            _jspx_th_liferay$1util_include_1.release();
            out.write("\n");
            out.write("\t\t\t\t\t");
            out.write("\n");
            out.write("\t\t\t\t");
}
            out.write("\n");
            out.write("\t\t\t");
}
            out.write("\n");
            out.write("\t\t");
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
      out.write("\t</ul>\n");
      out.write("\t\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\tjQuery(function() {\n");
      out.write("\t\t\tvar url = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${getSurveyResultsURL}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("';\n");
      out.write("\t\t\tvar surveyId = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${survey.surveyId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";\n");
      out.write("\t\t\tvar surveyLocale = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${surveyLocale}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("';\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tsurvey.viewer.showSurveyResults(url, surveyId, surveyLocale);\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("</div>");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t");
}
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("\t\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t");
}
else {
      out.write("\n");
      out.write("\t\t\t<p>\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_liferay$1ui_message_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t");

			Group controlPanelGroup = GroupLocalServiceUtil.fetchFriendlyURLGroup(
					user.getCompanyId(), GroupConstants.CONTROL_PANEL_FRIENDLY_URL);
			
			Layout controlPanelLayout = LayoutLocalServiceUtil.fetchFirstLayout(
					controlPanelGroup.getGroupId(), true, 0);
			
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t");
      //  liferay-portlet:renderURL
      com.liferay.taglib.portlet.RenderURLTag _jspx_th_liferay$1portlet_renderURL_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.RenderURLTag.class) : new com.liferay.taglib.portlet.RenderURLTag();
      _jspx_th_liferay$1portlet_renderURL_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1portlet_renderURL_0.setParent(null);
      _jspx_th_liferay$1portlet_renderURL_0.setDoAsGroupId( themeDisplay.getScopeGroupId() );
      _jspx_th_liferay$1portlet_renderURL_0.setPortletName( themeDisplay.getPortletDisplay().getId().replace("surveyviewer", "surveyeditor") );
      _jspx_th_liferay$1portlet_renderURL_0.setVar("editorURL");
      _jspx_th_liferay$1portlet_renderURL_0.setWindowState( WindowState.MAXIMIZED.toString() );
      _jspx_th_liferay$1portlet_renderURL_0.setPlid( controlPanelLayout.getPlid() );
      int _jspx_eval_liferay$1portlet_renderURL_0 = _jspx_th_liferay$1portlet_renderURL_0.doStartTag();
      if (_jspx_th_liferay$1portlet_renderURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_renderURL_0);
        _jspx_th_liferay$1portlet_renderURL_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_renderURL_0);
      _jspx_th_liferay$1portlet_renderURL_0.release();
      java.lang.String editorURL = null;
      editorURL = (java.lang.String) _jspx_page_context.findAttribute("editorURL");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<p>\n");
      out.write("\t\t\t\t");
      //  liferay-ui:message
      com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
      _jspx_th_liferay$1ui_message_4.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_message_4.setParent(null);
      _jspx_th_liferay$1ui_message_4.setKey("please-create-a-survey-and-configure-this-portlet");
      _jspx_th_liferay$1ui_message_4.setArguments(new String[]{editorURL, portletDisplay.getURLConfiguration(),
						portletDisplay.getURLConfigurationJS()} );
      int _jspx_eval_liferay$1ui_message_4 = _jspx_th_liferay$1ui_message_4.doStartTag();
      if (_jspx_th_liferay$1ui_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_4);
        _jspx_th_liferay$1ui_message_4.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_4);
      _jspx_th_liferay$1ui_message_4.release();
      out.write("\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t");
      out.write('\n');
      out.write('	');
}
      out.write("\n");
      out.write("</div>");
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

  private boolean _jspx_meth_liferay$1ui_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_0.setParent(null);
    _jspx_th_liferay$1ui_message_0.setKey("permission-error-view");
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

  private boolean _jspx_meth_liferay$1ui_message_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_1.setParent(null);
    _jspx_th_liferay$1ui_message_1.setKey("error-survey-not-active");
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

  private boolean _jspx_meth_liferay$1ui_message_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_2.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_2.setParent(null);
    _jspx_th_liferay$1ui_message_2.setKey("survey-change-language");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class) : new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${availableTranslations}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("translation");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t<li>\n");
          out.write("\t\t\t\t<a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${translateURL}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('&');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${renderResponse.namespace}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("surveyLanguage=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${translation}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&surveyId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${survey.surveyId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("\t\t\t\t\t<img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${themeDisplay.pathThemeImages}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("/language/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${translation}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".png\" />\n");
          out.write("\t\t\t\t</a>\n");
          out.write("\t\t\t</li>\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
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
    return false;
  }

  private boolean _jspx_meth_liferay$1util_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1util_include_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-util:param
    com.liferay.taglib.util.ParamTag _jspx_th_liferay$1util_param_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
    _jspx_th_liferay$1util_param_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1util_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1util_include_0);
    _jspx_th_liferay$1util_param_0.setName("questionId");
    _jspx_th_liferay$1util_param_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${childQuestion.questionId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_liferay$1util_param_0 = _jspx_th_liferay$1util_param_0.doStartTag();
    if (_jspx_th_liferay$1util_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_param_0);
      _jspx_th_liferay$1util_param_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_param_0);
    _jspx_th_liferay$1util_param_0.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1util_param_1(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1util_include_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-util:param
    com.liferay.taglib.util.ParamTag _jspx_th_liferay$1util_param_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
    _jspx_th_liferay$1util_param_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1util_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1util_include_0);
    _jspx_th_liferay$1util_param_1.setName("surveyLanguage");
    _jspx_th_liferay$1util_param_1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${surveyLocale}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_liferay$1util_param_1 = _jspx_th_liferay$1util_param_1.doStartTag();
    if (_jspx_th_liferay$1util_param_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_param_1);
      _jspx_th_liferay$1util_param_1.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_param_1);
    _jspx_th_liferay$1util_param_1.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1util_param_2(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1util_include_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-util:param
    com.liferay.taglib.util.ParamTag _jspx_th_liferay$1util_param_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
    _jspx_th_liferay$1util_param_2.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1util_param_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1util_include_1);
    _jspx_th_liferay$1util_param_2.setName("questionId");
    _jspx_th_liferay$1util_param_2.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${surveyQuestion.questionId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_liferay$1util_param_2 = _jspx_th_liferay$1util_param_2.doStartTag();
    if (_jspx_th_liferay$1util_param_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_param_2);
      _jspx_th_liferay$1util_param_2.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_param_2);
    _jspx_th_liferay$1util_param_2.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1util_param_3(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1util_include_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-util:param
    com.liferay.taglib.util.ParamTag _jspx_th_liferay$1util_param_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
    _jspx_th_liferay$1util_param_3.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1util_param_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1util_include_1);
    _jspx_th_liferay$1util_param_3.setName("surveyLanguage");
    _jspx_th_liferay$1util_param_3.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${surveyLocale}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_liferay$1util_param_3 = _jspx_th_liferay$1util_param_3.doStartTag();
    if (_jspx_th_liferay$1util_param_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_param_3);
      _jspx_th_liferay$1util_param_3.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1util_param_3);
    _jspx_th_liferay$1util_param_3.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_3.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_3.setParent(null);
    _jspx_th_liferay$1ui_message_3.setKey("no-template-or-survey-configured");
    int _jspx_eval_liferay$1ui_message_3 = _jspx_th_liferay$1ui_message_3.doStartTag();
    if (_jspx_th_liferay$1ui_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_3);
      _jspx_th_liferay$1ui_message_3.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_3);
    _jspx_th_liferay$1ui_message_3.release();
    return false;
  }
}
