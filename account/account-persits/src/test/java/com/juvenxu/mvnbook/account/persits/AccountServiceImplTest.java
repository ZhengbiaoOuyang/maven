package com.juvenxu.mvnbook.account.persits;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;

import com.juvenxu.mvnbook.account.persist.AccountPersistServiceImpl;

import junit.framework.TestCase;

public class AccountServiceImplTest extends TestCase{
	
	public void testReadDocument() {
		AccountPersistServiceImpl a = new AccountPersistServiceImpl();
		Document docment = a.readDocment();
		Element rootElement = docment.getRootElement();
		List<Element> elements = rootElement.elements();
		System.out.println(elements.size());
		for (Element element : elements) {
			System.out.println(element.toString());
		}
		
	}

}
