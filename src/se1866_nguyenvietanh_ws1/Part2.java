/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1866_nguyenvietanh_ws1;

import java.util.Scanner;

/**
 *
 * @author reality
 */
public class Part2 {

    public static void main(String[] args) {
        float num1, num2;
        String op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        num1 = sc.nextFloat();

        System.out.println("Enter the number 2: ");
        num2 = sc.nextFloat();

        sc = new Scanner(System.in);
        System.out.println("Enter the operator(+-*/):  ");
        op = sc.nextLine();

        if (op.equals("+")) {
            System.out.println("The result of " + num1 + op + num2 + "= " + (num1 + num2));

        }
        else if (op.equals("-")) {
            System.out.println("The result of " + num1 + op + num2 + "= " + (num1 - num2));

        }
        else if (op.equals("*")) {
            System.out.println("The result of " + num1 + op + num2 + "= " + (num1 * num2));

        }
        else if (op.equals("/")) {
            System.out.println("The result of " + num1 + op + num2 + "= " + (num1 / num2));
        }
        else
            System.out.println("");
    }
}