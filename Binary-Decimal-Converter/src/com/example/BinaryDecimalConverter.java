package com.example;

import java.util.Scanner;

public class BinaryDecimalConverter {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 to convert binary to decimal, or enter 2 to convert decimal to binary:");
        int choice = input.nextInt();
        
        if (choice == 1) {
            System.out.println("Enter a binary number:");
            String binary = input.next();
            int decimal = Integer.parseInt(binary, 2);
            System.out.println("Decimal equivalent: " + decimal);
        } else if (choice == 2) {
            System.out.println("Enter a decimal number:");
            int decimal = input.nextInt();
            String binary = Integer.toBinaryString(decimal);
            System.out.println("Binary equivalent: " + binary);
        } else {
            System.out.println("Invalid choice.");
        }
        
        input.close();
    }
}
