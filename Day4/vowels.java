package Bridgelabz.Day4;

import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        String[] vowels ={"a","e","i","o","u"};
        Scanner sc = new Scanner(System.in);
        String n=sc.nextLine();
        for (String i:vowels) {
            if(n==i){
                System.out.println("it is a vowel");
            }
            else{
                System.out.println("it is consonant");
            }
        }
    }
}
