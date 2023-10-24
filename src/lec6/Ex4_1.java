package lec6;

import java.util.*;

/**
 * Упорядкування в множинах
 */
public class Ex4_1 {
    public static void main(String[] args) {

        //Створюємо незмінну множину
        Set<Person> persons = Set.of(
                new Person("Дмитро","Гулак-Травін"),
                new Person("Артем","Гусак"),
                new Person("Галина","Рудченко"),
                new Person("Павло","Дудар"),
                new Person("Артем","Семиніжка")
                );

        //Створюємо змінні множини різних видів
        Set<Person> numbersHashSet = new HashSet<>(persons);
         Set<Person> numbersLinkedHashSet = new LinkedHashSet<>(persons);
         Set<Person> numbersTreeSet = new TreeSet<>(persons);

        Set<Person> numbersTreeSetComparator = new TreeSet<>(new PersonNameComparator());
        numbersTreeSetComparator.addAll(persons);

        //Виводимо множини

        //Власний порядок сортування
        System.out.println("HashSet:\n");
        for (Person p:numbersHashSet
             ) {
            System.out.println(p.toString());
        }

        System.out.println();

        //Сортування в порядку додавання в колекцію
        System.out.println("LinkedHashSet:\n");
        for (Person p:numbersLinkedHashSet
             ) {
            System.out.println(p.toString());
        }

        System.out.println();

        //Сортування визначене в класі
        System.out.println("TreeSet:\n");
        for (Person p:numbersTreeSet
             ) {
            System.out.println(p.toString());
        }
        System.out.println();

        //Сортування з використанням компаратора
        System.out.println("TreeSet+Comparator:\n");
        for (Person p:numbersTreeSetComparator
             ) {
            System.out.println(p.toString());
        }
        System.out.println();

    }
}