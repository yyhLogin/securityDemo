package com.exception;


import com.enume.YIXGEnum;

public class YIXGException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	private Integer code;

	public YIXGException(YIXGEnum yixgEnum) {
		super(yixgEnum.getMsg());
		this.code = yixgEnum.getStatus();
	}
	public YIXGException(YIXGEnum yixgEnum, Object object) {
		super(yixgEnum.getMsg());
		this.code = yixgEnum.getStatus();
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
}
