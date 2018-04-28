
/**
 * A user defined exception created by extending the Exception
 * class. This exception is to be thrown and caught in the
 * readPetFile method in the PetBoardingList class when a line
 * of input data contains an invalid pet category.
 *
 * @author Jared R. Porter
 * @version 12/1/2016
 */
public class InvalidCategoryException extends Exception {
// instance variables

// constructor

   public InvalidCategoryException(String category) {
      super("For category: " + "\"" + category + "\"");
   }
}