package lec5;

import java.util.Arrays;

/**
 * Відображення 2-вимірного масиву  за допомогою foreach
 */

public class Ex4_3 {

    static <T> void printMatrix(T[][] matrix){
        for (T[] i : matrix) {
            System.out.println(Arrays.toString(i));
        }
    }
    public static void main(String[] args) {

        Integer[][] i_arr = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10}};

        printMatrix(i_arr);

//        todo: Display a 3D Array with foreach
    }
}
