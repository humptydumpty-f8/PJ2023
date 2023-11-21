package lec12;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Контейнер Window в емуляції спливаючої підказки
 */
public class Ex2_1 extends Frame {

    //Конструктор
    public Ex2_1(String title) {
        super(title);
        setSize(300, 200);
        setLocation(200, 300);
        setVisible(true);
    }

    public static void main(String[] args) throws InterruptedException {

        // Створення батьківського фрейму
        Frame frame = new Ex2_1("Container Window");

        //Створення контейнеру Window
        Window w = new Window(frame);
        w.setSize(100, 100);
        w.setLocation(400, 400);
        w.toFront();//на передній план
        w.setBackground(Color.GREEN);//колір фону
        Label label=new Label("Window");
        w.add(label);
        w.setVisible(true);//візуалізувати (альтернатива застарілому show)
        // w.show();

        System.out.println("Window is showing: " + w.isShowing());//стан видимості
        Thread.sleep(9 * 1000);// затримка 9 мс
        w.setVisible(false);//приховати
        System.out.println("Window is showing: " + w.isShowing());//стан видимості
        Thread.sleep(9 * 1000);// затримка 9 мс
        w.dispose();

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
