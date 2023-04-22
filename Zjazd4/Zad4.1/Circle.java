public class Circle {

    //Atrybuty klasy Circle
    private double radius;
    private String color = "Blue";

    //Metody klasy Circle

    public Circle(){
        radius = 1.0;
        color = "Blue";
    };
    public Circle(double r){
        radius = r;
    };
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return (Math.PI*(radius * radius));
    }
    public String toString() {
        return getClass().getName() + ":" + " radius: %s, color: %s".formatted(radius, color);
    }

}
