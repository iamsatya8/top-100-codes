package com.satya.top_codes.basic;

import java.util.Scanner;

public class GreatestNumberOfThreeNumbers {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the three Numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if(number1>number2){
            if (number1>number3){
                System.out.println("Number "+number1+" is Greatest");
            } else{
                System.out.println("Number "+number3+" is Greatest");
            }
        } else if (number2>number3){
            System.out.println("Number "+number2+" is Greatest");
        } else {
            System.out.println("Number "+number3+" is Greatest");
        }
    }
}
