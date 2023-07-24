package units;
import java.util.ArrayList;

import org.w3c.dom.html.HTMLTableCaptionElement;

public abstract class Character implements myInterface{
    public static final char[] printStats = null;
    protected int maxHealth;
    protected int curHealth;
    protected int speed;
    protected int strength;
    protected int agility;
    protected int intelligence;
    public Coordinates coordinates;
    protected String name;
    public int initiative;
    protected String status;

    public abstract void attack();
    public abstract void defend();
    public abstract void useAbility();

    public Character(String name, int X, int Y) {
        this.name = name;
        this.coordinates = new Coordinates(X, Y);
        this.status = "Stand";
        this.maxHealth = 200;
    }

    public int findNearest(ArrayList<Character> team_blue){
        
                double minR = Coordinates.rastoynie(coordinates.X, team_blue.get(0).coordinates.X,coordinates.Y,
                        team_blue.get(0).coordinates.Y);
                int k = 0;
        
                for (int i = 1; i < 10; i++) {
                    double R = Coordinates.rastoynie(coordinates.X, team_blue.get(i).coordinates.X,coordinates.Y,
                            team_blue.get(i).coordinates.Y);
                    if(R<minR) {
                        minR = R;
                        k = i;
                    }
                }
        
                System.out.println(getClass().getName()+" "+name+"- "+team_blue.get(k).name+" "+minR);
                return k;
    }

    @Override
    public String getInfo() {
        return getClass().getName() + " "+name+" "+ curHealth;
    }

    // public String getName() {
        // Scanner scanner = new Scanner(null);
    // }


    public void printStats() {
        System.out.println(getClass().getSimpleName() + ":");
        System.out.println("Имя: " + name);
        System.out.println("Здоровье: " + curHealth);
        System.out.println("Скорость: " + speed);
        System.out.println("Сила: " + strength);
        System.out.println("Ловкость: " + agility);
        System.out.println("Интеллект: " + intelligence);
    }
  

    public abstract int getAttackPower();

    protected void getDamage(int damage) {
        curHealth -= damage;
        if (curHealth <= 0) {
            this.status = "dead";
            curHealth = 0;
        }
        if (this.curHealth > this.maxHealth) {
            this.curHealth = this.maxHealth;
        }
    }

    public boolean daad(){
        return this.status.equals("dead");
    }

    public int[] getCoords(){
        int[] coord = new int[2];
        coord[0] = this.coordinates.X;
        coord[1] = this.coordinates.Y;

        return coord;
    }
  

    public float getHp(){
        return this.curHealth;
    }

    public void attack(Character target) {
        int damage = getAttackPower();
        System.out.println(getClass().getSimpleName() + " атакует " + target.getClass().getSimpleName() + " и наносит " + damage + " урона");
        target.takeDamage(damage);
    }

    public void takeDamage(int damage) {
        curHealth -= damage;
        System.out.println(getClass().getSimpleName() + " получает " + damage + " урона и остается с " + curHealth + " здоровья");
    }
}