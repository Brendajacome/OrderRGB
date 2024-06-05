package com.example.orderrgb;

import java.util.Scanner;

public class HelloApplication {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Enter the value of R (between 0 and 255): ");
        int RED = value.nextInt();
        if (RED < 0 || RED > 255) {
            System.out.println("Value of R is out of range.");
            System.exit(0);
        }

        System.out.print("Enter the value of G (between 0 and 255):");
        int GREEN = value.nextInt();
        if (GREEN < 0 || GREEN > 255) {
            System.out.println("Value of G is out of range.");
            System.exit(0);
        }

        System.out.print("Enter the value of B (between 0 and 255):");
        int BLUE = value.nextInt();
        if (BLUE < 0 || BLUE > 255) {
            System.out.println("Value of B is out of range.");
            System.exit(0);
        }

        System.out.println("The RGB color code is: (" + RED + ", " + GREEN + ", " + BLUE + ")");
    }
}
