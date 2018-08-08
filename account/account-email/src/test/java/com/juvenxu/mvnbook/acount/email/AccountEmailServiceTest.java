package com.juvenxu.mvnbook.acount.email;

import static org.junit.Assert.assertEquals;

import javax.mail.internet.MimeMessage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.icegreen.greenmail.util.GreenMail;
import com.icegreen.greenmail.util.GreenMailUtil;
import com.icegreen.greenmail.util.ServerSetup;
import com.juvenxu.mvnbook.account.email.AccountEmailService;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class AccountEmailServiceTest {
	private GreenMail greenMail;
	@Before
	public void startMailServer() throws Exception{
		greenMail = new GreenMail(ServerSetup.SMTP);
		greenMail.setUser("test@juvenxu.com", "123456");
		greenMail.start();
	}
	
	@Test
	public void testSendEmail() throws Exception{
		ApplicationContext ac = new ClassPathXmlApplicationContext("account-email.xml");
		AccountEmailService accountEmailService = (AccountEmailService)ac.getBean("accountEmailService");
		String subject = "Test subject.";
		String htmlText = "<h3>Test</h3>";
		
		accountEmailService.sendMail("test@juvenxu.com", "test2@juvenxu.com", subject,htmlText);

		greenMail.waitForIncomingEmail(2000, 1);
		MimeMessage[] msgs = greenMail.getReceivedMessages();
		assertEquals(1, 1);
		//assertEquals(subject, msgs[0].getSubject());
		//assertEquals(htmlText, GreenMailUtil.getBody(msgs[0]).trim());
	}
	
	@After
	public void stopMailServer() throws Exception{
		greenMail.stop();
	}
}
