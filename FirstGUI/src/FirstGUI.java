import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FirstGUI implements Runnable {
    // Run window
    public void run() {
        JFrame frame = new JFrame("First GUI"); // Create frame
        frame.setSize(500, 500); // Set size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set close operation
        frame.setLayout(new FlowLayout()); // Set layout
        frame.setVisible(true); // Set visible

        JButton button = new JButton("Click me!"); // Create button
        button.setFont(new Font("Arial", Font.BOLD, 24)); // Set font
        button.setSize(200, 300);
        // Add action listener
        button.addActionListener(new ActionListener() {
            @Override
            // Action performed
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You clicked the button!");
            }
        });
        frame.add(button); // Add button to frame
    }

    public static void main(String[] args) {
        FirstGUI gui = new FirstGUI(); // Create new GUI
        gui.run(); // Run window
    }
}