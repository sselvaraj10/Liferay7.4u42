<%@ page import="com.liferay.portal.kernel.service.PortletLocalServiceUtil" %>
<%@ page import="com.liferay.portal.kernel.model.Portlet" %>
<%@ page import="java.util.List" %>
<%@ include file="/init.jsp" %>

<%
	List<Portlet> portlets = (List<Portlet>) request.getAttribute("portlets");
	System.out.println(request.getAttribute("portlets"));
%>
<%--<jsp:useBean id="portlets" class="java.util.ArrayList" scope="request"/>--%>

<liferay-ui:search-container
		total="<%= portlets.size()%>">
	<liferay-ui:search-container-results
			results="<%= portlets %>" />

	<liferay-ui:search-container-row
			className="com.liferay.portal.kernel.model.Portlet" modelVar="portlet">

		<liferay-ui:search-container-column-text name="PortletName"
												 property="portletId" />

				<liferay-ui:search-container-column-jsp
				align="right"  name="Action"
				path="/action.jsp" />

	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>


<%--	<liferay-ui:search-container--%>
<%--			total="<%=portlets.size() %>">--%>
<%--	<liferay-ui:search-container-results--%>
<%--			results="<%= portlets %>">--%>
<%--		<liferay-ui:search-container-row--%>
<%--				className="com.liferay.portal.kernel.model.Portlet"--%>
<%--				modelVar="portlet">--%>

<%--			<liferay-ui:search-container-column-text--%>
<%--					name="Name"--%>
<%--					value="<%= portlet.getPortletId() %>" />--%>
<%--&lt;%&ndash;			<liferay-ui:search-container-column-text&ndash;%&gt;--%>
<%--&lt;%&ndash;					name="Value"&ndash;%&gt;--%>
<%--&lt;%&ndash;					value="<%= portlet.getValue() %>" />&ndash;%&gt;--%>

<%--		</liferay-ui:search-container-row>--%>

<%--	</liferay-ui:search-container-results>--%>
<%--</liferay-ui:search-container>--%>