package com.ironhack.LabWeek4.service;

import org.springframework.stereotype.Service;

@Service
public class WetherService {
    //Get current temperature (simulate with random number between -10 and 40)
    //Get weather condition (randomly return: "Sunny", "Rainy", "Cloudy", "Windy")
    //Get wind speed (simulate with random number between 0 and 100)
    private final int currentTemp = 15;//in ( celsius )
    private final String weatherCondition1 = "Sunny";
    private final String weatherCondition2 = "Rainy";
    private final String weatherCondition3 = "Cloudy";
    private final String weatherCondition4 = "Windy";
    private final String weatherCondition = weatherCondition1;
    private final double windSpeed = 5.4;//in ( km/h )

    public String getWether(){
        //I used "<br>" and <h1> becouse I'm using the browser to have fun :)
        return  "<h1>"+"Project Wether"+"</h1>"+"<br>"+
                "The temperature is : "+currentTemp+"°."+"<br>"+
                "The weather condition is : "+weatherCondition+"."+"<br>"+
                "The wind speed is : "+windSpeed+" k/h."
                ;

    }
    public String getTemperature(){
        //I used "<br>" and <h1> becouse I'm using the browser to have fun :)
        return  "<h1>"+"Project Wether"+"</h1>"+"<br>"+
                "The temperature is : "+currentTemp+"°."
                ;
    }
    public String getCondition(){
        //I used "<br>" and <h1> becouse I'm using the browser to have fun :)
        return  "<h1>"+"Project Wether"+"</h1>"+"<br>"+
                "The wether condition is : "+weatherCondition+"."
                ;
    }
    public String getWind(){
        //I used "<br>" and <h1> becouse I'm using the browser to have fun :)
        return  "<h1>"+"Project Wether"+"</h1>"+"<br>"+
                "The wind speed is : "+windSpeed+" k/h."
                ;
    }

}
