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

package moduleblacklistservice.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import moduleblacklistservice.exception.NoSuchPortletException;

import moduleblacklistservice.model.Portlet;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the portlet service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PortletUtil
 * @generated
 */
@ProviderType
public interface PortletPersistence extends BasePersistence<Portlet> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PortletUtil} to access the portlet persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the portlets where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching portlets
	 */
	public java.util.List<Portlet> findByUuid(String uuid);

	/**
	 * Returns a range of all the portlets where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PortletModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of portlets
	 * @param end the upper bound of the range of portlets (not inclusive)
	 * @return the range of matching portlets
	 */
	public java.util.List<Portlet> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the portlets where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PortletModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of portlets
	 * @param end the upper bound of the range of portlets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching portlets
	 */
	public java.util.List<Portlet> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Portlet>
			orderByComparator);

	/**
	 * Returns an ordered range of all the portlets where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PortletModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of portlets
	 * @param end the upper bound of the range of portlets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching portlets
	 */
	public java.util.List<Portlet> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Portlet>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first portlet in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching portlet
	 * @throws NoSuchPortletException if a matching portlet could not be found
	 */
	public Portlet findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Portlet>
				orderByComparator)
		throws NoSuchPortletException;

	/**
	 * Returns the first portlet in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching portlet, or <code>null</code> if a matching portlet could not be found
	 */
	public Portlet fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Portlet>
			orderByComparator);

	/**
	 * Returns the last portlet in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching portlet
	 * @throws NoSuchPortletException if a matching portlet could not be found
	 */
	public Portlet findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Portlet>
				orderByComparator)
		throws NoSuchPortletException;

	/**
	 * Returns the last portlet in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching portlet, or <code>null</code> if a matching portlet could not be found
	 */
	public Portlet fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Portlet>
			orderByComparator);

	/**
	 * Returns the portlets before and after the current portlet in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current portlet
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next portlet
	 * @throws NoSuchPortletException if a portlet with the primary key could not be found
	 */
	public Portlet[] findByUuid_PrevAndNext(
			long id, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Portlet>
				orderByComparator)
		throws NoSuchPortletException;

	/**
	 * Removes all the portlets where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of portlets where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching portlets
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the portlet where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchPortletException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching portlet
	 * @throws NoSuchPortletException if a matching portlet could not be found
	 */
	public Portlet findByUUID_G(String uuid, long groupId)
		throws NoSuchPortletException;

	/**
	 * Returns the portlet where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching portlet, or <code>null</code> if a matching portlet could not be found
	 */
	public Portlet fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the portlet where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching portlet, or <code>null</code> if a matching portlet could not be found
	 */
	public Portlet fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the portlet where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the portlet that was removed
	 */
	public Portlet removeByUUID_G(String uuid, long groupId)
		throws NoSuchPortletException;

	/**
	 * Returns the number of portlets where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching portlets
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the portlets where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching portlets
	 */
	public java.util.List<Portlet> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the portlets where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PortletModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of portlets
	 * @param end the upper bound of the range of portlets (not inclusive)
	 * @return the range of matching portlets
	 */
	public java.util.List<Portlet> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the portlets where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PortletModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of portlets
	 * @param end the upper bound of the range of portlets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching portlets
	 */
	public java.util.List<Portlet> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Portlet>
			orderByComparator);

	/**
	 * Returns an ordered range of all the portlets where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PortletModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of portlets
	 * @param end the upper bound of the range of portlets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching portlets
	 */
	public java.util.List<Portlet> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Portlet>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first portlet in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching portlet
	 * @throws NoSuchPortletException if a matching portlet could not be found
	 */
	public Portlet findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Portlet>
				orderByComparator)
		throws NoSuchPortletException;

	/**
	 * Returns the first portlet in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching portlet, or <code>null</code> if a matching portlet could not be found
	 */
	public Portlet fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Portlet>
			orderByComparator);

	/**
	 * Returns the last portlet in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching portlet
	 * @throws NoSuchPortletException if a matching portlet could not be found
	 */
	public Portlet findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Portlet>
				orderByComparator)
		throws NoSuchPortletException;

	/**
	 * Returns the last portlet in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching portlet, or <code>null</code> if a matching portlet could not be found
	 */
	public Portlet fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Portlet>
			orderByComparator);

	/**
	 * Returns the portlets before and after the current portlet in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param id the primary key of the current portlet
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next portlet
	 * @throws NoSuchPortletException if a portlet with the primary key could not be found
	 */
	public Portlet[] findByUuid_C_PrevAndNext(
			long id, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Portlet>
				orderByComparator)
		throws NoSuchPortletException;

	/**
	 * Removes all the portlets where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of portlets where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching portlets
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the portlets where portletId = &#63;.
	 *
	 * @param portletId the portlet ID
	 * @return the matching portlets
	 */
	public java.util.List<Portlet> findByportletId(String portletId);

	/**
	 * Returns a range of all the portlets where portletId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PortletModelImpl</code>.
	 * </p>
	 *
	 * @param portletId the portlet ID
	 * @param start the lower bound of the range of portlets
	 * @param end the upper bound of the range of portlets (not inclusive)
	 * @return the range of matching portlets
	 */
	public java.util.List<Portlet> findByportletId(
		String portletId, int start, int end);

	/**
	 * Returns an ordered range of all the portlets where portletId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PortletModelImpl</code>.
	 * </p>
	 *
	 * @param portletId the portlet ID
	 * @param start the lower bound of the range of portlets
	 * @param end the upper bound of the range of portlets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching portlets
	 */
	public java.util.List<Portlet> findByportletId(
		String portletId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Portlet>
			orderByComparator);

	/**
	 * Returns an ordered range of all the portlets where portletId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PortletModelImpl</code>.
	 * </p>
	 *
	 * @param portletId the portlet ID
	 * @param start the lower bound of the range of portlets
	 * @param end the upper bound of the range of portlets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching portlets
	 */
	public java.util.List<Portlet> findByportletId(
		String portletId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Portlet>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first portlet in the ordered set where portletId = &#63;.
	 *
	 * @param portletId the portlet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching portlet
	 * @throws NoSuchPortletException if a matching portlet could not be found
	 */
	public Portlet findByportletId_First(
			String portletId,
			com.liferay.portal.kernel.util.OrderByComparator<Portlet>
				orderByComparator)
		throws NoSuchPortletException;

	/**
	 * Returns the first portlet in the ordered set where portletId = &#63;.
	 *
	 * @param portletId the portlet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching portlet, or <code>null</code> if a matching portlet could not be found
	 */
	public Portlet fetchByportletId_First(
		String portletId,
		com.liferay.portal.kernel.util.OrderByComparator<Portlet>
			orderByComparator);

	/**
	 * Returns the last portlet in the ordered set where portletId = &#63;.
	 *
	 * @param portletId the portlet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching portlet
	 * @throws NoSuchPortletException if a matching portlet could not be found
	 */
	public Portlet findByportletId_Last(
			String portletId,
			com.liferay.portal.kernel.util.OrderByComparator<Portlet>
				orderByComparator)
		throws NoSuchPortletException;

	/**
	 * Returns the last portlet in the ordered set where portletId = &#63;.
	 *
	 * @param portletId the portlet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching portlet, or <code>null</code> if a matching portlet could not be found
	 */
	public Portlet fetchByportletId_Last(
		String portletId,
		com.liferay.portal.kernel.util.OrderByComparator<Portlet>
			orderByComparator);

	/**
	 * Returns the portlets before and after the current portlet in the ordered set where portletId = &#63;.
	 *
	 * @param id the primary key of the current portlet
	 * @param portletId the portlet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next portlet
	 * @throws NoSuchPortletException if a portlet with the primary key could not be found
	 */
	public Portlet[] findByportletId_PrevAndNext(
			long id, String portletId,
			com.liferay.portal.kernel.util.OrderByComparator<Portlet>
				orderByComparator)
		throws NoSuchPortletException;

	/**
	 * Removes all the portlets where portletId = &#63; from the database.
	 *
	 * @param portletId the portlet ID
	 */
	public void removeByportletId(String portletId);

	/**
	 * Returns the number of portlets where portletId = &#63;.
	 *
	 * @param portletId the portlet ID
	 * @return the number of matching portlets
	 */
	public int countByportletId(String portletId);

	/**
	 * Returns all the portlets where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching portlets
	 */
	public java.util.List<Portlet> findBygroupId(long groupId);

	/**
	 * Returns a range of all the portlets where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PortletModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of portlets
	 * @param end the upper bound of the range of portlets (not inclusive)
	 * @return the range of matching portlets
	 */
	public java.util.List<Portlet> findBygroupId(
		long groupId, int start, int end);

	/**
	 * Returns an ordered range of all the portlets where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PortletModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of portlets
	 * @param end the upper bound of the range of portlets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching portlets
	 */
	public java.util.List<Portlet> findBygroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Portlet>
			orderByComparator);

	/**
	 * Returns an ordered range of all the portlets where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PortletModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of portlets
	 * @param end the upper bound of the range of portlets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching portlets
	 */
	public java.util.List<Portlet> findBygroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Portlet>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first portlet in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching portlet
	 * @throws NoSuchPortletException if a matching portlet could not be found
	 */
	public Portlet findBygroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Portlet>
				orderByComparator)
		throws NoSuchPortletException;

	/**
	 * Returns the first portlet in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching portlet, or <code>null</code> if a matching portlet could not be found
	 */
	public Portlet fetchBygroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Portlet>
			orderByComparator);

	/**
	 * Returns the last portlet in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching portlet
	 * @throws NoSuchPortletException if a matching portlet could not be found
	 */
	public Portlet findBygroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Portlet>
				orderByComparator)
		throws NoSuchPortletException;

	/**
	 * Returns the last portlet in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching portlet, or <code>null</code> if a matching portlet could not be found
	 */
	public Portlet fetchBygroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Portlet>
			orderByComparator);

	/**
	 * Returns the portlets before and after the current portlet in the ordered set where groupId = &#63;.
	 *
	 * @param id the primary key of the current portlet
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next portlet
	 * @throws NoSuchPortletException if a portlet with the primary key could not be found
	 */
	public Portlet[] findBygroupId_PrevAndNext(
			long id, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Portlet>
				orderByComparator)
		throws NoSuchPortletException;

	/**
	 * Removes all the portlets where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeBygroupId(long groupId);

	/**
	 * Returns the number of portlets where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching portlets
	 */
	public int countBygroupId(long groupId);

	/**
	 * Returns all the portlets where groupId = &#63; and portletId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @return the matching portlets
	 */
	public java.util.List<Portlet> findBygroup_portlet(
		long groupId, String portletId);

	/**
	 * Returns a range of all the portlets where groupId = &#63; and portletId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PortletModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param start the lower bound of the range of portlets
	 * @param end the upper bound of the range of portlets (not inclusive)
	 * @return the range of matching portlets
	 */
	public java.util.List<Portlet> findBygroup_portlet(
		long groupId, String portletId, int start, int end);

	/**
	 * Returns an ordered range of all the portlets where groupId = &#63; and portletId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PortletModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param start the lower bound of the range of portlets
	 * @param end the upper bound of the range of portlets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching portlets
	 */
	public java.util.List<Portlet> findBygroup_portlet(
		long groupId, String portletId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Portlet>
			orderByComparator);

	/**
	 * Returns an ordered range of all the portlets where groupId = &#63; and portletId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PortletModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param start the lower bound of the range of portlets
	 * @param end the upper bound of the range of portlets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching portlets
	 */
	public java.util.List<Portlet> findBygroup_portlet(
		long groupId, String portletId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Portlet>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first portlet in the ordered set where groupId = &#63; and portletId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching portlet
	 * @throws NoSuchPortletException if a matching portlet could not be found
	 */
	public Portlet findBygroup_portlet_First(
			long groupId, String portletId,
			com.liferay.portal.kernel.util.OrderByComparator<Portlet>
				orderByComparator)
		throws NoSuchPortletException;

	/**
	 * Returns the first portlet in the ordered set where groupId = &#63; and portletId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching portlet, or <code>null</code> if a matching portlet could not be found
	 */
	public Portlet fetchBygroup_portlet_First(
		long groupId, String portletId,
		com.liferay.portal.kernel.util.OrderByComparator<Portlet>
			orderByComparator);

	/**
	 * Returns the last portlet in the ordered set where groupId = &#63; and portletId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching portlet
	 * @throws NoSuchPortletException if a matching portlet could not be found
	 */
	public Portlet findBygroup_portlet_Last(
			long groupId, String portletId,
			com.liferay.portal.kernel.util.OrderByComparator<Portlet>
				orderByComparator)
		throws NoSuchPortletException;

	/**
	 * Returns the last portlet in the ordered set where groupId = &#63; and portletId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching portlet, or <code>null</code> if a matching portlet could not be found
	 */
	public Portlet fetchBygroup_portlet_Last(
		long groupId, String portletId,
		com.liferay.portal.kernel.util.OrderByComparator<Portlet>
			orderByComparator);

	/**
	 * Returns the portlets before and after the current portlet in the ordered set where groupId = &#63; and portletId = &#63;.
	 *
	 * @param id the primary key of the current portlet
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next portlet
	 * @throws NoSuchPortletException if a portlet with the primary key could not be found
	 */
	public Portlet[] findBygroup_portlet_PrevAndNext(
			long id, long groupId, String portletId,
			com.liferay.portal.kernel.util.OrderByComparator<Portlet>
				orderByComparator)
		throws NoSuchPortletException;

	/**
	 * Removes all the portlets where groupId = &#63; and portletId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 */
	public void removeBygroup_portlet(long groupId, String portletId);

	/**
	 * Returns the number of portlets where groupId = &#63; and portletId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param portletId the portlet ID
	 * @return the number of matching portlets
	 */
	public int countBygroup_portlet(long groupId, String portletId);

	/**
	 * Caches the portlet in the entity cache if it is enabled.
	 *
	 * @param portlet the portlet
	 */
	public void cacheResult(Portlet portlet);

	/**
	 * Caches the portlets in the entity cache if it is enabled.
	 *
	 * @param portlets the portlets
	 */
	public void cacheResult(java.util.List<Portlet> portlets);

	/**
	 * Creates a new portlet with the primary key. Does not add the portlet to the database.
	 *
	 * @param id the primary key for the new portlet
	 * @return the new portlet
	 */
	public Portlet create(long id);

	/**
	 * Removes the portlet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the portlet
	 * @return the portlet that was removed
	 * @throws NoSuchPortletException if a portlet with the primary key could not be found
	 */
	public Portlet remove(long id) throws NoSuchPortletException;

	public Portlet updateImpl(Portlet portlet);

	/**
	 * Returns the portlet with the primary key or throws a <code>NoSuchPortletException</code> if it could not be found.
	 *
	 * @param id the primary key of the portlet
	 * @return the portlet
	 * @throws NoSuchPortletException if a portlet with the primary key could not be found
	 */
	public Portlet findByPrimaryKey(long id) throws NoSuchPortletException;

	/**
	 * Returns the portlet with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the portlet
	 * @return the portlet, or <code>null</code> if a portlet with the primary key could not be found
	 */
	public Portlet fetchByPrimaryKey(long id);

	/**
	 * Returns all the portlets.
	 *
	 * @return the portlets
	 */
	public java.util.List<Portlet> findAll();

	/**
	 * Returns a range of all the portlets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PortletModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of portlets
	 * @param end the upper bound of the range of portlets (not inclusive)
	 * @return the range of portlets
	 */
	public java.util.List<Portlet> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the portlets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PortletModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of portlets
	 * @param end the upper bound of the range of portlets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of portlets
	 */
	public java.util.List<Portlet> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Portlet>
			orderByComparator);

	/**
	 * Returns an ordered range of all the portlets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PortletModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of portlets
	 * @param end the upper bound of the range of portlets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of portlets
	 */
	public java.util.List<Portlet> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Portlet>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the portlets from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of portlets.
	 *
	 * @return the number of portlets
	 */
	public int countAll();

}