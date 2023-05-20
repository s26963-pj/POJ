import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> months = new HashMap<Integer, String>();
        months.put(1, "January");
        months.put(2, "February");
        months.put(3, "March");
        months.put(4, "April");
        months.put(5, "May");
        months.put(6, "June");
        months.put(7, "July");
        months.put(8, "August");
        months.put(9, "September");
        months.put(10, "October");
        months.put(11, "November");
        months.put(12, "December");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number from 1 to 12: ");
        Integer choice = input.nextInt();

        switch (choice){
            case 1:
                System.out.println("This is January");
                break;
            case 2:
                System.out.println("This is February");
                break;
            case 3:
                System.out.println("This is March");
                break;
            case 4:
                System.out.println("This is April");
                break;
            case 5:
                System.out.println("This is May");
                break;
            case 6:
                System.out.println("This is June");
                break;
            case 7:
                System.out.println("This is July");
                break;
            case 8:
                System.out.println("This is August");
                break;
            case 9:
                System.out.println("This is September");
                break;
            case 10:
                System.out.println("This is October");
                break;
            case 11:
                System.out.println("This is November");
                break;
            case 12:
                System.out.println("This is December");
                break;
            default:
                System.out.println("That type of month does not exists");
        }
        System.out.println("All months: " + months);
    }
}