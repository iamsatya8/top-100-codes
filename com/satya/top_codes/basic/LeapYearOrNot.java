package com.satya.top_codes.basic;

import java.util.Scanner;

public class LeapYearOrNot {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        if (year%400==0){
            System.out.println("Year "+year+" is leap year.");
        } else if (year%4==0 && year%100!=0) {
            System.out.println("Year "+year+" is a leap year.");
        } else {
            System.out.println("year "+year+" is not a leap year.");
        }
    }
}
