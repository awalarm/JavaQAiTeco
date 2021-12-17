package part2;

import java.util.Scanner;

public class Division {
    public static void division(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int number2 = scanner.nextInt();

        double total = (double) number1 / number2;

        System.out.println("Результат: " + total);

    }
}
