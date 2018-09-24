package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class task1HW6 {
    public static void main(String[] args) {
        System.out.print("Введите кол-во строк: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strings = new String[n + 1];
        System.out.print("Введите строки: ");
        for (int i = 0; i < n + 1; i++) {
            strings[i] = sc.nextLine();
        }
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length - 1 - i; j++) {
                if (strings[j].length() > strings[j + 1].length()) {
                    String str = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = str;
                }
            }
            System.out.println(strings[i]);
        }
    }
}



