import javax.swing.*;
import java.awt.*;

public class Task12 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("My first GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);

        // Устанавливаем GridLayout для JFrame, чтобы разместить две панели
        frame.setLayout(new GridLayout(1, 2)); // 1 ряд, 2 колонки

        // Первая панель
        JPanel firstPanel = new JPanel();
        firstPanel.setPreferredSize(new Dimension(350, 700)); // Панель будет иметь размер
        JLabel labelFirst = new JLabel("Обычный вывод");

        // Вторая панель
        JPanel secondPanel = new JPanel();
        secondPanel.setPreferredSize(new Dimension(350, 700)); // Панель будет иметь размер
        JLabel labelSecond = new JLabel("Измененный вывод");

        // Настраиваем шрифт и цвет для второго вывода
        Font font = new Font("Segoe UI Black", Font.BOLD, 25);
        labelSecond.setFont(font);
        labelSecond.setForeground(Color.ORANGE);

        secondPanel.setBackground(Color.LIGHT_GRAY);
        // Добавляем компоненты JLabel на панели
        firstPanel.add(labelFirst);
        secondPanel.add(labelSecond);

        // Добавляем панели на frame
        frame.add(firstPanel);
        frame.add(secondPanel);

        // Пакуем компоненты
        frame.pack();
        frame.setVisible(true);
    }
}
