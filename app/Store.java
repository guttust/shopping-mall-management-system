package app;

public class Store {
    private String name;
    private int employeeCount;
    private double employeeBaseSalary;
    private Address storeAddress;
    private Date foundationDate;

    public Store(String name, int employeeCount, double employeeBaseSalary, Address storeAddress, Date foundationDate) {
        this.name = name;
        this.employeeCount = employeeCount;
        this.employeeBaseSalary = employeeBaseSalary;
        this.storeAddress = storeAddress;
        this.foundationDate = foundationDate;
    }

    public Store(String name, int employeeCount) {
        this.name = name;
        this.employeeCount = employeeCount;
        this.employeeBaseSalary = -1.0;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeCount() {
        return this.employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public double getEmployeeBaseSalary() {
        return this.employeeBaseSalary;
    }

    public void setEmployeeBaseSalary(double employeeBaseSalary) {
        this.employeeBaseSalary = employeeBaseSalary;
    }

    public Address getStoreAddress() {
        return this.storeAddress;
    }

    public void setStoreAddress(Address storeAddress) {
        this.storeAddress = storeAddress;
    }

    public Date getFoundationDate() {
        return this.foundationDate;
    }

    public void setFoundationDate(Date foundationDate) {
        this.foundationDate = foundationDate;
    }

    public String toString() {
        return "Store: " + this.name
            + "\nEmployee count: " + this.employeeCount
            + "\nEmployee base salary: " + this.employeeBaseSalary
            + "\nAddress: " + this.storeAddress
            + "\nFoundation date: " + this.foundationDate;
    }

    public double calculateSalaryExpenses() {
        if (this.employeeBaseSalary == -1.0) {
            return -1.0;
        } else {
            return this.employeeCount * this.employeeBaseSalary;
        }
    }

    public char getStoreSize() {
        if (this.employeeCount < 10) {
            return 'S';
        } else if (this.employeeCount >= 10 && this.employeeCount <= 30) {
            return 'M';
        } else {
            return 'L';
        }
    }
}
