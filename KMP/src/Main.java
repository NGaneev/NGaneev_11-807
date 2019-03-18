import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        //Randomizer
        String s = "";
        int[] array = new int[1000];
        final Random random = new Random();
        for (int i = 0; i < array.length; ++i)
            array[i] = random.nextInt();
        try (final FileWriter writer = new FileWriter("D:\\SecondTerm\\KMP\\src\\Text.txt", false)) {
            for (int i = 0; i < array.length; ++i) {
                s = Integer.toString(array[i]) ;
                writer.write(s);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
            //Считывание файла и удаление пробелов/абзацов
            Scanner in = new Scanner(new File("D:\\SecondTerm\\KMP\\src\\Text.txt"));
            while (in.hasNext())
                s += in.nextLine() + "\n";

            //Ввод образа(подстроки)
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите образец: ");
            String pattern = sc.nextLine().replace(" ", "").toLowerCase();

            //Вызов алгоритма КМП
            long start = System.nanoTime();
            if (KnuthMorrisPratt.kmpMatcher(s, pattern) == -1) {
                System.out.println("\"" + pattern + "\"" + " not found");
            } else {
                System.out.println("\"" + pattern + "\"" + " was found");
            }
            long end = System.nanoTime();
            long time = end - start;
            in.close();
            System.out.println("Время выполнения : " + (time/1e+9) + " sec");
            System.out.println("Количество итераций : " + KnuthMorrisPratt.count);
            System.out.println("Префикс-функция образа : " + Arrays.toString(KnuthMorrisPratt.prefixFunction(pattern)));
        }
    }


