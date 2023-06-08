<%@include file="../init.jsp"%>
<liferay-ui:success key="entryAdded" message="entry-added" />
<liferay-ui:success key="guestbookAdded" message="guestbook-added" />
<liferay-ui:success key="entryDeleted" message="entry-deleted" />

<liferay-portlet:renderURL varImpl="searchURL">
	<portlet:param name="mvcPath"
				   value="/guestbookwebportlet/view_search.jsp" />
</liferay-portlet:renderURL>

<%
	long guestbookId = Long.valueOf((Long) renderRequest
			.getAttribute("guestbookId"));
%>

<portlet:resourceURL id="/exportEntry" var="exportD" />

GuestBook
<aui:input name="backgroundTaskId" value="hrl" type="hidden"/>
<a href="<%=exportD.toString()%>"><clay:icon symbol="download"/></a>
<aui:form action="<%= searchURL %>" name="fm">
	<liferay-portlet:renderURLParams varImpl="searchURL" />

	<div class="row">
		<div class="col-md-8">
			<aui:input inlineLabel="left" label="" name="keywords" placeholder="search-entries" size="256" />
		</div>

		<div class="col-md-4">
			<aui:button type="submit" value="search" />
		</div>
	</div>
</aui:form>


<aui:button-row cssClass="guestbook-buttons">

	<portlet:renderURL var="addEntryURL">
		<portlet:param name="mvcPath" value="/guestbookwebportlet/edit_entry.jsp" />
		<portlet:param name="guestbookId"
					   value="<%=String.valueOf(guestbookId)%>" />
	</portlet:renderURL>

	<aui:button onClick="<%=addEntryURL.toString()%>" value="Add Entry"/>

</aui:button-row>

<liferay-ui:search-container total="<%=EntryLocalServiceUtil.getEntriesCount()%>">
	<liferay-ui:search-container-results
			results="<%=EntryLocalServiceUtil.getEntries(
                   searchContainer.getStart(),
                    searchContainer.getEnd())%>" />

	<liferay-ui:search-container-row
			className="com.liferay.docs.guestbook.model.Entry" modelVar="entry">

		<liferay-ui:search-container-column-text property="message" />

		<liferay-ui:search-container-column-text property="name" />

		<liferay-ui:search-container-column-text property="email" />
		<liferay-ui:search-container-column-jsp
				align="right"
				path="/guestbookwebportlet/entry_actions.jsp" />

	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />

</liferay-ui:search-container>

asasasasa<%= themeDisplay.getURLSignIn() %>






		<c:choose>
		<c:when test="<%= themeDisplay.isShowSignInIcon() %>">
        		<span class="sign-in text-default" role="presentation">
        		Brijesh
        			<a href="<%= themeDisplay.getURLSignIn() %>" class="sign-in text-default"><button>Sign-in</button> </a>
        		</span>

        		<aui:script sandbox="<%= true %>">
        			var signInLink = document.querySelector('.sign-in > a');
console.log("link: "+signInLink);
        			if (signInLink) {
        				var signInURL = '<%= themeDisplay.getURLSignIn() %>';

        				var modalSignInURL = Liferay.Util.addParams(
        					'windowState=exclusive',
        					signInURL
        				);

        				var setModalContent = function (html) {
        					var modalBody = document.querySelector('.liferay-modal-body');

        					if (modalBody) {
        						var fragment = document
        							.createRange()
        							.createContextualFragment(html);

        						modalBody.innerHTML = '';

        						modalBody.appendChild(fragment);
        					}
        				};

        				var loading = false;
        				var redirect = false;
        				var html = '';
        				var modalOpen = false;
console.log("html :"+html);

        				var fetchModalSignIn = function () {
        					if (loading || html) {
        						return;
        					}
console.log("infetch modal");
        					loading = true;

        					Liferay.Util.fetch(modalSignInURL)
        						.then((response) => {
        							return response.text();
        						})
        						.then((response) => {
        							if (!loading) {
        								return;
        							}

        							loading = false;

        							if (!response) {
        								redirect = true;

        								return;
        							}

        							html = response;
console.log("html2 :"+html);

        							if (modalOpen) {
        								setModalContent(response);
        							}
        						})
        						.catch(() => {
        							redirect = true;
        						});
        				};

        				window.addEventListener('load', fetchModalSignIn);
        				window.addEventListener('load', fetchModalSignIn);

        				window.addEventListener('load', (event) => {
        					event.preventDefault();

        					if (redirect) {
        						Liferay.Util.navigate(signInURL);

        						return;
        					}

        					Liferay.Util.openModal({
        						bodyHTML: html ? html : '<span class="loading-animation">',
        						containerProps: {
        							className: '',
        						},
        						height: '400px',
        						onClose: function () {
        							loading = false;
        							redirect = false;
        							html = '';
        							modalOpen = false;
        						},
        						onOpen: function () {
        							modalOpen = true;

        							if (html && document.querySelector('.loading-animation')) {
        								setModalContent(html);
        							}
        						},
        						size: 'md',
        						title: '<liferay-ui:message key="sign-in" />',
        					});
        				});
        			}
        		</aui:script>
        	</c:when>
		</c:choose>