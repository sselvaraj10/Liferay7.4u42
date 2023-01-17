<%@ page import="com.liferay.portal.kernel.portlet.LiferayWindowState" %>
<%@include file="../init.jsp"%>
<liferay-ui:success key="guestbookAdded" message="guestbook-added" />
<liferay-ui:success key="guestbookUpdated" message="guestbook-updated" />
<liferay-ui:success key="guestbookDeleted" message="guestbook-deleted" />


<portlet:actionURL name="exportData" var="exporting" />

<aui:button onClick="<%= exporting.toString() %>"
            value="Export Data" />

<%--<portlet:renderURL var="secondJspURL" windowState="<%=LiferayWindowState.POP_UP.toString()%>">--%>
<%--  <portlet:param name="mvcPath"--%>
<%--                 value="view.jsp" />--%>
<%--</portlet:renderURL>--%>

<portlet:renderURL var="popupUrl" windowState="<%=LiferayWindowState.POP_UP.toString() %>">
  <portlet:param name="mvcPath" value="/guestbookadminportlet/export.jsp"/>
</portlet:renderURL>
<aui:button useDialog="true" id="popup_id"   value="Export Popup" />

<aui:script use="liferay-util-window">
  A.one('#<portlet:namespace />popup_id').on('click', function(event) {
    Liferay.Util.openWindow({
      dialog: {
          centered: true,
          height: 750,
          modal: true,
          width: 800,
          destroyOnHide: true
      },
      id: 'dialog',
      title: "Guestbook - Export",
      uri: "<%=popupUrl.toString()%>>"
    });
  });
</aui:script>

<aui:script>
  Liferay.provide(window, 'refreshPortlet', function() {
  var curPortlet = '#p_p_id<portlet:namespace />';
  Liferay.Portlet.refresh(curPortlet);
  },
  ['aui-dialog','aui-dialog-iframe']
  );
</aui:script>
<aui:script>
  Liferay.provide(window, 'closePopup', function(dialogId) {

            var A = AUI();

            var dialog = Liferay.Util.Window.getById(dialogId);
            dialog.destroy();
          },
          ['liferay-util-window']
  );
</aui:script>

<liferay-ui:search-container
        total="<%= GuestbookLocalServiceUtil.getGuestbooksCount(scopeGroupId) %>">
  <liferay-ui:search-container-results
          results="<%= GuestbookLocalServiceUtil.getGuestbooks(scopeGroupId,
            searchContainer.getStart(), searchContainer.getEnd()) %>" />

  <liferay-ui:search-container-row
          className="com.liferay.docs.guestbook.model.Guestbook" modelVar="guestbook">

    <liferay-ui:search-container-column-text property="name" />

    <liferay-ui:search-container-column-jsp
            align="right"
            path="/guestbookadminportlet/guestbook_actions.jsp" />

  </liferay-ui:search-container-row>

  <liferay-ui:search-iterator />
</liferay-ui:search-container>

<aui:button-row cssClass="guestbook-admin-buttons">
  <portlet:renderURL var="addGuestbookURL">
    <portlet:param name="mvcPath"
                   value="/guestbookadminportlet/edit_guestbook.jsp" />
    <portlet:param name="redirect" value="<%= "currentURL" %>" />
  </portlet:renderURL>

  <aui:button onClick="<%= addGuestbookURL.toString() %>"
              value="Add Guestbook" />
</aui:button-row>