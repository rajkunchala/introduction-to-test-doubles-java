package com.techreturners.bubbleteaordersystem.app;

import com.techreturners.bubbleteaordersystem.model.HeightTooShortException;

public class Main {

    public static void main(String[] args) throws HeightTooShortException {

       // System.out.println("I like Bubble Tea! " +
       //         "This is a slimmed down version of a Bubble Tea Order System!");
        try {
            canRideRollerCoaster(140);
        }catch(HeightTooShortException e) {
            System.out.println(e.getMessage());
        }

    }

    static void canRideRollerCoaster(int heightInCm) throws HeightTooShortException {
        if (heightInCm <= 145) {
            throw new HeightTooShortException("Sorry, you are too short to ride this roller coaster! 😭");
        }
        else {
            System.out.println("Come for a ride! Weeeeee!!! 🎢");
        }
    }

}
