public class Car {

    //Atrybuty klasy Car
    private int speed;
    private double regularPrice;
    private String color;

    //Metody klasy Car
    public Car(int s, double r, String c){
        speed = s;
        regularPrice = r;
        color = c;
    }
    public int getSpeed(){
        return speed;
    }
    public double getRegularPrice(){
        return  regularPrice;
    }
    public String getColor(){
        return color;
    }

    public double getSalePrice(){
        return regularPrice;
    }

}
