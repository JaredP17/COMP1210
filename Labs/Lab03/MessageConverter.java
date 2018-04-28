import java.util.Scanner;

/**
 * This program will read in a message from the user and then
 * require the user to enter a number. The following will happen 
 * based on the number entered by user:
 *    -If the user enters a 1, the message will be printed as it was entered.
 *    -If the user enters a 2, the message will be printed in lower case.
 *    -If the user enters a 3, the message will be printed in upper case.
 *    -If the user enters a 4, the message will be printed with all vowels 
 *     replaced with underscores.
 *    -If the user enters a 5, the message will be printed without the first 
 *     and last character. o Any other number should generate an appropriate 
 *     message.
 *
 * @author COMP1210
 * @version 9/7/2016
 */
public class MessageConverter {
   /**
    * Main method.
    * @param args (not used)
    */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String message = "";
      int outputType = 0;
      String result = "";
   
      System.out.print("Type in a message and press enter:\n\t> ");
      message = userInput.nextLine();
      
      System.out.print("\nOutput types:"
         + "\n\t1: As is"
         + "\n\t2: lower case"
         + "\n\t3: UPPER CASE"
         + "\n\t4: v_w_ls r_pl_c_d"
         + "\n\t5: Without first and last character"
         + "\nEnter your choice: ");
      
      outputType = Integer.parseInt(userInput.nextLine());
      
      if (outputType == 1) { // As is
         result = message;
      }
      
      else if (outputType == 2) { // lower case
         result = message.toLowerCase();
      }
      
      else if (outputType == 3) { // UPPER CASE
         result = message.toUpperCase();
      }  
      
      else if (outputType == 4) { // replace vowels
         result = message.replace('A', '_').replace('a', '_');
         result = result.replace('E', '_').replace('e', '_');
         result = result.replace('I', '_').replace('i', '_');
         result = result.replace('O', '_').replace('o', '_');
         result = result.replace('U', '_').replace('u', '_');
      }
      
      else if (outputType == 5) { // without first and last character
         result = message.substring(1, message.length() - 1);
      }
      
      else { // invalid input
         result = "Error: Invalid choice input.";
      }
      
      System.out.println("\n" + result);
   }

}