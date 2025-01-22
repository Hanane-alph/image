package com.neotech.review11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	
	public static void main(String[] args) throws IOException {
		// the path of this project(in my computer)
		String projectPath=System.getProperty("user.dir");
		System.out.println(projectPath);
		
	// the path of the properties(in my computer)
		
		String filePath=projectPath+"/extra/demo.properties";
		System.out.println(filePath);
		
		// to read the file
		FileInputStream fileIs= new FileInputStream(filePath);
		Properties proper= new Properties();// the proper is a MAP stores(key-value pair)
		proper.load(fileIs);// load() method will help me read from the file to the proper-map
		System.out.println(proper);
		
		// 1st way
		Object lastName= proper.get("lastName");
		System.out.println(lastName);
		
		//2nd way the popular way
		String school= proper.getProperty("school");
		System.out.println(school);
		
		String age= proper.getProperty("age");// i will get the AGE as a String because of GETproperty()method
		System.out.println(age);
		
		proper.setProperty("SSN", "940-789-7895");// Adding more key-value pairs
		System.out.println(proper);
		
		proper.setProperty("age", "60");// re-assinging the age
		System.out.println(proper);
		
		// now let us Save into our EXTRA new file
		// now we need the path to the NEW file
		
		String newFilePath= projectPath+"/extra/newFile.txt";
		FileOutputStream fileOS= new FileOutputStream(newFilePath);
		proper.store(fileOS, "Studentds are tired");
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
