package com.ds.algorithm.max;

import java.util.Scanner;

/**
 * Using Conditional Operator
 */
class Logic1 {
    static int max(int a, int b) {
        return a > b ? a : b;
    }
}
public class MaxLogic1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        int b = scanner.nextInt();
        System.out.println("Max value is " + Logic1.max(a, b));
    }
}
