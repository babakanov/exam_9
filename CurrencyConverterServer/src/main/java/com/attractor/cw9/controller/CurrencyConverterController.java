package com.attractor.cw9.controller;


import com.attractor.cw9.dao.CurrencyConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class CurrencyConverterController {
    @Autowired
    CurrencyConverterService converterService;

    @GetMapping("/convert/{amout}/{fromCurrency}/{toCurrency}")
    public String makeCurrencyConvert(@PathVariable("amount") Double amount ,
                                      @PathVariable("fromCurrency") String fromCurrency,
                                      @PathVariable("toCurrency") String toCurrency) throws IOException {

        return converterService.makeConvert(amount, fromCurrency, toCurrency);

    }

}
