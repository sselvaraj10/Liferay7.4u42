<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.liferay.portal.kernel.model.Portlet" %>
<%@ include file="/init.jsp" %>

<%
    ResultRow row = (ResultRow) request
            .getAttribute("SEARCH_CONTAINER_RESULT_ROW");

    Portlet portlet = (Portlet) row.getObject();
%>

<%--<liferay-ui:icon-menu>--%>

<%--  <portlet:renderURL var="editURL">--%>
<%--    <portlet:param name="guestbookId"--%>
<%--                   value="<%=String.valueOf(guestbook.getGuestbookId()) %>" />--%>
<%--    <portlet:param name="mvcPath"--%>
<%--                   value="/guestbookadminportlet/edit_guestbook.jsp" />--%>
<%--  </portlet:renderURL>--%>

<%--  <liferay-ui:icon image="edit" message="Edit"--%>
<%--                   url="<%=editURL.toString() %>" />--%>

<%--  <portlet:actionURL name="deleteGuestbook" var="deleteURL">--%>
<%--    <portlet:param name="guestbookId"--%>
<%--                   value="<%= String.valueOf(guestbook.getGuestbookId()) %>" />--%>
<%--  </portlet:actionURL>--%>

<%--  <liferay-ui:icon-delete url="<%=deleteURL.toString() %>" />--%>

<%--</liferay-ui:icon-menu>--%>


<portlet:renderURL var="activeURL">
    <portlet:param name="portletId"
                   value="<%=portlet.getPortletId()%>" />
    <portlet:param name="mvcPath"
                   value="/active_portlet.jsp" />
</portlet:renderURL>

    <aui:button name="active" onClick="<%=activeURL.toString()%>"  type="button" value="Actions"/>



<%--<script>--%>
<%--    AUI().use('aui-io-request', function(A) {--%>
<%--        A.one('#activeCheckBox').on('click', function() {--%>
<%--            var isChecked = A.one('#activeCheckBox').get('checked');--%>
<%--            A.io.request('active', {--%>
<%--                method: 'POST',--%>
<%--                data: {--%>

<%--                },--%>
<%--                on: {--%>
<%--                    success: function() {--%>
<%--                        console.log('Action URL called successfully.');--%>
<%--                    }--%>
<%--                }--%>
<%--            });--%>
<%--        });--%>
<%--    });--%>
<%--</script>--%>