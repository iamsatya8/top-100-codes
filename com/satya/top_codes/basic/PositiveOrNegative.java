package com.satya.top_codes.basic;

import java.util.Scanner;

public class PositiveOrNegative {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number you want to check whether it's positive or not: ");
        int number = scanner.nextInt();
        if (number<0){
            System.out.println("The number which you entered is Negative.");
        } else {
            System.out.println("The number which you entered is Positive.");
        }
    }
}
