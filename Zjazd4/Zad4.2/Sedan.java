public class Sedan extends Car implements Purchase{
    //Atrybuty klasy Car
    private int length;

    //Metody klasy Car
    public Sedan(int speed, double regularPrice, String color, int l){
        super(speed, regularPrice, color);
        length = l;
    }
    public int getLength(){
        return length;
    }
    public double getSalePrice(){
        if (length > 20){
            double off = super.getSalePrice() * 0.05;
            return (super.getSalePrice() - off);
        } else{
            double off = super.getSalePrice() * 0.1;
            return (super.getSalePrice() - off);
        }
    }
    public String getPurchaseInfo(){
        return ("SEDAN: ");
    }
}
