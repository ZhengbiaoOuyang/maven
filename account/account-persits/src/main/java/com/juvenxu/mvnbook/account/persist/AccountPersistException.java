package com.juvenxu.mvnbook.account.persist;

public class AccountPersistException extends Exception {
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
