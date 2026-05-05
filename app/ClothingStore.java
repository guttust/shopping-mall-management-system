package app;

public class ClothingStore extends Store {
    private boolean importedProducts;

    public ClothingStore(String name, int employeeCount, double employeeBaseSalary, Address storeAddress, Date foundationDate, boolean importedProducts) {
        super(name, employeeCount, employeeBaseSalary, storeAddress, foundationDate);
        this.importedProducts = importedProducts;
    }

    public boolean getImportedProducts() {
        return this.importedProducts;
    }

    public void setImportedProducts(boolean importedProducts) {
        this.importedProducts = importedProducts;
    }

    public String toString() {
        return super.toString()
            + "\nImported products: " + this.importedProducts;
    }
}
