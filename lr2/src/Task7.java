public class Task7 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", "Иван Иванов", 1000.0);

        System.out.println("\nИнформация о счете:");
        System.out.println("Номер счета: " + account.getAccountNumber());
        System.out.println("Владелец: " + account.getOwner());
        System.out.println("Баланс: " + account.getBalance() + " руб.");

        System.out.println("\nВносим 500 руб...");
        account.deposit(500.0);
        System.out.println("Новый баланс: " + account.getBalance() + " руб.");

        System.out.println("\nСнимаем 300 руб...");
        boolean success = account.withdraw(300.0);
        if (success) {
            System.out.println("Операция успешна. Баланс: " + account.getBalance() + " руб.");
        } else {
            System.out.println("Недостаточно средств!");
        }

        System.out.println("\nПопытка снять 5000 руб...");
        success = account.withdraw(5000.0);
        if (!success) {
            System.out.println("Операция отклонена. Недостаточно средств!");
        }
    }
}

interface BankAccountInterface {
    void deposit(double amount);
    boolean withdraw(double amount);
    double getBalance();
    String getAccountNumber();
    String getOwner();
}

class BankAccount implements BankAccountInterface {
    private String accountNumber;
    private String owner;
    private double balance;

    public BankAccount(String accountNumber, String owner, double initialBalance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Успешно внесено: " + amount + " руб.");
        } else {
            System.out.println("Сумма должна быть положительной!");
        }
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Успешно снято: " + amount + " руб.");
            return true;
        } else {
            System.out.println("Недостаточно средств или некорректная сумма!");
            return false;
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String getOwner() {
        return owner;
    }
}