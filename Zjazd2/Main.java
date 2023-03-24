import javax.lang.model.type.NullType;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        zad2A11A12A13A14A15();
    }
    public static void zad2A1(){
        MyData myData = new MyData();

        myData.setName("Mateusz");
        myData.setSurname("Szotynski");
        myData.setGroup(5);
        myData.setFaculty("Future AI");


        System.out.println("Imie: " + myData.getName());
        System.out.println("Nazwisko: " + myData.getSurname());
        System.out.println("Grupa: " + myData.getGroup());
        System.out.println("Kierunek: " + myData.getFaculty());
    }

    public static void zad2A2(){
        MyData myData = new MyData();
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj imie:");
        myData.setName(input.nextLine());

        System.out.println("Podaj nazwisko:");
        myData.setSurname(input.nextLine());

        System.out.println("Podaj kierunek:");
        myData.setFaculty(input.nextLine());

        System.out.println("Podaj grupe:");
        myData.setGroup(input.nextInt());

        System.out.println("Imie: " + myData.getName());
        System.out.println("Nazwisko: " + myData.getSurname());
        System.out.println("Grupa: " + myData.getGroup());
        System.out.println("Kierunek: " + myData.getFaculty());
    }

    public static void zad2A3(){
        System.out.println("Primitive types in Java:");
        System.out.println();

        short s = 0;
        System.out.println("short s = " + s);
        System.out.println();

        int i = 0;
        System.out.println("int i = " + i);
        System.out.println();

        long l = 0l;
        System.out.println("long l = " + l);
        System.out.println();

        float f = 0.0f;
        System.out.println("float f = " + f);
        System.out.println();

        double d = 0.0d;
        System.out.println("double d = " + d);
        System.out.println();

        String str = null;
        System.out.println("string str = " + str);
        System.out.println();
    }

    public static void zad2A4(){
        String str1 = "napis";
        String str2 = "napis";

        System.out.println("str1.equals(str2): " + str1.equals(str2));
    }

    public static void zad2A5(){
        int x = 5;
        int y = 10;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        x = x + 1;
        System.out.println("++x = " + x );
        System.out.println("y++ = " + y );
        y = y + 1;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("================================");

        float w = 33.5f;
        float z = 17.3f;

        System.out.println("w = " + w);
        System.out.println("z = " + z);
        System.out.println("w + z = " + (w + z));
        System.out.println("w - z = " + (w - z));
        System.out.println("w * z = " + (w * z));
        System.out.println("w / z = " + (w / z));
        System.out.println("w % z = " + (w % z));
        System.out.println("================================");

        int m = 3;
        int n = 17;
        int o = 10;

        System.out.println("m < n = " + (m < n));
        System.out.println("m > o = " + (m > o));
        System.out.println("n <= o = " + (n <= o));
        System.out.println("m >= n = " + (m >= n));
        System.out.println("n == o = " + (n == o));
        System.out.println("m != o = " + (m != o));

    }

    public static void zad2A6(){
        Random generator = new Random();

        int[][] tab = new int[3][3];
        for (int i = 0; i < 3; i ++){
            for (int j = 0; j < 3; j ++){
                tab[i][j] = generator.nextInt(10);
            }
        }
        for (int i = 0 ; i < 3; i ++){
            for (int j = 0; j < 3; j ++){
                System.out.print(tab[i][j]);
            }
            System.out.println();
        }
        int x;
        for (int i = 0; i < 3 ; i ++){
            x = tab[0][i];
            tab[0][i] = tab[2][i];
            tab[2][i] = x;
        }
        System.out.println("===================");
        for (int i = 0 ; i < 3; i ++){
            for (int j = 0; j < 3; j ++){
                System.out.print(tab[i][j]);
            }
            System.out.println();
        }
    }

    public static void zad2A7(){
        float promien = 0;
        float wysokosc = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj promien walca: ");
        promien = input.nextFloat();

        System.out.println("Podaj wysokosc walca: ");
        wysokosc = input.nextFloat();

        double pojemnosc = Math.PI*((promien*promien)*wysokosc);
        pojemnosc = (double)Math.round(pojemnosc * 100) / 100;
        System.out.println("Pojemnosc walca wynosi: " + pojemnosc);
    }
    public static void zad2A8(){
        boolean p = true;
        boolean q = true;
        boolean xor = (p&&!q || !p&&q);
        boolean and = (p&&q);
        boolean or = (p||q);
        boolean not = (p!=q);
        String double_space = "\t\t";
        String space = "\t";
        System.out.println("P" + double_space + "Q" + double_space + "AND" + double_space + "OR" + double_space + "XOR" + double_space +"NOT");
        System.out.println(p + space + q + space + and + space + or + space + xor + space + not);
        q = false;
        and = (p&&q);
        or = (p||q);
        not = (p!=q);
        xor = (p&&!q || !p&&q);
        System.out.println(p + space + q + space + and + space + or + space + xor + space + not);
        p = false;
        q = true;
        and = (p&&q);
        or = (p||q);
        not = (p!=q);
        xor = (p&&!q || !p&&q);
        System.out.println(p + space + q + space + and + space + or + space + xor + space + not);
        q = false;
        and = (p&&q);
        or = (p||q);
        not = (p!=q);
        xor = (p&&!q || !p&&q);
        System.out.println(p + space + q + space + and + space + or + space + xor + space + not);
    }

    public static void zad2A9(){
        char los = 'z';
        char guess = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Pomyslalem litere z przedzialu od a - z");
        System.out.println("Odgadnij ja: ");
        while (guess != los){
            guess = input.next(".").charAt(0);
            if (guess > los){
                System.out.println("Wartosc tej litery jest za duza");
            } else if(guess < los) {
                System.out.println("Wartosc tej litery jest za mala");
            } else {
                System.out.println("Brawo! Odgadles!");
            }
        }
    }

    public static void zad2A10(){
        double x = 2;
        double wynik = 0;
        for (int i = 0; i <= 14; i++){
            wynik = Math.pow(x, i);
            System.out.println("2 do potegi: " + i + " = " + wynik);
        }
    }

    public static void zad2A11A12A13A14A15(){
        Vehicle miniVan = new Vehicle();
        Vehicle sportsCar = new Vehicle() ;

        miniVan.SetPassengers(7);
        miniVan.SetLkm(9.6f);
        miniVan.SetFuelCap(90);

        sportsCar.SetPassengers(2);
        sportsCar.SetLkm(17.6f);
        sportsCar.SetFuelCap(50);

        System.out.println("Minivan przewozi: " + miniVan.GetPassengers() +
                " osob na odleglosc do: " + Math.round(miniVan.range(miniVan.GetFuelCap(), miniVan.GetLkm())));
        System.out.println("Auto sportowe przewozi: " + sportsCar.GetPassengers() +
                " osob na odleglosc do: " + Math.round(sportsCar.range(sportsCar.GetFuelCap(), sportsCar.GetLkm())));
        /*w atrybut o nazwie: "howmuchkm" wpisujemy odleglosc aby dowiedziec sie ile dany pojazd potrzebuje litrow paliwa */
        System.out.println("Minivan potrzebuje: " + miniVan.howmuch(300, miniVan.GetLkm()) + " litrow");
        System.out.println("Auto sportowe potrzebuje: " + sportsCar.howmuch(300, sportsCar.GetLkm()) + " litrow");
    }

}
