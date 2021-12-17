package part2;

//Написать функцию, внутрь которой передается 3 переменных текущего времени (часы, минуты, секунды) и имя пользователя. В результате вызова этой функции на экран выводится:
//
//Если время от 5 до 12 -> "Доброе утро, {username}"
//Если время от 12 до 16 -> "Добрый день, {username}"
//Если время от 16 до 23 -> "Добрый вечер, {username}"
//Если время от 23 до 5 -> "Доброй ночи, {username}"

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Greetings {
    public static String hi(int[] time, String name){
        if(time[0] >= 5 && time[0] < 12){
            return "Доброе утро, " + name;
        } else if(time[0] >= 12 && time[0] < 16) {
            return "Доброе день, " + name;
        } else if(time[0] >= 16 && time[0] < 23) {
            return "Доброе вечер, " + name;
        }
        return "Доброе ночи, " + name;
    }

    public static int[] getTime(){
        DateTimeFormatter formatter;
        formatter = DateTimeFormatter.ofPattern("HH");
        int currentHours = Integer.parseInt(LocalTime.now().format(formatter));

        formatter = DateTimeFormatter.ofPattern("ss");
        int currentMinutes = Integer.parseInt(LocalTime.now().format(formatter));

        formatter = DateTimeFormatter.ofPattern("ss");
        int currentSeconds = Integer.parseInt(LocalTime.now().format(formatter));

         return new int[]{currentHours, currentMinutes, currentSeconds};
    }
}
