public class Car {

    // Instance Variables (Attributes of a Car)
    String carBrand;
    String carModel;
    int carYear;
    String carColor;

    // Constructor 1: Default Constructor
    // This constructor is used when you create a Car object without providing specific details.
    public Car() {
        System.out.println("A new car object is being created (default constructor called).");
        carBrand = "Unknown"; // Default brand
        carModel = "Unknown"; // Default model
        carYear = 2024;      // Default year
        carColor = "White";  // Default color
    }

    // Constructor 2: Parameterized Constructor
    // This constructor is used when you create a Car object and provide initial details.
    public Car(String brand, String model, int year, String color) {
        System.out.println("A new car object is being created with specific details (parameterized constructor called).");
        carBrand = brand;   // Assigning the parameter 'brand' to the instance variable 'carBrand'
        carModel = model;   // Assigning the parameter 'model' to the instance variable 'carModel'
        carYear = year;
        carColor = color;
    }

    // Instance Method (Behavior of a Car)
    // This method displays information about the car.
    public void displayCarInfo() {
        System.out.println("--- Car Information ---");
        System.out.println("Brand: " + carBrand);
        System.out.println("Model: " + carModel);
        System.out.println("Year: " + carYear);
        System.out.println("Color: " + carColor);
        System.out.println("-----------------------");
    }

    // Main Method (Where we run our code)
    public static void main(String[] args) {

        System.out.println("Starting the Car program...\n");

        // --- Creating Instances (objects) of the Car class ---

        // Using the default constructor to create Car 1
        System.out.println("Creating Car 1:");
        Car car1 = new Car(); // This calls the default constructor
        car1.displayCarInfo(); // Display car1's information
        System.out.println();

        // Using the parameterized constructor to create Car 2
        System.out.println("Creating Car 2:");
        Car car2 = new Car("Toyota", "Camry", 2023, "Blue"); // This calls the parameterized constructor
        car2.displayCarInfo(); // Display car2's information
        System.out.println();

        System.out.println("Creating Car 3:");
        Car car3 = new Car("Honda", "Civic", 2025, "Red");
        car3.displayCarInfo();
        System.out.println();

        // You can also change the attributes of an existing car object
        System.out.println("Updating Car 1's information:");
        car1.carBrand = "Nissan";
        car1.carModel = "Altima";
        car1.carYear = 2022;
        car1.carColor = "Silver";
        car1.displayCarInfo();
        System.out.println();

        System.out.println("Car program finished.");
    }
}