package part2;

import java.util.Scanner;

public class Even {
    public static void isEven(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number % 2 == 0 ? "Число " + number + " четно." : "Число " + number + " нечетно.");
    }
}
