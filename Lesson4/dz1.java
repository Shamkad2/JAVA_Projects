// 1. Реализовать консольное приложение, которое: Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.


package Lesson4;

import java.util.*;

public class dz1 {
    public static void main(String[] args) {
        List<String> ourList = new ArrayList<>();


        System.out.println("Выберите действие: add - Добавить слово, print - Печать списка, revert - Удалить последний элемент, exit - Выход.");
        Scanner sc = new Scanner(System.in);
        String stroka = sc.nextLine();
        while (!stroka.equals("exit")){


            if (stroka.equals("print")) {
                printArray(ourList);
            } else if (stroka.equals("add")) {
                System.out.print("Введите слово для записи: ");
                String newStroka = sc.nextLine();
                addWord(ourList, newStroka);
                System.out.println("Ваше слово " + newStroka + " добавлено.");
            } else if (stroka.equals("revert")) {
                revert(ourList);
            } else {
                System.out.println("Введена неверная комманда! Введите: add - Добавить слово, print - Печать списка, revert - Удалить последний элемент, exit - Выход.");
            }
            System.out.println("Выберите действие: add - Добавить слово, print - Печать списка, revert - Удалить последний элемент, exit - Выход.");
            stroka = sc.nextLine();
        }
        System.out.println("Выход");
    }

    private static List<String> revert(List<String> ourList) {
        int indexOfLastElement = ourList.size() - 1;
        String lastWrd = ourList.get(ourList.size() - 1);
        ourList.remove(indexOfLastElement);
        System.out.println("Удалено слово: " + lastWrd);
        return ourList;
    }

    private static List<String> addWord(List<String> ourList, String newStroka) {
        ourList.add(newStroka);
        return ourList;
    }

    private static void printArray(List<String> ourList) {
        if (ourList.size()!=0) {
            int reverseArrayCounter = ourList.size() - 1;

            for (int i = reverseArrayCounter; i >= 0; i--) {
                System.out.println(ourList.get(i));
            }
        }
        else {
            System.out.println("Список пуст! Добавьте слово.");
        }
    }
    
}
