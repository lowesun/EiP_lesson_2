package lesson_2
import java.util.Scanner;

public class lesson_2_hw_1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.printf("Введите дробное число: ");
            String input = scanner.next();
            String floatNumberPattern = "-?\\d+(\\.\\d+)?";

            while (!input.matches(floatNumberPattern)) {
                input = scanner.next();
            }
            System.out.println("Введенное число: " + input);
        }
    }
}