package lec5;

/**
 * Обробка аргументів змінної довжини
 */
public class Ex6_1 {
    /**
     * Виводить список введених аргументів
     * @param array аргумент змінної довжини
     */
    static void test(int... array) {
        System.out.println("Число аргументів: " + array.length);
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        test();
        test(1);
        test(1, 2);
        test(new int[]{1,2,3});
    }
}
