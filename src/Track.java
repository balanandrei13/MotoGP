import java.util.Random;

public class Track {
    int length;
    Weather trackWeather;

    public Track(int length, Weather trackWeather) {
        this.length = length;
        this.trackWeather = trackWeather;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Weather getTrackWeather() {
        return trackWeather;
    }

    public void setTrackWeather(Weather trackWeather) {
        this.trackWeather = trackWeather;
    }
}
