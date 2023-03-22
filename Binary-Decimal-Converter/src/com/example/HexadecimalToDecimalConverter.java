package com.example;

import java.util.Scanner;

public class HexadecimalToDecimalConverter implements Converter {
    
    @Override
    public void convert(Scanner input) {
        System.out.println("Enter a hexadecimal number:");
        String hexadecimal = input.next();
        int decimal = Integer.parseInt(hexadecimal, 16);
        System.out.println("Decimal equivalent: " + decimal);
    }
}
