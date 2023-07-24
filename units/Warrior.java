package units;

import java.util.ArrayList;

public class Warrior extends Character implements myInterface{
    public Warrior(String name, int X, int Y) {
        super(name, X, Y);
        curHealth = 100;
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
        if (this.curHealth == 0) return;
        int k = super.findNearest(team_blue);
        int[] coordStep = coordinates.coordStep(team_blue.get(k).coordinates);
           for (int i = 0; i < team_red.size(); i++){
                if (team_red.get(i).coordinates.X == coordStep[0] && team_red.get(i).coordinates.Y == coordStep[1]) {
                      return;
                }
           }
        if (team_blue.get(k).coordinates.X == coordStep[0] && team_blue.get(k).coordinates.Y == coordStep[1]) {
            team_blue.get(k).getDamage((this.getAttackPower()+this.getAttackPower())/2);

//            if (teamProtivnic.get(k).curHp == 0)
                return;
        }

           this.coordinates.X = coordStep[0];
           this.coordinates.Y = coordStep[1];

    }
    // @Override
    // public String getInfo() {
    //     String s = getClass().getName();
    //     return s;
    // }
}