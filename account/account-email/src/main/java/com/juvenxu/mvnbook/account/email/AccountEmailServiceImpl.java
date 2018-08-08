package com.juvenxu.mvnbook.account.email;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import com.juvenxu.mvnbook.account.error.AccountEmailException;

public class AccountEmailServiceImpl implements AccountEmailService {
	private JavaMailSender javaMailSender;
	private String systemMail;
	@Override
	public void sendMail(String to,String from, String subject, String htmlText) throws AccountEmailException {
		MimeMessage msg = javaMailSender.createMimeMessage();
		MimeMessageHelper msgHelper = new MimeMessageHelper(msg);
		try {
			System.out.println("AccountEmailCall...");
			msgHelper.setFrom(from);
			msgHelper.setTo(to);
			msgHelper.setSubject(subject);
			msgHelper.setText(htmlText,true);
		} catch (MessagingException e) {
			throw new AccountEmailException("发送失败");
		}
	}
	public JavaMailSender getJavaMailSender() {
		return javaMailSender;
	}
	public void setJavaMailSender(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}
	public String getSystemMail() {
		return systemMail;
	}
	public void setSystemMail(String systemMail) {
		this.systemMail = systemMail;
	}

}
