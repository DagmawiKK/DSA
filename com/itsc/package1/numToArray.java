package com.itsc.package1;
import java.util.*;

public class numToArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the length your array to be: ");
        int input = scan.nextInt();
        System.out.println();

        int[] array = new int[input];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Enter the number that should be looked for:");
        int var = scan.nextInt();

        int counter = 0;
        for(int i: array) {
            if(i == var) {
                counter++;
            }
        }
        System.out.println("Your variable occurs: " + counter + " times");

    }
}
