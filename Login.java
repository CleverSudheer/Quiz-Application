package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Login extends JFrame implements ActionListener {

    JTextField usernameField;
    JPasswordField passwordField;
    JButton login, register;

    Login() {
        setTitle("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/button.png"));
        Image i =i1.getImage().getScaledInstance(600,1000,Image.SCALE_SMOOTH);
        ImageIcon i2=new ImageIcon(i);
        JLabel background = new JLabel(i2);
        setContentPane(background);

        JLabel heading = new JLabel("Login");
        heading.setFont(new Font("Tahoma", Font.BOLD, 24));
        heading.setBounds(150, 20, 200, 30);
        heading.setForeground(Color.WHITE);
        add(heading);

        JLabel username = new JLabel("Username:");
        username.setBounds(50, 70, 100, 30);
        username.setForeground(Color.WHITE);
        add(username);

        usernameField = new JTextField();
        usernameField.setBounds(150, 70, 200, 30);
        add(usernameField);

        JLabel password = new JLabel("Password:");
        password.setBounds(50, 120, 100, 30);
        password.setForeground(Color.WHITE);
        add(password);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 120, 200, 30);
        add(passwordField);

        login = new JButton("Login");
        login.setBounds(50, 180, 120, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        register = new JButton("Register");
        register.setBounds(230, 180, 120, 30);
        register.setBackground(Color.BLACK);
        register.setForeground(Color.WHITE);
        register.addActionListener(this);
        add(register);

        setSize(400, 280);
        setLocation(500, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            try (BufferedReader br = new BufferedReader(new FileReader("users.txt"))) {
                String line;
                boolean found = false;
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split(",");
                    if (parts.length == 3 && parts[0].equals(username) && parts[1].equals(password)) {
                        found = true;
                        setVisible(false);
                        //new Quiz(parts[2]);
                        new Profile();// send the name to Quiz
                        break;
                    }
                }
                if (!found) {
                    JOptionPane.showMessageDialog(null, "Invalid credentials!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
            new Register();
        }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        new Login();
    }
}
