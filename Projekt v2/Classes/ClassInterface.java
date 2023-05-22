package Classes;

public interface ClassInterface {

    //Gettery
    public String getClassName();
    public Integer getLvl();
    public Integer getExp();
    public Integer getExpBar();
    public Integer getPoints();
    public Float getDmg();
    public void showInfo();


    //Settery
    public void addExp(Integer exp);
    public void addStrength(Integer points);
    public void addDefence(Integer points);
    public void addIntelligence(Integer points);
    public void addDexterity(Integer points);
    public void addAgility(Integer points);
    public void addSpeed(Integer points);
}
