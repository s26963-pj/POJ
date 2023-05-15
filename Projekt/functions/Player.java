package functions;
public class Player{
        //Atrybuty postaci

        private double strength;
        private double strengthMul = 1;
        private double defence;
        private double defenceMul = 1;
        private double intelligence;
        private double intelligenceMul = 1;
        private double dexterity;
        private double dexterityMul = 1;
        private double agility;
        private double agilityMul = 1;
        private double speed;
        private double speedMul = 1;

     //Metody postaci

     //Ustawia nam standardowe wartosci atrybutow bez przypisanej klasy
        public Player(double strength, double defence, double intelligence, double dexterity, double agility, double speed){
            this.strength = strength;
            this.defence = defence;
            this.intelligence = intelligence;
            this.dexterity = dexterity;
            this.agility = agility;
            this.speed = speed;
        }


    //Gettery i Settery

    public double getStrengthMul() {
        return strengthMul;
    }

    public void setStrengthMul(double strengthMul) {
        this.strengthMul = strengthMul;
    }

    public double getDefenceMul() {
        return defenceMul;
    }

    public void setDefenceMul(double defenceMul) {
        this.defenceMul = defenceMul;
    }

    public double getIntelligenceMul() {
        return intelligenceMul;
    }

    public void setIntelligenceMul(double intelligenceMul) {
        this.intelligenceMul = intelligenceMul;
    }

    public double getDexterityMul() {
        return dexterityMul;
    }

    public void setDexterityMul(double dexterityMul) {
        this.dexterityMul = dexterityMul;
    }

    public double getAgilityMul() {
        return agilityMul;
    }

    public void setAgilityMul(double agilityMul) {
        this.agilityMul = agilityMul;
    }

    public double getSpeedMul() {
        return speedMul;
    }

    public void setSpeedMul(double speedMul) {
        this.speedMul = speedMul;
    }

    public double getStrength() {
        return strength * strengthMul;
    }
        public double getDefence(){
            return defence * strengthMul;
        }
        public double getIntelligence(){
            return intelligence * intelligenceMul;
        }
        public double getDexterity(){
            return dexterity * dexterityMul;
        }

        public double getAgility() {
            return agility * agilityMul;
        }

        public double getSpeed() {
            return speed * agilityMul;
        }
        public void addStrength(double strength){
            this.strength = this.strength + strength;
        }
        public void addDefence(double defence){
            this.defence = this.defence + defence;
        }
        public void addIntelligence(double intelligence){
            this.intelligence = this.intelligence + intelligence;
        }
        public void addDexterity(double dexterity){
            this.dexterity = this.dexterity + dexterity;
        }
        public void addAgility(double agility){
            this.agility = this.agility + agility;
        }
        public void addSpeed(double speed){
            this.speed = this.speed + speed;
        }

}
