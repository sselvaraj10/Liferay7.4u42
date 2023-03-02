create index IX_95811812 on ModuleBlaclist_Portlet (groupId, portletId[$COLUMN_LENGTH:75$]);
create index IX_7C57A56E on ModuleBlaclist_Portlet (portletId[$COLUMN_LENGTH:75$]);
create index IX_6DA4578B on ModuleBlaclist_Portlet (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_D2E344CD on ModuleBlaclist_Portlet (uuid_[$COLUMN_LENGTH:75$], groupId);