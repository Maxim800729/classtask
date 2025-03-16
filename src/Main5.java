//задание 5: Проверка на палиндром
//  Напишите программу, которая запрашивает у пользователя строку и проверяет,
//  является ли она палиндромом (читается одинаково слева направо и справа налево).
//  Используйте цикл while для проверки.


import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("введите строку:  ");
        String input= scanner.nextLine();

        String str = input.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length()-1;
        boolean isPalindrome = true;

        while (left<right){
            if (str.charAt(left)!=str.charAt(right)){
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome){
            System.out.println("Строка является палиндромом");
        }else {
            System.out.println("Строка  не является палиндромом");
        }
        scanner.close();

    }
}
