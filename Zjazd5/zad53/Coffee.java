package zad53;
import java.util.ArrayList;
import java.util.Iterator;

public class Coffee {
    public ArrayList<String> kawy = new ArrayList<String>();
    public void CreateList(){
        kawy.add("espresso");
        kawy.add("latte");
        kawy.add("cappuccino");
        kawy.add("mocha");
        kawy.add("auLait");
        kawy.add("macchiato");
    }
    public void GetList(){
        for (int i = 0; i < kawy.size(); i ++){
            System.out.println(kawy.get(i));
        }
    }
    public void GetListViaIterator(){
        Iterator<String> coffee = kawy.iterator();
        while(coffee.hasNext()){
            System.out.println(coffee.next());
        }
    }
    public void GetListViaForeach(){
        for (String c : kawy){
            System.out.println(c);
        }
    }
    public void GetList4Letters(){
        for (int i = 0; i < kawy.size(); i ++){
            for (int j = 0; j < 4; j ++){
                System.out.print(kawy.get(i).charAt(j));
            }
            System.out.println();
        }
    }

}
