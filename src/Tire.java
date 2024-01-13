public class Tire implements LevelUp {
    private int adherence;
    private int tier;
    public Tire(int adherence, int tier){
        this.adherence = adherence;
        this.tier=tier;
    }

    public int getAdherence() {
        return adherence;
    }

    public void setAdherence(int adherence) {
        this.adherence = adherence;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public Tire(){
        this.adherence=0;
        this.tier=1;
    }
    public int tireBonusSpeed(){
        int tireBonusSpeed= adherence/10 + tier;
        return tireBonusSpeed;
    }

    @Override
    public void levelUp() {
        tier+=1;
        adherence+=10;
    }
}
