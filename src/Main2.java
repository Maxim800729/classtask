//Задание 2: Оценка кредита
// Напишите программу, которая запрашивает у пользователя его возраст,
// ежемесячный доход и сумму кредита, который он хочет взять.
// Программа должна проверять следующие условия:
//Возраст должен быть от 18 до 65 лет.
//Доход должен быть не менее 50 000 рублей.
//Сумма кредита не должна превышать 10-кратный размер ежемесячного дохода.
//Если все условия выполняются, программа должна сообщить,
// что кредит одобрен. В противном случае программа должна объяснить причину отказа.

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите Ваш возраст");
        int age = scanner.nextInt();
        System.out.println("Введите ежемесячный доход");
        int monthlyIncome = scanner.nextInt();
        System.out.println("Введите сумму кредита, которую Вы хотите взять");
        int summ = scanner.nextInt();

        if (age < 18 || age > 65) {
            System.out.println("Отказ. Возраст должен быть от 18 до 65 лет.");
        } else if (monthlyIncome < 50000) {
            System.out.println("Отказ. Доход должен быть не менее 50 000 рублей в месяц. ");
        } else if (summ > 10 * monthlyIncome) {
            System.out.println("Отказ.Сумма кредита не должна превышать 10-кратный размер ежемесячного дохода.");
        } else {
            System.out.println("кредит одобрен!");
        }

        scanner.close();
    }
}
