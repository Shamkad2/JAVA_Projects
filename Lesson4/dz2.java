// 2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.



package Lesson4;

import java.util.Iterator;
import java.util.LinkedList;

public class dz2 {
    public static void main(String[] args) throws
            Exception {

        try {

            String str1 = new String("First");
            String str2 = new String("Second");
            String str3 = new String("Third");
            String str4 = new String("Fourth");

            LinkedList<String> ourList = new LinkedList<>();
            ourList.add(str1);
            ourList.add(str2);
            ourList.add(str3);
            ourList.add(str4);

            System.out.println(ourList);

            ourList = reverseLinkedList(ourList);
            System.out.println("\nНовый 'перевернутый список': " + ourList);



            //Создаем итератор
            Iterator x = ourList.descendingIterator();

            // Здесь я просто итерировала наш список без изменения
            while (x.hasNext()) {
                System.out.println("Значение из списка : "
                        + x.next());
            }
        } catch (NullPointerException e) {
            System.out.println("Exception thrown : "
                    + e);
        }

    }
    public static LinkedList<String> reverseLinkedList(LinkedList<String> llist)
    {
        LinkedList<String> revLinkedList = new LinkedList<String>();
        for (int i = llist.size() - 1; i >= 0; i--) {

            // Append the elements in reverse order
            revLinkedList.add(llist.get(i));
        }
        // Return the reversed arraylist
        return revLinkedList;
    }
    
}
