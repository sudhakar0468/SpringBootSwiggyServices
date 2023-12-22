package com.sudhakar.sample.SpringBootSample.Service.impl;

import com.sudhakar.sample.SpringBootSample.Domain.Swiggy;
import com.sudhakar.sample.SpringBootSample.Dto.SwiggyRepository;
import com.sudhakar.sample.SpringBootSample.Service.svc.SwiggyInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SwiggySvcImpl implements SwiggyInterface {

    @Autowired
    private SwiggyRepository swiggyRepository;
    @Override
    public Optional<Swiggy> getOrderByID(int id) {
        return swiggyRepository.findById(id);
    }

    @Override
    public Swiggy saveSwiggy(final Swiggy swiggy) {
        return swiggyRepository.save(swiggy);
    }
}
