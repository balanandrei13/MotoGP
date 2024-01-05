public class Motorcycle extends Vehicle implements MotoActions{
    public Motorcycle(int nrWheels, String steering, Tire tire, Engine engine, String color) {
        super(2, "Handles(CounterSteering)", tire, engine, color);
    }

    @Override
    public double accelerates() {
        return tire.tireBonusSpeed()+engine.engineBonusSpeed();
    }
}
