package Lab12;
import java.lang.Math;
import java.util.Scanner;

public class Lab12{

   /* Converts a height in feet/inches to centimeters */
   public static void Calculate_circle(double radius)
   {
	   	double area;
	   	double circumference;
	   	
	   	area = Math.PI * Math.pow(radius, 2);
	   	circumference = 2 * Math.PI * radius;
	   	System.out.printf("Circle area: %.2f\n", area);
	   	System.out.printf("Circle circumference: %.2f\n", circumference);
   }
   
   public static void Calculate_pyramid(double length, double width, double height)
   {
	   	double baseArea;
	   	double volume;
	   	
	    baseArea = length * width;
	    volume = (length * width * height)/3.0;
	   	System.out.printf("Pyramid base area: %.2f\n", baseArea);
	   	System.out.printf("Pyramid volume: %.2f\n", volume);
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int userChoice;
      double length;
      double width;
      double height;
      double radius;

      // Prompt user for feet/inches
      System.out.print("Type 1 for Circle or Type 2 for Pyramid: ");
      userChoice = scnr.nextInt();

      if (userChoice == 1)
      {
    	  System.out.print("Enter circle radius: ");
          radius = scnr.nextDouble();
          Calculate_circle(radius);
      }
      else if (userChoice == 2)
      {
    	  System.out.print("Enter pyramid length: ");
          length = scnr.nextDouble();
    	  System.out.print("Enter pyramid width: ");
          width = scnr.nextDouble();
    	  System.out.print("Enter pyramid height: ");
          height = scnr.nextDouble();
    	  Calculate_pyramid(length, width, height);
      }
      else
      {
    	  System.out.println("Invalid option chosen. Please try again.");
    	  System.exit(0);
      }
      
   }
}