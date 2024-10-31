import javax.swing.*;
import java.awt.*;

public class Task131 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("My first GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 300);

        // Устанавливаем GridLayout для JFrame, чтобы разместить две панели
        frame.setLayout(new GridLayout(1, 3)); // 1 ряд, 3 колонки

        //Первая панель
        JPanel firstPanel = new JPanel();
        firstPanel.setPreferredSize(new Dimension(500,500));
        ImageIcon firstImageWay = new ImageIcon("C:\\Users\\VadimkA\\Desktop\\Работы 5 семестр\\ООП\\GUIPraktik6\\src\\Кот1.jpg"); //Путь к изображению
        JLabel labelImageFirst = new JLabel(firstImageWay);
        JLabel labelTextFirst = new JLabel("Кот улыбается!");


        firstPanel.setLayout(new BoxLayout(firstPanel, BoxLayout.PAGE_AXIS));
        firstPanel.add(labelImageFirst);// добавление компонетов на панель
        firstPanel.add(labelTextFirst);
        frame.add(firstPanel);//добавление панели в frame

        //--------------------------------------------------------------------

        //Вторая панель

        JPanel secondPanel = new JPanel();
        firstPanel.setPreferredSize(new Dimension(500,500));
        ImageIcon secondImageWay = new ImageIcon("C:\\Users\\VadimkA\\Desktop\\Работы 5 семестр\\ООП\\GUIPraktik6\\src\\Кот летучая мышь-1.jpg"); //Путь к изображению
        JLabel labelImageSecond = new JLabel(secondImageWay);
        JLabel labelTextSecond = new JLabel("Кот летучая мышь!");


        secondPanel.setLayout(new BoxLayout(secondPanel, BoxLayout.PAGE_AXIS));
        secondPanel.add(labelImageSecond);// добавление компонетов на панель
        secondPanel.add(labelTextSecond);
        frame.add(secondPanel);//добавление панели в frame

        //--------------------------------------------------------------------

        //Третья панель

        JPanel thirdPanel = new JPanel();
        firstPanel.setPreferredSize(new Dimension(500,500));
        ImageIcon thirdImageWay = new ImageIcon("C:\\Users\\VadimkA\\Desktop\\Работы 5 семестр\\ООП\\GUIPraktik6\\src\\ДаблКэт.jpg"); //Путь к изображению
        JLabel labelImageThird = new JLabel(thirdImageWay);
        JLabel labelTextThird = new JLabel("Кот летучая мышь!");


        thirdPanel.setLayout(new BoxLayout(thirdPanel, BoxLayout.PAGE_AXIS));
        thirdPanel.add(labelImageThird);// добавление компонетов на панель
        thirdPanel.add(labelTextThird);
        frame.add(thirdPanel);//добавление панели в frame




        frame.setVisible(true);

    }
}
