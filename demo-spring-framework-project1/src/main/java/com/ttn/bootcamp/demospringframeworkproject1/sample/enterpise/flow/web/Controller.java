package com.ttn.bootcamp.demospringframeworkproject1.sample.enterpise.flow.web;

import com.ttn.bootcamp.demospringframeworkproject1.sample.enterpise.flow.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    BusinessService businessService;

    // http://localhost:8080/sum
    @GetMapping("/sum")
    public long displaySum() {
        return businessService.calculateSum();
    }
}