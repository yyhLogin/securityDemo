package com.util;


import com.enume.YIXGEnum;
import com.exception.YIXGException;

/**
 * Create by yyh on 2017-08-11 18:08
 **/
public class ResultUtil {
	public static Result success(Object object) {
		Result result = new Result();
		result.setStatus(200);
		result.setMsg("成功");
		result.setData(object);
		return result;
	}

	public static Result error(YIXGEnum yixgEnum) {
		Result result = new Result();
		result.setStatus(yixgEnum.getStatus());
		result.setMsg(yixgEnum.getMsg());
		return result;
	}
	public static Result success(YIXGEnum yixgEnum) {
		Result result = new Result();
		result.setStatus(yixgEnum.getStatus());
		result.setMsg(yixgEnum.getMsg());
		return result;
	}

	public static Result success() {
		return success(null);
	}

	public static Result error(Integer status, String msg) {
		Result result = new Result();
		result.setStatus(status);
		result.setMsg(msg);
		return result;
	}

	public static Result error(Integer status, String msg, Object object) {
		Result result = new Result();
		result.setStatus(status);
		result.setMsg(msg);
		result.setData(object);
		return result;
	}

	public static Result error(YIXGException yixgExcetion, Object object) {
		Result result = new Result();
		result.setStatus(yixgExcetion.getCode());
		result.setMsg(yixgExcetion.getMessage());
		result.setData(object);
		return result;
	}

	public static Result error(YIXGException yixgException) {
		Result result = new Result();
		result.setStatus(yixgException.getCode());
		result.setMsg(yixgException.getMessage());
		return result;
	}

	public static Result success(YIXGEnum yixgEnum,Object object) {
		Result result = new Result();
		result.setStatus(yixgEnum.getStatus());
		result.setMsg(yixgEnum.getMsg());
		result.setData(object);
		return result;
	}

}
