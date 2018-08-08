package com.juvenxu.mvnbook.account.error;

public class AccountEmailException extends RuntimeException {
	private static final long serialVersionUID = 4020812935422864815L;
	private String msg;

	public AccountEmailException(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg; 
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
