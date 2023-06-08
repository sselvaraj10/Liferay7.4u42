package org.apache.jsp.view.editor;

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

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(12);
    _jspx_dependants.add("/view/editor/../init.jsp");
    _jspx_dependants.add("/META-INF/c.tld");
    _jspx_dependants.add("/WEB-INF/tld/liferay-portlet_2_0.tld");
    _jspx_dependants.add("/META-INF/fmt.tld");
    _jspx_dependants.add("/META-INF/fn.tld");
    _jspx_dependants.add("/WEB-INF/tld/liferay-portlet-ext.tld");
    _jspx_dependants.add("/WEB-INF/tld/liferay-theme.tld");
    _jspx_dependants.add("/WEB-INF/tld/liferay-ui.tld");
    _jspx_dependants.add("/META-INF/resources/liferay-ddm.tld");
    _jspx_dependants.add("/WEB-INF/tld/liferay-util.tld");
    _jspx_dependants.add("/WEB-INF/tld/liferay-security.tld");
    _jspx_dependants.add("/WEB-INF/tld/liferay-aui.tld");
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

	int surveyCount = SurveyLocalServiceUtil.getSurveysCount(scopeGroupId);

      out.write('\n');
      out.write('\n');
      if (_jspx_meth_liferay$1ui_success_0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_liferay$1ui_success_1(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
      //  aui:button-row
      com.liferay.taglib.aui.ButtonRowTag _jspx_th_aui_button$1row_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ButtonRowTag.class) : new com.liferay.taglib.aui.ButtonRowTag();
      _jspx_th_aui_button$1row_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_button$1row_0.setParent(null);
      _jspx_th_aui_button$1row_0.setCssClass("survey-admin-buttons");
      int _jspx_eval_aui_button$1row_0 = _jspx_th_aui_button$1row_0.doStartTag();
      if (_jspx_eval_aui_button$1row_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write('\n');
        out.write('	');
if (
SurveyModelPermission.contains(permissionChecker, scopeGroupId, "ADD_SURVEY")) {
        out.write("\n");
        out.write("\t\t");
        //  portlet:renderURL
        com.liferay.taglib.portlet.RenderURLTag _jspx_th_portlet_renderURL_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.RenderURLTag.class) : new com.liferay.taglib.portlet.RenderURLTag();
        _jspx_th_portlet_renderURL_0.setPageContext(_jspx_page_context);
        _jspx_th_portlet_renderURL_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_button$1row_0);
        _jspx_th_portlet_renderURL_0.setVar("addSurveyURL");
        int _jspx_eval_portlet_renderURL_0 = _jspx_th_portlet_renderURL_0.doStartTag();
        if (_jspx_eval_portlet_renderURL_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t\t");
          if (_jspx_meth_portlet_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_portlet_renderURL_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t");
        }
        if (_jspx_th_portlet_renderURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_renderURL_0);
          _jspx_th_portlet_renderURL_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_renderURL_0);
        _jspx_th_portlet_renderURL_0.release();
        java.lang.String addSurveyURL = null;
        addSurveyURL = (java.lang.String) _jspx_page_context.findAttribute("addSurveyURL");
        out.write("\n");
        out.write("\n");
        out.write("\t\t");
        if (_jspx_meth_aui_button_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_button$1row_0, _jspx_page_context))
          return;
        out.write('\n');
        out.write('	');
}
        out.write('\n');
      }
      if (_jspx_th_aui_button$1row_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button$1row_0);
        _jspx_th_aui_button$1row_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_button$1row_0);
      _jspx_th_aui_button$1row_0.release();
      out.write('\n');
      out.write('\n');
      //  liferay-portlet:renderURL
      com.liferay.taglib.portlet.RenderURLTag _jspx_th_liferay$1portlet_renderURL_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.RenderURLTag.class) : new com.liferay.taglib.portlet.RenderURLTag();
      _jspx_th_liferay$1portlet_renderURL_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1portlet_renderURL_0.setParent(null);
      _jspx_th_liferay$1portlet_renderURL_0.setVarImpl("iteratorURL");
      int _jspx_eval_liferay$1portlet_renderURL_0 = _jspx_th_liferay$1portlet_renderURL_0.doStartTag();
      if (_jspx_th_liferay$1portlet_renderURL_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_renderURL_0);
        _jspx_th_liferay$1portlet_renderURL_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1portlet_renderURL_0);
      _jspx_th_liferay$1portlet_renderURL_0.release();
      com.liferay.portal.kernel.portlet.LiferayPortletURL iteratorURL = null;
      iteratorURL = (com.liferay.portal.kernel.portlet.LiferayPortletURL) _jspx_page_context.findAttribute("iteratorURL");
      out.write('\n');
      out.write('\n');
      //  liferay-ui:search-container
      com.liferay.taglib.ui.SearchContainerTag _jspx_th_liferay$1ui_search$1container_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerTag.class) : new com.liferay.taglib.ui.SearchContainerTag();
      _jspx_th_liferay$1ui_search$1container_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1ui_search$1container_0.setParent(null);
      _jspx_th_liferay$1ui_search$1container_0.setDeltaConfigurable( true );
      _jspx_th_liferay$1ui_search$1container_0.setId("surveys");
      _jspx_th_liferay$1ui_search$1container_0.setIteratorURL( iteratorURL );
      _jspx_th_liferay$1ui_search$1container_0.setTotal( surveyCount );
      int _jspx_eval_liferay$1ui_search$1container_0 = _jspx_th_liferay$1ui_search$1container_0.doStartTag();
      if (_jspx_eval_liferay$1ui_search$1container_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Integer total = null;
        com.liferay.portal.kernel.dao.search.SearchContainer searchContainer = null;
        total = (java.lang.Integer) _jspx_page_context.findAttribute("total");
        searchContainer = (com.liferay.portal.kernel.dao.search.SearchContainer) _jspx_page_context.findAttribute("searchContainer");
        out.write('\n');
        out.write('	');
        //  liferay-ui:search-container-results
        java.util.List results = null;
        java.lang.Integer deprecatedTotal = null;
        com.liferay.taglib.ui.SearchContainerResultsTag _jspx_th_liferay$1ui_search$1container$1results_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerResultsTag.class) : new com.liferay.taglib.ui.SearchContainerResultsTag();
        _jspx_th_liferay$1ui_search$1container$1results_0.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1ui_search$1container$1results_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container_0);
        _jspx_th_liferay$1ui_search$1container$1results_0.setResults(SurveyLocalServiceUtil.getSurveys(scopeGroupId, searchContainer.getStart(), searchContainer.getEnd()));
        int _jspx_eval_liferay$1ui_search$1container$1results_0 = _jspx_th_liferay$1ui_search$1container$1results_0.doStartTag();
        results = (java.util.List) _jspx_page_context.findAttribute("results");
        deprecatedTotal = (java.lang.Integer) _jspx_page_context.findAttribute("deprecatedTotal");
        if (_jspx_th_liferay$1ui_search$1container$1results_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1results_0);
          _jspx_th_liferay$1ui_search$1container$1results_0.release();
          return;
        }
        results = (java.util.List) _jspx_page_context.findAttribute("results");
        deprecatedTotal = (java.lang.Integer) _jspx_page_context.findAttribute("deprecatedTotal");
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1results_0);
        _jspx_th_liferay$1ui_search$1container$1results_0.release();
        out.write("\n");
        out.write("\n");
        out.write("\t");
        //  liferay-ui:search-container-row
        com.liferay.taglib.ui.SearchContainerRowTag _jspx_th_liferay$1ui_search$1container$1row_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerRowTag.class) : new com.liferay.taglib.ui.SearchContainerRowTag();
        _jspx_th_liferay$1ui_search$1container$1row_0.setPageContext(_jspx_page_context);
        _jspx_th_liferay$1ui_search$1container$1row_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container_0);
        _jspx_th_liferay$1ui_search$1container$1row_0.setClassName("de.rtg.portlet.survey.model.Survey");
        _jspx_th_liferay$1ui_search$1container$1row_0.setModelVar("survey");
        int _jspx_eval_liferay$1ui_search$1container$1row_0 = _jspx_th_liferay$1ui_search$1container$1row_0.doStartTag();
        if (_jspx_eval_liferay$1ui_search$1container$1row_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          java.lang.Integer index = null;
          de.rtg.portlet.survey.model.Survey survey = null;
          com.liferay.portal.kernel.dao.search.ResultRow row = null;
          if (_jspx_eval_liferay$1ui_search$1container$1row_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = _jspx_page_context.pushBody();
            _jspx_th_liferay$1ui_search$1container$1row_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
            _jspx_th_liferay$1ui_search$1container$1row_0.doInitBody();
          }
          index = (java.lang.Integer) _jspx_page_context.findAttribute("index");
          survey = (de.rtg.portlet.survey.model.Survey) _jspx_page_context.findAttribute("survey");
          row = (com.liferay.portal.kernel.dao.search.ResultRow) _jspx_page_context.findAttribute("row");
          do {
            out.write("\n");
            out.write("\t\t\n");
            out.write("\t\t");
            if (_jspx_meth_liferay$1ui_search$1container$1column$1text_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_search$1container$1row_0, _jspx_page_context))
              return;
            out.write("\n");
            out.write("\n");
            out.write("\t\t");
            if (_jspx_meth_liferay$1ui_search$1container$1column$1text_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_search$1container$1row_0, _jspx_page_context))
              return;
            out.write("\n");
            out.write("\n");
            out.write("\t\t");
            if (_jspx_meth_liferay$1ui_search$1container$1column$1date_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_search$1container$1row_0, _jspx_page_context))
              return;
            out.write("\n");
            out.write("\n");
            out.write("\t\t");
            if (_jspx_meth_liferay$1ui_search$1container$1column$1date_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_search$1container$1row_0, _jspx_page_context))
              return;
            out.write("\n");
            out.write("\n");
            out.write("\t\t");
            if (_jspx_meth_liferay$1ui_search$1container$1column$1jsp_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_search$1container$1row_0, _jspx_page_context))
              return;
            out.write("\n");
            out.write("\n");
            out.write("\t");
            int evalDoAfterBody = _jspx_th_liferay$1ui_search$1container$1row_0.doAfterBody();
            index = (java.lang.Integer) _jspx_page_context.findAttribute("index");
            survey = (de.rtg.portlet.survey.model.Survey) _jspx_page_context.findAttribute("survey");
            row = (com.liferay.portal.kernel.dao.search.ResultRow) _jspx_page_context.findAttribute("row");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
          if (_jspx_eval_liferay$1ui_search$1container$1row_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
            out = _jspx_page_context.popBody();
        }
        if (_jspx_th_liferay$1ui_search$1container$1row_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1row_0);
          _jspx_th_liferay$1ui_search$1container$1row_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1row_0);
        _jspx_th_liferay$1ui_search$1container$1row_0.release();
        out.write("\n");
        out.write("\n");
        out.write("\t");
        if (_jspx_meth_liferay$1ui_search$1iterator_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_liferay$1ui_search$1container_0, _jspx_page_context))
          return;
        out.write('\n');
      }
      if (_jspx_th_liferay$1ui_search$1container_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container_0);
        _jspx_th_liferay$1ui_search$1container_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container_0);
      _jspx_th_liferay$1ui_search$1container_0.release();
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

  private boolean _jspx_meth_liferay$1ui_success_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:success
    com.liferay.taglib.ui.SuccessTag _jspx_th_liferay$1ui_success_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SuccessTag.class) : new com.liferay.taglib.ui.SuccessTag();
    _jspx_th_liferay$1ui_success_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_success_0.setParent(null);
    _jspx_th_liferay$1ui_success_0.setKey("success");
    _jspx_th_liferay$1ui_success_0.setMessage("survey-success");
    int _jspx_eval_liferay$1ui_success_0 = _jspx_th_liferay$1ui_success_0.doStartTag();
    if (_jspx_th_liferay$1ui_success_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_success_0);
      _jspx_th_liferay$1ui_success_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_success_0);
    _jspx_th_liferay$1ui_success_0.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_success_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:success
    com.liferay.taglib.ui.SuccessTag _jspx_th_liferay$1ui_success_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SuccessTag.class) : new com.liferay.taglib.ui.SuccessTag();
    _jspx_th_liferay$1ui_success_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_success_1.setParent(null);
    _jspx_th_liferay$1ui_success_1.setKey("success-delete");
    _jspx_th_liferay$1ui_success_1.setMessage("survey-success-delete");
    int _jspx_eval_liferay$1ui_success_1 = _jspx_th_liferay$1ui_success_1.doStartTag();
    if (_jspx_th_liferay$1ui_success_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_success_1);
      _jspx_th_liferay$1ui_success_1.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_success_1);
    _jspx_th_liferay$1ui_success_1.release();
    return false;
  }

  private boolean _jspx_meth_portlet_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_portlet_renderURL_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:param
    com.liferay.taglib.util.ParamTag _jspx_th_portlet_param_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.util.ParamTag.class) : new com.liferay.taglib.util.ParamTag();
    _jspx_th_portlet_param_0.setPageContext(_jspx_page_context);
    _jspx_th_portlet_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_portlet_renderURL_0);
    _jspx_th_portlet_param_0.setName("mvcPath");
    _jspx_th_portlet_param_0.setValue("/view/editor/edit_survey.jsp");
    int _jspx_eval_portlet_param_0 = _jspx_th_portlet_param_0.doStartTag();
    if (_jspx_th_portlet_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_0);
      _jspx_th_portlet_param_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_param_0);
    _jspx_th_portlet_param_0.release();
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
    _jspx_th_aui_button_0.setOnClick((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${addSurveyURL}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_aui_button_0.setValue("add-survey");
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

  private boolean _jspx_meth_liferay$1ui_search$1container$1column$1text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_search$1container$1row_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:search-container-column-text
    com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
    _jspx_th_liferay$1ui_search$1container$1column$1text_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_search$1container$1column$1text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
    _jspx_th_liferay$1ui_search$1container$1column$1text_0.setName("id");
    _jspx_th_liferay$1ui_search$1container$1column$1text_0.setProperty("surveyId");
    int _jspx_eval_liferay$1ui_search$1container$1column$1text_0 = _jspx_th_liferay$1ui_search$1container$1column$1text_0.doStartTag();
    if (_jspx_th_liferay$1ui_search$1container$1column$1text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_0);
      _jspx_th_liferay$1ui_search$1container$1column$1text_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_0);
    _jspx_th_liferay$1ui_search$1container$1column$1text_0.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_search$1container$1column$1text_1(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_search$1container$1row_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:search-container-column-text
    com.liferay.taglib.ui.SearchContainerColumnTextTag _jspx_th_liferay$1ui_search$1container$1column$1text_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnTextTag.class) : new com.liferay.taglib.ui.SearchContainerColumnTextTag();
    _jspx_th_liferay$1ui_search$1container$1column$1text_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_search$1container$1column$1text_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
    _jspx_th_liferay$1ui_search$1container$1column$1text_1.setProperty("nameDefaultLocale");
    _jspx_th_liferay$1ui_search$1container$1column$1text_1.setName("name");
    int _jspx_eval_liferay$1ui_search$1container$1column$1text_1 = _jspx_th_liferay$1ui_search$1container$1column$1text_1.doStartTag();
    if (_jspx_th_liferay$1ui_search$1container$1column$1text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_1);
      _jspx_th_liferay$1ui_search$1container$1column$1text_1.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1text_1);
    _jspx_th_liferay$1ui_search$1container$1column$1text_1.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_search$1container$1column$1date_0(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_search$1container$1row_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:search-container-column-date
    com.liferay.taglib.ui.SearchContainerColumnDateTag _jspx_th_liferay$1ui_search$1container$1column$1date_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnDateTag.class) : new com.liferay.taglib.ui.SearchContainerColumnDateTag();
    _jspx_th_liferay$1ui_search$1container$1column$1date_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_search$1container$1column$1date_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
    _jspx_th_liferay$1ui_search$1container$1column$1date_0.setProperty("startDate");
    int _jspx_eval_liferay$1ui_search$1container$1column$1date_0 = _jspx_th_liferay$1ui_search$1container$1column$1date_0.doStartTag();
    if (_jspx_th_liferay$1ui_search$1container$1column$1date_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1date_0);
      _jspx_th_liferay$1ui_search$1container$1column$1date_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1date_0);
    _jspx_th_liferay$1ui_search$1container$1column$1date_0.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_search$1container$1column$1date_1(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_search$1container$1row_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:search-container-column-date
    com.liferay.taglib.ui.SearchContainerColumnDateTag _jspx_th_liferay$1ui_search$1container$1column$1date_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnDateTag.class) : new com.liferay.taglib.ui.SearchContainerColumnDateTag();
    _jspx_th_liferay$1ui_search$1container$1column$1date_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_search$1container$1column$1date_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
    _jspx_th_liferay$1ui_search$1container$1column$1date_1.setProperty("endDate");
    int _jspx_eval_liferay$1ui_search$1container$1column$1date_1 = _jspx_th_liferay$1ui_search$1container$1column$1date_1.doStartTag();
    if (_jspx_th_liferay$1ui_search$1container$1column$1date_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1date_1);
      _jspx_th_liferay$1ui_search$1container$1column$1date_1.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1date_1);
    _jspx_th_liferay$1ui_search$1container$1column$1date_1.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_search$1container$1column$1jsp_0(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_search$1container$1row_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:search-container-column-jsp
    com.liferay.taglib.ui.SearchContainerColumnJSPTag _jspx_th_liferay$1ui_search$1container$1column$1jsp_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchContainerColumnJSPTag.class) : new com.liferay.taglib.ui.SearchContainerColumnJSPTag();
    _jspx_th_liferay$1ui_search$1container$1column$1jsp_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_search$1container$1column$1jsp_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container$1row_0);
    _jspx_th_liferay$1ui_search$1container$1column$1jsp_0.setPath("/view/editor/survey_actions.jsp");
    _jspx_th_liferay$1ui_search$1container$1column$1jsp_0.setAlign("right");
    int _jspx_eval_liferay$1ui_search$1container$1column$1jsp_0 = _jspx_th_liferay$1ui_search$1container$1column$1jsp_0.doStartTag();
    if (_jspx_th_liferay$1ui_search$1container$1column$1jsp_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1jsp_0);
      _jspx_th_liferay$1ui_search$1container$1column$1jsp_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1container$1column$1jsp_0);
    _jspx_th_liferay$1ui_search$1container$1column$1jsp_0.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_search$1iterator_0(javax.servlet.jsp.tagext.JspTag _jspx_th_liferay$1ui_search$1container_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:search-iterator
    com.liferay.taglib.ui.SearchIteratorTag _jspx_th_liferay$1ui_search$1iterator_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.SearchIteratorTag.class) : new com.liferay.taglib.ui.SearchIteratorTag();
    _jspx_th_liferay$1ui_search$1iterator_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_search$1iterator_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_liferay$1ui_search$1container_0);
    int _jspx_eval_liferay$1ui_search$1iterator_0 = _jspx_th_liferay$1ui_search$1iterator_0.doStartTag();
    if (_jspx_th_liferay$1ui_search$1iterator_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1iterator_0);
      _jspx_th_liferay$1ui_search$1iterator_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_search$1iterator_0);
    _jspx_th_liferay$1ui_search$1iterator_0.release();
    return false;
  }
}
