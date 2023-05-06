package zad54;

public class KsiazkaPapierowa extends Ksiazka{
    private int rokWydania;
    public KsiazkaPapierowa(String tytul, String autor, int liczbaStron, int rokWydania) {
        super(tytul, autor, liczbaStron);
        this.rokWydania = rokWydania;
    }
    public int getRokWydania(){
        return rokWydania;
    }
}
