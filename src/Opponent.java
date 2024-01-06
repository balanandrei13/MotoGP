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
    public double getTopSpeed(Weather weather){
        return this.driver.totalBonus(weather)+this.motorcycle.accelerates();
    }
}
