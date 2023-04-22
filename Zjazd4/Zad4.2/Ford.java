public class Ford extends Car implements Purchase{

    //Atrybuty klasy Ford
    private int year;
    private int manuacturerDiscount;

    //Metody klasy Ford
    public Ford(int speed, double regularPrice, String color, int y, int mD){
        super(speed, regularPrice, color);
        year = y;
        manuacturerDiscount = mD;
    }
    public int getYear(){
        return year;
    }
    public int getManuacturerDiscount(){
        return manuacturerDiscount;
    }
    public double getSalePrice(){
        double x = super.getSalePrice() - manuacturerDiscount;
        return x;
    }
    public String getPurchaseInfo(){
        return ("FORD: ");
    }
}
