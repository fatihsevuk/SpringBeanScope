package com.fatih;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FutbolcuTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
		Futbolcu futbolcu=context.getBean("futbolcuId" , Futbolcu.class);
		Futbolcu futbolcu2=context.getBean("futbolcuId" , Futbolcu.class);
		
		System.out.println(futbolcu);
		System.out.println(futbolcu2);

	}

}
