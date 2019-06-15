package com.attractor.cw9.dao;


import java.util.List;

import com.attractor.cw9.model.Rate;
import com.attractor.cw9.proxy.ScheduledProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class ScheduledDao {

    @Autowired
    ScheduledProxy scheduledProxy;

    @Scheduled(cron="0 0 11 1/1 * ? *")
    public List<Rate> getIn1() {
        return scheduledProxy.getRates();
    }

    @Scheduled(cron="0 0 14 1/1 * ? *")
    public List<Rate> getIn2() {
        return scheduledProxy.getRates();
    }

    @Scheduled(cron="0 30 17 1/1 * ? *")
    public List<Rate> getIn3() {
        return scheduledProxy.getRates();
    }
}

