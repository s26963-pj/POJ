public class AutoShop {
    public static void main(String[] args) {
        Sedan s1 = new Sedan(160, 20000, "red", 5);
        Ford f1 = new Ford(155, 4452.0, "black", 2007, 10);
        Ford f2 = new Ford(220, 35000, "blue", 2015, 5);
        Truck t1 = new Truck(90, 100000, "white", 10000);

        //Wypisywanie informacji o sedanie
        System.out.println(s1.getPurchaseInfo());
        System.out.println("- speed = " + s1.getSpeed());
        System.out.println("- regularPrice = " + s1.getRegularPrice());
        System.out.println("- color = " + s1.getColor());
        System.out.println("- length = " + s1.getLength());

        System.out.println();
        //Wypisywanie informacji o Fordzie 1
        System.out.println(f1.getPurchaseInfo());
        System.out.println("- speed = " + f1.getSpeed());
        System.out.println("- regularPrice = " + f1.getRegularPrice());
        System.out.println("- color = " + f1.getColor());
        System.out.println("- year = " + f1.getYear());
        System.out.println("- manufacturerDiscount = " + f1.getManuacturerDiscount());

        System.out.println();
        //Wypisywanie informacji o Fordzie 2
        System.out.println(f2.getPurchaseInfo());
        System.out.println("- speed = " + f2.getSpeed());
        System.out.println("- regularPrice = " + f2.getRegularPrice());
        System.out.println("- color = " + f2.getColor());
        System.out.println("- year = " + f2.getYear());
        System.out.println("- manufacturerDiscount = " + f2.getManuacturerDiscount());

        System.out.println();
        //Wypisywanie informacji o Ciezarowce
        System.out.println(t1.getPurchaseInfo());
        System.out.println("- speed = " + t1.getSpeed());
        System.out.println("- regularPrice = " + t1.getRegularPrice());
        System.out.println("- color = " + t1.getColor());
        System.out.println("- year = " + t1.getWeight());

        System.out.println();
        //Wypisywanie informacji o kosztach
        System.out.println(s1.getPurchaseInfo() + s1.getSalePrice());
        System.out.println(f1.getPurchaseInfo() + f1.getSalePrice());
        System.out.println(f2.getPurchaseInfo() + f2.getSalePrice());
        System.out.println(t1.getPurchaseInfo() + t1.getSalePrice());
    }
}
