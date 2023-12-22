package com.sudhakar.sample.SpringBootSample.controller;

import com.sudhakar.sample.SpringBootSample.Domain.Swiggy;
import com.sudhakar.sample.SpringBootSample.Service.svc.SwiggyInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/swiggy")
public class SwiggyController {

    @Autowired
    private SwiggyInterface swiggyInterface;

    @PostMapping(path = "/save",consumes = {MediaType.APPLICATION_JSON_VALUE})
    public Swiggy saveSwiggyObj(@RequestBody final Swiggy swiggy){
        return swiggyInterface.saveSwiggy(swiggy);
    }

    @GetMapping("/order/{id}")
    public Optional<Swiggy> getOrderDetails(@PathVariable Integer id){

        return swiggyInterface.getOrderByID(id);
    }
}
