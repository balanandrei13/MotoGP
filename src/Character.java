public abstract class Character {
    Driver driver;
    Motorcycle motorcycle;
    double topSpeed;

    public Character(Driver driver, Motorcycle motorcycle, double topSpeed) {
        this.driver = driver;
        this.motorcycle = motorcycle;
        this.topSpeed=topSpeed;
    }

    public Driver getDriver() {
        return this.driver;
    }


    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Motorcycle getMotorcycle() {
        return this.motorcycle;
    }

    public void setMotorcycle(Motorcycle motorcycle) {
        this.motorcycle = motorcycle;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public double getTopSpeed() {
        return this.topSpeed;
    }
    public double calculateTopSpeed(Weather weather) {
        return topSpeed;
    }

}

