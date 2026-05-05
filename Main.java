import app.Address;
import app.Date;
import app.Product;
import app.Store;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option = 0;
        Store createdStore = null;
        Product createdProduct = null;

        while (option != 3) {
            System.out.println("MENU:");
            System.out.println("Enter the number for the desired option:");
            System.out.println("[1] Create a Store");
            System.out.println("[2] Create a Product");
            System.out.println("[3] Exit");

            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                System.out.println("Enter the store name: ");
                String storeName = scanner.nextLine();

                System.out.println("Enter the number of employees: ");
                int employeeCount = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Enter the base employee salary: ");
                double employeeBaseSalary = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Enter the store address: ");
                System.out.println("Street name: ");
                String streetName = scanner.nextLine();

                System.out.println("City: ");
                String city = scanner.nextLine();

                System.out.println("State: ");
                String state = scanner.nextLine();

                System.out.println("Country: ");
                String country = scanner.nextLine();

                System.out.println("ZIP code: ");
                String zipCode = scanner.nextLine();

                System.out.println("Number: ");
                String number = scanner.nextLine();

                System.out.println("Complement: ");
                String complement = scanner.nextLine();

                System.out.println("Enter the store foundation date: ");
                System.out.println("Day: ");
                int foundationDay = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Month: ");
                int foundationMonth = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Year: ");
                int foundationYear = scanner.nextInt();
                scanner.nextLine();

                Address storeAddress = new Address(streetName, city, state, country, zipCode, number, complement);
                Date foundationDate = new Date(foundationDay, foundationMonth, foundationYear);

                createdStore = new Store(storeName, employeeCount, employeeBaseSalary, storeAddress, foundationDate);
            } else if (option == 2) {
                System.out.println("Enter the product name: ");
                String productName = scanner.nextLine();

                System.out.println("Enter the product price: ");
                double productPrice = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Enter the product expiration date: ");
                System.out.println("Day: ");
                int day = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Month: ");
                int month = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Year: ");
                int year = scanner.nextInt();
                scanner.nextLine();

                Date expirationDate = new Date(day, month, year);

                createdProduct = new Product(productName, productPrice, expirationDate);
            } else if (option == 3) {
                System.out.println("Exiting program...");
            } else {
                System.out.println("Invalid option");
            }

            if (createdStore != null && createdProduct != null && option != 3) {
                Date referenceDate = new Date(20, 10, 2023);

                if (createdProduct.isExpired(referenceDate)) {
                    System.out.println("EXPIRED PRODUCT");
                } else {
                    System.out.println("NOT EXPIRED PRODUCT");
                }

                System.out.println(createdStore);
            }
        }

        scanner.close();
    }
}
