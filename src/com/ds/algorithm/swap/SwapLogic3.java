package com.ds.algorithm.swap;

import java.util.Scanner;

/**
 * Without Using Temp Variable. Using Multiplication and Division
 */
class Logic3 {
    static void swap(int a, int b) {
        System.out.println("Before swap a= " + a + " and b=" + b);
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("After  swap a= " + a + " and b=" + b);
    }
}
public class SwapLogic3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        int b = scanner.nextInt();
        Logic3.swap(a, b);
    }
}
