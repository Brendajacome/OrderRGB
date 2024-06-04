package com.example.orderrgb;

import java.util.Scanner;

public class HelloApplication {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Enter the value of R (between 0 and 255): ");
        int R = value.nextInt();
        System.out.print("Enter the value of G (between 0 and 255): ");
        int G = value.nextInt();
        System.out.print("Enter the value of B (between 0 and 255): ");
        int B = value.nextInt();

        if (R < 0) {
            R = 0;
        }
        if (R > 255) {
            R = 255;
        }
        if (G < 0) {
            G = 0;
        }
        if (G > 255) {
            G = 255;
        }
        if (B < 0) {
            B = 0;
        }
        if (B > 255) {
            B = 255;
        }
        System.out.println("The RGB color code is: (" + R + ", " + G + ", " + B + ")");
    }
}