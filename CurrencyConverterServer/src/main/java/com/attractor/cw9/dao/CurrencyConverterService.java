package com.attractor.cw9.dao;

import com.attractor.cw9.model.Rate;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.*;

@Service
public class CurrencyConverterService {

    public  String makeConvert(Double amount, String fromCurrency, String toCurrency) throws IOException {

        String url = "http://localhost:8800/rates";

        List<Map<String, Object>> rates = new ArrayList<Map<String, Object>>();

        RestTemplate restTemplate = new RestTemplate();

        String result = restTemplate.getForEntity(url, String.class, new LinkedHashMap<String, Object>()).getBody();

        ObjectMapper mapper = new ObjectMapper();

        rates = mapper.readValue(result, rates.getClass());

        for (Map<String, Object> rate : rates)
            if (fromCurrency.equals(rate.get("code")))
                return Double.toString(rate.rate * amount);




        return "0.0";
    }

}
