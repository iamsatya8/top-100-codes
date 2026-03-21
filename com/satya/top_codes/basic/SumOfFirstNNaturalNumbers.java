package com.satya.top_codes.basic;

import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number to get the Sum till that Number: ");
        int number = scanner.nextInt();
        System.out.println("Sum of "+number+" natural number Using loop: "+sumOfFirstNNaturalNumbersUsingLoop(number));
        System.out.println("Sum of "+number+" natural number Using formula: "+sumOfFirstNNaturalNumbersUsingFormula(number));
        System.out.println("Sum of "+number+" natural number Using recursion: "+sumOfFirstNNaturalNumbersUsingRecursion(number));
    }

    public static int sumOfFirstNNaturalNumbersUsingLoop(int number) {
        int sum = 0;
        for (int i=1;i<=number;i++){
            sum += i;
        }
        return sum;
    }

    public static int sumOfFirstNNaturalNumbersUsingFormula(int number){
        int sum = (number*(number+1))/2;
        return sum;
    }

    public static int sumOfFirstNNaturalNumbersUsingRecursion(int number){
        if(number == 0){
            return number;
        }
        return number + sumOfFirstNNaturalNumbersUsingRecursion(number-1);
    }
}
