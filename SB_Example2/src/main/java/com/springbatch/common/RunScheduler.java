package com.springbatch.common;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunScheduler {

     public static void main(String[] args) {
	 
	 if (args[0] == null) {
	     System.out.println("Debe especificar el nombre del archivo para agendar el trabajo.");
	     return;
	 }
	 else {
	     //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringScheduler.xml");
	     ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(args[0]);
	     context.start();
	 }
     }
}
