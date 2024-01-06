import java.util.Random;

public enum Color {
    RED,
    GREEN,
    YELLOW,
    WHITE,
    BLACK;
    public static Color generateRandomColor(){
       Color[] colors= Color.values();
        int colorsLength= colors.length;
        int index= new Random().nextInt(colorsLength);
        return colors[index];
    }
}
