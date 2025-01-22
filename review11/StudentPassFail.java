package com.neotech.review11;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class StudentPassFail {

	public static void main(String[] args) {
		
		Map<String,Integer> studentGradeMap= new TreeMap<>();
		studentGradeMap.put("olga", 95);
		studentGradeMap.put("sertan", 58);
		studentGradeMap.put("cihan", 82);
		studentGradeMap.put("june", 91);
		studentGradeMap.put("yildirim", 75);
		studentGradeMap.put("nur", 45);
		System.out.println("studentGradeMap--> "+ studentGradeMap);
		// passing grade is 70
		Map<String,Integer> passinggrade=new TreeMap<>();
		Map<String,Integer> failinggrade=new TreeMap<>();
		
		for(String studentName: studentGradeMap.keySet()) {
		Integer score= studentGradeMap.get(studentName);
		if( score>=70){
			//passing
			passinggrade.put(studentName, score);
		}else {
			// failing
			failinggrade.put(studentName, score);
		}
		}
		System.out.println("passing--> "+passinggrade);
		System.out.println("failing--> "+failinggrade);
		System.out.println("--------------------------------");
		
		// entryset way
		passinggrade=new TreeMap<>();
		failinggrade=new TreeMap<>();
		for(Entry<String, Integer> entry: studentGradeMap.entrySet()) {
			if(entry.getValue()>=70)
			{passinggrade.put(entry.getKey(), entry.getValue());
				
			}else {
				failinggrade.put(entry.getKey(), entry.getValue());
			}
		}
		System.out.println("passing--> "+passinggrade);
		System.out.println("failing--> "+failinggrade);
	}

}
