package lec5;

import java.util.Arrays;

/**
 * Перебір елементів 2-вимірного масиву за допомогою foreach
 */

public class Ex4_4 {

    static <T> void getAllElements(T[][] arrDim2) {
        for (T[] i : arrDim2) {
            for (T j : i) {
                System.out.println(j);
            }
        }
    }

    public static void main(String[] args) {

        Integer[][] i_arr = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10}};
        getAllElements(i_arr);

    }
//        todo: Loop over elements in a 3D array with foreach
}

