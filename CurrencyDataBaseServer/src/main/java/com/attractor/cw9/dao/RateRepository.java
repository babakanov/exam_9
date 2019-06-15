package com.attractor.cw9.dao;

import com.attractor.cw9.model.Rate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RateRepository extends JpaRepository<Rate, Integer> {

    List<Rate> findByDate(String date);
}
