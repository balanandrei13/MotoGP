import java.util.Random;

public enum OpponentName {
    JAMES,
    JOHANNA,
    MAURICE,
    KYLE,
    TRENT,
    KAMILA,
    INGRID,
    BOGDANOV,
    EUNSEO,
    MINHOO,
    HIROSHI,
    DAIKI;
    public static String generateRandomName(){
        OpponentName[] names= OpponentName.values();
        int namesLength= names.length;
        int index= new Random().nextInt(namesLength);
        return names[index].toString();
    }
}
