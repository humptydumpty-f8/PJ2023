package lec5;

import java.util.Arrays;

/**
 * Бінарний пошук в масивах
 */
public class Ex2_5 {

    static Integer[] i_arr = {-1, 2, -3};
    static Double[] d_arr = {.0001, -20., 1_000.};
    static Character[] c_arr = {'Ф', 'ї', 'ж'};
    static Boolean[] bul_arr = {false, false, false};
    static String[] str = {"st2", "st3", "st1"};

    static class binSearcher<T> {
        T[] arr;
        T needle;

         binSearcher(T[] arr, T needle) {
            this.arr = arr;
            this.needle = needle;
        }

        int find(T[] arr, T needle) {
            Arrays.sort(arr);
            return Arrays.binarySearch(arr, needle);
        }

        void printResult() {
            System.out.println(needle + " in " + Arrays.toString(arr) + ":\n" +
                    "\t" + find(arr,needle));
        }
    }

    public static void main(String[] args) {

        (new binSearcher<Integer>(i_arr, 2)).printResult();
        (new binSearcher<Double>(d_arr, 1000.)).printResult();
        (new binSearcher<Character>(c_arr, 'ж')).printResult();
        (new binSearcher<Boolean>(bul_arr, true)).printResult();
        (new binSearcher<String>(str, "st1")).printResult();

    }
}
