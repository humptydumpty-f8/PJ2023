package lec6;

import java.util.PriorityQueue;

/**
 * Черга з пріоритетами
 */
public class Ex5_4 {
    public static void main(String[] args) {

        // Створюємо чергу PriorityQueue
        PriorityQueue<String> namePriorityQueue = new PriorityQueue <> ();

        // Додаємо елементи в чергу
        namePriorityQueue.add ( "Олекса");
        namePriorityQueue.add ( "Микола");
        namePriorityQueue.add ( "Гануся");
        namePriorityQueue.add ( "Надійка");
        namePriorityQueue.add ( "Левко");
        namePriorityQueue.add ( "Катерина");

        System.out.println("Черговість за пріоритетами: " + namePriorityQueue);

        // Видалення елементів відбувається за природним порядком (за алфавітом)
        while (! namePriorityQueue.isEmpty ()) {
            System.out.println (namePriorityQueue.remove ());
        }
    }
}