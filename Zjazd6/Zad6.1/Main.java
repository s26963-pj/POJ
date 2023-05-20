import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList test = new LinkedList<String>();
        test.add("Red");
        test.add("Green");
        test.add("Black");
        test.add("Pink");
        test.add("Orange");
        System.out.println(test);
        test.remove(test.getFirst());
        test.remove(test.getLast());
        System.out.println(test);
    }
}