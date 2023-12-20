package com.luv2code.springcoredemo.common;

public class SwimmCoach implements Coach{

    public SwimmCoach(){
        System.out.println("In constructor: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }
}
