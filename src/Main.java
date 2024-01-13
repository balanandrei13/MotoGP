public class Main {
    //mai multe design patterns
    //baze de date
    //exceptii
    //interfata??
    //constante(final)
    public static void main(String[] args){
        startGame();
    }
    public static void startGame(){
        System.out.println("Hello and welcome to MotoGP!");
        RaceGenerator raceGenerator=new RaceGenerator();
        Race race =  new Race(raceGenerator);
        race.raceResults(raceGenerator);
    }
}