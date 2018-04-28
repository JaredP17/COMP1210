import java.text.DecimalFormat;

/**
 * Defines right circular Cone objects (base of cone is a 
 * circle and the axis is perpendicular to the base) where 
 * height and radius are positive.
 *
 * @author COMP1210
 * @version 10/10/2016
 */
public class Cone {

// instance variables
   private String label;
   private double height, radius;
   
// constructor

/**
 * Cone object constructor.
 * 
 * @param labelIn sets label
 * @param heightIn sets height
 * @param radiusIn sets radius
 */
   public Cone(String labelIn, double heightIn, double radiusIn) {
      setLabel(labelIn);
      setHeight(heightIn);
      setRadius(radiusIn);
   }
   
// methods

/**
 * Accepts no parameters and returns a String representing the label field.
 *
 * @return label
 */
   public String getLabel() {
      return label;
   }
   
/**
 * Takes a String parameter and returns a boolean. If the string parameter 
 * is not null, then the “trimmed” String is set to the label field and the 
 * method returns true. Otherwise, the method returns false and the label 
 * is not set.
 *
 * @param labelIn sets label
 * @return boolean
 */   
   public boolean setLabel(String labelIn) {
      boolean isSet = false;
      
      if (labelIn != null) {
         label = labelIn.trim();
         isSet = true;
      }
      
      return isSet;
   }
   
/**
 * Accepts no parameters and returns a double representing the height field.
 *
 * @return height
 */   
   public double getHeight() {
      return height;
   }
   
/**
 * Accepts a double parameter and returns a boolean. If the height is greater
 * than zero, sets height field and returns true. Otherwise, the method returns 
 * false and the height is not set.
 *
 * @param heightIn sets height
 * @return boolean
 */   
   public boolean setHeight(double heightIn) {
      boolean isSet = false;
   
      if (heightIn > 0) {
         height = heightIn;
         isSet = true;
      }
   
      return isSet;
   }
   
/**
 * Accepts no parameters and returns a double representing the radius field.
 *
 * @return radius
 */
   public double getRadius() {
      return radius;
   }

/**
 * Accepts a double parameter and returns a boolean. If the radius is greater 
 * than zero, sets radius field and returns true. Otherwise, the method returns 
 * false and the radius is not set.
 *
 * @param radiusIn sets radius
 * @return boolean
 */   
   public boolean setRadius(double radiusIn) {
      boolean isSet = false;
   
      if (radiusIn > 0) {
         radius = radiusIn;
         isSet = true;
      }
   
      return isSet;
   }

/**
 * Accepts no parameters and returns the double value for the perimeter 
 * of the base circle of the cone calculated using radius.
 *
 * @return base perimeter
 */   
   public double basePerimeter() {
      return 2 * Math.PI * radius;
   }

/**
 * Accepts no parameters and returns the double value for the base area 
 * calculated using radius.
 *
 * @return base area
 */
   public double baseArea() {
      return Math.PI * Math.pow(radius, 2);
   }

/**
 * Accepts no parameters and returns the double value for the slant height 
 * calculated using height and radius.
 *
 * @return slant height
 */   
   public double slantHeight() {
      return Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
   }
   
/**
 * Accepts no parameters and returns the double value for the side area 
 * calculated using radius and slant height.
 *
 * @return side area
 */   
   public double sideArea() {
      return Math.PI * radius * slantHeight();
   }
   
/**
 * Accepts no parameters and returns the double value for the total surface
 * area calculated using the base area and side area.
 *
 * @return surface area
 */
   public double surfaceArea() {
      return Math.PI * (radius * (radius + slantHeight()));
   }
  
/**
 * Accepts no parameters and returns the double value for the volume calculated 
 * using height and radius.
 *
 * @return volume
 */   
   public double volume() {
      return (Math.PI * Math.pow(radius, 2) * height) / 3;
   }
  
/**
 * Returns a String containing the information about the Cone object formatted
 * as shown below, including decimal formatting ("#,##0.0##") for the double 
 * values. Newline escape sequences should be used to achieve the proper 
 * layout. In addition to the field values (or corresponding “get” methods), 
 * the following methods should be used to compute appropriate values in the 
 * toString method: basePerimeter(), baseArea(), slantHeight(), sideArea(), 
 * surfaceArea(), and volume(). Each line should have no leading and no 
 * trailing spaces (e.g., there should be no spaces before a newline (\n) 
 * character). The toString value for example1, example2, and example3 
 * respectively are shown below (the blank lines are not part of the toString 
 * values).
 *
 * @return cone to string
 */   
   public String toString() {
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      
      String output = "\"" + this.getLabel() + "\"" 
               + " is a cone with height = " + fmt.format(this.getHeight())
               + " units and radius = " 
               + fmt.format(this.getRadius()) + " units,"
               + "\nwhich has base perimeter = " 
               + fmt.format(this.basePerimeter())
               + " units, base area = " 
               + fmt.format(this.baseArea()) + " square units,"
               + "\nslant height = " 
               + fmt.format(this.slantHeight()) 
               + " units, side area = " 
               + fmt.format(this.sideArea()) + " square units,"
               + "\nsurface area = " 
               + fmt.format(this.surfaceArea()) 
               + " square units, and volume = " 
               + fmt.format(this.volume()) + " cubic units.";
      
      return output;
   }
}