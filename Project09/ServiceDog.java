/**
 * Derived from Dog class.
 *
 * @author Jared R. Porter
 * @version 11/10/2016
 */
public class ServiceDog extends Dog {
// instance variables
   private String service;
   private String[] commands;

// class variables

/**
 * Constant rate for service dogs.
 */
   public static final double BASE_RATE = 13;
   
// constructor
/**
 * The ServiceDog class must contain a constructor that accepts seven
 * parameters representing the five values for the instance fields in
 * the Pet class (owner, name, breed, weight, and days) and two for the
 * instance fields declared in ServiceDog. Since this class is a subclass
 * of Dog, the super constructor should be called with five values for Dog.
 * The instance variables for service and commands should be set with the
 * last two parameters. Below is an example of how the constructor could
 * be used to create a ServiceDog object. Note that the arguments "sit",
 * "down", "stay", "come", "around", "forward", "right", "left" are matched
 * with commands, which is a variable length parameter in the constructor
 * header (i.e., String ... commandsIn) and then simply a String[] in the
 * constructor body.
 *
 * @param owner sets owner
 * @param name sets name
 * @param breed sets breed
 * @param weight sets weight
 * @param days sets days
 * @param serviceIn sets service
 * @param commandsIn sets commands
 */
   public ServiceDog(String owner, String name, String breed, double weight,
                   int days, String serviceIn, String ... commandsIn) {
      super(owner, name, breed, weight, days);
   
      service = serviceIn;
      commands = commandsIn;
   }

// methods

/**
 * Accepts no parameters and returns a String representing service.
 *
 * @return service
 */
   public String getService() {
      return service;
   }
   
/**
 * Accepts a String representing the service, sets the field, and returns
 * nothing.
 *
 * @param serviceIn sets service
 */
   public void setService(String serviceIn) {
      service = serviceIn;
   }
   
/**
 * Accepts no parameters and returns a String[] representing commands.
 *
 * @return commands
 */
   public String[] getCommands() {
      return commands;
   }

/**
 * Accepts a variable length parameter of type String
 * (i.e., String ... commandsIn) representing commands, sets the field,
 * and returns nothing.
 * 
 * @param commandsIn sets commands
 */   
   public void setCommands(String ... commandsIn) {
      commands = commandsIn;
   }

/** 
 * Accepts no parameters and returns a double representing the boarding
 * cost for a service dog calculated as follows:
 * (BASE_RATE + weight * 0.05 + commands.length) * days.
 *
 * @return cost
 */
   public double boardingCost() {
      return (BASE_RATE + weight * 0.05 + commands.length) * days;
   }
   
/**
 * Calls the toString method in the parent, super.toString(), and then
 * appends the service info and commands info (if commands.length is
 * greater than 0) to it.
 * 
 * @return output
 */
   public String toString() {
      String output = super.toString() + "Service: " + service + "\nCommands: ";
   
      if (commands.length > 0) {
         for (String command : commands) {
            output += command + " ";
         }
      }
      return output;
   }
}