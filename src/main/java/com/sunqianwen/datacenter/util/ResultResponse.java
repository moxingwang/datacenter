package com.sunqianwen.datacenter.util;

public class ResultResponse<T> {

	protected String code ;

	protected String message ;

	protected T data;

	public ResultResponse() {
		this.code = ResultCode.C200.getCode();
		this.message = ResultCode.C200.getDesc();
	}

	public ResultResponse(String code) {
		this.code = code;
	}

	public ResultResponse(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public ResultResponse(String code, String message, T data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}

	public String getCode() {
		return code;
	}

	public ResultResponse<T> setCode(String code) {
		this.code = code;
		return this;
	}

	public String getMessage() {
		return message;
	}

	public ResultResponse<T> setMessage(String message) {
		this.message = message;
		return this;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}