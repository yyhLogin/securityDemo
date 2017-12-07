package com.enume;

/**
 * 权限的枚举
 */
public enum PermissionsEnum {

	GET_MACHINE_NUMBER(1,"获取机器编号",0x0000000000000001L),
	USB_BIND(2,"USB绑定",0x0000000000000002L),
	SYSTEM_MAINTENANCE(3,"系统维护",0x0000000000000004L),
	VIEW_FILE(4,"文件查看",0x0000000000000008L),
	UPDATE_FILE(5,"文件编辑",0x0000000000000010L),
	DELETE_FILE(6,"文件删除",0x0000000000000020L),
	DOWNLOAD_FILE(7,"文件下载",0x0000000000000040L),
	VIEW_DEP(8,"部门查看",0x0000000000000080L),
	UPDATE_DEP(9,"部门编辑",0x0000000000000100L),
	DELETE_DEP(10,"部门删除",0x0000000000000200L),
	VIEW_EMP(11,"警员查看",0x0000000000000400L),
	UPDATE_EMP(12,"警员编辑",0x0000000000000800L),
	DELETE_EMP(13,"警员删除",0x0000000000001000L),
	VIEW_USR(14,"用户查看",0x0000000000002000L),
	UPDATE_USR(15,"用户编辑",0x0000000000004000L),
	DELETE_USR(16,"用户删除",0x0000000000008000L),
	VIEW_ROLE(17,"角色查看",0x0000000000010000L),
	UPDATE_ROLE(18,"角色编辑",0x0000000000020000L),
	DELETE_ROLE(19,"角色删除",0x0000000000040000L),
	VIEW_DEVICE(20,"设备查看",0x0000000000080000L),
	UPDATE_DEVICE(21,"设备编辑",0x0000000000100000L),
	DELETE_DEVICE(22,"设备删除",0x0000000000200000L),
	VIEW_COLLECTIONS(23,"采集站查看",0x0000000000400000L),
	UPDATE_COLLECTIONS(24,"采集站编辑",0x0000000000800000L),
	DELETE_COLLECTIONS(25,"采集站删除",0x0000000001000000L);
	private int id;
	private String permissions;
	private Long value;

	PermissionsEnum(int id, String permissions, Long value) {
		this.id=id;
		this.permissions=permissions;
		this.value=value;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPermissions() {
		return permissions;
	}

	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}

	public Long getValue() {
		return value;
	}

	public void setValue(Long value) {
		this.value = value;
	}
}
