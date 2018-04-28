/**
 * Prints the course name, semester, and instructor of COMP 
 * 1210 followed by a description of the course. 
 *
 * @author Your name
 * @version today's date
 */
public class CourseInfo {
 
   /**
    * Prints course information to std output.
    *
    * @param args Command line arguments (not used).
    */
   public static void main(String[] args) {
     
      // print name, semester, & instructor
      System.out.println("Course Name: COMP 1210");
      System.out.println("Semester: Fall 2016");
      System.out.println("Instructor: Dr. Cross");
   
      // print description
      System.out.println("\nDesrciption: \nCOMP 1210 uses "
                        + "the java programming language to "
                        + "cover the basics of software development.");
   }
}