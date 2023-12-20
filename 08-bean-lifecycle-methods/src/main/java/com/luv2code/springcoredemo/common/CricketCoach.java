package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("In constructor: "+ getClass().getSimpleName());
    }

    //Define our init method

    @PostConstruct
    public void doMyStrartupStuff(){
        System.out.println("In doMyStrartupStuff()"+getClass().getSimpleName());
    }

    //Define our destroy method

    @PreDestroy
    public void doMyStartupStuff(){
        System.out.println("In doMyStrartupStuff()"+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Pratice fast bowling for 15 minutes.";
    }
}
