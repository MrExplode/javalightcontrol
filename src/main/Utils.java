package main;

import javax.swing.*;

public class Utils {

    public static void displayPopup(String title, String description) {
        JFrame frame = new JFrame("JLC - "+title);
        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        label.setText(description);
        panel.add(label);
        frame.add(panel);
        frame.setSize(300, 150);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    public static void displayPopup(String title, String description, int width, int height) {
        JFrame frame = new JFrame("JLC - "+title);
        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        label.setText(description);
        panel.add(label);
        frame.add(panel);
        frame.setSize(width, height);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
