package task_1313;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int s = 0; s <= 2 * n - 2; s++) {
            int iStart = Math.min(s, n - 1);
            int iEnd = Math.max(0, s - (n - 1));

            for (int i = iStart; i >= iEnd; i--) {
                int j = s - i;
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
