import Classes.*;
import Unit.Player;

public class Main {
    public static void main(String[] args) {

        //Tworzymy obiekt hunter i obiekt player, a nastepnie przypisujemy obiektowi player obiekt hunter
        Hunter h1 = new Hunter();
        Player p1 = new Player();
        p1 = h1;

        //To samo co na gorze z wyjatkiem ze zamiast obiektu hunter mamy obiekt warrior
        Warrior w1 = new Warrior();
        Player p2 = new Player();
        p2 = w1;

        //No i obiekt mage
        Mage m1 = new Mage();
        Player p3 = new Player();
        p3 = m1;

        //Wyswietlanie statystyk postaci przed wyexpieniem na 40 lvl
        h1.showInfo();
        h1.showStats();

        w1.showInfo();
        w1.showStats();

        m1.showInfo();
        m1.showStats();


        //Rolowanie po 10 atakow z kazdej klasy na 1 lvl bez przydzialu punktow
        System.out.println("Hunter: ");
        for(int i = 0; i < 10; i ++){
            System.out.println((i + 1) + ". " + h1.getDmg());
        }

        System.out.println("Warrior: ");
        for(int i = 0; i < 10; i ++){
            System.out.println((i + 1) + ". " + h1.getDmg());
        }

        System.out.println("Mage: ");
        for(int i = 0; i < 10; i ++){
            System.out.println((i + 1) + ". " + h1.getDmg());
        }

        //Wylevelowanie kazdej z klasy do lvl 40 i przydzielenie punktow
        for (;;){
            if(h1.getLvl() < 40) {
                h1.addExp(90);
            }
            else if(w1.getLvl() < 40) {
                w1.addExp(90);
            }
            else if(m1.getLvl() < 40) {
                m1.addExp(90);
            }
            else {
                break;
            }
        }
        h1.addDexterity(250);
        h1.addStrength(100);
        h1.addAgility(25);
        h1.addDefence(25);

        w1.addStrength(250);
        w1.addAgility(100);
        w1.addDefence(50);

        m1.addIntelligence(300);
        m1.addDefence(100);

        //Ukazanie statystyk i rollowanie kolejnych 10 atakow z kazdej klasy
        h1.showStats();
        w1.showStats();
        m1.showStats();

        System.out.println("Hunter: ");
        for(int i = 0; i < 10; i ++){
            System.out.println((i + 1) + ". " + h1.getDmg());
        }

        System.out.println("Warrior: ");
        for(int i = 0; i < 10; i ++){
            System.out.println((i + 1) + ". " + h1.getDmg());
        }

        System.out.println("Mage: ");
        for(int i = 0; i < 10; i ++){
            System.out.println((i + 1) + ". " + h1.getDmg());
        }

        }

}
