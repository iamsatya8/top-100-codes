package com.satya.top_codes.basic;

import java.util.Scanner;

public class PrimeNumberOrNot {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        if (number<2){
            System.out.println("Given Number is not a prime.");
            System.exit(0);
        } else{
            for (int i=2;i<Math.sqrt(number);i++){
                if (number%i==0){
                    System.out.println("Given number is not a prime");
                    System.exit(0);
                }
            }
            System.out.println("Given number is prime.");
            System.exit(0);
        }
    }
}
