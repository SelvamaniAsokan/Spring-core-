package com.application;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationDriver {
	public static void main(String[] args) {
		
		
		
		// inversion control  bean will be create object for us
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applictioncontext.xml");
	
		Bmw bmw = (Bmw)context.getBean("bmw");
		Audi audi = (Audi)context.getBean("audi");
		Thar thar = (Thar)context.getBean("thar");
		
		System.out.println(bmw.getdetail());
		System.out.println(thar.getdetail());
		System.out.println(audi.getdetail());
	
	
		
		// dependancy injection using xml file
		
		
		/*
		 * 1. contructor injection  => inside bean use contructor ref attribute 
		 * 2.method injection/setter injection => <property name="re" ref=" which one want to call "></property>
		 * 3.field injection
		 */
		
		 System.out.println(bmw.getdetail());
	System.out.println(bmw.engine.engineDetails());
	System.out.println(audi.engine.engineDetails());
	System.out.println(thar.getEngine().engineDetails());
		 
		 
	 
	
	}

}
