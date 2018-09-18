package com.company;

import java.util.Scanner;

public class task3HW4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s = sc.nextLine();
        System.out.print("Введите n1: ");
        int n1 = sc.nextInt();
        System.out.print("Введите n2: ");
        int n2 = sc.nextInt();
        StringBuffer s1 = new StringBuffer(s);
        s1.delete(n1,n2 + 1);
        System.out.print("Ваша строка: " + s1);
    }
}
