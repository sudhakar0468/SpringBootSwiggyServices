package com.sudhakar.sample.SpringBootSample.Dto;

import com.sudhakar.sample.SpringBootSample.Domain.Swiggy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SwiggyRepository extends JpaRepository<Swiggy, Integer> {


}
