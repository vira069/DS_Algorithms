package com.ravi.Array;

//import java.util.Scanner;

public class Minimum_Jump {
    static int minJumps(int[] arr, int n){
        if (n <= 1)
            return 0;

        if (arr[0] == 0)
            return -1;

        int maxReach = arr[0];
        int step = arr[0];
        int jump = 1;

        for (int i = 1; i < n; i++) {
            if (i == n - 1)
                return jump;

            maxReach = Math.max(maxReach, i + arr[i]);
            step--;

            if (step == 0) {
                jump++;
                if (i >= maxReach)
                    return -1;
                step = maxReach - i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 7};
        int n = arr.length;
        System.out.println("Minimum no. jumps to reach end of array: "+minJumps(arr,n));

    }
}
