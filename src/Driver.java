
public class Driver implements LevelUp{
    String name;
    int experience;
    String weatherBonus;
    int level;
    int tierCoin;

    public Driver(String name, int experience, String weatherBonus, int level,int tierCoin) {
        this.name=name;
        this.experience = experience;
        this.weatherBonus=weatherBonus;
        this.level=level;
        this.tierCoin=tierCoin;
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

    public String getWeatherBonus() {
        return weatherBonus;
    }

    public void setWeatherBonus(String weatherBonus) {
        this.weatherBonus = weatherBonus;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int experienceBonusSpeed(){
        int experienceBonusSpeed=10*experience/100;
        return experienceBonusSpeed;
    }
    public int weatherBonusSpeed(String weather){
        int weatherBonusSpeed=0;
        if(weather.equalsIgnoreCase(weatherBonus)){
            weatherBonusSpeed=10;
        }
        return weatherBonusSpeed;
    }
    public void increaseExperience(){
        experience+=10;
    }

    @Override
    public void levelUp() {
    if (experience % 10 == 0 && level<10) {
            level += 1;
            tierCoin+=1;
        }
    }

}
