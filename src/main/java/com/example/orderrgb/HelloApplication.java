package com.example.orderrgb;

import java.util.Scanner;

public class HelloApplication {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Enter the value of R (between 0 and 255): ");
        int R = value.nextInt();
        if (R < 0 || R > 255) {
            System.out.println("Value of R is out of range.");
            System.exit(0);
        }

        System.out.print("Enter the value of G (between 0 and 255):");
        int G = value.nextInt();
        if (G < 0 || G > 255) {
            System.out.println("Value of G is out of range.");
            System.exit(0);
        }

        System.out.print("Enter the value of B (between 0 and 255):");
        int B = value.nextInt();
        if (B < 0 || B > 255) {
            System.out.println("Value of B is out of range.");
            System.exit(0);
        }

        System.out.println("The RGB color code is: (" + R + ", " + G + ", " + B + ")");
    }
}
