public class Dog {

    // 1. Instance Field: This is a characteristic that each Dog object will have.
    String name;

    // 2. Constructor: This is a special method called when you create a new Dog object.
    //    It initializes the instance field 'name'.
    public Dog(String dogName) {
        this.name = dogName; // 'this.name' refers to the instance field, 'dogName' is the argument.
        System.out.println(this.name + " the dog has been created!");
    }

    // 3. Method: This is an action that a Dog object can perform.
    //    It takes an argument 'sound' and doesn't return anything (void).
    public void bark(String sound) {
        System.out.println(this.name + " barks: " + sound);
    }

    // 4. main method with args: The entry point of our program.
    //    'args' is an array of String arguments that can be passed when running the program.
    public static void main(String[] args) {

        // --- Using the instance field, constructor, and method ---

        // Create a new Dog object using the constructor
        Dog myDog = new Dog("Buddy");

        // Call the 'bark' method on the 'myDog' object, passing "Woof!" as an argument
        myDog.bark("Woof!");

        // Create another Dog object
        Dog neighborDog = new Dog("Lucy");
        neighborDog.bark("Yap yap!");

        System.out.println("\n--- Handling command line arguments (args) ---");

        // Check if any command line arguments were provided
        if (args.length > 0) {
            System.out.println("You passed " + args.length + " command line argument(s):");
            // Loop through and print each argument
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }

            // You could even use an argument to name a new dog!
            Dog commandLineDog = new Dog(args[0]);
            commandLineDog.bark("Arf!");

        } else {
            System.out.println("No command line arguments were provided.");
            System.out.println("Try running: java Dog MyNewDogName AnotherArg");
        }
    }
}