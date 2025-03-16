//3. Задание на switch
//Задание 3: Калькулятор простых операций
//Напишите консольную программу, которая запрашивает у
// пользователя два числа (целые) и оператор (+, -, *, /).
// Используйте switch для выполнения соответствующей арифметической операции.
//Обработайте следующие случаи:
//Деление на ноль (вывести сообщение об ошибке).
//Ввод некорректного оператора (вывести сообщение об ошибке).
//Корректный вывод результата


import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.println("Введите оператор (+, -, *, /). ");
        char operator = scanner.next().charAt(0);

        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();


        switch (operator) {
            case '+':
                System.out.println("Результат : " + (num1 + num2));
                break;

            case '-':
                System.out.println("Результат : " + (num1 - num2));
                break;
            case '*':
                System.out.println("Результат : " + (num1 * num2));
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Ошибка.Деление на ноль");
                } else {
                    System.out.println("Результат : " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Ошибка.Ввод некорректного оператора");

        }
        scanner.close();
    }
}