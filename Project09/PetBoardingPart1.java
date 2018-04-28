/**
* Driver class for Pet and its subclasses.
*
* @author Jared R. Porter
* @version 11/10/2016
*/
public class PetBoardingPart1 {

/**
  * Main method.
  *
  * @param args (unused)
  */
   public static void main(String[] args) {
      Cat c = new Cat("Barb Jones", "Callie", "Siamese", 9.0, 7, 9);
      System.out.println(c + "\n");
      
      Dog d = new Dog("Jake Smith", "Honey", "Great Dane", 60, 7);
      System.out.println(d + "\n");
      
      ServiceDog d2 = new ServiceDog("Jen Baker", "Pepper", "Sheppard", 60, 7,
                                     "guide dog", "sit", "down", "stay", "come",
                                     "around", "forward", "right", "left");
      System.out.println(d2 + "\n");
      
      Horse h = new Horse("Jessie Rider", "King", "Quarter Horse",
                           1000, 7, 10.0);
      System.out.println(h + "\n");
   }

}