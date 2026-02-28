import java.time.LocalDate;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentYear = LocalDate.now().getYear();

        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();

        int birthYear = currentYear - age;
        System.out.println("Ваш год рождения: " + birthYear);
    }
}