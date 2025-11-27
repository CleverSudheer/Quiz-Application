package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Register extends JFrame implements ActionListener {

    JTextField usernameField, nameField;
    JPasswordField passwordField;
    JButton register, back;

    Register() {
        setTitle("Register");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/button.png"));
        Image i =i1.getImage().getScaledInstance(560,1000,Image.SCALE_SMOOTH);
        ImageIcon i2=new ImageIcon(i);
        JLabel background = new JLabel(i2);
        setContentPane(background);

        JLabel heading = new JLabel("Register");
        heading.setFont(new Font("Tahoma", Font.BOLD, 24));
        heading.setBounds(150, 20, 200, 30);
        heading.setForeground(Color.WHITE);
        add(heading);

        JLabel name = new JLabel("Name:");
        name.setBounds(50, 70, 100, 30);
        name.setForeground(Color.WHITE);
        add(name);

        nameField = new JTextField();
        nameField.setBounds(150, 70, 200, 30);
        add(nameField);

        JLabel username = new JLabel("Username:");
        username.setBounds(50, 120, 100, 30);
        username.setForeground(Color.WHITE);
        add(username);

        usernameField = new JTextField();
        usernameField.setBounds(150, 120, 200, 30);
        add(usernameField);

        JLabel password = new JLabel("Password:");
        password.setBounds(50, 170, 100, 30);
        password.setForeground(Color.WHITE);
        add(password);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 170, 200, 30);
        add(passwordField);

        register = new JButton("Register");
        register.setBounds(50, 230, 120, 30);
        register.setBackground(Color.BLACK);
        register.setForeground(Color.WHITE);
        register.addActionListener(this);
        add(register);

        back = new JButton("Back to Login");
        back.setBounds(200, 230, 150, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        setSize(400, 330);
        setLocation(500, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == register) {
            String name = nameField.getText();
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if (username.isEmpty() || password.isEmpty() || name.isEmpty()) {
                JOptionPane.showMessageDialog(null, "All fields are required!");
                return;
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter("users.txt", true))) {
                bw.write(username + "," + password + "," + name);
                bw.newLine();
                JOptionPane.showMessageDialog(null, "Registration successful!");
                setVisible(false);
                new Login();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        new Register();
    }
}
