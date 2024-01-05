public class Player {
    static Driver playerDriver;
    static Motorcycle playerMotorcycle;
    public Player(Driver playerDriver,Motorcycle playerMotorcycle){
        this.playerDriver=playerDriver;
        this.playerMotorcycle=playerMotorcycle;
    }
    public static int getPlayerLevel(){
        return playerDriver.getLevel();
    }
}

