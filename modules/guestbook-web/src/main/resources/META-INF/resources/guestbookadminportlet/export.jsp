<%@include file="../init.jsp"%>
<style>
    .form-dg{

        margin-top: 40px;
    }

</style>
<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/guestbookadminportlet/view.jsp" />
</portlet:renderURL>

<portlet:actionURL name="exportData" var="exporting" />

<aui:form name="fmExport" id="fmID" cssClass="form-dg" method="POST" action="<%=exporting.toString()%>">
    <aui:row>
        <aui:col width="10"></aui:col>
        <aui:col width="80">
            <aui:fieldset-group markupView="lexicon">
                <aui:fieldset label="Select Data">
                        <hr>
                        <aui:input type="checkbox" name="UserId" value="UserId"
                                    label="UserId"  />
                    <aui:input type="checkbox" name="GroupId" label="GroupId"
                               value="GroupId" />
                        <aui:input type="checkbox" name="GuestbookId" value="GuestbookId"
                                 label="GuestbookId" />
                       <aui:input type="checkbox" name="Name" label="Name"
                                 value="Name" />
                    <aui:input type="checkbox" name="GroupId" label="UserName"
                               value="GroupId" />
                    <aui:input type="checkbox" name="GroupId" label="Created Date"
                               value="GroupId" />
                </aui:fieldset>
            </aui:fieldset-group>
        </aui:col>
        <aui:col width="10"></aui:col>
    </aui:row>
    <aui:button-row>

        <aui:button name="submitButton"  id="export" value="Export" type="submit"/>
        <aui:button id="closePopup" name="closeDialog" type="cancel"  />
<%--        <aui:button onClick="<%= viewURL %>" type="cancel"  />--%>

    </aui:button-row>
</aui:form>
<%--<script src="https://code.jquery.com/jquery-3.6.3.js" integrity="sha256-nQLuAZGRRcILA+6dMBOvcRh5Pe310sBpanc6+QBmyVM=" crossorigin="anonymous"></script>--%>
<%--<script>--%>

<%--    $("#submitButton").click(function(e) {--%>
<%--        var form = $("#fmID");--%>
<%--        var url = "<%=exporting.toString()%>";--%>
<%--        $.ajax({--%>
<%--            type: "POST",--%>
<%--            url: url,--%>
<%--            data: form.serialize(),--%>
<%--            success: function(data) {--%>
<%--                Liferay.Util.getOpener().refreshPortlet();--%>
<%--                Liferay.Util.getOpener().closePopup('dialog');--%>
<%--                // Ajax call completed successfully--%>
<%--                alert("Form Submited Successfully");--%>
<%--            },--%>
<%--            error: function(data) {--%>

<%--                // Some error in ajax call--%>
<%--                alert("some Error");--%>
<%--            }--%>
<%--        });--%>

<%--    });--%>

<%--</script>--%>


<%--<aui:script use="aui-base,aui-io-request">--%>
<%--    A.one('#<portlet:namespace />submitButton').on('click', function(event) {--%>
<%--        console.log("CLicked");--%>
<%--    var A = AUI();--%>
<%--    var url = "<%=exporting.toString()%>";--%>
<%--    A.io.request(--%>
<%--    url,--%>
<%--    {--%>
<%--    method: 'POST',--%>
<%--    form: {id: '<portlet:namespace />fmExport'},--%>
<%--    on: {--%>
<%--    success: function() {--%>
<%--   Liferay.Util.getOpener().refreshPortlet();--%>
<%--    Liferay.Util.getOpener().closePopup('dialog');--%>
<%--    }--%>
<%--    }--%>
<%--    }--%>
<%--    );--%>
<%--    });--%>
<%--</aui:script>--%>


<%--<aui:script use="aui-base">--%>
<%--    A.one('#<portlet:namespace />closeDialog').on('click', function(event) {--%>
<%--        console.log("sasasa");--%>
<%--    Liferay.Util.getOpener().closePopup('dialog');--%>
<%--    });--%>
<%--</aui:script>--%>

<%--<aui:script>--%>
<%--    Liferay.provide(window, 'closePopup', function(dialogId) {--%>
<%--                var A = AUI();--%>
<%--                var dialog = Liferay.Util.Window.getById(dialogId);--%>
<%--                dialog.destroy();--%>
<%--            },--%>
<%--            ['liferay-util-window']--%>
<%--    );--%>
<%--</aui:script>--%>

<%--<aui:script use="liferay-util-window">--%>
<%--    AUI().ready('aui-base', function(A) {--%>
<%--    A.get('#export').on('click', function() {--%>
<%--    A.DialogManager.hideAll();--%>
<%--    });--%>
<%--    }); --%>

<%--    Liferay.provide(--%>
<%--    window,--%>
<%--    '<portlet:namespace />closeDialog',--%>
<%--    function() {--%>
<%--    Liferay.fire(--%>
<%--    'closeWindow',--%>
<%--    {--%>
<%--    id:'<portlet:namespace />dialog',--%>
<%--    }--%>
<%--    );--%>
<%--    },--%>
<%--    ['aui-base']--%>
<%--    );--%>
<%--</aui:script >--%>


<%--<aui:form action="<%= exporting%>" method="POST" name="fmUpdateState">--%>
<%--    <aui:fieldset>--%>
<%--        Hlelelle--%>
<%--    </aui:fieldset>--%>
<%--    <aui:button-row>--%>
<%--        <aui:button name="saveForm" value="Export" />--%>
<%--        <aui:button name="closeDialog" type="cancel" />--%>
<%--    </aui:button-row>--%>
<%--</aui:form>--%>

<%--<aui:script use="aui-base,aui-io-request">--%>
<%--    A.one('#<portlet:namespace />saveForm').on('click', function(event) {--%>
<%--    console.log("clicked add");--%>

<%--    var A = AUI();--%>
<%--    var url = "<%=exporting.toString()%>";--%>
<%--    A.io.request(--%>
<%--    url,--%>
<%--    {--%>
<%--    method: 'POST',--%>
<%--    form: {id: '<portlet:namespace />fmUpdateState'},--%>
<%--    on: {--%>
<%--    success: function() {--%>
<%--    Liferay.Util.getOpener().refreshPortlet();--%>
<%--    Liferay.Util.getOpener().closePopup('dialog');--%>
<%--    }--%>
<%--    }--%>
<%--    }--%>
<%--    );--%>
<%--    });--%>
<%--</aui:script>--%>
<%--<aui:script use="aui-base">--%>
<%--    A.one('#<portlet:namespace />closeDialog').on('click', function(event) {--%>
<%--        console.log("clicked cancel");--%>
<%--    Liferay.Util.getOpener().closePopup('dialog');--%>
<%--    });--%>
<%--</aui:script>--%>