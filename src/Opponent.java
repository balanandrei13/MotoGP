import java.util.Random;

public class Opponent extends Character {
    public Opponent(Driver driver, Motorcycle motorcycle, double topSpeed){
        super(driver,motorcycle,topSpeed);
        this.topSpeed=topSpeed;
    }
    @Override
    public double calculateTopSpeed(Weather weather) {
        Random randomDouble = new Random();
        double speedVariation = randomDouble.nextDouble(-10.5, 10.5);
        return this.driver.totalBonus(weather) + this.motorcycle.accelerates() + speedVariation;
    }
}
