package com.ds.algorithm.swap;

import java.util.Scanner;

/**
 * Using Temp Variable
 */
class Logic1 {
    static void swap(int a, int b) {
        System.out.println("Before swap a= " + a + " and b=" + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After  swap a= " + a + " and b=" + b);
    }
}
public class SwapLogic1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        int b = scanner.nextInt();
        Logic1.swap(a, b);
    }
}
