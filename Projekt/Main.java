import java.util.Scanner;
import functions.*;

import static functions.Functions.*;


public class Main {
    public static void main(String[] args) {

        //Tworzymy obiekt user, klase i laczymy je ze soba. Klasa jest przypisana do postaci
        Player user1 = createUser();
        Classes class1 = createClass(user1);
        user1 = class1;

        //Atrybuty postaci oraz multiplikatory przed wyborem klasy
        System.out.println(infoUser(user1));
        System.out.println(infoClass(class1));

        //wybranie klasy Warrior i wyswietlenie statystyk uzytkownika oraz klasy
        class1.setWarrior();
        System.out.println(infoUser(user1));
        System.out.println(infoClass(class1));

        //Wylevelowanie klasy na lvl 10, przydzielenie punktow
        int j = 1;
        for (int i = 0; i < 9; i++){
            class1.addExp(30 * j);
            j = j * 2;
        }
        System.out.println(infoClass(class1));
        System.out.println(infoUser(user1));
        class1.addStr(50);
        class1.addAgil(30);
        class1.addDef(10);
        System.out.println(infoUser(user1));
        System.out.println(infoClass(class1));
        System.out.println();

        //Zabezpieczenie przed dodaniem wiekszej liczby pkt niz jest dostepna
        class1.addDef(1);

        //Reset na inna klase
        user1 = createUser();
        class1 = createClass(user1);
        user1 = class1;
        class1.setHunter();

        System.out.println(infoClass(class1));
        System.out.println(infoUser(user1));

        //System obrazen, uzytkownik atakuje 10 razy na 1 lvl

        for (int i = 0; i < 10; i ++){
            System.out.println(class1.getDmg());
        }

        //System obrazen, uzytkownik atakuje 10 razy na 10 lvl
        j = 1;
        for (int i = 0; i < 9; i++){
            class1.addExp(30 * j);
            j = j * 2;
        }
        System.out.println(infoClass(class1));
        class1.addDex(30);
        class1.addStr(60);
        for (int i = 0; i < 10; i ++){
            System.out.println(class1.getDmg());
        }
        //Jezeli nie wylosowano krytyka, to w Classes zmienic wartosc mnozenia danej statystyki, zeby uzyskac wiekszy %

    }
}
