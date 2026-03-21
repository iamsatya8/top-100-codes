package com.satya.top_codes.basic;

import java.util.Scanner;

public class GreatestOfTwoNumbers {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the two numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if(number1>number2){
            System.out.println("Number "+number1+" is greater.");
        } else if (number1<number2) {
            System.out.println("Number "+number2+" is greater.");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}
