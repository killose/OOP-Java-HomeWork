public class Ranger extends Character{
    public Ranger() {
        health = 80;
        speed = 15;
        strength = 10;
        agility = 20;
        intelligence = 5;
    }

    public void attack() {
        System.out.println("Рейнджер атакует");
    }

    public void defend() {
        System.out.println("Рейнджер защищается");
    }

    public void useAbility() {
        System.out.println("Рейнджер использует способность");
    }

    public int getAttackPower() {
        return agility;
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