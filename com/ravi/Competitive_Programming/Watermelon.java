package com.ravi.Competitive_Programming;

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        if(W%2==0 && W>2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
