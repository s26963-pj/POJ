package zad52;
public class MovablePoint implements Movable{

    //Atrybuty klasy MovablePoint
    private int x;
    private int y;
    //Metody klasy MovablePoint
    public MovablePoint(int x, int y){
        x = this.x;
        y = this.y;
    }
    public void moveUp() {
        y = y + 1;
    }
    public void moveDown() {
        y = y - 1;
    }
    public void moveLeft() {
        x = x - 1;
    }
    public void moveRight() {
        x = x + 1;
    }
    public String toString(){
        return "Twoje polozenie to: \n" + "x: " + x + "\ny: " + y;
    }
}
