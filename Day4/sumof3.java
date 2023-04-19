package Bridgelabz.Day4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sumof3 {
    static void sum(int[] arr, int len) {
        int[] sumof = new int[len];
        int add = 0;
        for (int i = 0; i < len; i++) {
//            for (int j = 0; j <= 2; j++) {
//                add += arr[i];
//
//            }
            add+=arr[i]*3;
            sumof[i] = add;
            add=0;

        }

        System.out.println(Arrays.toString(sumof));
    }

    public static void main(String[] args) {
        int [] arr={5,4,3,2,2,1,4};
        int len=arr.length;
        sum(arr,len);
    }
}

