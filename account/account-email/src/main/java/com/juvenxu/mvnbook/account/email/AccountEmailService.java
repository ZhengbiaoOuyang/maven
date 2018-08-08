package com.juvenxu.mvnbook.account.email;

import com.juvenxu.mvnbook.account.error.AccountEmailException;

public interface AccountEmailService {
	void sendMail(String to,String from,String subject,String htmlText)throws AccountEmailException;
}
