package com.atika.spring.demo.springdemo.enterprise.example.web;

import com.atika.spring.demo.springdemo.enterprise.example.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyWebController {
    @Autowired
    private BusinessService businessService;

    public MyWebController(BusinessService businessService) {
        this.businessService = businessService;
    }

    public long returnValueFromBusinessService() {
        return businessService.calculateSum();
    }
}

