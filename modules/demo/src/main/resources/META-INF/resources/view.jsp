<%@ taglib prefix="liferay-util" uri="http://liferay.com/tld/util" %>
<%@ include file="/init.jsp" %>


<portlet:actionURL name="/actionCommand" var="actionFire" />



<aui:button onClick="<%=actionFire.toString()%>" value="Click me"/>
<p>
	<b><liferay-ui:message key="demo.caption"/></b>
</p>

<liferay-util:dynamic-include key="com.demo#/view.jsp#pre" />

<liferay-util:dynamic-include key="com.demo#/view.jsp#post" />
