package Unit;

public interface UnitInterface {

    //Gettery
    public Float getStrength();
    public Float getDefence();
    public Float getIntelligence();
    public Float getDexterity();
    public Float getAgility();
    public Float getSpeed();
    public Float getHp();
    public void showStats();

    //Settery
    public void setHp(Float hp);
    public void setStrength(Float strength);
    public void setDefence(Float defence);
    public void setIntelligence(Float intelligence);
    public void setDexterity(Float dexterity);
    public void setAgility(Float agility);
    public void setSpeed(Float speed);
}
