package com.satya.top_codes.basic;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number you wanna verify whether it's Even or Odd: ");
        int number = scanner.nextInt();
        if (number%2==0){
            System.out.println("The given number is Even");
        } else {
            System.out.println("The give number is Odd");
        }
    }
}
