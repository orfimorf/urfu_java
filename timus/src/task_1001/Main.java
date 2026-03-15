package task_1001;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Long> numbers = new ArrayList<>();

        while (scanner.hasNextLong()) {
            numbers.add(scanner.nextLong());
        }

        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.printf("%.4f%n", Math.sqrt(numbers.get(i)));
        }
    }
}
