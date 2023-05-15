package functions;

import java.util.Random;

public class Classes extends Player{
    private int lvl;
    private double exp;
    private int points;
    private String classData;
    private int expBar = 30;
    private double dmg;



    //Obiekt klasa wraz z definicjami poszczegolnych klas postaci
    public Classes(double strength, double defence, double intelligence, double dexterity, double agility, double speed, int lvl, float exp, int points){
        super(strength, defence, intelligence, dexterity, agility, speed);
        this.lvl = lvl;
        this.exp = exp;
        this.points = points;
    }
    public void setWarrior(){
        this.lvl = 1;
        this.exp = 0;
        this.points = 0;
        this.expBar = 30;
        classData = "Warrior";
        setStrengthMul(1.20);
        setDefenceMul(1.10);
        setIntelligenceMul(1.0);
        setDexterityMul(1.05);
        setAgilityMul(1.02);
        setSpeedMul(1.05);
    }
    public void setHunter(){
        this.lvl = 1;
        this.exp = 0;
        this.points = 0;
        this.expBar = 30;
        classData = "Hunter";
        setStrengthMul(1.05);
        setDefenceMul(1.05);
        setIntelligenceMul(1.0);
        setDexterityMul(1.2);
        setAgilityMul(1.1);
        setSpeedMul(1.05);
    }
    public void setMage(){
        this.lvl = 1;
        this.exp = 0;
        this.points = 0;
        this.expBar = 30;
        classData = "Mage";
        setStrengthMul(1.0);
        setDefenceMul(1.0);
        setIntelligenceMul(1.2);
        setDexterityMul(1.05);
        setAgilityMul(1.02);
        setSpeedMul(1.0);
    }



    //Typowe gettery w celu prezentacji
    public String getClassData(){
        return classData;
    }

    public int getLvl(){
        return this.lvl;
    }
    public double getExp(){
        return this.exp;
    }

    public int getPoints() {
        return points;
    }



    //System levelowania
    public void setExpBar(){
        if(lvl <= 10) {
            this.expBar = this.expBar * 2;
        }
        else if(lvl > 10 && lvl <= 15) {
            this.expBar = this.expBar * 3;
        }
        else if(lvl > 15 && lvl <= 25) {
            this.expBar = this.expBar * 5;
        }
        else if(lvl > 25 && lvl <= 55) {
            this.expBar = this.expBar * 10;
        }
        else {
            this.expBar = this.expBar * 30;
        }
    }
    public int getExpBar(){
        return this.expBar;
    }
    public void lvlUp(){
        this.lvl = this.lvl + 1;
        this.points = this.points + 10;
        this.exp = this.exp - this.expBar;
        setExpBar();
    }
    public void addExp(double exp){
        this.exp = this.exp + exp;
        if(this.exp >= this.expBar){
            lvlUp();
        }
    }

    //System obliczania obrazen w zaleznosci od klasy postaci

    public boolean ifCrit(){
        boolean crit;
        Random random = new Random();
        double percentage;
        if(getClassData() == "Warrior"){
            percentage = (getDexterity() * 0.15) / 100;
            double rand = random.nextDouble();
            System.out.println(rand);
            System.out.println(percentage);
            if(rand <= percentage){
                crit = true;
                return crit;
            }
        }
        else if(getClassData() == "Hunter"){
            percentage = (getStrength() * 0.15) / 100;
            double rand = random.nextDouble();
            if(rand <= percentage){
                crit = true;
                return crit;
            }
        }
        else{
            percentage = (getDexterity() * 0.15) / 100;
            double rand = random.nextDouble();
            if(rand <= percentage){
                crit = true;
                return crit;
            }
        }
        return crit = false;
    }
    public double getDmg() {
        if(getClassData() == "Warrior"){
            if(ifCrit() == false) {
                return (getStrength() * 1.5 + getDexterity());
            }
            else{
                return(getStrength() * 3.0 + getDexterity());
            }
        }
        else if(getClassData() == "Hunter"){
            if(ifCrit() == false) {
                return (getDexterity() * 1.5 + getAgility());
            }
            else{
                return (getDexterity() * 3.0 + getAgility());
            }
        }
        else{
            if(ifCrit() == false) {
                return (getIntelligence() * 2);
            }
            else{
                return (getIntelligence() * 4);
            }
        }
    }

    //System dodawania do statystyk okreslona liczbe punktow
    public void addStr(int points){
        if(points <= this.points) {
            addStrength(points);
            this.points = this.points - points;
        }
        else{
            System.out.println("You do not have enough points!");
        }
    }
    public void addDef(int points){
        if(points <= this.points) {
            addDefence(points);
            this.points = this.points - points;
        }
        else{
            System.out.println("You do not have enough points!");
        }
    }
    public void addInt(int points){
        if(points <= this.points) {
            addIntelligence(points);
            this.points = this.points - points;
        }
        else{
            System.out.println("You do not have enough points!");
        }
    }
    public void addDex(int points){
        if(points <= this.points) {
            addDexterity(points);
            this.points = this.points - points;
        }
        else{
            System.out.println("You do not have enough points!");
        }
    }
    public void addAgil(int points){
        if(points <= this.points) {
            addAgility(points);
            this.points = this.points - points;
        }
        else{
            System.out.println("You do not have enough points!");
        }
    }
    public void addSpd(int points){
        if(points <= this.points) {
            addSpeed(points);
            this.points = this.points - points;
        }
        else{
            System.out.println("You do not have enough points!");
        }
    }
}
