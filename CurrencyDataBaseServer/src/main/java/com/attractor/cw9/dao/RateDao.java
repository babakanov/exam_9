package com.attractor.cw9.dao;

import com.attractor.cw9.model.Rate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;

@Repository
public class RateDao implements IRateDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void deleteAllRate()  {

        String sql = "delete * from rate ";

        jdbcTemplate.update(sql);
    }

    public void updateByDate(@PathVariable("date")String date, @RequestBody Rate rate) throws IOException {

        String sql = String.format("update rate set code = '%s', value = %f ,created_at = '%s' where date = %s",rate.getCode(),rate.getValue(),rate.getCreate_at(),date);

        jdbcTemplate.update(sql);
    }

    @Override
    public void deleteByDate(@PathVariable("date")String date)  {

        String sql = String.format("delete from rate where date = %s", date);

        jdbcTemplate.update(sql);
    }


}
