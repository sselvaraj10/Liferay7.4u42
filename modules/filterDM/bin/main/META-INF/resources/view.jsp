<%@ page import="com.liferay.frontend.taglib.clay.servlet.taglib.util.DropdownItemList" %>
<%@ include file="/init.jsp" %>
<%@ taglib prefix="clay" uri="http://liferay.com/tld/clay" %>


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

