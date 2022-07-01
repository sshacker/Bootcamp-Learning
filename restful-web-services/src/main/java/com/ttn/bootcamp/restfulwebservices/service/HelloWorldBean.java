package com.ttn.bootcamp.restfulwebservices.service;

public class HelloWorldBean {
    private String message;
    public HelloWorldBean(String message) {
        this.message = message;
    }

    // This getter is mandatory to see output
    public String getMessage() {
        return message;
    }
}
