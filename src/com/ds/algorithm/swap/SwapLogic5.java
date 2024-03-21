package com.ds.algorithm.swap;

import java.util.Scanner;

/**
 * Without Using Temp Variable. Using Single Line
 */
class Logic5 {
    static void swap(int a, int b) {
        System.out.println("Before swap a= " + a + " and b=" + b);
        a = (a + b) - (b = a);
        System.out.println("After  swap a= " + a + " and b=" + b);
    }
}
public class SwapLogic5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        int b = scanner.nextInt();
        Logic5.swap(a, b);
    }
}
