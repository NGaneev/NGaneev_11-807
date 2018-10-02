package com.company;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class task2HW8 {
    public static void main(String[] args) {
        System.out.print("Введите количество строк: ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.print("Введите количество столбцов: ");
        int n = sc.nextInt();
        int[][] massive = new int[n][m];
        System.out.println("Введите матрицу: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                massive[i][j] = sc.nextInt();
            }
        }
        int MMax = Integer.MIN_VALUE;
        int NMax = Integer.MIN_VALUE;
        int SumM = 0;
        int SumN = 0;
        int a = 0;
        int IndexM = 0;
        while (a != m) {
            for (int i = 0; i < m; i++) {
                SumM = massive[i][a];
            }
            if (SumM > MMax) {
                IndexM = a;
            }
            a++;
        }
        int b = 0;
        int IndexN = 0;
        while (b != n) {
            for (int i = 0; i < n; i++) {
                SumN = massive[b][i];
            }
            if (SumN > NMax) {
                IndexN = b;
            }
            b++;
        }
        System.out.print("Максимальная строка: ");
        for (int i = 0; i < m; i++) {
            System.out.print(massive [IndexM][i] + " ");
        }
        System.out.print("Максимальный столбец: ");
        for (int i = 0; i < n; i++) {
            System.out.print(massive [i][IndexN] + " ");
        }
    }
}
