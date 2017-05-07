package com.bean_life_cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.*;
import org.springframework.context.weaving.LoadTimeWeaverAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.instrument.classloading.LoadTimeWeaver;
import org.springframework.jmx.export.notification.NotificationPublisher;
import org.springframework.jmx.export.notification.NotificationPublisherAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by krishna1bhat on 5/7/17.
 */
@Component
public class ExampleBean implements ApplicationContextAware,
        ApplicationEventPublisherAware, BeanClassLoaderAware, BeanFactoryAware,
        BeanNameAware, LoadTimeWeaverAware, MessageSourceAware,
        NotificationPublisherAware, ResourceLoaderAware {

    private String message = "Bean message";

    ExampleBean(){
        System.out.println("Bean no-argument constructor");
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

    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("setBeanClassLoader Aware");
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory Aware");
    }

    public void setBeanName(String s) {
        System.out.println("setBeanName Aware");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext Aware");
    }

    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        System.out.println("setApplicationEventPublisher Aware");
    }

    public void setMessageSource(MessageSource messageSource) {
        System.out.println("setMessageSource Aware");
    }

    public void setResourceLoader(ResourceLoader resourceLoader) {
        System.out.println("setResourceLoader Aware");
    }

    public void setLoadTimeWeaver(LoadTimeWeaver loadTimeWeaver) {
        System.out.println("setLoadTimeWeaver Aware");
    }

    public void setNotificationPublisher(NotificationPublisher notificationPublisher) {
        System.out.println("setNotificationPublisher Aware");
    }
}


/*
*  ---------------------- NOTE ----------------------
*  If there are too many beans having init / destroy methods with
*  the same name, no need to declare init-method and destroy-method on each bean.
*  Use default-init-method and default-destroy-method attributes on the <beans> element
*  in configuration file.
*
*  Complete bean life-cycle:
*  http://howtodoinjava.com/spring/spring-core/spring-bean-life-cycle/
*/