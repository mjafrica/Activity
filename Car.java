package ph.com.bpi.hello;

//Create the Car class
public class Car {
 // Attributes
 String brand; 
 String model;
 int year;

 // Parameterized Constructor
 public Car(String brand, String model, int year) {
     this.brand = brand;
     this.model = model;
     this.year = year;
 }

 // Method
 public void displayInfo() {
	 System.out.println("********************");
	 System.out.println("*    CAR DETAILS   *");
	 System.out.println("********************");
	 System.out.println("Brand: " + brand);
     System.out.println("Model: " + model);
     System.out.println("Year:  " + year);

 }
}

