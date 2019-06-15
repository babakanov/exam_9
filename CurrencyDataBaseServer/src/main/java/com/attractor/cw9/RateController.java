package com.attractor.cw9;


import com.attractor.cw9.dao.RateDao;
import com.attractor.cw9.dao.RateRepository;
import com.attractor.cw9.model.Rate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class RateController {
    @Autowired
    RateRepository rateRepository;

    @Autowired
    RateDao rateDao;



    @GetMapping("/rates ")
    public List<Rate> getRate() {

        return rateRepository.findAll();
    }


    @GetMapping("/rates/{date}")
    public List<Rate> getDailyByDate() throws IOException {
        return getDailyByDate();
    }

    @GetMapping("/rates/{date}")
    public List<Rate> getDailyByDate(@PathVariable("date")String date) throws IOException {

        return rateRepository.findByDate(date);
    }

    @RequestMapping(value = "/rates", method = RequestMethod.POST)
    public Rate insertRate(@RequestBody Rate rate) {

        return rateRepository.save(rate);
    }


    @RequestMapping(value = "/rates", method = RequestMethod.DELETE)
    public void deleteAllRate() {

        rateDao.deleteAllRate();

    }

    @RequestMapping(value = "/rates", method = RequestMethod.DELETE)
    public void deleteRateByDate(@PathVariable("date") String date) {


        rateDao.deleteByDate(date);

    }









}
