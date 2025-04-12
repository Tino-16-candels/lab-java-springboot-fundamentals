package com.ironhack.LabWeek4.controller;

import com.ironhack.LabWeek4.service.WetherService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping
public class WetherController {
    //weather/temperature - Returns current temperature
    //weather/condition - Returns current weather condition
    //weather/wind - Returns current wind speed
    //weather/all - Returns all weather information in a single response
    private final WetherService wetherService;
    public WetherController(WetherService wetherService){

        this.wetherService = wetherService;
    }
    //print
    @GetMapping("/wether/all")
    public String all(){
        return wetherService.getWether();

    }
    @GetMapping("/wether/temperature")
    public String temperature(){
        return wetherService.getTemperature();

    }
    @GetMapping("/wether/condition")
    public String condition(){
        return wetherService.getCondition();

    }
    @GetMapping("/wether/wind")
    public String wind(){
        return wetherService.getWind();

    }
}
