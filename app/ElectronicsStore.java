package app;

public class ElectronicsStore extends Store{
    private double electronicsInsurance;

    public ElectronicsStore(String name, int employeeCount, double employeeBaseSalary, Address storeAddress, Date foundationDate, int maximumProductCount, double electronicsInsurance){
        super(name, employeeCount, employeeBaseSalary, storeAddress, foundationDate, maximumProductCount);
        this.electronicsInsurance = electronicsInsurance;
    }

    public double getElectronicsInsurance(){
        return this.electronicsInsurance;
    }

    public void setElectronicsInsurance(double electronicsInsurance){
        this.electronicsInsurance = electronicsInsurance;
    }

    public String toString(){
        return super.toString()
            + "\nElectronics insurance value: " + this.electronicsInsurance;
    }
}
