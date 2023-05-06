package zad51;
import java.util.ArrayList;

public class TestArrayList {
    static long start=System.currentTimeMillis();
    public static void test(){
        ArrayList<Integer> liczby = new ArrayList<Integer>();
        for (int i = 2; i < 200; i = i + 2){
            liczby.add(i);
        }
        for(int i = 0; i < 50; i ++){
            System.out.println(i + ". " + liczby.get(i));
        }
        long stop=System.currentTimeMillis();
        System.out.println("Czas wykonania w milisekundach:" +(stop-start));
    }
}
