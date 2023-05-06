package zad54;

public class Ebook extends Ksiazka{
    private int rozmiar;
    private String format;
    public Ebook(String tytul, String autor, int liczbaStron, int rozmiar, String format) {
        super(tytul, autor, liczbaStron);
        this.rozmiar = rozmiar;
        this.format = format;
    }
    public int getRozmiar(){
        return rozmiar;
    }
    public String getFormat(){
        return format;
    }
}
