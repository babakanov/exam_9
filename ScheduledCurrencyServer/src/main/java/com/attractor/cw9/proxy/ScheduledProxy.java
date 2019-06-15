package com.attractor.cw9.proxy;


import com.attractor.cw9.model.Rate;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "currency-api-server", url = "http://localhost:8900")
@RibbonClient(name = "currency-api-server")
public interface ScheduledProxy {
    @GetMapping("/rates")
    public List<Rate> getRates();
}
