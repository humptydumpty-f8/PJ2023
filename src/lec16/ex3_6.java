package lec16;

import javax.swing.*;
import java.awt.*;

/**
 * Компонент JToolBar
 * В контекстному меню відображаються команди для вкл/викл прапорця
 * Командам призначені швидкі і "гарячі клавіші". Показана можливість блокування команд
 */
public class ex3_6 extends JFrame {

    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;

    public ex3_6() {
        super("ToolBar");
        setSize(300, 300);
        setLocation(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Додаєм тулбар і розміщуємо її зверху
        JToolBar jToolBar = new JToolBar("Мій тулбар");//задаєм назву для тулбар
        add(jToolBar, BorderLayout.NORTH);

        // Додаємо кнопки в тулбар
        jButton1 = new JButton(new ImageIcon("src/lec11/Herald_of_NTUU_KPI_logo.svg.png"));
        jButton1.setToolTipText("КПІ");
        jToolBar.add(jButton1);//Спливаюча підказка
        jButton2 = new JButton(new ImageIcon("src/lec11/Herald_of_NTUU_KPI_logo.svg.png"));
        jButton2.setToolTipText("КПІ");
        jToolBar.add(jButton2);
        jToolBar.addSeparator();//додаєм розділювач
        jButton3 = new JButton(new ImageIcon("src/lec11/Herald_of_NTUU_KPI_logo.svg.png"));
        jButton3.setToolTipText("КПІ");
        jToolBar.add(jButton3);

        setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ex3_6();//створення вікна
            }
        });
    }
}
