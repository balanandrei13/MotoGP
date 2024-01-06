public class Player {
    private Driver playerDriver;
    private Motorcycle playerMotorcycle;
    private static Player instance;
    private Player(Driver playerDriver,Motorcycle playerMotorcycle){
        this.playerDriver=playerDriver;
        this.playerMotorcycle=playerMotorcycle;
    }
    public int getPlayerLevel(){
        return playerDriver.getLevel();
    }
    public static Player getInstance(Driver playerDriver,Motorcycle playerMotorcycle){
        if(instance==null){
            instance= new Player(playerDriver,playerMotorcycle);
        }
        return instance;
    }
    public double getTopSpeed(Weather weather){
        return this.playerDriver.totalBonus(weather)+this.playerMotorcycle.accelerates();
    }
    public Motorcycle getPlayerMotorcycle(){
        return this.playerMotorcycle;
    }
    public Driver getPlayerDriver(){
        return this.playerDriver;
    }

}

