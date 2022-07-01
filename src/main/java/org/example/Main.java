package org.example;

public class Main {
    public static void main(String[] args) {

        //Weapon blaster = new Weapon("Infinity Blaster", 50);
        //Weapon sword = new Weapon("Blade of 1000 deaths", 50);
        Axe axe = new Axe();
        Pistol pistol = new Pistol();
        Gloves gloves = new Gloves();
        Robot robotOne = new Robot("Megatron",axe);
        Robot robotTwo = new Robot("Optimus Prime",pistol);
        Robot robotThree = new Robot("Ultron",gloves);

        robotOne.Attack();
        robotTwo.Attack();
        robotThree.Attack();

    }
}