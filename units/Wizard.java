package units;

import java.util.ArrayList;

public class Wizard extends Character {
    public Wizard(String name,int X, int Y) {
        super(name, X, Y);
        health = 60;
        speed = 10;
        strength = 5;
        agility = 5;
        intelligence = 30;
        initiative = 1;
    }

    public void attack() {
        System.out.println("Маг атакует");
    }

    public void defend() {
        System.out.println("Маг защищается");
    }

    public void useAbility() {
        System.out.println("Маг использует способность");
    }

    public int getAttackPower() {
        return intelligence;
    }

    // @Override
    // public String getInfo() {
    //     String s = getClass().getName();
    //     return s;
    // }

    @Override
    public void step(ArrayList<Character> team_blue, ArrayList<Character> team_red) {

    }
}
