package com.example;

import java.util.Scanner;

public class OctalToDecimalConverter implements Converter {
    
    @Override
    public void convert(Scanner input) {
        System.out.println("Enter an octal number:");
        String octal = input.next();
        int decimal = Integer.parseInt(octal, 8);
        System.out.println("Decimal equivalent: " + decimal);
    }
}
