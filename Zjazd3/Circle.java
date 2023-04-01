public class Circle {
    private double radius;
    private String color = "Green";

    public Circle(){
        radius = 1;
        color = "Red";
    }
    public Circle(double x){
        radius = x;
    }
    public Circle(double r, String c){
        radius = r;
        color = c;
    }


    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return (Math.PI*(radius*radius));
    }


    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String toString(){
        return getClass().getName() + ":" + " radius: %s, color: %s".formatted(radius, color);
    }

}
