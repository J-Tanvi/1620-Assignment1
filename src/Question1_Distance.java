/*
---------------------------------------------------------------------------------
Name: Tanvi Jain
Student #: 220287975
Subject: ITEC 1620 - Object-Based Programming
Professor: Nahid Alimohammadi

Purpose: The purpose of this code is to allow people to find the distance between
         a point and the line perpendicular to the line given the equation.
----------------------------------------------------------------------------------
 */
//libraries (imports the scanner library)
import java.util.Scanner;
public class Question1_Distance {
    //main method
    public static void main (String[] args){
        //adds the scanner object
        Scanner scan = new Scanner(System.in);

        //prints out statements that ask user for information
        //turns inputs into variables (extracts it using the scanner)
        System.out.print("Enter the x coordinate of point A: ");
        int xA = scan.nextInt();
        System.out.print("Enter the y coordinate of point A: ");
        int yA = scan.nextInt();
        System.out.print("Enter the slope of the line: ");
        int slopeA = scan.nextInt();
        System.out.print("Enter the slope-intercept of the line: ");
        int interceptA = scan.nextInt();

        //finds the slope and intercept of the line perpendicular to the one given
        //prints it out
        double slopePerp = -1.0/slopeA;
        double interceptPerp = yA - (slopePerp * xA);
        System.out.println("\nThe slope of the perpendicular line is: " + slopePerp);
        System.out.println("The slope intercept of the perpendicular line is: " + interceptPerp);

        //finds the coordinates for the perpendicular line (x,y)
        //prints it out
        double xI = (interceptPerp - interceptA) / (slopeA - slopePerp);
        double yI = (slopeA * xI) + interceptA;
        System.out.println("\nThe corrdinates of the intersection point are x = " + xI + " and y = " + yI);

        //finds the distance between the perpendicular line and the given line
        //prints it
        double distance = (Math.pow((xA - xI), 2)) + (Math.pow((yA - yI), 2));
        distance = Math.sqrt(distance);
        System.out.println("\nThe distance from point A to the line is: " + distance + "!!");
    }
}