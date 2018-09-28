package com.company;

import static com.company.taskDHW7.PowerOfTwo;

public class taskDHW7 {
    public static void main(String[] args) {
        double n = 35;
        if (PowerOfTwo(n) == 1) {
            System.out.println("Yes");
        } else
            System.out.println("No");
    }
    public static int PowerOfTwo(double n){
        if (n == 1) {
            return 1;
        } else if (n > 1 && n < 2){
            return 0;
        } else {
            return PowerOfTwo(n / 2);
        }
    }
}
