public class Rogue extends Character {
    public Rogue() {
        health = 70;
        speed = 20;
        strength = 10;
        agility = 15;
        intelligence = 5;
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
    public void step() {
    }

    @Override
    public String getInfo() {
        String s = getClass().getName();
        return s;
    }
}