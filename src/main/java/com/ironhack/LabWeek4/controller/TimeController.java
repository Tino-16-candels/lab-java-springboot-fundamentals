package com.ironhack.LabWeek4.controller;

import com.ironhack.LabWeek4.service.TimeService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping
public class TimeController {
    //time - Returns current time
    //date - Returns current date
    //day - Returns current day of the week
    //all - Returns all time information in a single response
    private final TimeService timeService;

    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    //print
    @GetMapping("/time/all")
    public String all(){
        return timeService.getTimeAll();

    }

    @GetMapping("/time/date")
    public String date(){
        return timeService.getDate();

    }
    @GetMapping("/time/time")
    public String time(){
        return timeService.getTime();

    }
    @GetMapping("/time/day")
    public String weekDay(){
        return timeService.getWeekDay();

    }
}
