
//Задания на ООП
//Задание 6: Банковский счет

//Создайте класс BankAccount, который содержит:
//Поля: balance (баланс), owner (владелец счета).
//Метод deposit(double amount), который увеличивает баланс.
//Метод withdraw(double amount), который уменьшает баланс, но не позволяет уйти в минус.
//Конструктор, который принимает начальный баланс и имя владельца.
//Напишите программу, которая создает объект BankAccount,
// выполняет несколько операций пополнения и снятия и выводит итоговый баланс.

public class BankAccount {
    private double balance;
    private String owner;


    public BankAccount(double initialBalance, String owner) {
        this.balance = initialBalance;
        this.owner = owner;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(owner + "Пополнил счет на " + amount + " руб. Новый баланс: " + balance);
        } else {
            System.out.println("Ошиибка. Сумма пополнения должна быть положительной.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(owner + " снял " + amount + " руб. Остаток на счете: " + balance);
        } else if (amount > balance) {
            System.out.println("Ошибка. недостаточно средств на счете.");

        } else {
            System.out.println("Ошибка. Сумма снятия должна быть положительной.");
        }

    }

    public double getBalance(){
        return balance;
    }
}
