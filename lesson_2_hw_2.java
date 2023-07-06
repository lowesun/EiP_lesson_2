package lesson_2;

public class lesson_2_hw_2 {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 5, 4, 6, 8, 1, 6};
        int d = 2;
        if (d == 0) {
            throw new RuntimeException("Делить на 0 нельзя!");
        }
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    }
}