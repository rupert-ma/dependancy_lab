package org.example;

public class Robot {
    //Instance Variables (Has A)
    public String name;
    public Weapon weapon;


    //Constructor
    public Robot(Weapon weapon) {
        this.name = "Megatron";
        //this.weapon = new Weapon("Infiniti Blaster", 50);
        this.weapon = weapon;
    }

    //Methods (Can Do)
    public void Attack() {
        System.out.println(this.name + " attacks with their " + this.weapon.name + " for " + this.weapon.power + " damage!");
    }
}
