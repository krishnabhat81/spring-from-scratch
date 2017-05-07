package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by krishna1bhat on 5/6/17.
 */

public class HelloWorld {
    @Autowired
    private MyMessage myMessage;

    public String getMessage() {
        return myMessage.getMessage();
    }

    HelloWorld(){
        System.out.println("Constructor");
    }

    public void init(){
        System.out.println("init called");
    }

    public void cleanup(){
        System.out.println("cleanup called");
    }
}
