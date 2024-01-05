import java.util.Random;

public class Weather {
    String weather;
    static String[] weatherList= {"Sunny","Rain","Snow","Foggy"};
    public Weather(String weather){
        this.weather=weather;
    }

    public static String getWeather() {
        Random random = new Random();
        int randomWeather = random.nextInt(0, 2);
        return weatherList[randomWeather];
    }
}
