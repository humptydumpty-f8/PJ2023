package lec3;

/**
 * Приклад використання спеціальних (екрануючих) символів форматування
 */
public class ex1_2 {
    public static void main(String[] args) {

        System.out.println(
                "Спеціальні символи форматування:\n" +
                        "\t \\n - вставка нового рядка\n" +
                        "\t \\b - видалення останнього символа\n" +
                        "\t \\’ - виведення одинарної лапки\n" +
                        "\t \\r - повернення на початок рядка\n" +
                        "\t \\t - табуляция по горизонталі\n" +
                        "\t \\\\ - виведення зворотного слеша\n" +
                        "\t \\\" - виведення лапок\n" +
                        "\t \\num - виведення символу за його 8-ковим поданням ASCII-коду\n");
    }
}
