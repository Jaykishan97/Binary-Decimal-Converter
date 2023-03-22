package com.example;

import java.util.Scanner;

public class DecimalToBinaryConverter implements Converter {
    
    @Override
    public void convert(Scanner input) {
        System.out.println("Enter a decimal number:");
        int decimal = input.nextInt();
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary equivalent: " + binary);
    }
}
