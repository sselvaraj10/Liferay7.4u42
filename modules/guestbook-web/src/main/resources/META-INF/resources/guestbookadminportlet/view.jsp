<%@ page import="com.liferay.portal.kernel.portlet.LiferayWindowState" %>
<%@include file="../init.jsp"%>
<liferay-ui:success key="guestbookAdded" message="guestbook-added" />
<liferay-ui:success key="guestbookUpdated" message="guestbook-updated" />
<liferay-ui:success key="guestbookDeleted" message="guestbook-deleted" />


<portlet:actionURL name="exportData" var="exporting" />

hellojxnsjnjsnxj


<%--<portlet:resourceURL  var="exportDataUrl" ><portlet:param name="exportCSVData" value="exportCSVData"/></portlet:resourceURL>--%>
<aui:button onClick="<%= exporting.toString() %>"
            value="Export Data" />



<%--<portlet:renderURL var="secondJspURL" windowState="<%=LiferayWindowState.POP_UP.toString()%>">--%>
<%--  <portlet:param name="mvcPath" value="/guestbookadminportlet/view.jsp"/>--%>
<%--</portlet:renderURL>--%>

<liferay-ui:success key="success" message="Your Action Completed Successfully..."/>
<portlet:renderURL var="secondJspURL" windowState="<%=LiferayWindowState.POP_UP.toString()%>">
  <portlet:param name="mvcPath"
                 value="view.jsp" />
</portlet:renderURL>

<portlet:renderURL var="popupUrl" windowState="<%=LiferayWindowState.POP_UP.toString() %>">
  <portlet:param name="mvcPath" value="/guestbookadminportlet/export.jsp"/>
</portlet:renderURL>
<aui:button href="${popupUrl}" useDialog="true"  value="Open Popup Using useDialog" />

<div id="popup_id">
  Click here
</div>
<aui:script use="liferay-util-window">
  A.one('#popup_id').on('click', function(event) {
  Liferay.Util.openWindow({ dialog: {
  centered: true,
  height: 750,
  modal: true,
  width: 800,
  destroyOnHide: true,

  },
  id: '<portlet:namespace />dialog',
  title: 'Guestbook - Export',
  uri: '<%=popupUrl%>'
  });
  });

  Liferay.provide(
  window,
  'closePopup',
  function(popupId) {

  var dialog = Liferay.Util.getWindow(popupId);
  dialog.destroy();
  },
  ['aui-base','aui-dialog','aui-dialog-iframe']
  );

</aui:script>


<button onClick="window.open('/guestbookadminportlet/view.jsp','mywindow','width=500,height=350,toolbar=no,resizable=yes')">Export Data Pop up</button>
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