package com.juvenxu.mvnbook.account.persist;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class AccountPersistServiceImpl implements AccountPersistService {

	private String file = "target/classes/account-persist.xml";
	
	private SAXReader reader = new SAXReader();
	
	public Account createAccount(Account account) throws AccountPersistException {
		// TODO Auto-generated method stub
		return null;
	}

	public Account readAccount(String id) throws AccountPersistException {
		// TODO Auto-generated method stub
		return null;
	}

	public Account updateAccount(Account account) throws AccountPersistException {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteAccount(String id) throws AccountPersistException {
		// TODO Auto-generated method stub

	}
	
	public Document readDocment() {
		File dataFile = new File(file);
		try {
			Document document = reader.read(dataFile);
			return document;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public SAXReader getReader() {
		return reader;
	}

	public void setReader(SAXReader reader) {
		this.reader = reader;
	}

	
}
