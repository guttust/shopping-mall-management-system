package app;

public class JewelryStore extends Store{
    private double salesTarget;

    public JewelryStore(String name, int employeeCount, double employeeBaseSalary, Address storeAddress, Date foundationDate, int maximumProductCount, double salesTarget){
        super(name, employeeCount, employeeBaseSalary, storeAddress, foundationDate, maximumProductCount);
        this.salesTarget = salesTarget;
    }

    public double getSalesTarget(){
        return this.salesTarget;
    }

    public void setSalesTarget(double salesTarget){
        this.salesTarget = salesTarget;
    }

    public String toString(){
        return super.toString()
            + "\nSales target: " + this.salesTarget;
    }
}
