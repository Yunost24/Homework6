import javax.swing.*;
import java.awt.*;

public class Task11 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My first GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 350);

        JPanel firstPanel = new JPanel();
        firstPanel.setPreferredSize(new Dimension(350, 700)); // Панель будет иметь размер
        JLabel labelHello = new JLabel("Привет Мир!");

        // Добавляем компонент JLabel на firstPanel
        firstPanel.add(labelHello);

        // Добавляем firstPanel на frame
        frame.getContentPane().add(firstPanel);

        // Пакуем компоненты
        frame.pack();
        frame.setVisible(true);
    }
}
