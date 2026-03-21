package com.satya.top_codes.basic;

import java.util.Scanner;

public class PrimeNumbersInARange {
    public static boolean PrimeOrNot(int number){
        if (number<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter the range to find the prime numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.print("Prime Number are: ");
        for(;number1<=number2;number1++){
            if (PrimeOrNot(number1)){
                System.out.print(number1+" ");
            }
        }
    }
}
