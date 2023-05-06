import zad51.TestArrayList;
import zad52.MovablePoint;
import zad53.Coffee;
import zad54.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //zad 5.1
        TestArrayList.test();

        //zad 5.2
        MovablePoint p1 = new MovablePoint(0,0);
        p1.moveRight();
        p1.moveDown();
        System.out.println(p1.toString());

        //zad 5.3
        Coffee c1 = new Coffee();
        c1.CreateList();
        c1.GetListViaForeach();
        c1.GetList4Letters();

        //zad 5.4
        ArrayList<Ebook> e = new ArrayList<Ebook>();
        e.add(new Ebook("cTytul", "zAutor", 250, 25, "jpg"));
        e.add(new Ebook("bTytul", "xAutor", 270, 28, "jpg"));
        e.add(new Ebook("aTytul", "uAutor", 190, 18, "jpg"));

        ArrayList<KsiazkaPapierowa> kp = new ArrayList<KsiazkaPapierowa>();
        kp.add(new KsiazkaPapierowa("xTytul", "yAutor", 90, 1999));
        kp.add(new KsiazkaPapierowa("aATytul", "bAutor", 900, 1972));
        kp.add(new KsiazkaPapierowa("uTytul", "jAutor", 120, 2010));
    }
}
