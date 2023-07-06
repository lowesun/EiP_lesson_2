package lesson_2;
import java.util.Scanner;

public class lesson_2_hw_4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.printf("Введите слово: ");
            String word = scanner.nextLine();

            if(word.isEmpty()){
                throw new RuntimeException("Вы ввели пустую строку, введите текст!");
            }
        }

    }
}