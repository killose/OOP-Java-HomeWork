public class Warrior extends Character{
    public Warrior() {
        health = 100;
        speed = 10;
        strength = 20;
        agility = 5;
        intelligence = 5;
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
    public void step() {
       System.out.println("Шаг вперёд!");
    }
    @Override
    public String getInfo() {
        String s = getClass().getName();
        return s;
    }
}