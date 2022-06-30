package com.ttn.bootcamp.restfulwebservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET, path = "hello-world")
    // @GetMapping("hello-world")
    public String HelloWorld() {
        return "Hello World RESTFul Web Services new1";
    }
}
