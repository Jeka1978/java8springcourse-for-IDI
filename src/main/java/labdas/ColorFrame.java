package labdas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Evgeny Borisov
 */
public class ColorFrame extends JFrame {
    public ColorFrame(int count) throws HeadlessException {
        JButton button = new JButton("click to change color");
        add(button, BorderLayout.SOUTH);
        setSize(1500,700);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        count++;
        button.addActionListener(e -> {
            System.out.println("button was clicked");
            getContentPane().setBackground(Color.BLACK);
//            System.out.println("count = " + count);
        });

    }

    public static void main(String[] args) {
        new ColorFrame(1);
    }
}
