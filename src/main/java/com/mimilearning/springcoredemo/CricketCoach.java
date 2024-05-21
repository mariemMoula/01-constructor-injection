package com.mimilearning.springcoredemo;

import org.springframework.stereotype.Component;

@Component //marks the class a spring bean
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "¨Practice fast bowling for 15mns !!!!";
    }
}
