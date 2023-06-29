public class Wizard extends Character {
    public Wizard() {
        health = 60;
        speed = 10;
        strength = 5;
        agility = 5;
        intelligence = 30;
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

    @Override
    public String getInfo() {
        String s = getClass().getName();
        return s;
    }

    @Override
    public void step() {
    }
}
