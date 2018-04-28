 /**
 * Lab 7B: Comparable Interface.
 *
 * @author Jared R. Porter
 * @version 10/24/2016
 */
public class Customer implements Comparable<Customer> {
// instance variables
   private String name, location;
   private double balance;

// constructor

/**
 * Customer constructor.
 * @param nameIn sets name
 */
   public Customer(String nameIn) {
      name = nameIn; // sets name to parameter input
      location = ""; // sets location to empty string
      balance = 0; // sets balance to 0
   
   }
   
// methods

/**
 * Sets customer's location.
 * @param locationIn sets location
 */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   
/**
 * Sets customer's location.
 * @param city sets first part of location
 * @param state sets second part of location
 */
   public void setLocation(String city, String state) {
      location = city + ", " + state;
   }

/**
 * Add amount to balance.
 * @param amount added to balance
 */
   public void changeBalance(double amount) {
      balance += amount;
   }

/**
 * Return variable for location.
 * @return location
 */
   public String getLocation() {
      return location;
   }

/**
 * Return variable for balance.
 * @return balance
 */
   public double getBalance() {
      return balance;
   } 
   
/**
 * Print customer object to string.
 * @return customer.toString()
 */
   public String toString() {
      return name + "\n" + location + "\n$" + balance;
   }
  
/**
 * Compare Customer objects by balance.
 * @param obj is the compared object
 * @return 1, -1, or 0
 */ 
   public int compareTo(Customer obj) {
      
      if (this.balance > obj.getBalance()) {
         return 1;
      }
      
      else if (this.balance < obj.getBalance()) {
         return -1;
      }
      
      else {
         return 0;
      }
   }
}