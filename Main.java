import units.*;
import units.Character;

import java.util.ArrayList;
import java.util.Random;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {

 

        // Character warrion = new Warrior("Alexander", 2,4);
        // System.out.println(Arrays.toString(warrion.coordinates.getCoordinates()));

        ArrayList<Character> team_blue = newTeam();
        ArrayList<Character> team_red = newTeam();
        ArrayList<Character> teamAll = new ArrayList<>();
        teamAll.addAll(team_blue);
        teamAll.addAll(team_red);
        teamAll.sort(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o1.initiative - o2.initiative;
            }
        });

        printInfo(team_blue);
        printInfo(team_red);
        System.out.println("_".repeat(20));


        for (Character p: teamAll) {
            if(team_blue.contains(p)) {
                p.step(team_blue, team_red);
            } else {
                p.step(team_red, team_blue);
            }
        }

        System.out.println("Получивший урон Пётр");
        printInfo(team_blue);
        printInfo(team_red);

        // for (Character character : teamAll) {
        //     character.printStats();
        // }
    }

    private static ArrayList<Character> newTeam() {
            
            ArrayList<Character> team = new ArrayList<Character>(10);
            Random rand = new Random();

            for (int i = 0; i < 10; i++) {
                int val = rand.nextInt(4);
                switch (val) {
                    case 0:
                        team.add(new Warrior("Алекандр",2,3 ));
                        break;
                    case 1:
                        team.add(new Ranger("Пётр",0,4));
                        break;
                    case 2:
                        team.add(new Rogue("Григорий",0,1));
                        break;
                    default:
                        team.add(new Wizard("Алексей",1,1));
                        break;
                }
            }
            return team;
        }
    
        // for (var character : team_blue) System.out.println(character.getInfo()); 

        // for (var character : team_red) System.out.println(character.coordinates.getCoordinates());

    private static void printInfo(ArrayList<Character> team) {
        for (int i = 0; i < team.size(); i++) {
            System.out.println(team.get(i).getInfo());
        }
        System.out.println("=============================================");
    }
}

        


 
        // warrior.attack(ranger);
        // ranger.attack(wizard);
        // wizard.attack(rogue);
        // rogue.attack(warrior);

        
    //    System.out.println(warrior.getInfo());
    //    System.out.println(warrior.step());


