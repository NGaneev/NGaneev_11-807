package com.company;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Количество элементов: ");
        int n = sc.nextInt();
        System.out.print("Введите элементы: ");
        int[] arr = new int[n];
        int localCount = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < n - 1; i++) {
            if (arr[i - 1] < arr[i] & arr[i] > arr[i + 1]) {
                localCount++;
            }
        }
        System.out.println("Количество локальных максимумов: " + localCount);
    }
}
