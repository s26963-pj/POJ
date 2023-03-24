public class Vehicle {
    private int passengers;
    private float fuelcap;
    private float lkm;

    public int GetPassengers(){ return passengers;}
    public float GetFuelCap(){return fuelcap;}
    public float GetLkm(){return lkm;}
    public void SetPassengers(int passengers){this.passengers = passengers;}
    public void SetFuelCap(float fuelcap){this.fuelcap = fuelcap;}
    public void SetLkm(float lkm){this.lkm = lkm;}

    public float range(float fuelcap, float lkm){
        return ((fuelcap / lkm)*100);
    }
    public float howmuch(float howmuchkm, float lkm){
        float lkm1 = lkm / 100;
        return (howmuchkm * lkm1);
    }
}
