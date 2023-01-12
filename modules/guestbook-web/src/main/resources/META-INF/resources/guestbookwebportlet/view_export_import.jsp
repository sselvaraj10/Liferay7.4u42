<%@include file="../init.jsp"%>



<%
    String backURL = ParamUtil.getString(request, "backURL");
    long backgroundTaskId = ParamUtil.getLong(request, "backgroundTaskId");

    portletDisplay.setDescription(LanguageUtil.get(request, "process-details"));

    if (Validator.isNotNull(backURL)) {
        portletDisplay.setShowBackIcon(true);
        portletDisplay.setURLBack(backURL);
    }
%>

<portlet:resourceURL id="/exportEntry" var="exportD" />
<aui:form name="fm">
    <aui:fieldset-group markupView="lexicon">
        <aui:fieldset>
            GuestBookEntries
            <aui:input name="backgroundTaskId" value="<%=backgroundTaskId%>" type="hidden"/>
            <a href="<%=exportD.toString()%>"><clay:icon symbol="download"/></a>
            <br>
            <span style="color: green">Successful</span>
        </aui:fieldset>
    </aui:fieldset-group>
</aui:form>