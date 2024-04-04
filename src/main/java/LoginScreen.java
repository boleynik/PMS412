import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Toolkit;

public class LoginScreen {
    public static void main(String[] args) {
        JFrame window = new JFrame("PMS System Prototype");

        window.setSize((int) Toolkit.getDefaultToolkit().getScreenSize().width * 3 / 4,
                (int) Toolkit.getDefaultToolkit().getScreenSize().height * 3 / 4); // Sets the window to 3/4 the size of the screen it is currently on.
        window.setLocationRelativeTo(null); // Centralizes the window on the screen
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Assigns the close ([X] Button) action to fully exit the program.

        JTextField usernameField = new JTextField(12);
        JTextField passwordField = new JTextField(12);

        JButton loginButton = new JButton("Log In");
        loginButton.addActionListener(e -> {
            // TODO: Implement button/submission of credentials.
        });

        // Create JPanel + Add declared objects to it.
        JPanel loginPanel = new JPanel();
        loginPanel.add(new JLabel("Username:"));
        loginPanel.add(usernameField);
        loginPanel.add(new JLabel("Password:"));
        loginPanel.add(passwordField);
        loginPanel.add(loginButton);

        // Establish layout schema and add JPanel to the window
        window.setLayout(new GridBagLayout());
        window.add(loginPanel, new GridBagConstraints());
        window.setVisible(true);
    }
}
