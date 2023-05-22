package Unit;

public class Player implements UnitInterface{
    private Float hp;
    private Float strength;
    private Float defence;
    private Float intelligence;
    private Float dexterity;
    private Float agility;
    private Float speed;

    //Gettery
    @Override
    public Float getHp() {
        return hp;
    }

    @Override
    public Float getStrength() {
        return strength;
    }

    @Override
    public Float getDefence() {
        return defence;
    }

    @Override
    public Float getIntelligence() {
        return intelligence;
    }

    @Override
    public Float getDexterity() {
        return dexterity;
    }

    @Override
    public Float getAgility() {
        return agility;
    }

    @Override
    public Float getSpeed() {
        return speed;
    }

    public void showStats(){
        System.out.println("==========Stats==========");
        System.out.println("Hit points: " + this.hp);
        System.out.println("Strength: " + this.strength);
        System.out.println("Defence: " + this.defence);
        System.out.println("Intelligence: " + this.intelligence);
        System.out.println("Dexterity: " + this.dexterity);
        System.out.println("Agility: " + this.agility);
        System.out.println("Speed: " + this.speed);
    }


    //Settery
    @Override
    public void setHp(Float hp) {
        this.hp = hp;
    }
    @Override
    public void setStrength(Float strength) {
        this.strength = strength;
    }
    @Override
    public void setDefence(Float defence) {
        this.defence = defence;
    }
    @Override
    public void setIntelligence(Float intelligence) {
        this.intelligence = intelligence;
    }
    @Override
    public void setDexterity(Float dexterity) {
        this.dexterity = dexterity;
    }
    @Override
    public void setAgility(Float agility) {
        this.agility = agility;
    }
    @Override
    public void setSpeed(Float speed) {
        this.speed = speed;
    }
}
