/*
    Zawieta doslownie to samo co Hunter.
    Zmiany sa tylko w multiplikatorach, obliczaniu dmg'a oraz krytykowaniu

 */

package Classes;

import Unit.Player;
import java.util.HashMap;
import java.util.Random;

public class Warrior extends Player implements ClassInterface{
    private String className = "Warrior";
    private Integer lvl;
    private Integer exp;
    private Integer expBar;
    private Integer points;
    private HashMap<String, Float> multiplier = new HashMap<String, Float>();

    public Warrior(){
        this.lvl = 1;
        this.exp = 0;
        this.points = 10;
        this.expBar = 30;
        this.multiplier.put("Strength multiplier", 1.20f);
        this.multiplier.put("Defence multiplier", 1.10f);
        this.multiplier.put("Intelligence multiplier", 1.00f);
        this.multiplier.put("Dexterity multiplier", 1.05f);
        this.multiplier.put("Agility multiplier", 1.02f);
        this.multiplier.put("Speed multiplier", 1.05f);
        setHp((float)Math.round(100f * multiplier.get("Defence multiplier")*100.0f) / 100.0f);
        setStrength((float)Math.round(3 * multiplier.get("Strength multiplier")*100.0) / 100.0f);
        setDefence((float)Math.round(2 * multiplier.get("Defence multiplier")*100.0f) / 100.0f);
        setIntelligence((float)Math.round(2 * multiplier.get("Intelligence multiplier")*100.0f) / 100.0f);
        setDexterity((float)Math.round(5 * multiplier.get("Dexterity multiplier")*100.0f) / 100.0f);
        setAgility((float)Math.round(4 * multiplier.get("Agility multiplier")*100.0f) / 100.0f);
        setSpeed((float)Math.round(4 * multiplier.get("Speed multiplier")*100.0f) / 100.0f);
    }

    //Gettery
    @Override
    public String getClassName() {
        return this.className;
    }
    @Override
    public Integer getLvl() {
        return this.lvl;
    }
    @Override
    public Integer getExp() {
        return this.exp;
    }
    @Override
    public Integer getExpBar(){
        return this.expBar;
    }
    @Override
    public Integer getPoints() {
        return this.points;
    }
    @Override
    public Float getDmg(){
        Random rand = new Random();
        Float random = rand.nextFloat();
        Float random2 = rand.nextFloat(getDexterity() / 5);
        Float percentage = (getAgility() * 0.015f);
        if(random <= percentage){
            return(float)Math.round((getStrength() * 1.5 + getAgility() + random2) * 100)/ 100;
        }
        else {
            return (float)Math.round((getStrength() + random2) * 100) / 100;
        }
    }
    public void showInfo(){
        System.out.println("==========Information==========");
        System.out.println("Class: " + this.className);
        System.out.println("Level: " + this.lvl);
        System.out.println("Points to spend: " + this.points);
        System.out.println("Experience points: " + this.exp);
        System.out.println("Experience bar: " + this.expBar);
    }


    //Settery

    @Override
    public void addStrength(Integer points) {
        if(this.points >= points){
            this.points -= points;
            setStrength((float)Math.round((getStrength() + points) * multiplier.get("Strength multiplier") * 100.0f) / 100.0f);
        }
    }

    @Override
    public void addDefence(Integer points) {
        if(this.points >= points){
            this.points -= points;
            setDefence((float)Math.round((getDefence() + points) * multiplier.get("Defence multiplier") * 100.0f) / 100.0f);
            setHp((float)Math.round((getHp() + getDefence() + points)  * 100.0f) / 100.0f);
        }
    }

    @Override
    public void addIntelligence(Integer points) {
        if(this.points >= points){
            this.points -= points;
            setIntelligence((float)Math.round((getIntelligence() + points) * multiplier.get("Intelligence multiplier") * 100.0f) / 100.0f);
        }
    }

    @Override
    public void addDexterity(Integer points) {
        if(this.points >= points){
            this.points -= points;
            setDexterity((float)Math.round((getDexterity() + points) * multiplier.get("Dexterity multiplier") * 100.0f) / 100.0f);
        }
    }

    @Override
    public void addAgility(Integer points) {
        if(this.points >= points){
            this.points -= points;
            setAgility((float)Math.round((getAgility() + points) * multiplier.get("Agility multiplier") * 100.0f) / 100.0f);
        }
    }

    @Override
    public void addSpeed(Integer points) {
        if(this.points >= points){
            this.points -= points;
            setSpeed((float)Math.round((getSpeed() + points) * multiplier.get("Speed multiplier") * 100.0f) / 100.0f);
        }
    }

    @Override
    public void addExp(Integer exp){
        if(this.lvl <= 60) {
            this.exp += exp;
            if (this.exp >= this.expBar) {
                lvlUp();
                setExpBar();
            }
        }
    }
    private void lvlUp() {
        this.lvl += 1;
        this.points += 10;
        this.exp = this.exp - this.expBar;
        setExpBar();
    }
    private void setExpBar(){
        if(this.lvl <= 10){
            this.expBar += this.expBar/2;
        }
        else if(this.lvl > 10 && this.lvl <= 20){
            this.expBar += this.expBar/4;
        }
        else if(this.lvl > 20 && this.lvl <= 30){
            this.expBar += this.expBar/6;
        }
        else if(this.lvl > 30 && this.lvl <= 40){
            this.expBar += this.expBar/6;
        }
        else if(this.lvl > 40 && this.lvl <= 50){
            this.expBar +=this.expBar/4;
        }
        else if(this.lvl > 50 && this.lvl <= 60){
            this.expBar +=this.expBar/2;
        }
        else{
            System.out.println("You've reached max lvl!");
        }
    }
}
