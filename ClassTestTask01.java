import java.util.Arrays;
import java.util.Scanner;

//Вариант 1
public class ClassTestTask01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = sc.nextInt(); // Ввод числа n(количество строк и столбцов)
        int[][] matrix = new int[n][n];
        System.out.print("Введите элементы матрицы: ");// Ввод элементов массива
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        getSideDiagonalAsVector(matrix);
        mult(matrix,arr);
    }

    static void getSideDiagonalAsVector(int[][] matrix) {
        int n = matrix.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i] = matrix[i][n - 1 - i];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    static void mult(int[][] matrix, int[] arr) {
        int n = arr.length;
        int[] multArr = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                multArr[i] += matrix[i][j] * arr[i];
            }
            arr[i] = sum;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(multArr[i] + "\t");
            }
        }
    }
}