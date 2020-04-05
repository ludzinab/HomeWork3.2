package com.itacademy;

import java.util.Scanner;

public class HomeWork32 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = scanner.nextInt();

        System.out.println("Input b: ");
        int b = scanner.nextInt();

        System.out.println("Input c: ");
        int c = scanner.nextInt();

        int D = (b*b) - (4*a*c);
        System.out.println("Discriminant =");
        System.out.println(D);

        if (D > 0) {
            System.out.println("Discriminant is positive.");
        } else if (D == 0){
            System.out.println("Discriminant is zero.");
        } else {
            System.out.println("Discriminant is negative.");
        }

        double num = D;
        double rootPow = 2;
        double SR = Math.pow(num, ( 1 / rootPow));

        if (D > 0) {
            double x1 = ((-b + SR)/(2*a));
            double x2 = ((-b - SR)/(2*a));
            System.out.println("Two solutions:");
            System.out.println("x1 =");
            System.out.println(x1);
            System.out.println("x2 =");
            System.out.println(x2);
        } else if (D == 0) {
            double x  = -b / (2*a);
            System.out.println("One solution:");
            System.out.println("x =");
            System.out.println(x);
        } else {
            System.out.println("No solution.");
        }
    }

}
