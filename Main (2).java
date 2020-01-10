package edu.cscc;
import java.lang.Math;
import java.util.Scanner;


public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double radius, height, volume;
        System.out.print("Enter height of the cylinder:");
        height = input.nextDouble();
        System.out.print("Enter radius of the cylinder:");
        radius = input.nextDouble();
        volume = Math.PI*Math.pow(radius,2)*height;
        System.out.print("The volume of the cylinder is:" + volume);
    }
}

