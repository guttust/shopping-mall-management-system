package app;

public class Product {
    private String name;
    private double price;
    private Date expirationDate;

    public Product(String name, double price, Date expirationDate) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String toString() {
        return "Product: " + this.name
            + "\nPrice: " + this.price
            + "\nExpiration date: " + this.expirationDate;
    }

    public boolean isExpired(Date currentDate) {
        if (this.expirationDate.getYear() < currentDate.getYear()) {
            return true;
        } else if (this.expirationDate.getYear() == currentDate.getYear()) {
            if (this.expirationDate.getMonth() < currentDate.getMonth()) {
                return true;
            } else if (this.expirationDate.getMonth() == currentDate.getMonth() && this.expirationDate.getDay() < currentDate.getDay()) {
                return true;
            }
        }

        return false;
    }
}
