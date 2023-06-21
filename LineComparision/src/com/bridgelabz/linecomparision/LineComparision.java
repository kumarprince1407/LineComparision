package com.bridgelabz.linecomparision;
import java.util.*;
public class LineComparision {
    public static void main(String args[]){
        System.out.println("Welcome to Line Comparision Problem program.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x1:");
        double x1 = sc.nextDouble();
        System.out.print("Enter the value of x2:");
        double x2 = sc.nextDouble();
        System.out.print("Enter the value of y1:");
        double y1 = sc.nextDouble();
        System.out.print("Enter the value of y2:");
        double y2 = sc.nextDouble();

        System.out.println("The length of the line is: "+ (Math.sqrt(Math.pow((x2 - x1),2) )+ Math.pow((y2 -y1),2)));

    }
    /*
 
     */
}
