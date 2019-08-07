package Feature8;

import java.awt.*;
import java.awt.event.*;


public class AnonymousFunction {
    public static void main(String[] args) {
        /*Frame frame = new Frame("ActionListener Before Java8");
        Button button = new Button("Click Here");
        button.setBounds(50,100,80,50);
        *//*button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Hello world");
            }

    });*//*
        button.addActionListener(e -> System.out.println("Hello World"));
        frame.add(button);
        frame.setSize(200,200);
        frame.setLayout(null);
        frame.setVisible(true);
    }*/
        Frame frame = new Frame("ActionListener Before Jav8");
        Button button = new Button("Click Me");
        button.setBounds(100, 100, 100, 100);
        //button.addActionListener(e -> System.out.println("Hello World"));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello World");
            }
        });
        frame.add(button);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}

