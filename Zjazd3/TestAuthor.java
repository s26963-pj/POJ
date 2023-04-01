public class TestAuthor {
    public static void main(String[] args){

        Author a1 = new Author("Mateusz", "Szotynski", 20);

        System.out.println("name: " + a1.getName() + "\nsurname: " + a1.getSurname() + "\nage: " + a1.getAge());
        a1.setSurname("Kowalski");
        System.out.println();
        System.out.println(a1.toString());

    }
}
