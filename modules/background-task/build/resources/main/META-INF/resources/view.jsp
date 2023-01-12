<%@ include file="/init.jsp" %>
<%@taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
hello from view outside



<portlet:resourceURL id="/exportEntry" var="exportD" />

data
<a href="<%=exportD.toString()%>">download</a>
<a href="<portlet:resourceURL><portlet:param name="javax.portlet.action" value="exportCSVData" /></portlet:resourceURL>">Export</a>

<portlet:renderURL var="addEntryURL">
	<portlet:param name="mvcPath" value="/edit_entry.jsp"></portlet:param>
</portlet:renderURL>
<aui:button-row>
	<aui:button onClick="<%= addEntryURL.toString() %>" value="Add Entry"></aui:button>
</aui:button-row>

<jsp:useBean id="entries" class="java.util.ArrayList" scope="request"/>

<liferay-ui:search-container>
	<liferay-ui:search-container-results results="<%= entries %>" />

	<liferay-ui:search-container-row
			className="com.liferay.docs.guestbook.model.Entry"
			modelVar="entry"
	>
		<liferay-ui:search-container-column-text property="message" />

		<liferay-ui:search-container-column-text property="name" />
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>