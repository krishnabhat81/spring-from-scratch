package com.bean_life_cycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Created by krishna1bhat on 5/6/17.
 */
public class MainApp {
    public static void main(String[] args){
        System.out.println("1");

        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("2");

        ExampleBean exampleBean = (ExampleBean)ctx.getBean("exampleBean");

        System.out.println(exampleBean.getMessage());

        System.out.println("3");

        //Will ensure a graceful shutdown and call the relevant destroy methods.
        ctx.registerShutdownHook();

        System.out.println("4");
    }
}
