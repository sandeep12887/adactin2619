package com.helper;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class PropertyReader {
	public static Properties prob;
	
	public PropertyReader () throws IOException {
		try {
			prob = new Properties();
			File propFILE= new File(System.getProperty
					("user.dir")+"//src//test//resource//com//adatinProperties//config.properties");
			
			FileInputStream ip= new FileInputStream(propFILE);
			prob.load(ip);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	    
	}
	
	public String getbrowserName() throws Exception {
        String browser = prob.getProperty("browsername");
		
        if(browser==null) {
        	throw new Exception("not valid");
        }
		return browser;
        
		}
	public String getulr() throws Exception {
		String ulrname = prob.getProperty("url");
		if(ulrname==null) {
			throw new Exception("not valid");
			
	}
		return ulrname;
	}
	public String getusername() throws Exception {
		String name = prob.getProperty("username");
		if(name==null) {
			throw new Exception("not valid");
			
	}
		return name;
	}
	

public String getpassword() throws Exception {
	String pass = prob.getProperty("password");
	if(pass==null) {
		throw new Exception("not valid");
		
}
	return pass;
}


	
	

}
