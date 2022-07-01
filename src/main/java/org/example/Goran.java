package org.example;

public class Goran implements Attacker {
    //Instance Variables (Has A)
    public String name;
    public int attackPower;

    //Constructor

    public Goran(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    @Override
    public void Attack() {
        System.out.println(this.name + " attacks for " + this.attackPower + " damage!");

    }
}
