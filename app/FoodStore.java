package app;

public class FoodStore extends Store{
    private Date permitDate;

    public FoodStore(String name, int employeeCount, double employeeBaseSalary, Address storeAddress, Date foundationDate, int maximumProductCount, Date permitDate){
        super(name, employeeCount, employeeBaseSalary, storeAddress, foundationDate, maximumProductCount);
        this.permitDate = permitDate;
    }

    public Date getPermitDate(){
        return this.permitDate;
    }

    public void setPermitDate(Date permitDate){
        this.permitDate = permitDate;
    }

    public String toString(){
        return super.toString()
            + "\nPermit date: " + this.permitDate;
    }
}
