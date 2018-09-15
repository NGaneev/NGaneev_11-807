package com.company;

import java.util.Scanner;

public class task6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Количество элементов: ");
        int n = sc.nextInt();
        System.out.print("Введите элементы: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = n; i > n; i--) {
            System.out.println(arr[i]);
        }
    }
}
