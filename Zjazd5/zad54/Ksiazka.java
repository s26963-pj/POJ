package zad54;
public class Ksiazka {
    private String tytul;
    private String autor;
    private int liczbaStron;
    public Ksiazka(String tytul, String autor, int liczbaStron){
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
    }
    public String getTytul(){
        return tytul;
    }
    public String getAutor(){
        return autor;
    }
    public int getLiczbaStron(){
        return liczbaStron;
    }
}
