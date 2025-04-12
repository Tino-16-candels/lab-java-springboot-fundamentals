package com.ironhack.LabWeek4.service;

import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Service
public class TimeService {
    //Get current time
    //Get current date
    //Get current day of the week
    public String getTimeAll(){
        //I used "<br>" and <h1> becouse I'm using the browser to have fun :)
        LocalDate curentDate = LocalDate.now();
        LocalTime curentTime = LocalTime.now();
        LocalDate curentDay = LocalDate.now();
        //I have add this to get my formatting style
        DateTimeFormatter myFormatObj1 = DateTimeFormatter.ofPattern("yyy/MM/dd");
        DateTimeFormatter myFormatObj2 = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter myFormatObj3 = DateTimeFormatter.ofPattern("EEEE");
        String formattedDate = curentDate.format(myFormatObj1);
        String formattedTime = curentTime.format(myFormatObj2);
        String formattedDay = curentDay.format(myFormatObj3);
        return  "<h1>"+"Project Time"+"</h1>"+"<br>"+
                "The date is : "+formattedDate+"<br>"+
                "The time is : "+formattedTime+"<br>"+
                "The week day is : "+formattedDay
                ;
    }
    public String getDate(){
        LocalDate curentDate = LocalDate.now();
        DateTimeFormatter myFormatObj1 = DateTimeFormatter.ofPattern("yyy/MM/dd");
        String formattedDate = curentDate.format(myFormatObj1);
        return  "<h1>"+"Project Time"+"</h1>"+"<br>"+
                "The date is : "+formattedDate
                ;
    }
    public String getTime(){
        LocalTime curentTime = LocalTime.now();
        DateTimeFormatter myFormatObj2 = DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime = curentTime.format(myFormatObj2);
        return  "<h1>"+"Project Time"+"</h1>"+"<br>"+
                "The time is : "+formattedTime
                ;
    }
    public String getWeekDay(){
        LocalDate curentDay = LocalDate.now();
        DateTimeFormatter myFormatObj3 = DateTimeFormatter.ofPattern("EEEE");
        String formattedDay = curentDay.format(myFormatObj3);
        return  "<h1>"+"Project Time"+"</h1>"+"<br>"+
                "The week day is : "+formattedDay
                ;
    }

}
