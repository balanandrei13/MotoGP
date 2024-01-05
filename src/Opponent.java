import java.util.ArrayList;
import java.util.Random;
import java.math.*;

public class Opponent {
    Driver driver;
    Motorcycle motorcycle;
    public Opponent(Driver driver, Motorcycle motorcycle){
        this.driver=driver;
        this.motorcycle=motorcycle;
    }
    ArrayList<Opponent> opponents=new ArrayList<>();
    public void opponentGenerator(){
        Random rand= new Random();
        ArrayList<String> names=new ArrayList<>();
        names.add("James Carlton");
        names.add("Randy Colton");
        names.add("Johanna Rust");
        names.add("Mirabelle Nguyen");
        String[] colors={"Red","White","Blue","Yellow","Green"};
        int choice=rand.nextInt(0,3);
        String opponentName=names.get(choice);
        int opponentLevel=Player.getPlayerLevel();
        int opponentExperience=rand.nextInt(0,10)*Player.getPlayerLevel();
        String opponentWeatherBonus=Weather.getWeather();
        Driver driver=new Driver(opponentName,opponentExperience,opponentWeatherBonus,opponentLevel,0);
        int adherence=rand.nextInt(1,10);
        int tireTier=rand.nextInt(1,4);
        Tire tire = new Tire(adherence,tireTier);
        int engineTier= rand.nextInt(1,4);
        int horsePower=rand.nextInt(80,220);
        Engine engine=new Engine(engineTier,horsePower);
        int randomNumber=rand.nextInt();
        String color=colors[randomNumber];
        Motorcycle motorcycle= new Motorcycle(2,"handles",tire,engine,color);
    }
}
