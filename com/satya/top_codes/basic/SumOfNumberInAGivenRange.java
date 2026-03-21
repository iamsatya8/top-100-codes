package com.satya.top_codes.basic;

import java.util.Scanner;

public class SumOfNumberInAGivenRange {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter the Range for Finding Sum between them: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println("Sum between "+number1+", "+number2+" using Brute Force is: "+sumBetweenRangeUsingBruteForce(number1,number2));
        System.out.println("Sum between "+number1+", "+number2+" using Formula is: "+sumBetweenRangeUsingFormula(number1,number2));
        System.out.println("Sum between "+number1+", "+number2+" using Recursion is: "+sumBetweenRangeUsingRecursion(0, number1,number2));
    }

    public static int sumBetweenRangeUsingBruteForce(int number1, int number2) {
        int sum = 0;
        for(;number1<=number2;number1++){
            sum += number1;
        }
        return sum;
    }

    public static int sumBetweenRangeUsingFormula(int number1, int number2) {
        int sum = (number2*(number2+1))/2 - (number1*(number1+1))/2 + number1;
        return sum;
    }

    public static int sumBetweenRangeUsingRecursion(int sum, int number1, int number2){
        if(number1>number2){
            return sum;
        }
        return sum + sumBetweenRangeUsingRecursion(sum,number1+1,number2);
    }
}
