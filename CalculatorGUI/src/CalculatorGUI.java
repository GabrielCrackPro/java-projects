import javax.swing.*;

import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI implements Runnable {
    public void run() {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(550, 300);
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.WHITE);

        JTextField textField = new JTextField(20);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setBackground(Color.GRAY);
        textField.setForeground(Color.WHITE);
        textField.setSize(350, 60);
        textField.setPreferredSize(textField.getSize());
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setText("0");
        textField.setEditable(false);

        frame.add(textField);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("AC")) {
                    textField.setText("0");
                } else if (e.getActionCommand().equals("+/-")) {
                    String text = textField.getText();
                    if (text.charAt(0) == '-') {
                        textField.setText(text.substring(1));
                    } else {
                        textField.setText("-" + text);
                    }
                } else if (e.getActionCommand().equals("%")) {
                    String text = textField.getText();
                    textField.setText(text + "%");
                } else if (e.getActionCommand().equals("=")) {
                    String text = textField.getText();
                    textField.setText(calculate(text));
                } else {
                    String text = textField.getText();
                    if (text.equals("0")) {
                        textField.setText(e.getActionCommand());
                    } else {
                        textField.setText(text + e.getActionCommand());
                    }
                }

            }

            private String calculate(String text) {
                String[] parts = text.split("[+\\-\\*\\/]");
                double result = Double.parseDouble(parts[0]);
                if (parts.length > 2) {
                    return "Max numbers allowed: 2";
                }
                for (int i = 1; i < parts.length; i++) {
                    if (text.charAt(i) == '+') {
                        result += Double.parseDouble(parts[i]);
                    } else if (text.charAt(i) == '-') {
                        result -= Double.parseDouble(parts[i]);
                    } else if (text.charAt(i) == '*') {
                        result *= Double.parseDouble(parts[i]);
                    } else if (text.charAt(i) == '/') {
                        result /= Double.parseDouble(parts[i]);
                    }
                }
                return String.valueOf(result);
            }
        };

        JButton[] firstRow = new JButton[4];
        JPanel firstRowPanel = new JPanel();
        firstRowPanel.setBackground(Color.WHITE);
        firstRowPanel.setLayout(new GridLayout(1, 4));
        firstRow[0] = new JButton("AC");
        firstRow[1] = new JButton("+/-");
        firstRow[2] = new JButton("%");
        firstRow[3] = new JButton("/");

        for (int i = 0; i < 4; i++) {
            firstRow[i].setFont(new Font("Arial", Font.BOLD, 20));
            firstRow[i].setSize(50, 50);
            firstRow[i].setPreferredSize(firstRow[i].getSize());
            firstRow[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
            firstRow[i].setOpaque(true);
            firstRow[i].setBorder(BorderFactory.createStrokeBorder(new BasicStroke(1)));
            firstRow[i].setBackground(new Color(253, 141, 14));
            firstRow[i].setForeground(Color.WHITE);
            firstRow[i].setFocusPainted(true);
            firstRow[i].addActionListener(listener);
            firstRowPanel.add(firstRow[i]);
        }
        firstRow[0].setBackground(Color.RED);
        firstRow[3].setBackground(Color.GRAY);
        frame.add(firstRowPanel);

        JButton[] secondRow = new JButton[4];
        JPanel secondRowPanel = new JPanel();
        secondRowPanel.setBackground(Color.GRAY);
        secondRowPanel.setLayout(new GridLayout(1, 4));
        secondRow[0] = new JButton("7");
        secondRow[1] = new JButton("8");
        secondRow[2] = new JButton("9");
        secondRow[3] = new JButton("*");

        for (int i = 0; i < 4; i++) {
            secondRow[i].setFont(new Font("Arial", Font.BOLD, 20));
            secondRow[i].setSize(50, 50);
            secondRow[i].setPreferredSize(secondRow[i].getSize());
            secondRow[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
            secondRow[i].setOpaque(true);
            secondRow[i].setBorder(BorderFactory.createStrokeBorder(new BasicStroke(1)));
            secondRow[i].setBackground(new Color(253, 141, 14));
            secondRow[i].setForeground(Color.WHITE);
            secondRow[i].addActionListener(listener);
            secondRowPanel.add(secondRow[i]);
        }
        secondRow[3].setBackground(Color.GRAY);
        frame.add(secondRowPanel);

        JButton[] thirdRow = new JButton[4];
        JPanel thirdRowPanel = new JPanel();
        thirdRowPanel.setBackground(Color.WHITE);
        thirdRowPanel.setLayout(new GridLayout(1, 4));
        thirdRow[0] = new JButton("4");
        thirdRow[1] = new JButton("5");
        thirdRow[2] = new JButton("6");
        thirdRow[3] = new JButton("-");

        for (int i = 0; i < 4; i++) {
            thirdRow[i].setFont(new Font("Arial", Font.BOLD, 20));
            thirdRow[i].setSize(50, 50);
            thirdRow[i].setPreferredSize(thirdRow[i].getSize());
            thirdRow[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
            thirdRow[i].setOpaque(true);
            thirdRow[i].setBorder(BorderFactory.createStrokeBorder(new BasicStroke(1)));
            thirdRow[i].setBackground(new Color(253, 141, 14));
            thirdRow[i].setForeground(Color.WHITE);
            thirdRow[i].addActionListener(listener);
            thirdRowPanel.add(thirdRow[i]);
        }
        thirdRow[3].setBackground(Color.GRAY);
        frame.add(thirdRowPanel);

        JButton[] fourthRow = new JButton[4];
        JPanel fourthRowPanel = new JPanel();
        fourthRowPanel.setBackground(Color.WHITE);
        fourthRowPanel.setLayout(new GridLayout(1, 4));
        fourthRow[0] = new JButton("1");
        fourthRow[1] = new JButton("2");
        fourthRow[2] = new JButton("3");
        fourthRow[3] = new JButton("+");

        for (int i = 0; i < 4; i++) {
            fourthRow[i].setFont(new Font("Arial", Font.BOLD, 20));
            fourthRow[i].setSize(50, 50);
            fourthRow[i].setPreferredSize(fourthRow[i].getSize());
            fourthRow[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
            fourthRow[i].setOpaque(true);
            fourthRow[i].setBorder(BorderFactory.createStrokeBorder(new BasicStroke(1)));
            fourthRow[i].setBackground(new Color(253, 141, 14));
            fourthRow[i].setForeground(Color.WHITE);
            fourthRow[i].addActionListener(listener);
            fourthRowPanel.add(fourthRow[i]);
        }
        fourthRow[3].setBackground(Color.GRAY);
        frame.add(fourthRowPanel);

        JButton[] fifthRow = new JButton[4];
        JPanel fifthRowPanel = new JPanel();
        fifthRowPanel.setBackground(Color.WHITE);
        fifthRowPanel.setLayout(new GridLayout(1, 4));
        fifthRow[0] = new JButton("0");
        fifthRow[1] = new JButton(".");
        fifthRow[2] = new JButton(" ");
        fifthRow[3] = new JButton("=");

        for (int i = 0; i < 4; i++) {
            fifthRow[i].setFont(new Font("Arial", Font.BOLD, 20));
            fifthRow[i].setSize(50, 50);
            fifthRow[i].setPreferredSize(fifthRow[i].getSize());
            fifthRow[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
            fifthRow[i].setOpaque(true);
            fifthRow[i].setBorder(BorderFactory.createStrokeBorder(new BasicStroke(1)));
            fifthRow[i].setBackground(new Color(253, 141, 14));
            fifthRow[i].setForeground(Color.WHITE);
            fifthRow[i].addActionListener(listener);
            fifthRowPanel.add(fifthRow[i]);
        }
        fifthRow[2].setVisible(false);
        fifthRow[3].setBackground(Color.RED);
        fifthRow[3].setFont(new Font("Arial", Font.BOLD, 30));
        frame.add(fifthRowPanel);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new CalculatorGUI());
    }
}
