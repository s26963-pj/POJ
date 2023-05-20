import java.util.TreeSet;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //punkt a
        TreeSet<String> tree1 = new TreeSet<>();
        tree1.add("Black");
        tree1.add("White");
        tree1.add("Blue");
        tree1.add("Green");
        tree1.add("Red");
        System.out.println(tree1);
        System.out.println();

        //punkt b
        for(String value : tree1){
            System.out.println(value + ", ");
        }
        System.out.println();

        //punkt c
        TreeSet<String> tree2 = new TreeSet<>();
        tree2.add("Purple");
        tree2.add("Orange");
        tree2.add("Yellow");
        System.out.println(tree2);
        System.out.println();

        tree1.addAll(tree2);
        System.out.println(tree1);
        System.out.println();
        Object[] arr = tree1.toArray();

        //punkt d.
        for(int i = tree1.size() - 1; i >= 0; i--){
            System.out.println(arr[i]);
        }
        System.out.println();

        //punkt e
        System.out.println(tree1.first() + ", " + tree1.last());
        System.out.println();

        //punkt f
        Object tree3 = tree1.clone();
        System.out.println(tree3);
        System.out.println();

        //punkt g
        System.out.println(tree1);
        System.out.println(tree1.size());
        System.out.println();

        //punkt h
        System.out.println(tree1);
        System.out.println(tree2);
        Object[] objtree1 = tree1.toArray();
        Object[] objtree2 = tree2.toArray();
        for(int i = 0; i < tree1.size(); i ++){
            if(i > tree2.size() - 1){
                break;
            }
            else{
                if(objtree1[i] == objtree2[i]){
                    System.out.println("Yes");
                }
                else
                {
                    System.out.println("No");
                }
            }
        }

    }
}