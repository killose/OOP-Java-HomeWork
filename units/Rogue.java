package units;

import java.util.ArrayList;

public class Rogue extends Character {
    public Rogue(String name, int X, int Y) {
        super(name, X, Y);
        health = 70;
        speed = 20;
        strength = 10;
        agility = 15;
        intelligence = 5;
        initiative = 4;
    }

    public void attack() {
        System.out.println("Разбойник атакует");
    }

    public void defend() {
        System.out.println("Разбойник защищается");
    }

    public void useAbility() {
        System.out.println("Разбойник использует способность");
    }

    public int getAttackPower() {
        return agility + strength;
    }

    @Override
    public void step(ArrayList<Character> team_blue, ArrayList<Character> team_red) {

    }

    // @Override
    // public String getInfo() {
    //     String s = getClass().getName();
    //     return s;
    // }
}