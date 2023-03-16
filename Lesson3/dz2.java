// 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.



package Lesson3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class dz2 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, -9, 18);
        System.out.println("Максимальное число нашего списка: " + Collections.max(list));
        System.out.println("Минимальное число нашего спискм: " + Collections.min(list));
        average();


    }
    public static void average() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, -9, 18);

        // Ищем вручную
        double sum = 0;
        for (int x: list) {
            sum += x;
        }
        System.out.println("1-ый способ Среднее арифметическое чисел равно: " + sum/list.size());

        //Встроенная функция
        System.out.println("2-ой способ Среднее арифметическое чисел равно: " + list.stream().mapToInt(a -> a).average().orElse(0));
    }
    
}
