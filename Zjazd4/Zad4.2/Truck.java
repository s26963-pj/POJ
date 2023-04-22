public class Truck extends Car implements Purchase{

    //Atrybuty klasy Truck

    private int weight;

    //Metody klasy Truck

    public Truck(int speed, double regularPrice, String color, int w){
        super(speed, regularPrice, color);
        weight = w;
    }
    public int getWeight(){
        return weight;
    }
    public double getSalePrice(){
        if(weight > 2000){
            double off = super.getSalePrice() * 0.1;
            return (super.getSalePrice() - off);
        }
        else{
            return (super.getSalePrice());
        }
    }
    public String getPurchaseInfo(){
        return ("TRUCK: ");
    }
}
