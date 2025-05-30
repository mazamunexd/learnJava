public class DivineVault { // Renamed from Bank. This class manages bank accounts.
  private AccountHolder accountOne; // An instance of AccountHolder (formerly CheckingAccount) for the first client.
  private AccountHolder accountTwo; // An instance of AccountHolder for the second client.

  public DivineVault() { // Constructor for DivineVault. Runs when a new DivineVault object is created.
    accountOne = new AccountHolder("Zeus", 100, "1"); // Creates a new AccountHolder object for Zeus by calling its constructor (lines 19-24).
    accountTwo = new AccountHolder("Hades", 200, "2"); // Creates a new AccountHolder object for Hades by calling its constructor (lines 19-24).
  }

  public static void main(String[] args) { // The main method where the program starts executing.
    DivineVault bankOfGods = new DivineVault(); // Creates a new DivineVault object, which in turn creates the accounts (calls the constructor on lines 7-10).

    // Using the name and ID for accountOne
    System.out.println("Account Holder: " + bankOfGods.accountOne.getName() + " (ID: " + bankOfGods.accountOne.getId() + ")"); // Prints the account holder's name and ID by calling getName() (line 42) and getId() (line 47).
    System.out.println("Initial Balance: " + bankOfGods.accountOne.getBalance()); // Prints Zeus's account balance by calling getBalance() (line 32) on the 'accountOne' object.

    bankOfGods.accountOne.setBalance(5000); // Sets Zeus's account balance to 5000 by calling setBalance() (line 37) on the 'accountOne' object.
    System.out.println("New Balance: " + bankOfGods.accountOne.getBalance()); // Prints Zeus's updated account balance by calling getBalance() (line 32) again.
    System.out.println("Monthly Interest: " + bankOfGods.accountOne.getMonthlyInterest()); // Prints Zeus's monthly interest by calling getMonthlyInterest() (line 40) on the 'accountOne' object.

    System.out.println("\n--- Hades' Account ---"); // Separator for Hades' account.
    // Using the name and ID for accountTwo
    System.out.println("Account Holder: " + bankOfGods.accountTwo.getName() + " (ID: " + bankOfGods.accountTwo.getId() + ")"); // Prints Hades' account holder's name and ID by calling getName() (line 42) and getId() (line 47).
    System.out.println("Balance: " + bankOfGods.accountTwo.getBalance()); // Prints Hades' account balance by calling getBalance() (line 32).
  }
}

class AccountHolder { // Renamed from CheckingAccount. This class defines an individual bank account.
  private String name; // Stores the account holder's name.
  private int balance; // Stores the current money in the account.
  private String id; // Stores the unique identification number for the account.
  private double interestRate; // Stores the annual interest rate for the account.

  public AccountHolder(String inputName, int inputBalance, String inputId) { // Constructor for AccountHolder. Runs when a new account is created.
    this.name = inputName; // Assigns the provided name to the account.
    this.balance = inputBalance; // Assigns the provided starting balance to the account.
    this.id = inputId; // Assigns the provided ID to the account.
    this.interestRate = 0.02; // Sets a default interest rate of 2% for the account.
  }

  public int getBalance() { // Public method to get the current account balance.
    return this.balance; // Returns the value of the 'balance' variable.
  }

  public void setBalance(int newBalance) { // Public method to change the account balance.
    this.balance = newBalance; // Updates the 'balance' variable with the 'newBalance' value.
  }

  public double getMonthlyInterest() { // Public method to calculate and get the monthly interest.
    return this.interestRate * this.balance; // Calculates interest by multiplying the interest rate by the balance.
  }

  public String getName() { // Public method to get the account holder's name.
    return this.name; // Returns the value of the 'name' variable.
  }

  public String getId() { // Public method to get the account's ID.
    return this.id; // Returns the value of the 'id' variable.
  }
}