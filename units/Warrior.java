package units;

import java.util.ArrayList;

public class Warrior extends Character{
    public Warrior(String name, int X, int Y) {
        super(name, X, Y);
        health = 100;
        speed = 10;
        strength = 20;
        agility = 5;
        intelligence = 5;
        initiative = 3;
    }

    public void attack() {
        System.out.println("Воин атакует");
    }

    public void defend() {
        System.out.println("Воин защищается");
    }

    public void useAbility() {
        System.out.println("Воин использует способность");
    }

    public int getAttackPower() {
        return strength;
    }

    @Override
    public void step(ArrayList<Character> team_blue, ArrayList<Character> team_red) {
    //    System.out.println("Шаг вперёд!");
    }
    // @Override
    // public String getInfo() {
    //     String s = getClass().getName();
    //     return s;
    // }
}