package com.epam.mjc.stage0;

public class Animal {
    private final String color;
    private final int numberOfPaws;
    private final boolean hasFur;


    public String getDescription() {
        String description = "This animal is mostly " + color + ". It has " + numberOfPaws;
        if (numberOfPaws == 1) {
            description += " paw ";
        } else {
            description += " paws ";
        }
        description += "and ";
        if (hasFur) {
            description += "a ";
        } else {
            description += "no ";
        }
        description += "fur.";

        return description;
    }


    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }
}
