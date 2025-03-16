
//Задание 4: Поиск числа Фибоначчи
//Пользователь вводит целое положительное число n.
// Программа должна вывести n-й элемент
// последовательности Фибоначчи, используя цикл while.
// (Последовательность: 0, 1, 1, 2, 3, 5, 8, 13, …)


import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое положительное число n: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Ощибка: Введите положительное число.");
        } else {
            int a = 0, b = 1, i = 0;

            while (i < n) {
                int temp = a;
                a = b;
                b = temp + b;
                i++;
            }
            System.out.println(n + " -й элемент последовательности Фибоначчи" +a);
        }
        scanner.close();
    }
}
