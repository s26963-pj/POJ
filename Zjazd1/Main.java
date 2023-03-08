import java.io.EOFException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args){
        zad1();
        System.out.println();
        zad2();
        System.out.println();
        zad3();
        System.out.println();
        zad4();
        System.out.println();
        zad5();
        System.out.println();
        zad6();
        System.out.println();
        zad7();
        System.out.println();
        zad8();
        System.out.println();
        zad10();
        System.out.println();
        zad11();
        System.out.println();
        zad13();
    }
    public static void zad1(){
        System.out.println("============Zadanie 1============");
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj a: ");
        float a = input.nextFloat();

        System.out.print("Podaj b: ");
        float b = input.nextFloat();
        float ab = a * b;
        System.out.print("Pole prostokata: " + ab);
        System.out.println();

    }
    public static void zad2(){
        System.out.println("============Zadanie 2============");
        System.out.print("Pierwiastek z liczby 2 = " + String.format("%.2f",Math.sqrt(Math.PI)));
        System.out.println();
    }

    public static void zad3(){
        System.out.println("============Zadanie 3============");
        Scanner input1 = new Scanner(System.in);
        String x = input1.next();
        String y = input1.next();
        System.out.println("%" + y + " " + x + "%");
    }

    public static void zad4(){
        System.out.println("============Zadanie 4============");
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadz dlugosci bokow trojkata: ");
        System.out.print("a: ");
        float a = input.nextFloat();

        System.out.print("b: ");
        float b = input.nextFloat();

        System.out.print("c: ");
        float c = input.nextFloat();

        if (a <= 0 || b <= 0 || c <= 0){
            System.out.println("BLAD");
        }
        else if (a + b > c)
        {
            System.out.println("TAK");
        }
        else if (b + c > a)
        {
            System.out.println("TAK");
        }
        else if (a + c > b)
        {
            System.out.println("TAK");
        }
        else
        {
            System.out.println("NIE");
        }
    }

    public static void zad5(){
        System.out.println("============Zadanie 5============");
        Scanner input = new Scanner(System.in);
        int miesiac = input.nextInt();

        switch (miesiac){
            case 1:
                System.out.println("Styczen: 31 dni");
                break;
            case 2:
                System.out.println("Luty: 28 dni");
                break;
            case 3:
                System.out.println("Marzec: 31 dni");
                break;
            case 4:
                System.out.println("Kwiecien: 30 dni");
                break;
            case 5:
                System.out.println("Maj: 31 dni");
                break;
            case 6:
                System.out.println("Czerwiec: 30 dni");
                break;
            case 7:
                System.out.println("Lipiec: 31 dni");
                break;
            case 8:
                System.out.println("Sierpien: 31 dni");
                break;
            case 9:
                System.out.println("Wrzesien: 30 dni");
                break;
            case 10:
                System.out.println("Pazdziernik: 31 dni");
                break;
            case 11:
                System.out.println("Listopad: 30 dni");
                break;
            case 12:
                System.out.println("Grudzien: 31 dni");
                break;
            default:
                System.out.println("BLAD");
        }

    }

    public static void zad6(){
        System.out.println("============Zadanie 6============");
        Scanner input = new Scanner(System.in);
        double[] tab = new double[3];
        for (int i = 0; i < 3; i ++){
            System.out.print("Wprowadz liczbe nr " + i + ": ");
            tab[i] = input.nextDouble();
        }
        double x;
        for (int i = 0; i < 3; i ++) {
            if (tab[1] > tab[0]) {
                x = tab[0];
                tab[0] = tab[1];
                tab[1] = x;

            }
            if (tab[2] > tab[1]) {
                x = tab[1];
                tab[1] = tab[2];
                tab[2] = x;

            }
        }
        System.out.println(tab[0] + " " + tab[1] + " " + tab[2]);
        System.out.println(tab[2] + " " + tab[1] + " " + tab[0]);




    }

    public static void zad7(){
        System.out.println("============Zadanie 7============");
        int[] tab1 = new int[3];
        int[] tab2 = new int[3];

        Scanner input = new Scanner(System.in);
        int x, y;
        int iloczyn_skal = 0;

        for (int i = 0; i < 3; i ++){
            x = input.nextInt();
            y = input.nextInt();
            if(x <= 0 || y <= 0){
                System.out.println("BLAD");
                System.exit(0);
            }
            iloczyn_skal = iloczyn_skal + x * y;
        }
        System.out.println("Iloczyn skalarny = " + iloczyn_skal);
    }

    public static void zad8() {
        System.out.println("============Zadanie 8============");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = x; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = x; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void zad10(){
        System.out.println("============Zadanie 10============");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        int[][] tab = new int[a][b];
        for (int i = 0; i < a; i ++){
            for (int j = 0; j < b; j ++){
                tab[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < b; i ++){
            for (int j = 0; j < a; j ++){
                System.out.print(tab[j][i] + " ");
            }
            System.out.println();
        }

    }

    public static void zad11(){
        System.out.println("============Zadanie 11============");
        int year_to_sec_Earth = 31557600;
        double year_Merc_Earth = 0.2408467;
        double year_to_sec_Mercure = year_to_sec_Earth * year_Merc_Earth;
        double year_Wenus_Earth = 0.61519726;
        double year_to_sec_Wenus = year_to_sec_Earth * year_Wenus_Earth;
        double year_Mars_Earth = 1.8808158;
        double year_to_sec_Mars = year_to_sec_Earth * year_Mars_Earth;
        double year_Jowisz_Earth = 11.862615;
        double year_to_sec_Jowisz = year_to_sec_Earth * year_Jowisz_Earth;
        double year_Saturn_Earth = 29.447498;
        double year_to_sec_Saturn = year_to_sec_Earth * year_Saturn_Earth;
        double year_Uranos_Earth = 84.016846;
        double year_to_sec_Uranos = year_to_sec_Earth * year_Uranos_Earth;
        double year_Neptun_Earth = 164.79132;
        double year_to_sec_Neptun = year_to_sec_Earth * year_Neptun_Earth;

        Scanner input = new Scanner(System.in);

        int precision = 2;
        System.out.println("Podaj wiek w sekundach: ");
        double x = input.nextDouble();
        BigDecimal bigDecimal = new BigDecimal(x / year_to_sec_Earth);
        System.out.println("Twoj wiek w latach na Ziemii: " + bigDecimal.setScale(precision, RoundingMode.HALF_UP));
        bigDecimal = new BigDecimal(x / year_to_sec_Mercure);
        System.out.println("Twoj wiek w latach na Merkurze: " + bigDecimal.setScale(precision, RoundingMode.HALF_UP));
        bigDecimal = new BigDecimal(x / year_to_sec_Wenus);
        System.out.println("Twoj wiek w latach na Wenusie: " + bigDecimal.setScale(precision, RoundingMode.HALF_UP));
        bigDecimal = new BigDecimal(x / year_to_sec_Mars);
        System.out.println("Twoj wiek w latach na Marsie: " + bigDecimal.setScale(precision, RoundingMode.HALF_UP));
        bigDecimal = new BigDecimal(x / year_to_sec_Jowisz);
        System.out.println("Twoj wiek w latach na Jowiszu: " + bigDecimal.setScale(precision, RoundingMode.HALF_UP));
        bigDecimal = new BigDecimal(x / year_to_sec_Saturn);
        System.out.println("Twoj wiek w latach na Saturnie: " + bigDecimal.setScale(precision, RoundingMode.HALF_UP));
        bigDecimal = new BigDecimal(x / year_to_sec_Uranos);
        System.out.println("Twoj wiek w latach na Uranosie: " + bigDecimal.setScale(precision, RoundingMode.HALF_UP));
        bigDecimal = new BigDecimal(x / year_to_sec_Neptun);
        System.out.println("Twoj wiek w latach na Neptunie: " + bigDecimal.setScale(precision, RoundingMode.HALF_UP));


    }

    public static void zad13(){
        System.out.println("============Zadanie 13============");
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj ile elementow ma znajdowac sie w tablicy: ");
        int x = input.nextInt();

        Random generator = new Random();
        int[] tab = new int[x];

        for (int i = 0; i < x; i ++){
            tab[i] = generator.nextInt(100);
        }
        for (int i = 0; i < x; i ++){
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.stream(tab).max());

    }
}