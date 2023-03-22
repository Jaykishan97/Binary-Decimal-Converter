package com.example;

import java.util.Scanner;

public class BinaryToDecimalConverter implements Converter {
    
    @Override
    public void convert(Scanner input) {
        System.out.println("Enter a binary number:");
        String binary = input.next();
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal equivalent: " + decimal);
    }
}
