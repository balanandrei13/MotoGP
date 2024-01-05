public class Engine implements LevelUp {
    int horsepower;
    int tier;

    public Engine(int horsepower, int tier) {
        this.horsepower = horsepower;
        this.tier=tier;
    }
    public double engineBonusSpeed(){
        double engineBonusSpeed=Math.cbrt(horsepower)*20*1.60934;
        return engineBonusSpeed;
    }

    @Override
    public void levelUp() {
        tier+=1;
        horsepower+=35;
    }
}

