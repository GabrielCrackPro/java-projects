import javax.swing.*;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.Cursor;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI implements Runnable {
    public void run() {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(400, 300);
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setPreferredSize(frame.getSize());
        frame.setVisible(true);

        JTextField textField = new JTextField(20);
        textField.setFont(new Font("Arial", Font.PLAIN, 20));
        textField.setSize(350, 50);
        textField.setPreferredSize(textField.getSize());
        textField.setHorizontalAlignment(JTextField.LEFT);
        textField.setEditable(false);
        frame.add(textField);

        JButton[] oneToThree = new JButton[4];
        JPanel oneToThreePanel = new JPanel();
        for (int i = 1; i <= 3; i++) {
            oneToThree[i] = new JButton(Integer.toString(i));
            oneToThree[i].setFont(new Font("Arial", Font.PLAIN, 20));
            oneToThree[i].setSize(70, 70);
            oneToThree[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
            oneToThree[i].setPreferredSize(oneToThree[i].getSize());
            oneToThree[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textField.setText(textField.getText() + ((JButton) e.getSource()).getText());
                }
            });
            oneToThreePanel.add(oneToThree[i]);
            oneToThreePanel.setLayout(new GridLayout(1, 3));
            frame.add(oneToThreePanel);
        }
        JButton[] fourToSix = new JButton[7];
        JPanel fourToSixPanel = new JPanel();
        for (int i = 4; i <= 6; i++) {
            fourToSix[i] = new JButton(Integer.toString(i));
            fourToSix[i].setFont(new Font("Arial", Font.PLAIN, 20));
            fourToSix[i].setSize(70, 70);
            fourToSix[i].setPreferredSize(fourToSix[i].getSize());
            fourToSix[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textField.setText(textField.getText() + ((JButton) e.getSource()).getText());
                }
            });
            fourToSixPanel.add(fourToSix[i]);
            fourToSixPanel.setLayout(new GridLayout(1, 3));
            frame.add(fourToSixPanel);
        }
        JButton[] sevenToNine = new JButton[10];
        JPanel sevenToNinePanel = new JPanel();
        for (int i = 7; i <= 9; i++) {
            sevenToNine[i] = new JButton(Integer.toString(i));
            sevenToNine[i].setFont(new Font("Arial", Font.PLAIN, 20));
            sevenToNine[i].setSize(70, 70);
            sevenToNine[i].setPreferredSize(sevenToNine[i].getSize());
            sevenToNine[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textField.setText(textField.getText() + ((JButton) e.getSource()).getText());
                }
            });
            sevenToNinePanel.add(sevenToNine[i]);
            sevenToNinePanel.setLayout(new GridLayout(1, 3));
            frame.add(sevenToNinePanel);
        }
        JButton zero = new JButton("0");
        JPanel zeroPanel = new JPanel();
        zero.setFont(new Font("Arial", Font.PLAIN, 20));
        zero.setSize(70, 70);
        zero.setPreferredSize(zero.getSize());
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + ((JButton) e.getSource()).getText());
            }
        });
        zeroPanel.add(zero);
        zeroPanel.setLayout(new GridLayout(1, 3));
        frame.add(zeroPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new CalculatorGUI());
    }
}
