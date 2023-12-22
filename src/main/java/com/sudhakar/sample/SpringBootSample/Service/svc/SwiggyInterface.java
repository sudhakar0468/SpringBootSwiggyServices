package com.sudhakar.sample.SpringBootSample.Service.svc;

import com.sudhakar.sample.SpringBootSample.Domain.Swiggy;

import java.util.Optional;

public interface SwiggyInterface {

    Optional<Swiggy> getOrderByID(int id);

    Swiggy saveSwiggy(final Swiggy swiggy);
}
