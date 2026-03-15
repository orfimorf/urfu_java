package task_1014;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println(10);
            return;
        }
        if (n == 1) {
            System.out.println(1);
            return;
        }
        ArrayList<Integer> digits = new ArrayList<>();

        for (int d = 9; d >= 2; d--) {
            while (n % d == 0) {
                digits.add(d);
                n /= d;
            }
        }

        if (n > 1) {
            System.out.println(-1);
            return;
        }
        Collections.sort(digits);

        StringBuilder result = new StringBuilder();
        for (int digit : digits) {
            result.append(digit);
        }
        System.out.println(result.toString());
    }
}
