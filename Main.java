import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        TextAnalyzer a = new JaccardAnalyzer();
        TextAnalyzer b = new CosAnalyzer();
        System.out.println("Нажмите нужную вам цифру : ");
        System.out.println("1.Сравнение файлов");
        System.out.println("2.Сравнение строк с консоли");
        Scanner scanner = new Scanner(System.in);
        int ch1 = scanner.nextInt();
        System.out.println("Нажмите нужную вам цифру : ");
        System.out.println("1.JaccardAnalyzer");
        System.out.println("2.CosAnalyzer");
        int ch2 = scanner.nextInt();
        if (ch1 == 1) {
            System.out.println("Путь к первому файлу :");
            File f1 = new File(scanner.nextLine());
            scanner.nextLine();
            System.out.println("Путь ко второму файлу :");
            File f2 = new File(scanner.nextLine());
            if (ch2 == 1) {
                double JacCoef = a.analyze(new FileTextProvider(f1), new FileTextProvider(f2));
                System.out.println("Жаккард для содержимого файлов: " + JacCoef);
            } else if (ch2 == 2){
                double CosCoef = b.analyze(new FileTextProvider(f1), new FileTextProvider(f2));
                System.out.println("Косинусная мера содержимого файлов: " + CosCoef);
            }
        }else {
            if (ch1 == 2) {
                System.out.println("Введите первую строку : ");
                String s1 = scanner.next();
                scanner.nextLine();
                System.out.println("Введите вторую строку : ");
                String s2 = scanner.next();
                if (ch2 == 1) {
                    double JacCoef = a.analyze(new SimpleTextProvider(s1), new SimpleTextProvider(s2));
                    System.out.println("Жаккард для содержимого строк: " + JacCoef);
                } else if (ch2 == 2){
                    double CosCoef = a.analyze(new SimpleTextProvider(s1), new SimpleTextProvider(s2));
                    System.out.println("Косинусная мера для содержимого строк: " + CosCoef);
                }
            }
        }
    }
}
