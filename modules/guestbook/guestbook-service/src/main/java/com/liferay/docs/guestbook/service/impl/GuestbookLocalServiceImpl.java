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

package com.liferay.docs.guestbook.service.impl;

import com.liferay.docs.guestbook.model.Entry;
import com.liferay.docs.guestbook.model.Guestbook;
import com.liferay.docs.guestbook.service.EntryLocalService;
import com.liferay.docs.guestbook.service.GuestbookLocalService;
import com.liferay.docs.guestbook.service.base.GuestbookLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.Date;
import java.util.List;


/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.liferay.docs.guestbook.model.Guestbook",
	service = AopService.class
)
public class GuestbookLocalServiceImpl extends GuestbookLocalServiceBaseImpl implements GuestbookLocalService {

	@Reference
	private EntryLocalService entryLocalService;
	@Indexable(type = IndexableType.REINDEX)
	public Guestbook addGuestbook(
			long userId, String name, ServiceContext serviceContext)
			throws PortalException {

		long groupId = serviceContext.getScopeGroupId();

		User user = userLocalService.getUserById(userId);

		Date now = new Date();

		validate(name);

		long guestbookId = counterLocalService.increment();

		Guestbook guestbook = guestbookPersistence.create(guestbookId);

		guestbook.setUuid(serviceContext.getUuid());
		guestbook.setUserId(userId);
		guestbook.setGroupId(groupId);
		guestbook.setCompanyId(user.getCompanyId());
		guestbook.setUserName(user.getFullName());
		guestbook.setCreateDate(serviceContext.getCreateDate(now));
		guestbook.setModifiedDate(serviceContext.getModifiedDate(now));
		guestbook.setName(name);
		guestbook.setExpandoBridgeAttributes(serviceContext);

		guestbookPersistence.update(guestbook);

		resourceLocalService.addResources(user.getCompanyId(), groupId, userId,
				Guestbook.class.getName(), guestbookId, false, true, true);

		return guestbook;

	}
	@Indexable(type = IndexableType.REINDEX)
	public Guestbook updateGuestbook(long userId, long guestbookId,
									 String name,String message, ServiceContext serviceContext) throws PortalException,
			SystemException {

		Date now = new Date();

		validate(name);

		Guestbook guestbook = getGuestbook(guestbookId);

		User user = userLocalService.getUser(userId);

		guestbook.setUserId(userId);
		guestbook.setUserName(user.getFullName());
		guestbook.setModifiedDate(serviceContext.getModifiedDate(now));
		guestbook.setName(name);
		guestbook.setExpandoBridgeAttributes(serviceContext);

		guestbookPersistence.update(guestbook);
		resourceLocalService.updateResources(serviceContext.getCompanyId(),
				serviceContext.getScopeGroupId(),
				Guestbook.class.getName(), guestbookId,
				serviceContext.getModelPermissions());
		return guestbook;
	}
	@Indexable(type = IndexableType.DELETE)
	public Guestbook deleteGuestbook(long guestbookId,
									 ServiceContext serviceContext) throws PortalException,
			SystemException {
		System.out.println("Guste book id delee: "+guestbookId);
		Guestbook guestbook = getGuestbook(guestbookId);

		List<Entry> entries = entryLocalService.getEntries(
				serviceContext.getScopeGroupId(), guestbookId);

		for (Entry entry : entries) {
			entryLocalService.deleteEntry(entry.getEntryId());
		}

		guestbook = deleteGuestbook(guestbook);

				resourceLocalService.deleteResource(serviceContext.getCompanyId(),
				Guestbook.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL,
				guestbookId);

		return guestbook;
	}

	public Guestbook deleteGuestbook(long guestbookId ) throws PortalException,
			SystemException {
		System.out.println("deelelelelelle");
		System.out.println("Guste book id delee: "+guestbookId);
		Guestbook guestbook = getGuestbook(guestbookId);

		if(entryLocalService.getEntries(20121,guestbookId) != null) {
			List<Entry> entries = entryLocalService.getEntries(20121, guestbookId);

			System.out.println("entries: " + entries);
			for (Entry entry : entries) {
				System.out.println("id if entryu: " + entry.getEntryId());
				entryLocalService.deleteEntry(entry.getEntryId());
			}
		}

		guestbook = deleteGuestbook(guestbook);



		return guestbook;
	}

	public List<Guestbook> getGuestbooks(long groupId) {

		return guestbookPersistence.findByGroupId(groupId);
	}

	public List<Guestbook> getGuestbooks(long groupId, int start, int end,
										 OrderByComparator<Guestbook> obc) {

		return guestbookPersistence.findByGroupId(groupId, start, end, obc);
	}

	public List<Guestbook> getGuestbooks(long groupId, int start, int end) {

		return guestbookPersistence.findByGroupId(groupId, start, end);
	}

	public int getGuestbooksCount(long groupId) {

		return guestbookPersistence.countByGroupId(groupId);
	}

	protected void validate(String name) throws PortalException {
		if (Validator.isNull(name)) {
		//	throw new GuestbookNameException();
		}
	}
}