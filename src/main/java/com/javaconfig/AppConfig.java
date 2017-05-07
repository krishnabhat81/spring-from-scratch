package com.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by krishna1bhat on 5/6/17.
 */
/*
* Constraints when authoring @Configuration classes
* 1. @Configuration classes must be non-final
* 2. @Configuration classes must be non-local (may not be declared within a method)
* 3. @Configuration classes must have a default/no-arg constructor and may not use @Autowired constructor parameters. Any nested configuration classes must be static
*/
@Configuration
@ComponentScan(basePackages="com.javaconfig")
public class AppConfig {

    @Bean //spring 3.0v
    public HelloWorld helloWorld(){
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello java config");
        return helloWorld;
    }


    //---------------------------- NOTE ----------------------------
    //if you just want to make bean - use @Component on HelloWorld class (you can set some value there too) --> comment @Bean here
    //if you need value use @Bean in this config ...

    //@Bean is used to explicitly declare a single bean, rather than letting Spring
    // do it automatically as @Component (used to auto-detect and auto-configure beans using classpath scanning)
}
