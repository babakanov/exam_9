package com.attractor.cw9.controller;

import com.attractor.cw9.model.Rate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class RateController {

    @Value("${days.nbkr.url}")
    private String days;
    @Value("${week.nbkr.url}")
    private String week;

    static List<Rate> rateList = new ArrayList<>();




    @GetMapping("/rate")
    public List<Rate> getRate() throws IOException, ParserConfigurationException, SAXException {


        Controller.getRateList(days);
        Controller.getRateList(week);

        return rateList;
    }



}
