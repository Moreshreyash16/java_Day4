package Bridgelabz.Day4;

import java.util.Random;
import java.util.Scanner;
public class toss {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        double count1=0;
        double count2=0;
        for (int i = 0; i < n; i++) {
            double ran= Math.random();

            if(ran>0.5){
                System.out.println("Heads");
                count1+=1;
            }
            else{
                System.out.println("tails");
                count2+=1;
            }
        }
        double winheads=(count1/n)*100;
        double wintails=(count2/n)*100;
        System.out.println("Winning percentage of heads is "+winheads+"%");
        System.out.println("Winning percentage of tails is "+wintails+"%");
    }
}
