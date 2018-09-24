package com.company;

import java.util.Scanner;

public class task3HW6 {
    public static void main(String[] args) {
        System.out.print("Введите количество чисел: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 1;
        int a = 1;
        System.out.print("Введите числа: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i+1]){
                count++;
                if (count > a ){
                    a = count;
                }
            }else
                count = 1;
        }
        System.out.print(a);
    }
}
