public class Author {
    private String name;
    private String surname;
    private int age;

    public Author(String n, String s, int a){
        name = n;
        surname = s;
        age = a;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getAge(){
        return age;
    }

    public void setSurname(String s){
        this.surname = s;
    }

    @Override
    public String toString() {
        return getClass().getName() + ": " + "name = %s, surname = %s, age = %s".formatted(name,surname,age);
    }
}
