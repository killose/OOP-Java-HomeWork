import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Character warrior = new Warrior();
        Character ranger = new Ranger();
        Character wizard = new Wizard();
        Character rogue = new Rogue();
 

        int count = 10;
        List<Character> team = new ArrayList<>();

        Random rand = new Random();

        for (int i = 0; i < count; i++) {
            int val = rand.nextInt(4);
            switch (val) {
                case 0:
                    team.add(new Warrior());
                    break;
                case 1:
                    team.add(new Ranger());
                    break;
                case 2:
                    team.add(new Rogue());
                    break;
                default:
                    team.add(new Wizard());
            }
            System.out.println(team.get(i).getInfo());
        }
        for (var character : team) {
            System.out.println(character.getInfo()); 
        }

   


        // warrior.printStats();
        // ranger.printStats();
        // wizard.printStats();
        // rogue.printStats();

        // warrior.attack(ranger);
        // ranger.attack(wizard);
        // wizard.attack(rogue);
        // rogue.attack(warrior);

        
       System.out.println(warrior.getInfo());
    //    System.out.println(warrior.step());

        
    }
}