public class Engine implements LevelUp {
    int horsepower;
    int tier;

    public Engine(int horsepower, int tier) {
        this.horsepower = horsepower;
        this.tier=tier;
    }
    public Engine() {
        this.horsepower = 0;
        this.tier=0;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
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

