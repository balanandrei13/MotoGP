import java.util.ArrayList;

public class Opponent {
    private Driver driver;
    private Motorcycle motorcycle;
    ArrayList<Opponent> opponents;
    public Opponent(Driver driver, Motorcycle motorcycle){
        this.driver=driver;
        this.motorcycle=motorcycle;
        this.opponents=new ArrayList<Opponent>();
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Motorcycle getMotorcycle() {
        return motorcycle;
    }

    public void setMotorcycle(Motorcycle motorcycle) {
        this.motorcycle = motorcycle;
    }

    public double getTopSpeed(Weather weather){
        return this.driver.totalBonus(weather)+this.motorcycle.accelerates();
    }
    public void addOpponents(Opponent opponent){
        opponents.add(opponent);
    }
}
