public class Player extends Character {
    public int tierCoins;
    private static Player instance;

    private Player(Driver playerDriver, Motorcycle playerMotorcycle, double topSpeed, int tierCoins) {
        super(playerDriver, playerMotorcycle, topSpeed);
        tierCoins=0;
    }
    public static Player getInstance(Driver playerDriver, Motorcycle playerMotorcycle, double topSpeed, int tierCoins) {
        if (instance == null) {
            instance = new Player(playerDriver, playerMotorcycle, topSpeed, tierCoins);
        }
        return instance;
    }
    @Override
    public double calculateTopSpeed(Weather weather) {
        return Player.instance.getDriver().totalBonus(weather) + Player.instance.getMotorcycle().accelerates();
    }
    public int getTierCoins(){
        return this.tierCoins;
    }
}