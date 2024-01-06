
public class Driver implements LevelUp{
    private String name;
    private int experience;
    private int level;
    private Weather weatherBonus;
    private int tierCoin;

    public Driver(String name, int experience,int level, Weather weatherBonus, int tierCoin) {
        this.name=name;
        this.experience = experience;
        this.weatherBonus=weatherBonus;
        this.level=level;
        this.tierCoin=tierCoin;
    }
    public Driver(String name, Weather weatherBonus){
        this.name=name;
        this.experience=0;
        this.weatherBonus=weatherBonus;
        this.level=0;
        this.tierCoin=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Weather getWeatherBonus() {
        return weatherBonus;
    }

    public void setWeatherBonus(Weather weatherBonus) {
        this.weatherBonus = weatherBonus;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double experienceBonusSpeed(){
        int experienceBonusSpeed=10*experience/100;
        return experienceBonusSpeed;
    }
    public double weatherBonusSpeed(Weather weather){
        int weatherBonusSpeed=0;
        if(weather==weatherBonus){
            weatherBonusSpeed=10;
        }
        return weatherBonusSpeed;
    }
    public double totalBonus(Weather weather){
        return experienceBonusSpeed()+weatherBonusSpeed(weather);
    }
    //DE MODIFICAT!!!!!
    public void increaseExperience(){
        experience+=5;
    }

    @Override
    public void levelUp() {
    if (experience % 10 == 0 && level<10) {
            level += 1;
            tierCoin+=1;
        }
    }

}
