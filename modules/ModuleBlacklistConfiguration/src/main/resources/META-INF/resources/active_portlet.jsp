<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.theme.ThemeDisplay" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ page import="moduleblacklistservice.model.Portlet" %>
<%@ page import="moduleblacklistservice.service.PortletLocalServiceUtil" %>
<%@ include file="/init.jsp" %>


<%
    String portletId = ParamUtil.getString(request, "portletId");
    Portlet portlet = null;
    if(PortletLocalServiceUtil.getPortlet(themeDisplay.getSiteGroupId(),portletId).size() > 0) {
        portlet = PortletLocalServiceUtil.getPortlet(themeDisplay.getSiteGroupId(), portletId).get(0);
    }
%>
<portlet:actionURL name="activatePortlet" var="active">
    <portlet:param name="portletId"
                   value="<%= portletId %>"/>
</portlet:actionURL>


<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/view.jsp"/>
</portlet:renderURL>
<aui:form action="<%=active.toString()%>" name="fm">
    <aui:row>
        <aui:col width="10"></aui:col>
        <aui:col width="80">
            <aui:input name="portletId" value="<%=portletId%>" label="PortletId"/>
            <c:choose>
                <c:when test="<%=portlet != null%>">
                    <aui:input type="checkbox" name="active" label="active" value="<%=portlet.getActive()%>" id="activeCheckBox"/>
                </c:when>
                <c:otherwise>
                    <aui:input type="checkbox" name="active" label="active" value="true" id="activeCheckBox"/>
                </c:otherwise>
            </c:choose>
<%--            <c:if test="<%=portlet%>!=null">--%>
<%--            <aui:input type="checkbox" name="active" label="active" value="<%=portlet.getActive()%>>" id="activeCheckBox"/>--%>
<%--            </c:if>--%>
            <aui:button-row>
                <aui:button type="submit"/>
                <aui:button onClick="<%= viewURL %>" type="cancel"/>
            </aui:button-row>
        </aui:col>
    </aui:row>
</aui:form>