package com.attractor.cw9.hystrix;

import com.attractor.cw9.model.Rate;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "currency-database-server", url = "http://localhost:8800")
@RibbonClient(name = "currency-database-server")
public interface ApiFromDB {


        @GetMapping("/rates")
        List<Rate> getRates();

        @PostMapping("/rates")
        void addRates();


}
