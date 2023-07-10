package units;
import java.util.ArrayList;

public abstract class Character implements myInterface{
    public static final char[] printStats = null;
    protected int health;
    protected int speed;
    protected int strength;
    protected int agility;
    protected int intelligence;
    public Coordinates coordinates;
    protected String name;
    public int initiative;

    public abstract void attack();
    public abstract void defend();
    public abstract void useAbility();

    public Character(String name, int X, int Y) {
        this.name = name;
        this.coordinates = new Coordinates(X, Y);

    }

    public int findNearest(ArrayList<Character> team_blue){
        
                double minR = Coordinates.Rastoynie(coordinates.X, team_blue.get(0).coordinates.X,coordinates.Y,
                        team_blue.get(0).coordinates.Y);
                int k = 0;
        
                for (int i = 1; i < 10; i++) {
                    double R = Coordinates.Rastoynie(coordinates.X, team_blue.get(i).coordinates.X,coordinates.Y,
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
        return getClass().getName() + " "+name+" "+ health;
    }

    // public String getName() {
        // Scanner scanner = new Scanner(null);
    // }


    public void printStats() {
        System.out.println(getClass().getSimpleName() + ":");
        System.out.println("Имя: " + name);
        System.out.println("Здоровье: " + health);
        System.out.println("Скорость: " + speed);
        System.out.println("Сила: " + strength);
        System.out.println("Ловкость: " + agility);
        System.out.println("Интеллект: " + intelligence);
    }
  

    // Редактирование статистик персонажа

    // public void increaseHealth(int amount) {
    //     health += amount;
    // }

    // public void decreaseHealth(int amount) {
    //     health -= amount;
    // }

    // public void increaseSpeed(int amount) {
    //     speed += amount;
    // }

    // public void decreaseSpeed(int amount) {
    //     speed -= amount;
    // }

    // public void increaseStrength(int amount) {
    //     strength += amount;
    // }

    // public void decreaseStrength(int amount) {
    //     strength -= amount;
    // }

    // public void increaseAgility(int amount) {
    //     agility += amount;
    // }

    // public void decreaseAgility(int amount) {
    //     agility -= amount;
    // }

    // public void increaseIntelligence(int amount) {
    //     intelligence += amount;
    // }

    // public void decreaseIntelligence(int amount) {
    //     intelligence -= amount;
    // }

    public abstract int getAttackPower();

    public void attack(Character target) {
        int damage = getAttackPower();
        System.out.println(getClass().getSimpleName() + " атакует " + target.getClass().getSimpleName() + " и наносит " + damage + " урона");
        target.takeDamage(damage);
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(getClass().getSimpleName() + " получает " + damage + " урона и остается с " + health + " здоровья");
    }
    public Character get(Character character) {
        return null;
    }

  

}