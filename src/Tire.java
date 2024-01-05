public class Tire implements LevelUp {
    int adherence;
    int tier;
    public Tire(int adherence, int tier){
        this.adherence = adherence;
        this.tier=tier;
    }
    public int tireBonusSpeed(){
        int tireBonusSpeed= adherence/10 + tier;
        return tireBonusSpeed;
    }

    @Override
    public void levelUp() {
        tier+=1;
    }
}
