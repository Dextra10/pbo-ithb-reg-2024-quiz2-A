// View/PersonForm.java
package view;

import javax.swing.JOptionPane;
import controller.UserController;
import model.users;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {
    private JTextField emailField;
    private JTextField passwordField;
    private JButton saveButton;

    public LoginView() {
        setTitle("Login Page");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JTextField();

        saveButton = new JButton("Login");

        add(emailLabel);
        add(emailField);
        add(passwordLabel);
        add(passwordField);
        add(new JLabel()); 
        add(saveButton);

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = emailField.getText();
                String password = passwordField.getText();
                boolean isValidUser = UserController.checkUser(email, password);
                if (!isValidUser) {
                    JOptionPane.showMessageDialog(
                        null, 
                        "Login Gagal!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                    );
                }else {
                    //
                }
            }
        });
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginView form = new LoginView();
            form.setVisible(true);
        });
    }
}
