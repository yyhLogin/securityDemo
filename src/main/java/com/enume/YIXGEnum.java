package com.enume;


/**
 * Create by yyh on 2017-08-11 18:12
 **/
public enum YIXGEnum {
	UNKNOWN_FILE(404, "文件不存在"),
	UNKNOWN_ERROR(-1, "未知错误"),
	UNKNOWN_SESSION(-2,"请重新登录"),
	INSERT_ERROR(-1,"未知原因导致插入失败"),
	INSERT_SUCCESS(200,"插入成功"),
	UPDATE_SUCCESS(200,"更新成功"),
	UPDATE_ERROR(-1,"未知原因导致更新失败"),
	DELETE_FAIL(-1,"未知原因导致删除失败"),
	DELETE_SUCCESS(2,"删除成功"),
	NO_DEPS(1001, "该用户无所属单位"),
	NOT_NULL(1002, "必要信息必须填写"),
	DEP_HAS(1003, "单位编号不能重复，请重新添加"),
	USR_HAS(1003, "该用户已存在，请重新添加"),
	ROLERS_HAS(1003, "该角色已存在，请重新添加"),
	DEVICE_HAS(1, "设备编号不能重复，请重新添加"),
	DEP_EMPHAS(1004,"该单位还有下属警员,请先将警员移至其它单位"),
	EXPORT_SUCCESS(200,"导出文件生成成功"),
	EXPORT_FAIL(-1,"未知原因导致导出文件生成失败"),
	EMP_HAS(1006, "警员编号不能重复，请重新添加"),
	FILETYPE_ERROR(-1, "请选择xls或者xlsx格式的文件"),
	FILE_NULL(-1, "文件内容为空"),
	LOCK_ISLOCK(1,"该文件是锁定状态，无需锁定"),
	LOCK_UNLOCK(1,"该文件是解锁状态，无需解锁"),
	LOCK_UNLOCK_SUCCESS(200,"解锁成功"),
	LOCK_UNLOCK_ERROR(-1,"解锁失败"),
	LOCK_LOCK_SUCCESS(200,"锁定成功"),
	LOCK_LOCK_ERROR(-1,"锁定失败"),
	IMPORT_ERROR(-1, "未知原因导致导入失败"),
	IMPORT_SUCCESS(200, "未知原因导致导入失败"),
	IMPORT_ERROR_INSERTEMP(-1, "未知原因导致在导入时新增警员失败"),
	IMPORT_ERROR_UPDATEEMP(-1, "未知原因导致在导入时更新警员失败"),
	IMPORT_ERROR_INSERTDEVICE(-1, "未知原因导致在导入时新增设备失败"),
	IMPORT_ERROR_UPDATEDEVICE(-1, "未知原因导致在导入时更新设备失败"),
	DELETE_FILESRV_SUCCESS(200,"删除服务器文件成功"),
	DELETE_FILELOCAL_SUCCESS(200,"删除采集站文件成功"),
	READ_PROFILE_SUCCESS(200,"读取配置文件信息"),
	READ_PROFILE_ERROR(-1,"由于未知原因导致读取配置文件信息失败"),
	WRITE_PROFILE_SUCCESS(200,"写入配置文件信息"),
	WRITE_PROFILE_ERROR(-1,"由于未知原因导致写入配置文件信息失败"),
	SUCCESS(200, "成功");
	private Integer status;
	private String msg;

	YIXGEnum(Integer status, String msg) {
		this.status = status;
		this.msg = msg;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
