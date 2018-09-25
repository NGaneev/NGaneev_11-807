package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class task5HW6 {
    public static void main(String[] args) {
        int count = 0;
        System.out.print("Введите количество элементов первого массива: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.print("Введите элементы первого массива: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Введите количество элементов второго массива: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        int count2 = m + n;
        System.out.print("Введите элементы второго массива: ");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr1[i] == arr2[j]) {
                    count++;
                }
            }
        }
        count2 = count2 - 2 * count;
        System.out.print(count2);
    }
}
