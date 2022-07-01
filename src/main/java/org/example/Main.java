package org.example;

public class Main {
    public static void main(String[] args) {

        Weapon blaster = new Weapon("Infinity Blaster", 50);
        Weapon sword = new Weapon("Blade of 1000 deaths", 50);
        Robot robotOne = new Robot(sword);
        System.out.printf(robotOne.name);
        robotOne.Attack();

    }
}