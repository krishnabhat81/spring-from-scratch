package com.xml;

import org.springframework.context.annotation.Scope;

/**
 * Created by krishna1bhat on 5/6/17.
 */
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
}
