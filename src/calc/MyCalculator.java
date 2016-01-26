package calc;

import javax.swing.*;
import java.awt.*;

public class MyCalculator {
    JPanel windowContent;
    JTextField displayField;
    JButton button0;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton buttonPoint;
    JButton buttonEqual;
    JPanel p1;

    /*В конструкторе создаются все компоненты и добавляются в фрейм
    с помощью комбинации Borderlayout и Gridlayout*/

    MyCalculator() {
        windowContent = new JPanel();
        //Задаём схему для этой панели
        BorderLayout b1 = new BorderLayout();
        windowContent.setLayout(b1);
        //Создаем и отображаем поле. Добавляем его в Северную облать окна
        displayField = new JTextField(30);
        windowContent.add("North", displayField);
        //Создаём кнопки, используя конструктор класса JButton, который принимает текст кнопки в качестве параметра
        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonPoint = new JButton(".");
        buttonEqual = new JButton("=");

        //Создаём панель с GridLayout, которая содержит 12 кнопок
        p1 = new JPanel();
        GridLayout g1 = new GridLayout(4,3);
        p1.setLayout(g1);

        //Добавляем кнопки на панель p1
        p1.add(button0);
        p1.add(button1);
        p1.add(button2);
        p1.add(button3);
        p1.add(button4);
        p1.add(button5);
        p1.add(button6);
        p1.add(button7);
        p1.add(button8);
        p1.add(button9);
        p1.add(buttonPoint);
        p1.add(buttonEqual);

        //Помещаем панель в центральную область окна
        windowContent.add("Center",p1);

        //Создаём фрейм с задаём его основую область окна
        JFrame frame = new JFrame("Calculatur");
        frame.setContentPane(windowContent);

        //Делаем размер окна достаточным для того, чтобы вместить все компоненты
        frame.pack();

        //Наконец, отображаем окно
        frame.setVisible(true);
    }
    public static void main(String[] args){
        MyCalculator calc = new MyCalculator();
    }

}
