import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    //more design patterns
    //check SOLID priciples are implemented
    //maybe use a database?
    public static void main(String[] args){
        startGame();
    }
    public static void startGame() {
        System.out.println("Hello and welcome to MotoGP!");
        RaceGenerator raceGenerator = new RaceGenerator();
        Scanner scanner = new Scanner(System.in);
        Race race = new Race(raceGenerator);
//        race.raceResults(raceGenerator);
        boolean finished = false;
        while (!finished) {
            int option=0;
            try {
                while(option !=1 && option!=2 && option!=3) {
                    System.out.println("\n What do you want to do?:\n"
                            + "1.Enter a race\n"
                            + "2.Upgrade your gear\n"
                            + "3.ExitGame");
                    option = scanner.nextInt();
                }
            }catch(Exception e){
                System.out.println("Please enter a valid option.");
            }
            switch (option) {
                case 1:
                    race.raceResults(raceGenerator);
                    break;
                case 2:
                    if (raceGenerator.player.getTierCoins() == 0) {
                        System.out.println("You don't have enough TierCoins, win races to earn more!");
                    } else {
                        int upgradeOption=0;
                        while(upgradeOption!=1 && upgradeOption!=2) {
                            System.out.println("What would you like to upgrade?:\n" +
                                    "1.Engine\n" +
                                    "2.Tires\n");
                            upgradeOption = scanner.nextInt();
                            if (upgradeOption == 1) {
                                race.raceGenerator.player.getMotorcycle().getEngine().levelUp();
                            } else if(upgradeOption == 2){
                                race.raceGenerator.player.getMotorcycle().getTire().levelUp();
                            }else{
                                System.out.println("Please choose a valid number(1 or 2)");
                            }
                        }
                    }
                case 3:
                    finished = true;
            }
        }
    }

    }