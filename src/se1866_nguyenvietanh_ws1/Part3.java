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
public class Part3 {
    public static void main(String[] args) {
        String list[] = new String[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the list of names");
        for (int i = 0; i < 10; i++) {
            System.out.println("Input name: " + (i+1) + "/10");
            list[i] = sc.nextLine();
            sc = new Scanner(System.in);
            
        }
        for (int i = 0; i < 10; i++) {
            list[i] = Character.toUpperCase(list[i].charAt(0)) + list[i].substring(1);
            System.out.println(list[i]);
        }
    }
    
}
