package task_1020;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        int n = scanner.nextInt();
        double r = scanner.nextDouble();

        double[] x = new double[n];
        double[] y = new double[n];

        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextDouble();
            y[i] = scanner.nextDouble();
        }

        double perimeter = 0.0;

        for (int i = 0; i < n; i++) {
            int next = (i + 1) % n;
            double dx = x[i] - x[next];
            double dy = y[i] - y[next];
            perimeter += Math.sqrt(dx * dx + dy * dy);
        }

        double totalLength = perimeter + 2 * Math.PI * r;
        System.out.printf(Locale.ENGLISH,"%.2f%n", totalLength);
    }
}
