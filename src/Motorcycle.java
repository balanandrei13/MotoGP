public class Motorcycle extends Vehicle implements MotoActions{
    public Motorcycle(Tire tire, Engine engine, Color color) {
        super(2, "Handles(CounterSteering)", tire, engine, color);
    }

    @Override
    public double accelerates() {
        return tire.tireBonusSpeed()+engine.engineBonusSpeed();
    }
}
