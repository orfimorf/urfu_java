import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов: ");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];
        int counter = 1;

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    array[i][j] = counter++;
                }
            } else {
                for (int j = cols - 1; j >= 0; j--) {
                    array[i][j] = counter++;
                }
            }
        }

        System.out.println("\nЗаполненный массив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%3d ", array[i][j]);
            }
            System.out.println();
        }
    }
}