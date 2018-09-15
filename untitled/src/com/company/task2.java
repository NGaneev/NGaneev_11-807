package com.company;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Количество элементов: ");
        int n = sc.nextInt();
        System.out.print("Введите элементы: ");
        int[] arr = new int[n];
        int a = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                arr[i] = arr[i] * -1;
            }
            if (arr[i] > max) {
                max = arr[i];
                a = i;
            }
        }
        System.out.println("Максимальное число по модулю: " + max);
        System.out.println("Его индекс: " + a);
    }
}

