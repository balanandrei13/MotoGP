public class Engine{
    private int horsepower;
    private int tier;

    public Engine(int horsepower, int tier) {
        this.horsepower = horsepower;
        this.tier=tier;
    }
    public Engine() {
        this.horsepower = 80;
        this.tier=1;
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
    public void levelUp() {
        this.tier+=1;
        this.horsepower+=35;
    }
}

