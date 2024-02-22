package com.java.testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertiesclas {
	
	Properties properties ;
	
		
	
	public  Propertiesclas() {
		properties  = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\800xAInstaller\\eclipse-workspace\\Dependancy\\src\\test\\java\\com\\java\\testng\\config.properties");
			
			try {
				properties.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		public String geturl() {
			String url = properties.getProperty("url");
			
			if(url!=null) { 
				
			return url;
			
			}else { 
				throw new RuntimeException("url is not specified in config file");
				
			}
		}
			public String getpassword() {
				String pass = properties.getProperty("pass");
				
				if(pass!=null) { 
					
				return pass;
				
				}else { 
					throw new RuntimeException("url is not specified in config file");
					
				}
			}
				public String getusername() {
					String username = properties.getProperty("username");
					
					if(username!=null) { 
						
					return username;
					
					}else { 
						throw new RuntimeException("url is not specified in config file");
						
					}
				
			
			
			
			
		}
			
			
			
	}		
			
	
		
	





