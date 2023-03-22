package com.example;

import java.util.Scanner;

public class DecimalToHexadecimalConverter implements Converter {
    
    @Override
    public void convert(Scanner input) {
        System.out.println("Enter a decimal number:");
        int decimal = input.nextInt();
        String hexadecimal = Integer.toHexString(decimal);
        System.out.println("Hexadecimal equivalent: " + hexadecimal);
    }
}
