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

package moduleblacklistservice.service.impl;

import com.liferay.portal.aop.AopService;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import moduleblacklistservice.model.Portlet;
import moduleblacklistservice.service.base.PortletLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=moduleblacklistservice.model.Portlet",
	service = AopService.class
)
public class PortletLocalServiceImpl extends PortletLocalServiceBaseImpl {
	public Portlet addPortlet(
			long userId, long groupId,String portletId,Boolean active, ServiceContext serviceContext)
			throws PortalException {

		User user = userLocalService.getUserById(userId);

		Date now = new Date();

		long id = counterLocalService.increment();

		Portlet portlet = portletPersistence.create(id);

		portlet.setPortletId(portletId);
		portlet.setActive(active);
		portlet.setCompanyId(user.getCompanyId());
		portlet.setGroupId(groupId);
		portlet.setCreateDate(serviceContext.getCreateDate(now));
		portlet.setModifiedDate(serviceContext.getModifiedDate(now));
		portlet.setUserId(userId);
		portlet.setUserName(user.getScreenName());
		portlet.setUuid(serviceContext.getUuid());
		portlet.setExpandoBridgeAttributes(serviceContext);


		portletPersistence.update(portlet);


		return portlet;

	}

	public List<Portlet> getPortletByPortletId(String portletId) {

		return portletPersistence.findByportletId(portletId);
	}
	public List<Portlet> getPortletByGroupId(long groupId) {

		return portletPersistence.findBygroupId(groupId);
	}
	public List<Portlet> getPortlet(long groupId,String portletId) {

		return portletPersistence.findBygroup_portlet(groupId,portletId);
	}
	public List<Portlet> getPortlets(int start, int end) {

		return portletPersistence.findAll(start, end);
	}

	public List<Portlet> getPortlets(int start, int end, OrderByComparator<Portlet> obc) {

		return portletPersistence.findAll(start, end,obc);
	}

	public int getPortletsCount() {

		return portletPersistence.countAll();
	}
	public List<Portlet> getPortlets() {

		return portletPersistence.findAll();
	}
}