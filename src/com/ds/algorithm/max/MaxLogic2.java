package com.ds.algorithm.max;

import java.util.Scanner;

/**
 * Using Conditional Operator
 */
class Logic2 {
    static int max(int a, int b) {
        return Math.max(a, b);
    }
}
public class MaxLogic2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        int b = scanner.nextInt();
        System.out.println("Max value is " + Logic2.max(a, b));
    }
}
