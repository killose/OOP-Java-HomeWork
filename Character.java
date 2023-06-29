import java.io.Serializable;

public abstract class Character implements myInterface{
    protected int health;
    protected int speed;
    protected int strength;
    protected int agility;
    protected int intelligence;


    public abstract void attack();
    public abstract void defend();
    public abstract void useAbility();

    public void printStats() {
        System.out.println(getClass().getSimpleName() + ":");
        System.out.println("Здоровье: " + health);
        System.out.println("Скорость: " + speed);
        System.out.println("Сила: " + strength);
        System.out.println("Ловкость: " + agility);
        System.out.println("Интеллект: " + intelligence);
    }

    public void increaseHealth(int amount) {
        health += amount;
    }

    public void decreaseHealth(int amount) {
        health -= amount;
    }

    public void increaseSpeed(int amount) {
        speed += amount;
    }

    public void decreaseSpeed(int amount) {
        speed -= amount;
    }

    public void increaseStrength(int amount) {
        strength += amount;
    }

    public void decreaseStrength(int amount) {
        strength -= amount;
    }

    public void increaseAgility(int amount) {
        agility += amount;
    }

    public void decreaseAgility(int amount) {
        agility -= amount;
    }

    public void increaseIntelligence(int amount) {
        intelligence += amount;
    }

    public void decreaseIntelligence(int amount) {
        intelligence -= amount;
    }

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
}