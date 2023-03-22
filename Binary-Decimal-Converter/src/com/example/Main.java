package com.example;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        Converter converter;
        String exit = "n";
        
        do {
        	System.out.println("------------------------------------------");
            System.out.println("Enter 1 to convert binary to decimal");
            System.out.println("Enter 2 to convert decimal to binary");
            System.out.println("Enter 3 to convert octal to decimal");
            System.out.println("Enter 4 to convert decimal to octal");
            System.out.println("Enter 5 to convert hexadecimal to decimal");
            System.out.println("Enter 6 to convert decimal to hexadecimal");
            System.out.println("------------------------------------------");

            choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    converter = new BinaryToDecimalConverter();
                    converter.convert(input);
                    break;
                case 2:
                    converter = new DecimalToBinaryConverter();
                    converter.convert(input);
                    break;
                case 3:
                    converter = new OctalToDecimalConverter();
                    converter.convert(input);
                    break;
                case 4:
                    converter = new DecimalToOctalConverter();
                    converter.convert(input);
                    break;
                case 5:
                    converter = new HexadecimalToDecimalConverter();
                    converter.convert(input);
                    break;
                case 6:
                    converter = new DecimalToHexadecimalConverter();
                    converter.convert(input);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
            System.out.println("-------------------------------");
            System.out.println("Do you want to continue? (y/n)");
            System.out.println("-------------------------------");
            exit = input.next();
        } while (exit.equals("y"));
        
        System.out.println("Program terminated.");
        input.close();
    }
}
