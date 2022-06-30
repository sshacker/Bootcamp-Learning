package com.ttn.bootcamp.demospringframeworkproject1.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

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

@Component
class BusinessService {
    @Autowired
    private DataService dataService;
    public long calculateSum() {
        List<Integer> data = dataService.retrieveData();
        return data.stream().reduce(Integer::sum).get();
    }
}

@Component
class DataService {
    public List<Integer> retrieveData(){
        return Arrays.asList(10,20,30,40,50,60);
    }
}