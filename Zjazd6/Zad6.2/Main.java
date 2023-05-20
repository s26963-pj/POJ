import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> test = new HashSet<>();
        test.add("Matt");
        test.add("Pat");
        test.add("Dziad");
        System.out.println(test);
        Object[] arr = test.toArray();
        System.out.println("The array is:");
        for(int i = 0; i < test.size(); i ++){
            System.out.println(arr[i]);
        }
    }
}