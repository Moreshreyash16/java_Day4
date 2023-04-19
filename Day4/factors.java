package Bridgelabz.Day4;

import java.util.Arrays;
import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] factors=new int[10];
        int count=0;
        while(n>=1){
            for(int i=2;i<=n+1;i++){
                if(n%i==0){
                    n=n/i;
                    factors[count]=i;
                    count++;
                    break;
                }
            }
        if(n==1 || n==2 ){
            break;
        }
        }
        System.out.println(Arrays.toString(factors));
    }
}
