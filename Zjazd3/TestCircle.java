public class TestCircle {

    public static void main(String args[]){
        Circle c1 = new Circle();
        Circle c2 = new Circle(1);
        Circle c3 = new Circle(5, "Green");
        Circle c4 = new Circle();

        c4.setRadius(10);
        c4.setColor("White");

        System.out.println("Circle1: \n" + "area = " + c1.getArea() + "\nradius = " + c1.getRadius());
        System.out.println(c1.toString());
        System.out.println();
        System.out.println("Circle2: \n" + "area = " + c2.getArea() + "\nradius = " + c2.getRadius());
        System.out.println(c2.toString());
        System.out.println();
        System.out.println("Circle3: \n" + "area = " + c3.getArea() + "\nradius = " + c3.getRadius());
        System.out.println(c3.toString());
        System.out.println();
        System.out.println("Circle4: \n" + "area = " + c4.getArea() + "\nradius = " + c4.getRadius());
        System.out.println(c4.toString());
    }
}
