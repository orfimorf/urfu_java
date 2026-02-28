package task_2066;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = scanner.nextInt();
        int mid = scanner.nextInt();
        int max = scanner.nextInt();

        System.out.println(min - max * mid);
    }
}
