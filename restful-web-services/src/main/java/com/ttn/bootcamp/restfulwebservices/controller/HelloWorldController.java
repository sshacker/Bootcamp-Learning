package com.ttn.bootcamp.restfulwebservices.controller;

import com.ttn.bootcamp.restfulwebservices.service.HelloWorldBean;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET, path = "hello-world")
    // @GetMapping("hello-world")
    public String HelloWorld() {
        return "Hello World RESTFul Web Services";
    }

    @RequestMapping(method = RequestMethod.GET, path = "hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World Bean");
    }

    @GetMapping(path = "/hello-world-bean/path-variable-example/{name}")
    public HelloWorldBean helloWorldBeanPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello, %s",name));
    }
}
