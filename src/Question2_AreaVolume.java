/*
---------------------------------------------------------------------------------
Name: Tanvi Jain
Student #: 220287975
Subject: ITEC 1620 - Object-Based Programming
Professor: Nahid Alimohammadi

Purpose: The purpose of this code is to find the area + volume of a sphere given
         the radius.
----------------------------------------------------------------------------------
 */
//libraries (imports the scanner library)
import java.util.Scanner;
public class Question2_AreaVolume {
    //main method
    public static void main (String[] args){
        //creates a new scanner object
        Scanner scan = new Scanner(System.in);

        //asks the user for the radius of the sphere
        //turns input variable into a variable
        System.out.print("Enter the radius of the sphere: ");
        int radius = scan.nextInt();

        //calculates the area/volume with the radius provided
        //prints it out and rounds to the nearest 100th (using printf)
        double area = 4 * Math.PI * (Math.pow(radius, 2));
        double volume = (4.0/3.0) * Math.PI * (Math.pow(radius, 3));
        System.out.print("\nThe area of the sphere is: ");
        System.out.printf("%.2f%n", area);
        System.out.print("The volume of the sphere is: ");
        System.out.printf("%1.2f%n", volume);
    }
}
