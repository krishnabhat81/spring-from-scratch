package com.bean_life_cycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by krishna1bhat on 5/7/17.
 */
@Component
public class ExampleBean {
    private String message = "Bean message";

    ExampleBean(){
        System.out.println("Bean constructor");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @PostConstruct
    public void init(){
        System.out.println("Bean init-method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Bean destroy-method");
    }
}


/*
*  ---------------------- NOTE ----------------------
*  If there are too many beans having init / destroy methods with
*  the same name, no need to declare init-method and destroy-method on each bean.
*  Use default-init-method and default-destroy-method attributes on the <beans> element
*  in configuration file.
*/