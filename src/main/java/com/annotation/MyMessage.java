package com.annotation;

import org.springframework.stereotype.Component;

/**
 * Created by krishna1bhat on 5/7/17.
 */
public class MyMessage {
    private String message = "Message from autowired";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MyMessage{" +
                "message='" + message + '\'' +
                '}';
    }
}
