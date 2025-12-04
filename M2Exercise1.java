package ph.com.bpi.hello;

public class M2Exercise1 {

    public static void main(String[] args) {
        // No-args constructor
        Car car1 = new Car("", "", 0);
        car1.brand = "Ford";
        car1.model = "Raptor";
        car1.year = 2024;

        // Parameterized constructor
        Car car2 = new Car("BYD", "Shark", 2025);

        // Call method
        car1.displayInfo();
        car2.displayInfo();
    }
}
