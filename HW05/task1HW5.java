//package com.company;

import java.util.Scanner;

public class task1HW5 {
    public static void main(String[] args) {
        int index = 1;
        int n = 0;
        int a = 0;
        int b;
        Scanner sc = new Scanner(System.in);
        while (index == 1) {
            System.out.print("1 - вкл, 0 - выкл: ");
            index = sc.nextInt();
            if (n == 0) {
                System.out.print("Введите первое число: ");
                a = sc.nextInt();
            }
            System.out.print("Введите оператор: ");
            String op = sc.next();
            System.out.print("Введите второе число: ");
            b = sc.nextInt();
            if (op.equals("+")) {
                System.out.print("Результат: ");
                System.out.print(a += b);
            }
            if (op.equals("*")) {
                System.out.print("Результат: ");
                System.out.print(a *= b);
            }
            if (op.equals("-")) {
                System.out.print("Результат: ");
                System.out.print(a -= b);
            }
            if (op.equals("/")) {
                System.out.print("Результат: ");
                System.out.print(a /= b);
            }
            System.out.print(" ");
            System.out.print("Сбросить результат? ");
            String rez = sc.next();
            if (rez.equals("да")) {
                n = 0;
            } else {
                n = 2;
            }
        }
    }
}

