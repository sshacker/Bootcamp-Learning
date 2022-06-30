package com.ttn.bootcamp.demospringframeworkproject1.sample.enterpise.flow.data;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataService {
    public List<Integer> retrieveData(){
        return Arrays.asList(10,20,30,40,50,60);
    }
}