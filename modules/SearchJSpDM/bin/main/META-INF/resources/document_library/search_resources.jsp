<%@ page import="com.liferay.frontend.taglib.clay.servlet.taglib.util.DropdownItemList" %><%--
/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>

<%@ include file="/document_library/init.jsp" %>
<%@ taglib prefix="clay" uri="http://liferay.com/tld/clay" %>

<%
long repositoryId = ParamUtil.getLong(request, "repositoryId");
	System.out.println("Repository id from resources: "+repositoryId);

if (repositoryId == 0) {
	repositoryId = scopeGroupId;
}

long searchRepositoryId = ParamUtil.getLong(request, "searchRepositoryId");

if (searchRepositoryId == 0) {
	searchRepositoryId = scopeGroupId;
}

long folderId = ParamUtil.getLong(request, "folderId");
	System.out.println("Folder id from resources: "+folderId);

long searchFolderId = ParamUtil.getLong(request, "searchFolderId");

Folder folder = null;

if (searchFolderId > 0) {
	folder = DLAppServiceUtil.getFolder(searchFolderId);
}

String keywords = ParamUtil.getString(request, "keywords");
	System.out.println("keywords from resources: "+keywords);

DLAdminDisplayContext dlAdminDisplayContext = (DLAdminDisplayContext)request.getAttribute(DLAdminDisplayContext.class.getName());
DLPortletInstanceSettingsHelper dlPortletInstanceSettingsHelper = new DLPortletInstanceSettingsHelper(dlRequestHelper);

EntriesChecker entriesChecker = new EntriesChecker(liferayPortletRequest, liferayPortletResponse);

entriesChecker.setCssClass("entry-selector");
entriesChecker.setRememberCheckBoxStateURLRegex("^(?!.*" + liferayPortletResponse.getNamespace() + "redirect).*(folderId=" + String.valueOf(folderId) + ")");
%>

<c:if test='<%= dlAdminDisplayContext.isSearch() && ParamUtil.getBoolean(request, "showSearchInfo") %>'>
	<liferay-util:include page="/document_library/search_info.jsp" servletContext="<%= application %>" />
</c:if>

<aui:input name="repositoryId" type="hidden" value="<%= repositoryId %>" />
<aui:input name="searchRepositoryId" type="hidden" value="<%= searchRepositoryId %>" />

<%
	DLAdminDisplayContext dlAdminDisplayContextdemo = (DLAdminDisplayContext)request.getAttribute(DLAdminDisplayContext.class.getName());
	DLAdminManagementToolbarDisplayContext dlAdminManagementToolbarDisplayContext = (DLAdminManagementToolbarDisplayContext)request.getAttribute(DLAdminManagementToolbarDisplayContext.class.getName());
	System.out.println("filterss given : "+dlAdminManagementToolbarDisplayContext.getFilterDropdownItems());
	DLViewDisplayContext dlViewDisplayContext = new DLViewDisplayContext(dlAdminDisplayContextdemo, request, renderRequest, renderResponse);

%>





<%--<clay:dropdown-actions--%>
<%--		label="typefilter"--%>
<%--		buttonLabel="More"--%>
<%--		buttonStyle="secondary"--%>
<%--		caption="Showing 4 of 32 Options"--%>
<%--		helpText="You can customize this menu or see all you have by pressing \"more\"."--%>
<%--		dropdownItems='<%=--%>
<%--    new DropdownItemList() {--%>
<%--        {--%>
<%--            addGroup(--%>
<%--                dropdownGroupItem -> {--%>
<%--                    dropdownGroupItem.setDropdownItems(--%>
<%--                        new DropdownItemList() {--%>
<%--                            {--%>
<%--                                add(--%>
<%--                                    dropdownItem -> {--%>
<%--                                        dropdownItem.setHref("http://localhost:8080/group/guest/~/control_panel/manage?p_p_id=com_liferay_document_library_web_portlet_DLAdminPortlet&p_p_lifecycle=0&p_p_state=maximized&p_p_mode=view&_com_liferay_document_library_web_portlet_DLAdminPortlet_mvcRenderCommandName=%2Fdocument_library%2Fview&_com_liferay_document_library_web_portlet_DLAdminPortlet_folderId=0&p_p_auth=GTClojC6");--%>
<%--                                        dropdownItem.setLabel("All");--%>
<%--                                    });--%>

<%--                                add(--%>
<%--                                    dropdownItem -> {--%>
<%--                                        dropdownItem.setHref("#2");--%>
<%--                                        dropdownItem.setLabel("Folder");--%>
<%--                                    });--%>

<%--								 add(--%>
<%--                                    dropdownItem -> {--%>
<%--                                        dropdownItem.setHref("#2");--%>
<%--                                        dropdownItem.setLabel("Document");--%>
<%--                                    });--%>
<%--                            }--%>
<%--                        }--%>
<%--                    );--%>
<%--                    dropdownGroupItem.setLabel("Filter By");--%>
<%--                });--%>
<%--        }--%>
<%--    }--%>
<%--%>'--%>
<%--/>--%>


<clay:dropdown-menu
		label="Type"
		dropdownItems='<%=
    new DropdownItemList() {
        {
            addGroup(
                dropdownGroupItem -> {
                    dropdownGroupItem.setDropdownItems(
                        new DropdownItemList() {
                            {
                                add(
                                    dropdownItem -> {
                                        dropdownItem.setHref("http://localhost:8080/document-and-media-search-page?");
                                        dropdownItem.setLabel("All");
                                    });

                                add(
                                    dropdownItem -> {
                                        dropdownItem.setHref("http://localhost:8080/document-and-media-search-page?type=com.liferay.document.library.kernel.model.DLFolder");
                                        dropdownItem.setLabel("Folder");
                                    });

								 add(
                                    dropdownItem -> {
                                        dropdownItem.setHref("http://localhost:8080/document-and-media-search-page?type=com.liferay.document.library.kernel.model.DLFileEntry");
                                        dropdownItem.setLabel("Document");
                                    });
                            }
                        }
                    );
                    dropdownGroupItem.setLabel("Filter By");
                });
        }
    }
%>'
/>



<liferay-util:buffer
	var="searchResults"
>

	<%
	SearchContainer<RepositoryEntry> dlSearchContainer = dlAdminDisplayContext.getSearchContainer();
        for(int i=0;i<dlSearchContainer.getResults().size();i++)
		{
			System.out.println("answer: "+dlSearchContainer.getResults().get(i));
		}
		for(int i=0;i<dlSearchContainer.getTotal();i++)
		{
			System.out.println("DL search answer: "+dlSearchContainer);
		}
	%>

	<div class="document-container" id="<portlet:namespace />entriesContainer">
		<liferay-ui:search-container
			emptyResultsMessage='<%= LanguageUtil.format(request, "no-documents-were-found-that-matched-the-keywords-x", HtmlUtil.escape(keywords), false) %>'
			id="entries"
			searchContainer="<%= dlSearchContainer %>"
			total="<%= dlSearchContainer.getTotal() %>"
		>
			<liferay-ui:search-container-row
				className="Object"
				modelVar="result"
			>
				<%@ include file="/document_library/cast_result.jspf" %>

				<c:choose>
					<c:when test="<%= (fileEntry != null) && DLFileEntryPermission.contains(permissionChecker, fileEntry, ActionKeys.VIEW) %>">

						<%
						FileVersion latestFileVersion = fileEntry.getFileVersion();

						if ((user.getUserId() == fileEntry.getUserId()) || permissionChecker.isContentReviewer(user.getCompanyId(), scopeGroupId) || DLFileEntryPermission.contains(permissionChecker, fileEntry, ActionKeys.UPDATE)) {
							latestFileVersion = fileEntry.getLatestFileVersion();
						}

						if ((dlSearchContainer.getRowChecker() == null) && (DLFileEntryPermission.contains(permissionChecker, fileEntry, ActionKeys.DELETE) || DLFileEntryPermission.contains(permissionChecker, fileEntry, ActionKeys.UPDATE))) {
							dlSearchContainer.setRowChecker(entriesChecker);
						}

						String thumbnailSrc = DLURLHelperUtil.getThumbnailSrc(fileEntry, latestFileVersion, themeDisplay);

						row.setPrimaryKey(String.valueOf(fileEntry.getFileEntryId()));
						%>

						<c:choose>
							<c:when test="<%= Validator.isNotNull(thumbnailSrc) %>">
								<liferay-ui:search-container-column-image
									src="<%= thumbnailSrc %>"
									toggleRowChecker="<%= true %>"
								/>
							</c:when>
							<c:when test="<%= Validator.isNotNull(latestFileVersion.getExtension()) %>">
								<liferay-ui:search-container-column-text>
									<liferay-document-library:mime-type-sticker
										fileVersion="<%= fileEntry.getFileVersion() %>"
									/>
								</liferay-ui:search-container-column-text>
							</c:when>
							<c:otherwise>
								<liferay-ui:search-container-column-icon
									icon="documents-and-media"
									toggleRowChecker="<%= true %>"
								/>
							</c:otherwise>
						</c:choose>

						<liferay-ui:search-container-column-jsp
							colspan="<%= 2 %>"
							path="/document_library/view_file_entry_descriptive.jsp"
						/>

						<c:if test="<%= dlPortletInstanceSettingsHelper.isShowActions() %>">
							<liferay-ui:search-container-column-jsp
								path="/document_library/file_entry_action.jsp"
							/>
						</c:if>
					</c:when>
					<c:when test="<%= (curFolder != null) && DLFolderPermission.contains(permissionChecker, curFolder, ActionKeys.VIEW) %>">

						<%
						if ((dlSearchContainer.getRowChecker() == null) && (DLFolderPermission.contains(permissionChecker, curFolder, ActionKeys.DELETE) || DLFolderPermission.contains(permissionChecker, curFolder, ActionKeys.UPDATE))) {
							dlSearchContainer.setRowChecker(entriesChecker);
						}

						row.setPrimaryKey(String.valueOf(curFolder.getPrimaryKey()));
						%>

						<liferay-ui:search-container-column-icon
							icon='<%= curFolder.isMountPoint() ? "repository" : "folder" %>'
							toggleRowChecker="<%= true %>"
						/>

						<liferay-ui:search-container-column-jsp
							colspan="<%= 2 %>"
							path="/document_library/view_folder_descriptive.jsp"
						/>

						<c:if test="<%= dlPortletInstanceSettingsHelper.isShowActions() %>">
							<liferay-ui:search-container-column-jsp
								path="/document_library/folder_action.jsp"
							/>
						</c:if>
					</c:when>
					<c:otherwise>
						<liferay-ui:search-container-column-icon
							icon="minus-circle"
						/>
					</c:otherwise>
				</c:choose>
			</liferay-ui:search-container-row>

			<liferay-ui:search-iterator
				displayStyle="descriptive"
				markupView="lexicon"
				searchContainer="<%= dlSearchContainer %>"
			/>
		</liferay-ui:search-container>
	</div>
</liferay-util:buffer>

<div class="repository-search-results" data-repositoryId="<%= searchRepositoryId %>" id="<%= liferayPortletResponse.getNamespace() %>searchResultsContainer<%= searchRepositoryId %>">
	<%= searchResults %>
</div>

<%
request.setAttribute("view.jsp-folderId", String.valueOf(folderId));
%>