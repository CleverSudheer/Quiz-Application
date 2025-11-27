package quiz.app;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Profile extends JFrame implements ActionListener {

    JTextField text;
    JButton Next, Back;

    Profile()
    {
        setTitle("Profile");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        getContentPane().setBackground(Color.WHITE);
//        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Quiz3.png"));
        Image i =i1.getImage().getScaledInstance(1000,500,Image.SCALE_SMOOTH);
        ImageIcon i2=new ImageIcon(i);

        JLabel background = new JLabel(i2);
        background.setBounds(0,0,1000,500);
        background.setLayout(null);
        setContentPane(background);

        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(null);
        leftPanel.setBounds(60, 40, 880, 400);
        leftPanel.setOpaque(false);
//        leftPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        leftPanel.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.WHITE));


        JLabel heading = new JLabel("QUIZ TEST");
        heading.setBounds(140,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(Color.white);
        leftPanel.add(heading);

        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(160,150,300,20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD,18));
        name.setForeground(Color.white);
        leftPanel.add(name);

        text = new JTextField();
        text.setBounds(80,200,300,25);
        text.setFont(new Font("Times New Roman", Font.BOLD,18));
        text.setBorder(BorderFactory.createLineBorder(Color.black));
        leftPanel.add(text);

        Next = new JButton("Next");
        Next.setBounds(100,270,120,25);
        Next.setBackground(new Color(22,99,54));
        Next.setForeground(Color.WHITE);
        Next.addActionListener(this);
        leftPanel.add(Next);

        Back = new JButton("Back");
        Back.setBounds(250,270,120,25);
        Back.setBackground(new Color(22,99,54));
        Back.setForeground(Color.WHITE);
        Back.addActionListener(this);

        leftPanel.add(Back);

        background.add(leftPanel);


        setSize(1000,500);
        setVisible(true);
        setResizable(false);
        setLocation(200,150);



    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Next)
        {
            String name = text.getText();
            setVisible(false);
            new Rules(name);

        }
        else if(e.getSource() == Back)
        {
            System.exit(50);

        }

    }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            } catch (Exception e) {
            e.printStackTrace();
        }
        new Profile();

    }
}
