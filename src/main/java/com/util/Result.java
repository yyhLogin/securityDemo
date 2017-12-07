package com.util;

import java.io.Serializable;

/**
 * http 请求返回的最外层对象
 * Create by yyh on 2017-08-11 18:04
 **/
public class Result<T> implements Serializable {

	private static final long serialVersionUID = 1L;

    //响应状态码
    private Integer status;

    //返回信息
    private String msg;

    //返回内容
    private T data;

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
