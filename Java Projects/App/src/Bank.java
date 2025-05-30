public class Bank { // This class will contain the main method

    public static void main(String[] args) {
        System.out.println("--- Welcome to the Bank Program ---");

        // Create instances (objects) of CheckingAccount
        CheckingAccount accountOne = new CheckingAccount("Zeus", 100);
        CheckingAccount accountTwo = new CheckingAccount("Hades", 200);
        CheckingAccount myAccount = new CheckingAccount("Mike", 300);

        System.out.println("\n--- Initial Account Information ---");
        myAccount.printBalance();
        accountOne.printBalance();
        accountTwo.printBalance(); // Display initial balance for accountTwo

        System.out.println("\n--- Performing Operations ---");

        // Using myAccount
        System.out.println("Processing for Mike's account (myAccount):");
        myAccount.addFunds(50); // Add funds to myAccount
        myAccount.printBalance();
        myAccount.getInfo(); // Get full info for myAccount

        System.out.println("\nProcessing for Zeus's account (accountOne):");
        accountOne.addFunds(75); // Add funds to accountOne
        accountOne.printBalance();
        accountOne.getInfo(); // Get full info for accountOne

        // *** Making use of accountTwo ***
        System.out.println("\nProcessing for Hades's account (accountTwo):");
        accountTwo.printBalance(); // Show balance before operation
        accountTwo.addFunds(120);  // Add funds to accountTwo
        accountTwo.printBalance(); // Show balance after adding funds
        accountTwo.getInfo();      // Get full info for accountTwo

        System.out.println("\n--- Program Finished ---");
    }
}

// The CheckingAccount class definition
class CheckingAccount {
    private String name;
    private int balance;

    // Constructor to initialize name and balance
    public CheckingAccount(String inputName, int inputBalance) {
        name = inputName;
        balance = inputBalance;
        System.out.println("New checking account created for " + name + " with initial balance of " + balance + " dollars.");
    }

    // Method to add funds (public to be callable from Bank class)
    public void addFunds(int fundsToAdd) {
        balance += fundsToAdd;
        System.out.println("SUCCESS: " + fundsToAdd + " dollars added to " + name + "'s account.");
    }

    // Method to print the account balance (public)
    public void printBalance() {
        System.out.println(name + "'s current account balance is " + balance + " dollars.");
    }

    // Method to get comprehensive account information (public to be callable from Bank class)
    public void getInfo() {
        System.out.println("DETAILS: This checking account belongs to " + name + ". It currently has " + balance + " dollars in it.");
    }
}

/*
 * This entire code block demonstrates a simple banking system with a Bank class and a CheckingAccount class.
 * It showcases how to create objects (instances) of a class, use constructors to initialize them,
 * and interact with their properties using getter and setter methods.
 *
 * The `Bank` class contains the `main` method, which is the starting point of the program.
 * It creates multiple `CheckingAccount` objects and performs operations on them.
 *
 * The `CheckingAccount` class defines the blueprint for a bank account.
 * It has:
 * - Instance variables (`name`, `balance`, `id`) to store account details.
 * - A constructor (`CheckingAccount`) to set initial values when a new account is created.
 * - A getter method (`getBalance`) to retrieve the current balance.
 * - A setter method (`setBalance`) to modify the account balance.
 
public class Bank {
    public static void main(String[] args) {
        // Creating two CheckingAccount objects (instances) using the constructor
        // Each object holds its own 'name', 'balance', and 'id'.
        CheckingAccount accountOne = new CheckingAccount("Zeus", 100, "1");
        CheckingAccount accountTwo = new CheckingAccount("Hades", 200, "2"); // accountTwo is created but not explicitly used in this example beyond creation.

        System.out.println("--- Account Operations ---");

        // Retrieving the initial balance of accountOne using the getBalance() method
        System.out.println("Initial balance for Zeus (accountOne): " + accountOne.getBalance() + " dollars.");

        // Modifying the balance of accountOne using the setBalance() method
        // This updates the 'balance' instance variable specifically for 'accountOne'.
        System.out.println("Setting new balance for Zeus (accountOne) to 5000 dollars.");
        accountOne.setBalance(5000);

        // Retrieving and printing the updated balance of accountOne
        System.out.println("Updated balance for Zeus (accountOne): " + accountOne.getBalance() + " dollars.");

        // Although accountTwo is created, no operations (like getting/setting balance) are performed on it in this main method.
        // It exists as a separate object with its own data.
    }
}

// This class defines the properties and behaviors of a bank checking account.
class CheckingAccount {
    // Instance variables: These store the unique data for each CheckingAccount object.
    // 'name' is public, meaning it can be accessed directly from outside the class.
    public String name;
    // 'balance' and 'id' are private, meaning they can only be accessed directly from within this class.
    // We use getter and setter methods to interact with private variables from outside.
    private int balance;
    private String id;

    // Constructor: This special method is called when a new CheckingAccount object is created.
    // It takes initial values (inputName, inputBalance, inputId) and assigns them
    // to the instance variables of the newly created object.
    public CheckingAccount(String inputName, int inputBalance, String inputId) {
        this.name = inputName;       // 'this.name' refers to the instance variable, 'inputName' is the parameter
        this.balance = inputBalance; // 'this' helps clarify that we're referring to the object's own 'balance'
        this.id = inputId;
        System.out.println("Account created for " + name + " with ID " + id + " and initial balance of " + balance + ".");
    }

    // Getter method for 'balance':
    // It allows other parts of the program to read the 'balance' value.
    // Since 'balance' is private, this is the controlled way to access it.
    public int getBalance() {
        return this.balance; // 'this.balance' explicitly refers to the instance's balance
    }

    // Setter method for 'balance':
    // It allows other parts of the program to change the 'balance' value.
    // This provides a controlled way to modify private data.
    public void setBalance(int newBalance) {
        System.out.println("Attempting to set balance for " + this.name + " to " + newBalance + ".");
        // We could add validation here, e.g., if (newBalance >= 0) { ... }
        this.balance = newBalance; // Assigns the 'newBalance' parameter value to the instance's 'balance'
    }

    // (Optional: You could add getter methods for 'name' and 'id' if you wanted them to be private,
    // or if you wanted to keep 'name' public but still offer a consistent way to access it.)
    // public String getId() { return this.id; }
    // public String getName() { return this.name; }
}

*/