//Задания на Stream API
//Задание 8: Фильтрация чисел
//Дан список чисел List<Integer>. Используйте Stream API, чтобы:
//Оставить только четные числа.
//Упорядочить их по убыванию.
//Вывести их на экран.
//Пример входных данных: [5, 12, 7, 3, 14, 18, 6]
//Выход: [18, 14, 12, 6]


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main8 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 7, 3, 14, 18, 6);


        List<Integer> filterwdNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .sorted((a, b) -> Integer.compare(b, a))
                .collect(Collectors.toUnmodifiableList());
        System.out.println(filterwdNumbers);

    }
}
