package com.pearl;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Car {

    public void printCarDetails(){
        System.out.println("I am inside car details method");
    }
}
