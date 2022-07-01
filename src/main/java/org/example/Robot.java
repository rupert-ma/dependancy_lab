package org.example;

public class Robot implements Attacker {
    //Instance Variables (Has A)
    public String name;
    public Weapon weapon;


    //Constructor
    public Robot(String name, Weapon weapon) {
        this.name = name;
        //this.weapon = new Weapon("Infiniti Blaster", 50);
        this.weapon = weapon;
    }

    //Methods (Can Do)
    public void Attack() {
        System.out.println(this.name + " attacks with their " + this.weapon.name + " for " + this.weapon.power + " damage!");
    }
}
