// 2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.


package Lesson2;

import java.io.FileWriter;
import java.io.IOException;

public class dz2 {
    public static String stringMultiplier(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++)
            sb.append(s);
        return sb.toString();
    }

    public static void stringToFile(String sb) {
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write(sb);
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        String s = "TEST", sb = stringMultiplier(s);
        System.out.println(sb);
        stringToFile(sb);
    }
    
}
