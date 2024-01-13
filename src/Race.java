import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Race {
    RaceGenerator raceGenerator;
    public Race(RaceGenerator raceGenerator){
        this.raceGenerator=raceGenerator;
    }
    public HashMap<String,Double> raceResults(RaceGenerator raceGenerator){
        HashMap<String,Double> entitySpeed=new HashMap<String,Double>();
        ArrayList<Opponent> opponents=raceGenerator.getOpponents();
        Player player=raceGenerator.getPlayer();

        double playerTopSpeed=player.getTopSpeed(raceGenerator.getTrack().getTrackWeather());

        for(Opponent opponent:opponents){
         double speed=opponent.getTopSpeed(raceGenerator.getTrack().getTrackWeather());
         entitySpeed.put(opponent.getDriver().getName(),speed);
        }
        entitySpeed.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Double>comparingByValue())
                .forEach(System.out::println);
        return entitySpeed;
    }
}
