package units;

import java.util.ArrayList;

public class Wizard extends Character {
    protected int mana;
    public Wizard(String name,int X, int Y) {
        super(name, X, Y);
        curHealth = 60;
        speed = 10;
        strength = 5;
        agility = 5;
        intelligence = 30;
        initiative = 1;
        this.mana = 100;
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
    public void step(ArrayList<Character> team_blue, ArrayList<Character> team_red) {
        if (mana <= 0) return;
        Character igrok = team_blue.get(findNearest(team_blue));
        if (igrok.maxHealth == igrok.curHealth) return;

        else {
            igrok.getDamage(getAttackPower());
            mana += getAttackPower();
            if (igrok.curHealth > igrok.curHealth)
                igrok.curHealth = igrok.maxHealth;
        }
    }
    @Override
    public String getInfo() {
        return String.format("%s \u2747: %s",super.getInfo(),this.mana);

    }
}
