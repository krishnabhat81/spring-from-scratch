package com.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by krishna1bhat on 5/6/17.
 */
public class MainApp {
    public static void main(String[] args){
        System.out.println("1");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("2");

        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld");
        System.out.println("3");
        HelloWorld helloWorld1 = (HelloWorld) applicationContext.getBean("helloWorld");
        System.out.println("4");

        //by default spring beans are singleton - eagerly loaded -- check memory addressed
        System.out.println(helloWorld);
        System.out.println(helloWorld1);
    }
}
