package Bridgelabz.Day4;

import java.util.Scanner;

public class largestof3 {
    public static void main(String[] args) {
        int [] arr=new int[3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number1");
        int n1= sc.nextInt();
        System.out.println("Enter a number2");
        int n2= sc.nextInt();
        System.out.println("Enter a number3");
        int n3= sc.nextInt();
        arr[0]=n1;
        arr[1]=n2;
        arr[2]=n3;
        int max=arr[0];
        for (int i :arr ) {
            if (i>max){
                max=i;
            }
        }
        System.out.println("largest element is " + max);
    }

}
