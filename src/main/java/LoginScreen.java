import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Toolkit;

public class LoginScreen {
    public static void main(String[] args) {
        JFrame window = new JFrame("PMS System Prototype");

        window.setSize((int) Toolkit.getDefaultToolkit().getScreenSize().width * 3 / 4,
                (int) Toolkit.getDefaultToolkit().getScreenSize().height * 3 / 4);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField textField1 = new JTextField(12);
        JTextField textField2 = new JTextField(12);

        JButton button = new JButton("Log In");
        button.addActionListener(e -> {
            // TODO: Implement button/submission of credentials.
        });

        // Create a JPanel to hold components
        JPanel loginPanel = new JPanel();
        loginPanel.add(new JLabel("Username:"));
        loginPanel.add(textField1);
        loginPanel.add(new JLabel("Password:"));
        loginPanel.add(textField2);
        loginPanel.add(button);

        window.add(loginPanel);
        window.setVisible(true);
    }
}
