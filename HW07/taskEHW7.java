package com.company;

public class taskEHW7 {
    public static void main(String[] args) {
        System.out.println(Sum(100));
    }

    public static int Sum (int n){
        if (n < 10){
            return n;
        } else {
            return n % 10 + Sum(n / 10);
        }
    }
}
