package com.company;

import java.util.Scanner;

public class task1HW4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов первого массива: ");
        int n = sc.nextInt();
        String arr1 = "",arr2 = "";
        System.out.print("Введите элементы первого массива: ");
        for (int i = 0; i < n; i++) {
            arr1 = arr1 + sc.nextInt();
        }
        System.out.print("Введите количество элементов второго массива: ");
        int m = sc.nextInt();
        System.out.print("Введите элементы второго массива: ");
        for (int i = 0; i < m; i++) {
            arr2 = arr2 + sc.nextInt();
        }
        int a = arr1.indexOf(arr2);
        if (a > -1){
            System.out.print("Входит, начиная с индекса : " + a);
        } else{
            System.out.print("Не входит");
        }
    }
}
