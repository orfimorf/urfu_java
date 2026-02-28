import java.time.LocalDate;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentYear = LocalDate.now().getYear();

        System.out.print("Введите год рождения: ");
        int birthYear = scanner.nextInt();

        int age = currentYear - birthYear;
        System.out.println("Ваш возраст: " + age);
    }
}