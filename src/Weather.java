import java.util.Random;

public enum Weather {
    SUN,
    FOGG,
    RAIN,
    SNOW;
    public static Weather generateRandomWeather(){
        Weather[] weatherTypes= Weather.values();
        int weatherLength= weatherTypes.length;
        int index= new Random().nextInt(weatherLength);
        return weatherTypes[index];
    }
}
