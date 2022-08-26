package com.rishav.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
    private Heart heart;

    public Human() {

    }

    public Human(Heart heart) {
        System.out.println("Constructor method called");
        this.heart = heart;
    }

    @Autowired
    @Qualifier("humanHeart")
    public void setHeart(Heart heart) {
        System.out.println("Setter method called");
        this.heart = heart;
    }

    public void startPumping() {
        if(heart!=null) {
            heart.pump();
            System.out.println("Name of animal: "+heart.getNameOfAnimal());
            System.out.println("Number of hearts: "+heart.getNoOfHeart());
        } else {
            System.out.println("You are dead.");
        }
    }
}
