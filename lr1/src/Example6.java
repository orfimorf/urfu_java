import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите фамилию: ");
        String surname = scanner.nextLine();

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите отчество: ");
        String patronymic = scanner.nextLine();

        System.out.println("Hello " + surname + ", " + name + ", " + patronymic);
    }
}