package com.helper;

import java.io.IOException;

public class PropertyReaderManager {
	 static PropertyReaderManager prm=new PropertyReaderManager();
	
	 private PropertyReaderManager () {
	
	}
	 public PropertyReader pr;
	 public static PropertyReaderManager getInstance() {
		return prm;
		 
}
	 public PropertyReader getPr() throws IOException {
		 if(pr==null) {
			 pr= new PropertyReader();
		 }
			return pr;
		}

	
}