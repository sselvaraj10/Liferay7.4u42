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

package moduleblacklistservice.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PortletLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PortletLocalService
 * @generated
 */
public class PortletLocalServiceWrapper
	implements PortletLocalService, ServiceWrapper<PortletLocalService> {

	public PortletLocalServiceWrapper() {
		this(null);
	}

	public PortletLocalServiceWrapper(PortletLocalService portletLocalService) {
		_portletLocalService = portletLocalService;
	}

	@Override
	public moduleblacklistservice.model.Portlet addPortlet(
			long userId, long groupId, String portletId, Boolean active,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _portletLocalService.addPortlet(
			userId, groupId, portletId, active, serviceContext);
	}

	/**
	 * Adds the portlet to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PortletLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param portlet the portlet
	 * @return the portlet that was added
	 */
	@Override
	public moduleblacklistservice.model.Portlet addPortlet(
		moduleblacklistservice.model.Portlet portlet) {

		return _portletLocalService.addPortlet(portlet);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _portletLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new portlet with the primary key. Does not add the portlet to the database.
	 *
	 * @param id the primary key for the new portlet
	 * @return the new portlet
	 */
	@Override
	public moduleblacklistservice.model.Portlet createPortlet(long id) {
		return _portletLocalService.createPortlet(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _portletLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the portlet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PortletLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the portlet
	 * @return the portlet that was removed
	 * @throws PortalException if a portlet with the primary key could not be found
	 */
	@Override
	public moduleblacklistservice.model.Portlet deletePortlet(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _portletLocalService.deletePortlet(id);
	}

	/**
	 * Deletes the portlet from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PortletLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param portlet the portlet
	 * @return the portlet that was removed
	 */
	@Override
	public moduleblacklistservice.model.Portlet deletePortlet(
		moduleblacklistservice.model.Portlet portlet) {

		return _portletLocalService.deletePortlet(portlet);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _portletLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _portletLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _portletLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _portletLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>moduleblacklistservice.model.impl.PortletModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _portletLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>moduleblacklistservice.model.impl.PortletModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _portletLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _portletLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _portletLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public moduleblacklistservice.model.Portlet fetchPortlet(long id) {
		return _portletLocalService.fetchPortlet(id);
	}

	/**
	 * Returns the portlet matching the UUID and group.
	 *
	 * @param uuid the portlet's UUID
	 * @param groupId the primary key of the group
	 * @return the matching portlet, or <code>null</code> if a matching portlet could not be found
	 */
	@Override
	public moduleblacklistservice.model.Portlet fetchPortletByUuidAndGroupId(
		String uuid, long groupId) {

		return _portletLocalService.fetchPortletByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _portletLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _portletLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _portletLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _portletLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _portletLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the portlet with the primary key.
	 *
	 * @param id the primary key of the portlet
	 * @return the portlet
	 * @throws PortalException if a portlet with the primary key could not be found
	 */
	@Override
	public moduleblacklistservice.model.Portlet getPortlet(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _portletLocalService.getPortlet(id);
	}

	@Override
	public java.util.List<moduleblacklistservice.model.Portlet> getPortlet(
		long groupId, String portletId) {

		return _portletLocalService.getPortlet(groupId, portletId);
	}

	@Override
	public java.util.List<moduleblacklistservice.model.Portlet>
		getPortletByGroupId(long groupId) {

		return _portletLocalService.getPortletByGroupId(groupId);
	}

	@Override
	public java.util.List<moduleblacklistservice.model.Portlet>
		getPortletByPortletId(String portletId) {

		return _portletLocalService.getPortletByPortletId(portletId);
	}

	/**
	 * Returns the portlet matching the UUID and group.
	 *
	 * @param uuid the portlet's UUID
	 * @param groupId the primary key of the group
	 * @return the matching portlet
	 * @throws PortalException if a matching portlet could not be found
	 */
	@Override
	public moduleblacklistservice.model.Portlet getPortletByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _portletLocalService.getPortletByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public java.util.List<moduleblacklistservice.model.Portlet> getPortlets() {
		return _portletLocalService.getPortlets();
	}

	/**
	 * Returns a range of all the portlets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>moduleblacklistservice.model.impl.PortletModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of portlets
	 * @param end the upper bound of the range of portlets (not inclusive)
	 * @return the range of portlets
	 */
	@Override
	public java.util.List<moduleblacklistservice.model.Portlet> getPortlets(
		int start, int end) {

		return _portletLocalService.getPortlets(start, end);
	}

	@Override
	public java.util.List<moduleblacklistservice.model.Portlet> getPortlets(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<moduleblacklistservice.model.Portlet> obc) {

		return _portletLocalService.getPortlets(start, end, obc);
	}

	/**
	 * Returns all the portlets matching the UUID and company.
	 *
	 * @param uuid the UUID of the portlets
	 * @param companyId the primary key of the company
	 * @return the matching portlets, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<moduleblacklistservice.model.Portlet>
		getPortletsByUuidAndCompanyId(String uuid, long companyId) {

		return _portletLocalService.getPortletsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of portlets matching the UUID and company.
	 *
	 * @param uuid the UUID of the portlets
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of portlets
	 * @param end the upper bound of the range of portlets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching portlets, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<moduleblacklistservice.model.Portlet>
		getPortletsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<moduleblacklistservice.model.Portlet> orderByComparator) {

		return _portletLocalService.getPortletsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of portlets.
	 *
	 * @return the number of portlets
	 */
	@Override
	public int getPortletsCount() {
		return _portletLocalService.getPortletsCount();
	}

	/**
	 * Updates the portlet in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PortletLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param portlet the portlet
	 * @return the portlet that was updated
	 */
	@Override
	public moduleblacklistservice.model.Portlet updatePortlet(
		moduleblacklistservice.model.Portlet portlet) {

		return _portletLocalService.updatePortlet(portlet);
	}

	@Override
	public PortletLocalService getWrappedService() {
		return _portletLocalService;
	}

	@Override
	public void setWrappedService(PortletLocalService portletLocalService) {
		_portletLocalService = portletLocalService;
	}

	private PortletLocalService _portletLocalService;

}