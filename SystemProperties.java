package com.org.basicPrograms;

import java.util.Properties;

public class SystemProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("os.arch"));
		System.out.println(System.getProperty("sun.arch.data.model"));
		System.out.println(System.getProperty("os.version"));
		System.out.println(System.getProperty("java.class.path"));
		System.out.println(System.getProperty("java.version"));
		
		Properties p=System.getProperties();
		p.list(System.out);
	}

}
//By Suhas339
