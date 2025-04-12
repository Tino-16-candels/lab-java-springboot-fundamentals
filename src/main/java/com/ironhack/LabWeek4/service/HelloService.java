package com.ironhack.LabWeek4.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.ironhack.LabWeek4.model.HelloModel;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HelloService {
    private final String name1 = "Tizio";
    private final String name2 = "Caio";
    private final int num1 = 33;
    private final int num2 = 40;
    private final int sum = num1 + num2;
    private final int pro = num1 * num2;
    public String getMessage(){
        //I used "<br>" and <h1> becouse I'm using the browser to have fun :)
        return  "<h1>"+"Hello World"+"</h1>"+"<br>"+
                name1+" is "+num1+" years old."+"<br>"+
                name2+" is "+num2+" years old."+"<br>"+
                "The sum of both ages is : "+sum+"."+"<br>"+
                "The product of both ages is : "+pro+"."
                ;

    }
}