package com.javaconfig;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by krishna1bhat on 5/6/17.
 */

//by default bean name is class name with starting lowercase letter, and are camel-cased from then on
//@Component  //or @Component("helloWorld") //here helloWorld is id or, name of bean --- spring 2.5v
@Scope(value = "singleton")
@Lazy
public class HelloWorld {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    HelloWorld(){
        System.out.println("Constructor");
    }

    @PostConstruct
    public void init(){
        System.out.println("init called");
    }

    @PreDestroy
    public void cleanup(){
        System.out.println("cleanup called");
    }
}
