package com.juvenxu.mvnbook.account.service;

import com.juvenxu.mvnbook.account.email.AccountEmailService;
import com.juvenxu.mvnbook.account.persist.AccountPersistService;

public class AccountServiceImpl implements AccountService {

	private AccountEmailService accountEmailService;
	private AccountPersistService accountPersistService;
	
	public void accountService(Object object) {
		//accountEmailService
		
		// accountEmailService.sendMail("test@juvenxu.com", "test2@juvenxu.com", "title","testing");
		
	}

	public AccountEmailService getAccountEmailService() {
		return accountEmailService;
	}

	public void setAccountEmailService(AccountEmailService accountEmailService) {
		this.accountEmailService = accountEmailService;
	}

	public AccountPersistService getAccountPersistService() {
		return accountPersistService;
	}

	public void setAccountPersistService(AccountPersistService accountPersistService) {
		this.accountPersistService = accountPersistService;
	}

}
