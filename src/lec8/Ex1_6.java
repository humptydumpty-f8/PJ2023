package lec8;

import java.util.Scanner;
import static java.lang.System.*;

/**
 * Імпорт класу Scanner і
 * статичних полів out і in класу System
 * з бібліотек java
 */
public class Ex1_6 {
    public static void main(String[] args) {

      out.println("Enter text:");
      Scanner scanner = new Scanner(in);
      String text = scanner.nextLine();
      scanner.close();

      out.println("Entered text:");
      out.println(text);

    }
}
