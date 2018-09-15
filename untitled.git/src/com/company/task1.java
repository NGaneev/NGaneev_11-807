package com.company;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Количество учеников: ");
        int n = sc.nextInt();
        System.out.print("Их рост: ");
        int[] arr = new int[n];
        int rost = 0;
        int countrost = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            rost += arr[i];
        }
        int srost = rost / n;
        for (int i = 0; i < n; i++) {
            if (arr[i] > srost) {
                countrost++;
            }

        }
        System.out.println("Средний рост учеников: " + srost);
        System.out.println("Количество учеников,рост которых выше среднего : " + countrost);
    }
}

