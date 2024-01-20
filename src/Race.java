import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Race {
    RaceGenerator raceGenerator;
    public Race(RaceGenerator raceGenerator){
        this.raceGenerator=raceGenerator;
    }
    public void raceResults(RaceGenerator raceGenerator){

        ArrayList<Double> speedList = new ArrayList<>();

        ArrayList<Character> racers = new ArrayList<>();

        for(Character opponent: raceGenerator.opponents){
            speedList.add(opponent.topSpeed);
        }

        speedList.add(raceGenerator.player.getTopSpeed());

        Collections.sort(speedList);

        System.out.println("This are our results for today:");

        racers.sort((o1,o2)->
                (o1.getTopSpeed().CompareTo.o2.getTOpSpeed()));
    }
}
