package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame{

    Score(String name, int score)
    {
        setTitle("Score");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(200,150,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(120,220,200,150);
        add(image);

        JLabel heading = new JLabel("Thankyou " + name + " for Playing QUIZ test ");
        heading.setBounds(120,60,700,30);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma",Font.BOLD,26));
        add(heading);

        JLabel Score = new JLabel("Your score is " + score);
        Score.setBounds(350,250,300,30);
        Score.setForeground(Color.WHITE);
        Score.setFont(new Font("Tahoma",Font.BOLD,26));
        add(Score);

        JButton exit = new JButton("EXIT");
        exit.setBounds(340,340,100,30);
        exit.setBackground(Color.WHITE);
        exit.setForeground(Color.BLACK);
        add(exit);

        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Profile();
            }
        });

        JButton logout = new JButton("Logout");
        logout.setBounds(470,340,100,30);
        logout.setBackground(Color.WHITE);
        logout.setForeground(Color.BLACK);
        add(logout);
        logout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Login();
            }
        });


        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icons/score1.png"));
        Image i22 = i11.getImage().getScaledInstance(750,550,Image.SCALE_DEFAULT);
        ImageIcon i33 = new ImageIcon(i22);
        JLabel imagee = new JLabel(i33);
        imagee.setBounds(0,0,750,550);
        add(imagee);

        setSize(750,550);
        setLocation(400,150);
//        setUndecorated(true);
        setLayout(null);
        setVisible(true);

    }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        new Score("User",0);
    }
}
