package units;

import java.util.ArrayList;

public class Ranger extends Character{

    protected int countArrow;   

    public Ranger(String name, int X, int Y) {
        super(name, X, Y);
        this.countArrow = 10;
        curHealth = 80;
        speed = 15;
        strength = 10;
        agility = 20;
        intelligence = 5;
        initiative = 5;
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
    public void step(ArrayList<Character> team_blue, ArrayList<Character> team_red) {
        if (this.curHealth == 0) return;
        if (this.countArrow == 0) return;

        int k = super.findNearest(team_blue);
        team_blue.get(k).getDamage((this.getAttackPower()+this.getAttackPower())/2);

        for (int i = 0; i < team_blue.size(); i++){
            if (team_blue.get(i).getClass().getSimpleName().equals("Farmer") && team_blue.get(i).status.equals("Stand")) {
                team_blue.get(i).status = "busy";
                return;
            }
        }
        this.countArrow -= 1;
    }

    @Override
    public String getInfo() {
        return String.format("%s \u27B3: %s",super.getInfo(),this.countArrow);
    }

    // @Override
    // public String getInfo() {
    //     String s = getClass().getName();
    //     return s;
    // }
}