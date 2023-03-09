// 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы


package Lesson1;



public class dz1 {
    public static void minMaxArr() {
        int[] maxValue = {8, 2, 6, 3, 9, 4, 2, 8, 1, 3, 6, 5};
        int max = maxValue[0];
        int min = maxValue[0];

        for (int i = 0; i < maxValue.length; i++) {
            if (maxValue[i] > max) {
                max = maxValue[i];
            } else if (maxValue[i] < min) {
                min = maxValue[i];
            }
        }
        System.out.println("min" + "\t" + min + " " + "max" + "\t" + max);
    }
}


