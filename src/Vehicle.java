public abstract class Vehicle {
    int nrWheels;
    String steering;
    Tire tire;
    Engine engine;
    Color color;

    public Vehicle(int nrWheels, String steering, Tire tire, Engine engine, Color color) {
        this.nrWheels = nrWheels;
        this.steering = steering;
        this.tire = tire;
        this.engine = engine;
        this.color = color;
    }

    public int getNrWheels() {
        return nrWheels;
    }

    public void setNrWheels(int nrWheels) {
        this.nrWheels = nrWheels;
    }

    public String getSteering() {
        return steering;
    }

    public void setSteering(String steering) {
        this.steering = steering;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
