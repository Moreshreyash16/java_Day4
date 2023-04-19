package Bridgelabz.Day4;

import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the year");
        int year= sc.nextInt();
        if (year>=1000) {
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is not a Leap Year");
            }
        }
    }
}