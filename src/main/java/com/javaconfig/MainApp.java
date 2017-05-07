package com.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by krishna1bhat on 5/6/17.
 */
public class MainApp {
    public static void main(String[] args){
        System.out.println("1");

        //Java configuration example
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("2");

        HelloWorld helloWorld = (HelloWorld)ctx.getBean("helloWorld");
        System.out.println("3 : " + helloWorld.getMessage());
        HelloWorld helloWorld1 = (HelloWorld)ctx.getBean("helloWorld");

        System.out.println("4");

        ((ConfigurableApplicationContext)ctx).close();

        System.out.println("5");

        System.out.println(helloWorld);
        System.out.println(helloWorld1);
    }
}
