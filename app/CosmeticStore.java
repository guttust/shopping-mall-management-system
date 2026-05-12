package app;

public class CosmeticStore extends Store{
    private double commercializationFee;

    public CosmeticStore(String name, int employeeCount, double employeeBaseSalary, Address storeAddress, Date foundationDate, int maximumProductCount, double commercializationFee){
        super(name, employeeCount, employeeBaseSalary, storeAddress, foundationDate, maximumProductCount);
        this.commercializationFee = commercializationFee;
    }

    public double getCommercializationFee(){
        return this.commercializationFee;
    }

    public void setCommercializationFee(double commercializationFee){
        this.commercializationFee = commercializationFee;
    }

    public String toString(){
        return super.toString()
            + "\nCommercialization fee: " + this.commercializationFee;
    }
}
