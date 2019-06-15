package com.attractor.cw9.controller;


import java.util.List;

import com.attractor.cw9.hystrix.ApiFromDB;
import com.attractor.cw9.hystrix.CurrencyAPI;
import com.attractor.cw9.model.Rate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class ApiController {

    @Autowired
    CurrencyAPI currencyAPI;

    @Autowired
    ApiFromDB apiFromDB;

    @GetMapping("/rates")
    @HystrixCommand(fallbackMethod="getRatesFromDB")
    public List<Rate> getRates() {

        if(apiFromDB.getRates().isEmpty())
            apiFromDB.addRates();

        return currencyAPI.getRates();
    }

    @GetMapping("/ratesFromDB")
    public List<Rate> getRatesFromDB() {
        return apiFromDB.getRates();
    }
}
