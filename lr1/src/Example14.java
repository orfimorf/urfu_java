import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        int n1 = n - 1;
        int n2 = n;
        int n3 = n + 1;

        int sumFirstThree = n1 + n2 + n3;
        int n4 = sumFirstThree * sumFirstThree;

        System.out.println("Последовательность: " + n1 + ", " + n2 + ", " + n3 + ", " + n4);
    }
}