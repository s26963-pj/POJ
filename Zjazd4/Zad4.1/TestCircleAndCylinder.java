public class TestCircleAndCylinder {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(3.1);
        System.out.println("promien c1: " + c1.getRadius() + " Pole c1: " + c1.getArea());
        System.out.println("promien c2: " + c2.getRadius() + " Pole c2: " + c2.getArea());

        Cylinder cyl1 = new Cylinder();
        System.out.println("promien cylindra: " + cyl1.getRadius() + " Wysokosc cylindra: " + cyl1.getHeight() + " Objetosc cylindra: " + cyl1.getVolume());
    }
}
