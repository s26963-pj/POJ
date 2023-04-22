public class Cylinder extends Circle{
    //Atrybuty klasy Cylinder
    private double height = 4.0;

    //Metody klasy Cylinder
    public Cylinder(){
        height = 4.0;
    };
    public Cylinder(double r){
        super(r);
    };
    public Cylinder(double r, double h){
        super(r);
        height = h;
    }
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return (Math.PI*((super.getRadius() * super.getRadius())*height));
    }
}
