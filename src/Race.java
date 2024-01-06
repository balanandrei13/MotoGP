import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Race {
    Player player;
    Opponent[] opponents;
    Track track;
    public Driver createDriver(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please choose a player name: ");
        String name=scanner.nextLine();
        Weather weather=Weather.generateRandomWeather();
        return new Driver(name,weather);
    }
    public Motorcycle createMotorcycle(){
        Engine engine= new Engine();
        Tire tire= new Tire();
        return new Motorcycle(tire, engine,Color.generateRandomColor());
    }
    public Driver createOpponentDriver(){
        Random rand= new Random();
        int experience= rand.nextInt(0,9);
        String name=OpponentName.generateRandomName();
        Driver opponentDriver=new Driver(name,experience,player.getPlayerLevel(),Weather.generateRandomWeather(),0);
        return  opponentDriver;
    }
    public Motorcycle createOpponentMotorcycle(){
        Motorcycle opponentMotorcycle=player.getPlayerMotorcycle();
        opponentMotorcycle.engine.setTier(generateOpponentTierEngine());
        opponentMotorcycle.tire.setTier(generateOpponentTierTire());
        return opponentMotorcycle;
    }
    public int generateOpponentTierEngine(){
        Motorcycle opponentMotorcycle=player.getPlayerMotorcycle();
        int limit=opponentMotorcycle.engine.getTier();
        Random rand=new Random();
        return rand.nextInt(0,limit);
    }
    public int generateOpponentTierTire(){
        Motorcycle opponentMotorcycle=player.getPlayerMotorcycle();
        int limit=opponentMotorcycle.tire.getTier();
        Random rand=new Random();
        return rand.nextInt(0,limit);
    }
    public void createOpponent(){
        Opponent opponent=new Opponent(createOpponentDriver(),createOpponentMotorcycle());
    }
    public void generateGame() {
        Player player = Player.getInstance(createDriver(), createMotorcycle());

    }
//    public void opponentGenerator(){
//        Random rand= new Random();
//        ArrayList<String> names=new ArrayList<>();
//        names.add("James Carlton");
//        names.add("Randy Colton");
//        names.add("Johanna Rust");
//        names.add("Mirabelle Nguyen");
//        String[] colors={"Red","White","Blue","Yellow","Green"};
//        int choice=rand.nextInt(0,3);
//        String opponentName=names.get(choice);
//        int opponentLevel=Player.getPlayerLevel();
//        int opponentExperience=rand.nextInt(0,10)*Player.getPlayerLevel();
//        String opponentWeatherBonus=Weather.getWeather();
//        Driver driver=new Driver(opponentName,opponentExperience,opponentLevel,opponentWeatherBonus,0);
//        int adherence=rand.nextInt(0,10);
//        int tireTier=rand.nextInt(0,3);
//        Tire tire = new Tire(adherence,tireTier);
//        int engineTier= rand.nextInt(0,3);
//        int horsePower=rand.nextInt(80,220);
//        Engine engine=new Engine(engineTier,horsePower);
//        int randomNumber=rand.nextInt();
//        String color=colors[randomNumber];
//        Motorcycle motorcycle= new Motorcycle(tire,engine,color);
//    }

}
