import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RaceGenerator {
    Player player;
    Opponent opponent;
    ArrayList<Opponent> opponents;
    Track track;

    public RaceGenerator() {
        opponents=new ArrayList<>();
        this.player = Player.getInstance(createDriver(), createMotorcycle(), 80,0);
        this.track=createTrack();
        createOpponent();
        createOpponent();
        createOpponent();
        createOpponent();
        createOpponent();
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public ArrayList<Opponent> getOpponents() {
        return opponents;
    }

    public void setOpponents(ArrayList<Opponent> opponents) {
        this.opponents = opponents;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public Track createTrack(){
        Random rand=new Random();
        int randomLength=rand.nextInt(10,30);
        return new Track(randomLength,Weather.generateRandomWeather());

    }
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
        Driver opponentDriver=new Driver(name,experience,player.getDriver().getLevel(), Weather.generateRandomWeather());
        return  opponentDriver;
    }

    public int generateOpponentTierEngine(){
        Motorcycle opponentMotorcycle=player.getMotorcycle();
        int limit=opponentMotorcycle.engine.getTier();
        Random rand=new Random();
        return rand.nextInt(limit+1);
    }
    public int generateOpponentTierTire(){
        Motorcycle opponentMotorcycle=player.getMotorcycle();
        int limit=opponentMotorcycle.tire.getTier();
        Random rand=new Random();
        return rand.nextInt(limit+1);
    }
    public Motorcycle createOpponentMotorcycle() {
        Motorcycle opponentMotorcycle = player.getMotorcycle();
        opponentMotorcycle.engine.setTier(generateOpponentTierEngine());
        opponentMotorcycle.tire.setTier(generateOpponentTierTire());
        return opponentMotorcycle;
    }

    public void createOpponent(){
        this.opponent=new Opponent(createOpponentDriver(),createOpponentMotorcycle(),0);
        double topSpeed=opponent.calculateTopSpeed(track.getTrackWeather());
        opponent.setTopSpeed(topSpeed);
        this.opponents.add(opponent);
    }
//    public Race generateGame() {
//        Player player = Player.getInstance(createDriver(), createMotorcycle());
//        createOpponent();
//        createOpponent();
//        createOpponent();
//        createOpponent();
//        createTrack();
//        return new Race(player,opponents,track);
//    }
}
