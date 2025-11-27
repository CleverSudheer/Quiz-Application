//package quiz.app;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class Quiz extends JFrame implements ActionListener {
//
//    String questions[][] = new String[10][5];
//    String answers[][] = new String[10][2];
//    String useranswers[][] = new String[10][1];
//
//    JLabel qno, question;
//    JRadioButton opt1, opt2, opt3, opt4;
//    ButtonGroup group;
//
//    JButton next, submit, help;
//
//    public static int timer = 15;
//
//    public static int ans_given = 0;
//
//    public static int count = 0;
//
//    public static int score = 0;
//    String name;
//
//    Quiz(String name)
//    {
//        this.name = name;
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.png"));
//        JLabel img = new JLabel(i1);
//        img.setBounds(0,0,1440,392);
//        add(img);
//
//        qno = new JLabel();
//        qno.setBounds(100,450,50,30);
//        qno.setFont(new Font("Tahoma",Font.PLAIN,24));
//        add(qno);
//
//        question = new JLabel();
//        question.setBounds(150,450,600,30);
//        question.setFont(new Font("Tahoma",Font.PLAIN,24));
//        add(question);
//
//        questions[0][0] = "Number of primitive data types in Java are.?";
//        questions[0][1] = "6";
//        questions[0][2] = "7";
//        questions[0][3] = "8";
//        questions[0][4] = "9";
//
//        questions[1][0] = "What is the size of float and double in java.?";
//        questions[1][1] = "32 and 64";
//        questions[1][2] = "32 and 32";
//        questions[1][3] = "64 and 64";
//        questions[1][4] = "64 and 32";
//
//        questions[2][0] = "Automatic type conversion is possible in which of the possible cases?";
//        questions[2][1] = "Byte to int";
//        questions[2][2] = "Int to Long";
//        questions[2][3] = "Long to int";
//        questions[2][4] = "Short to int";
//
//        questions[3][0] = "When an array is passed to a method, what does the method receive?";
//        questions[3][1] = "The reference of the array";
//        questions[3][2] = "A copy of the array";
//        questions[3][3] = "Length of the array";
//        questions[3][4] = "Copy of first element";
//
//        questions[4][0] = "Arrays in java are.?";
//        questions[4][1] = "Object References";
//        questions[4][2] = "Objects";
//        questions[4][3] = "Primitive data type";
//        questions[4][4] = "None";
//
//        questions[5][0] = "When is the object created with new keyword?";
//        questions[5][1] = "At rum time";
//        questions[5][2] = "At compile time";
//        questions[5][3] = "Depends on the code";
//        questions[5][4] = "None";
//
//        questions[6][0] = "Identify the corrected definition of a package.?";
//        questions[6][1] = "A package is a collection of editing tools";
//        questions[6][2] = "A package is a collection of Classes";
//        questions[6][3] = "A package is a collection of Classes and interfaces";
//        questions[6][4] = "A package is a collection of interfaces";
//
//        questions[7][0] = "compareTo() returns";
//        questions[7][1] = "True";
//        questions[7][2] = "False";
//        questions[7][3] = "An int value";
//        questions[7][4] = "None";
//
//        questions[8][0] = "To which of the following does the class string belong to.";
//        questions[8][1] = "java.lang";
//        questions[8][2] = "java.awt";
//        questions[8][3] = "java.applet";
//        questions[8][4] = "java.String";
//
//        questions[9][0] = "Total constructor string class have.?";
//        questions[9][1] = "3";
//        questions[9][2] = "7";
//        questions[9][3] = "13";
//        questions[9][4] = "20";
//
//        answers[0][1] = "8";
//        answers[1][1] = "32 and 64";
//        answers[2][1] = "Int to Long";
//        answers[3][1] = "The reference of the array";
//        answers[4][1] = "Objects";
//        answers[5][1] = "At rum time";
//        answers[6][1] = "A package is a collection of Classes and interfaces";
//        answers[7][1] = "An int value";
//        answers[8][1] = "java.lang";
//        answers[9][1] = "13";
//
//        opt1 = new JRadioButton();
//        opt1.setBounds(170,520,700,30);
//        opt1.setBackground(Color.WHITE);
//        opt1.setFont(new Font("Dialog",Font.PLAIN,20));
//        add(opt1);
//
//        opt2 = new JRadioButton();
//        opt2.setBounds(170,560,700,30);
//        opt2.setBackground(Color.WHITE);
//        opt2.setFont(new Font("Dialog",Font.PLAIN,20));
//        add(opt2);
//
//        opt3 = new JRadioButton();
//        opt3.setBounds(170,600,700,30);
//        opt3.setBackground(Color.WHITE);
//        opt3.setFont(new Font("Dialog",Font.PLAIN,20));
//        add(opt3);
//
//        opt4 = new JRadioButton();
//        opt4.setBounds(170,640,700,30);
//        opt4.setBackground(Color.WHITE);
//        opt4.setFont(new Font("Dialog",Font.PLAIN,20));
//        add(opt4);
//
//        group = new ButtonGroup();
//        group.add(opt1);
//        group.add(opt2);
//        group.add(opt3);
//        group.add(opt4);
//
//        next = new JButton("Next");
//        next.setBounds(700,750,200,30);
//        next.setBackground(new Color(22,99,54));
//        next.setForeground(Color.WHITE);
//        next.addActionListener(this);
//        add(next);
//
//        submit = new JButton("Submit");
//        submit.setBounds(1150,750,200,30);
//        submit.setBackground(new Color(255,215,0));
//        submit.setForeground(Color.BLACK);
//        submit.addActionListener(this);
//        submit.setEnabled(false);
//        add(submit);
//
//        help = new JButton("Help");
//        help.setBounds(930,750,200,30);
//        help.setBackground(new Color(22,99,54));
//        help.setForeground(Color.WHITE);
//        help.addActionListener(this);
//
//        add(help);
//
//        start(count);
//
//
//
//
//
//        setSize(1440,850);
//        getContentPane().setBackground(Color.WHITE);
//        setUndecorated(true);
//        setLayout(null);
//        setVisible(true);
//
//
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == next)
//        {
//            repaint();
//            opt1.setEnabled(true);
//            opt2.setEnabled(true);
//            opt3.setEnabled(true);
//            opt4.setEnabled(true);
//            ans_given = 1;
//            if (group.getSelection() == null)
//            {
//                useranswers[count][0]= "";
//            }else {
//                useranswers[count][0] = group.getSelection().getActionCommand();
//
//            }
//
//            if(count == 8){
//                next.setEnabled(false);
//                submit.setEnabled(true);
//            }
//
//            count++;
//            start(count);
//
//        } else  if(e.getSource() == help){
//            if(count ==2 || count ==4 || count ==6 || count ==8 || count ==9){
//                opt2.setEnabled(false);
//                opt3.setEnabled(false);
//            }else{
//                opt1.setEnabled(false);
//                opt4.setEnabled(false);
//            }
//            help.setEnabled(false);
//        } else if(e.getSource() == submit){
//            ans_given =1;
//            if(group.getSelection() == null){
//                useranswers[count][0]= "";
//            }else{
//                useranswers[count][0] = group.getSelection().getActionCommand();
//            }
//            for(int i=0; i<useranswers.length; i++){
//                if(useranswers[i][0].equals(answers[i][1])){
//                    score += 10;
//                }else {
//                    score += 0;
//                }
//            }
//            setVisible(false);
//            new Score(name,score);
//
//        }
//
//
//    }
//    public void paint(Graphics g){
//        super.paint(g);
//
//        String time = "Time left - "+ timer + "seconds";
//        g.setColor(Color.RED);
//        g.setFont(new Font("Tahoma",Font.BOLD,25));
//        if(timer > 0){
//            g.drawString(time, 1100, 500);
//        }else {
//            g.drawString("Times up !!",1100,500);
//
//        }
//        timer --;
//
//        try{
//            Thread.sleep(1000);
//            repaint();
//
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        if(ans_given == 1){
//            ans_given = 0;
//            timer =15;
//
//        }else if(timer < 0) {
//            opt1.setEnabled(true);
//            opt2.setEnabled(true);
//            opt3.setEnabled(true);
//            opt4.setEnabled(true);
//
//            if(count == 8){
//                next.setEnabled(false);
//                submit.setEnabled(true);
//            }
//            if (count == 9) {
//                if (group.getSelection() == null){
//                    useranswers[count][0]= "";
//
//                }else {
//                    useranswers[count][0] = group.getSelection().getActionCommand();
//
//                }
//                for(int i=0; i<useranswers.length; i++){
//                    if(useranswers[i][0].equals(answers[i][1])){
//                        score += 10;
//                    }else {
//                        score += 0;
//                    }
//
//                }
//                setVisible(false);
//                new Score(name, score);
//            }else{
//                if(group.getSelection() == null){
//                    useranswers[count][0]= "";
//                }else {
//                    useranswers[count][0] = group.getSelection().getActionCommand();
//
//                }
//                count++;
//                start(count);
//            }
//        }
//    }
//    public void start(int count){
//        qno.setText(""+(count+1)+". ");
//        question.setText(questions[count][0]);
//        opt1.setText(questions[count][1]);
//        opt1.setActionCommand(questions[count][1]);
//
//        opt2.setText(questions[count][2]);
//        opt2.setActionCommand(questions[count][2]);
//
//        opt3.setText(questions[count][3]);
//        opt3.setActionCommand(questions[count][3]);
//
//        opt4.setText(questions[count][4]);
//        opt4.setActionCommand(questions[count][4]);
//
//        group.clearSelection();
//    }
//
//    public static void main(String[] args) {
//
//        try {
//            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        new Quiz("User");
//    }
//}
// 2nd gpt generatted code

//package quiz.app;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class Quiz extends JFrame implements ActionListener {
//
//    String[][] questions = new String[10][5];
//    String[][] answers = new String[10][2];
//    String[][] useranswers = new String[10][1];
//
//    JLabel qno, question, timerLabel;
//    JRadioButton opt1, opt2, opt3, opt4;
//    ButtonGroup group;
//
//    JButton next, submit, help;
//
//    public static int timer = 15;
//    public static int ans_given = 0;
//    public static int count = 0;
//    public static int score = 0;
//    String name;
//
//    Timer swingTimer;
//
//    Quiz(String name) {
//        this.name = name;
//        setLayout(null);
//
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.png"));
//        JLabel img = new JLabel(i1);
//        img.setBounds(0, 0, 1440, 392);
//        add(img);
//
//        qno = new JLabel();
//        qno.setBounds(100, 450, 50, 30);
//        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
//        add(qno);
//
//        question = new JLabel();
//        question.setBounds(150, 450, 800, 30);
//        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
//        add(question);
//
//        timerLabel = new JLabel("Time left - 15 seconds");
//        timerLabel.setBounds(1100, 500, 300, 30);
//        timerLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
//        timerLabel.setForeground(Color.RED);
//        add(timerLabel);
//
//        opt1 = new JRadioButton();
//        opt1.setBounds(170, 520, 700, 30);
//        opt1.setBackground(Color.WHITE);
//        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
//        add(opt1);
//
//        opt2 = new JRadioButton();
//        opt2.setBounds(170, 560, 700, 30);
//        opt2.setBackground(Color.WHITE);
//        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
//        add(opt2);
//
//        opt3 = new JRadioButton();
//        opt3.setBounds(170, 600, 700, 30);
//        opt3.setBackground(Color.WHITE);
//        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
//        add(opt3);
//
//        opt4 = new JRadioButton();
//        opt4.setBounds(170, 640, 700, 30);
//        opt4.setBackground(Color.WHITE);
//        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
//        add(opt4);
//
//        group = new ButtonGroup();
//        group.add(opt1);
//        group.add(opt2);
//        group.add(opt3);
//        group.add(opt4);
//
//        next = new JButton("Next");
//        next.setBounds(700, 750, 200, 30);
//        next.setBackground(new Color(22, 99, 54));
//        next.setForeground(Color.WHITE);
//        next.addActionListener(this);
//        add(next);
//
//        submit = new JButton("Submit");
//        submit.setBounds(1150, 750, 200, 30);
//        submit.setBackground(new Color(255, 215, 0));
//        submit.setForeground(Color.BLACK);
//        submit.addActionListener(this);
//        submit.setEnabled(false);
//        add(submit);
//
//        help = new JButton("Help");
//        help.setBounds(930, 750, 200, 30);
//        help.setBackground(new Color(22, 99, 54));
//        help.setForeground(Color.WHITE);
//        help.addActionListener(this);
//        add(help);
//
//        setSize(1440, 850);
//        getContentPane().setBackground(Color.WHITE);
//        setUndecorated(true);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setVisible(true);
//
//        loadQuestions();
//        start(count);
//        startTimer();
//    }
//
//    void loadQuestions() {
//        questions[0][0] = "How many primitive data types are there in Java?";
//        questions[0][1] = "6";
//        questions[0][2] = "7";
//        questions[0][3] = "8";
//        questions[0][4] = "9";
//
//        questions[1][0] = "What is the size of float and double in Java?";
//        questions[1][1] = "32 and 64";
//        questions[1][2] = "32 and 32";
//        questions[1][3] = "64 and 64";
//        questions[1][4] = "64 and 32";
//
//        questions[2][0] = "Automatic type conversion is possible in which case?";
//        questions[2][1] = "Byte to int";
//        questions[2][2] = "Int to Long";
//        questions[2][3] = "Long to int";
//        questions[2][4] = "Short to int";
//
//        questions[3][0] = "When an array is passed to a method, what does the method receive?";
//        questions[3][1] = "The reference of the array";
//        questions[3][2] = "A copy of the array";
//        questions[3][3] = "Length of the array";
//        questions[3][4] = "Copy of first element";
//
//        questions[4][0] = "What are arrays in Java?";
//        questions[4][1] = "Object References";
//        questions[4][2] = "Objects";
//        questions[4][3] = "Primitive data type";
//        questions[4][4] = "None";
//
//        questions[5][0] = "When is the object created with new keyword?";
//        questions[5][1] = "At run time";
//        questions[5][2] = "At compile time";
//        questions[5][3] = "Depends on the code";
//        questions[5][4] = "None";
//
//        questions[6][0] = "Identify the correct definition of a package.";
//        questions[6][1] = "A package is a collection of editing tools";
//        questions[6][2] = "A package is a collection of Classes";
//        questions[6][3] = "A package is a collection of Classes and interfaces";
//        questions[6][4] = "A package is a collection of interfaces";
//
//        questions[7][0] = "What does compareTo() return?";
//        questions[7][1] = "True";
//        questions[7][2] = "False";
//        questions[7][3] = "An int value";
//        questions[7][4] = "None";
//
//        questions[8][0] = "To which package does the String class belong?";
//        questions[8][1] = "java.lang";
//        questions[8][2] = "java.awt";
//        questions[8][3] = "java.applet";
//        questions[8][4] = "java.String";
//
//        questions[9][0] = "How many constructors does the String class have?";
//        questions[9][1] = "3";
//        questions[9][2] = "7";
//        questions[9][3] = "13";
//        questions[9][4] = "20";
//
//        answers[0][1] = "8";
//        answers[1][1] = "32 and 64";
//        answers[2][1] = "Int to Long";
//        answers[3][1] = "The reference of the array";
//        answers[4][1] = "Objects";
//        answers[5][1] = "At run time";
//        answers[6][1] = "A package is a collection of Classes and interfaces";
//        answers[7][1] = "An int value";
//        answers[8][1] = "java.lang";
//        answers[9][1] = "13";
//    }
//
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == next) {
//            recordAnswer();
//            if (count == 8) {
//                next.setEnabled(false);
//                submit.setEnabled(true);
//            }
//            count++;
//            start(count);
//        } else if (e.getSource() == help) {
//            if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
//                opt2.setEnabled(false);
//                opt3.setEnabled(false);
//            } else {
//                opt1.setEnabled(false);
//                opt4.setEnabled(false);
//            }
//            help.setEnabled(false);
//        } else if (e.getSource() == submit) {
//            recordAnswer();
//            calculateScore();
//            setVisible(false);
//            new Score(name, score);
//        }
//    }
//
//    void recordAnswer() {
//        ans_given = 1;
//        if (group.getSelection() == null) {
//            useranswers[count][0] = "";
//        } else {
//            useranswers[count][0] = group.getSelection().getActionCommand();
//        }
//    }
//
//    void calculateScore() {
//        for (int i = 0; i < useranswers.length; i++) {
//            if (useranswers[i][0].equals(answers[i][1])) {
//                score += 10;
//            }
//        }
//    }
//
//    void start(int count) {
//        qno.setText((count + 1) + ". ");
//        question.setText(questions[count][0]);
//        opt1.setText(questions[count][1]);
//        opt1.setActionCommand(questions[count][1]);
//
//        opt2.setText(questions[count][2]);
//        opt2.setActionCommand(questions[count][2]);
//
//        opt3.setText(questions[count][3]);
//        opt3.setActionCommand(questions[count][3]);
//
//        opt4.setText(questions[count][4]);
//        opt4.setActionCommand(questions[count][4]);
//
//        group.clearSelection();
//        help.setEnabled(true);
//        timer = 15;
//    }
//
//    void startTimer() {
//        swingTimer = new Timer(1000, new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                timerLabel.setText("Time left - " + timer + " seconds");
//                timer--;
//
//                if (timer < 0) {
//                    recordAnswer();
//                    if (count == 9) {
//                        swingTimer.stop();
//                        calculateScore();
//                        setVisible(false);
//                        new Score(name, score);
//                    } else {
//                        count++;
//                        start(count);
//                    }
//                }
//            }
//        });
//        swingTimer.start();
//    }

// 3rd generated code

//


//package quiz.app;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class Quiz extends JFrame implements ActionListener {
//
//    String[][] questions = new String[10][5];
//    String[][] answers = new String[10][2];
//    String[][] useranswers = new String[10][1];
//
//    JLabel qno, question, timerLabel;
//    JRadioButton opt1, opt2, opt3, opt4;
//    ButtonGroup group;
//
//    JButton next, submit, previous;
//
//    public static int timer = 15;
//    public static int ans_given = 0;
//    public static int count = 0;
//    public static int score = 0;
//    String name;
//
//    Timer swingTimer;
//
//    Quiz(String name) {
//        this.name = name;
//        setLayout(null);
//
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.png"));
//        JLabel img = new JLabel(i1);
//        img.setBounds(0, 0, 1440, 392);
//        add(img);
//
//        qno = new JLabel();
//        qno.setBounds(100, 450, 50, 30);
//        qno.setFont(new Font("Tahoma", Font.BOLD, 24));
//        add(qno);
//
//        question = new JLabel();
//        question.setBounds(150, 450, 800, 30);
//        question.setFont(new Font("Tahoma", Font.BOLD, 24));
//        add(question);
//
//        timerLabel = new JLabel("Time left - 15 seconds");
//        timerLabel.setBounds(1100, 500, 300, 30);
//        timerLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
//        timerLabel.setForeground(Color.RED);
//        add(timerLabel);
//
//        opt1 = new JRadioButton();
//        opt1.setBounds(170, 520, 700, 30);
//        opt1.setBackground(Color.WHITE);
//        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
//        add(opt1);
//
//        opt2 = new JRadioButton();
//        opt2.setBounds(170, 560, 700, 30);
//        opt2.setBackground(Color.WHITE);
//        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
//        add(opt2);
//
//        opt3 = new JRadioButton();
//        opt3.setBounds(170, 600, 700, 30);
//        opt3.setBackground(Color.WHITE);
//        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
//        add(opt3);
//
//        opt4 = new JRadioButton();
//        opt4.setBounds(170, 640, 700, 30);
//        opt4.setBackground(Color.WHITE);
//        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
//        add(opt4);
//
//        group = new ButtonGroup();
//        group.add(opt1);
//        group.add(opt2);
//        group.add(opt3);
//        group.add(opt4);
//
//        next = new JButton("Next");
//        next.setBounds(700, 750, 200, 30);
//        next.setBackground(new Color(22, 99, 54));
//        next.setForeground(Color.WHITE);
//        next.addActionListener(this);
//        add(next);
//
//        previous = new JButton("Previous");
//        previous.setBounds(450, 750, 200, 30);
//        previous.setBackground(new Color(22, 99, 54));
//        previous.setForeground(Color.WHITE);
//        previous.addActionListener(this);
//        add(previous);
//
//        submit = new JButton("Submit");
//        submit.setBounds(1150, 750, 200, 30);
//        submit.setBackground(new Color(255, 215, 0));
//        submit.setForeground(Color.BLACK);
//        submit.addActionListener(this);
//        submit.setEnabled(false);
//        add(submit);
//
//        setSize(1440, 850);
//        getContentPane().setBackground(Color.WHITE);
//        setUndecorated(true);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setVisible(true);
//
//        loadQuestions();
//        resetQuiz();
//    }
//
//    void loadQuestions() {
//        questions[0][0] = "How many primitive data types are there in Java?";
//        questions[0][1] = "6";
//        questions[0][2] = "7";
//        questions[0][3] = "8";
//        questions[0][4] = "9";
//
//        questions[1][0] = "What is the size of float and double in Java?";
//        questions[1][1] = "32 and 64";
//        questions[1][2] = "32 and 32";
//        questions[1][3] = "64 and 64";
//        questions[1][4] = "64 and 32";
//
//        questions[2][0] = "Automatic type conversion is possible in which case?";
//        questions[2][1] = "Byte to int";
//        questions[2][2] = "Int to Long";
//        questions[2][3] = "Long to int";
//        questions[2][4] = "Short to int";
//
//        questions[3][0] = "When an array is passed to a method, what does the method receive?";
//        questions[3][1] = "The reference of the array";
//        questions[3][2] = "A copy of the array";
//        questions[3][3] = "Length of the array";
//        questions[3][4] = "Copy of first element";
//
//        questions[4][0] = "What are arrays in Java?";
//        questions[4][1] = "Object References";
//        questions[4][2] = "Objects";
//        questions[4][3] = "Primitive data type";
//        questions[4][4] = "None";
//
//        questions[5][0] = "When is the object created with new keyword?";
//        questions[5][1] = "At run time";
//        questions[5][2] = "At compile time";
//        questions[5][3] = "Depends on the code";
//        questions[5][4] = "None";
//
//        questions[6][0] = "Identify the correct definition of a package.";
//        questions[6][1] = "A package is a collection of editing tools";
//        questions[6][2] = "A package is a collection of Classes";
//        questions[6][3] = "A package is a collection of Classes and interfaces";
//        questions[6][4] = "A package is a collection of interfaces";
//
//        questions[7][0] = "What does compareTo() return?";
//        questions[7][1] = "True";
//        questions[7][2] = "False";
//        questions[7][3] = "An int value";
//        questions[7][4] = "None";
//
//        questions[8][0] = "To which package does the String class belong?";
//        questions[8][1] = "java.lang";
//        questions[8][2] = "java.awt";
//        questions[8][3] = "java.applet";
//        questions[8][4] = "java.String";
//
//        questions[9][0] = "How many constructors does the String class have?";
//        questions[9][1] = "3";
//        questions[9][2] = "7";
//        questions[9][3] = "13";
//        questions[9][4] = "20";
//
//        answers[0][1] = "8";
//        answers[1][1] = "32 and 64";
//        answers[2][1] = "Int to Long";
//        answers[3][1] = "The reference of the array";
//        answers[4][1] = "Objects";
//        answers[5][1] = "At run time";
//        answers[6][1] = "A package is a collection of Classes and interfaces";
//        answers[7][1] = "An int value";
//        answers[8][1] = "java.lang";
//        answers[9][1] = "13";
//    }
//
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == next) {
//            recordAnswer();
//            if (count == 8) {
//                next.setEnabled(false);
//                submit.setEnabled(true);
//            }
//            count++;
//            start(count);
//        } else if (e.getSource() == previous) {
//            if (count > 0) {
//                count--;
//                start(count);
//            }
//        } else if (e.getSource() == submit) {
//            recordAnswer();
//            calculateScore();
//            setVisible(false);
//            new Score(name, score);
//        }
//    }
//
//    void recordAnswer() {
//        ans_given = 1;
//        if (group.getSelection() == null) {
//            useranswers[count][0] = "";
//        } else {
//            useranswers[count][0] = group.getSelection().getActionCommand();
//        }
//    }
//
//    void calculateScore() {
//        score = 0;
//        for (int i = 0; i < useranswers.length; i++) {
//            if (useranswers[i][0] != null && useranswers[i][0].equals(answers[i][1])) {
//                score += 10;
//            }
//        }
//    }
//
//    void start(int count) {
//        qno.setText((count + 1) + ". ");
//        question.setText(questions[count][0]);
//        opt1.setText(questions[count][1]);
//        opt1.setActionCommand(questions[count][1]);
//
//        opt2.setText(questions[count][2]);
//        opt2.setActionCommand(questions[count][2]);
//
//        opt3.setText(questions[count][3]);
//        opt3.setActionCommand(questions[count][3]);
//
//        opt4.setText(questions[count][4]);
//        opt4.setActionCommand(questions[count][4]);
//
//        group.clearSelection();
//        timer = 15;
//    }
//
//    void startTimer() {
//        swingTimer = new Timer(1000, new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                timerLabel.setText("Time left - " + timer + " seconds");
//                timer--;
//
//                if (timer < 0) {
//                    recordAnswer();
//                    if (count == 9) {
//                        swingTimer.stop();
//                        calculateScore();
//                        setVisible(false);
//                        new Score(name, score);
//                    } else {
//                        count++;
//                        start(count);
//                    }
//                }
//            }
//        });
//        swingTimer.start();
//    }
//
//    void resetQuiz() {
//        for (int i = 0; i < useranswers.length; i++) {
//            useranswers[i][0] = "";
//        }
//        count = 0;
//        score = 0;
//        timer = 15;
//        next.setEnabled(true);
//        submit.setEnabled(false);
//        start(count);
//        startTimer();
//    }



//4th gen code
//package quiz.app;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class Quiz extends JFrame implements ActionListener {
//
//    String[][] questions = new String[10][5];
//    String[][] answers = new String[10][2];
//    String[][] useranswers = new String[10][1];
//
//    JLabel qno, question, timerLabel;
//    JRadioButton opt1, opt2, opt3, opt4;
//    ButtonGroup group;
//
//    JButton next, submit, previous;
//
//    public static int timer = 15;
//    public static int ans_given = 0;
//    public static int count = 0;
//    public static int score = 0;
//    String name;
//
//    Timer swingTimer;
//
//    Quiz(String name) {
//        this.name = name;
//        setLayout(null);
//
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.png"));
//        JLabel img = new JLabel(i1);
//        img.setBounds(0, 0, 1440, 392);
//        add(img);
//
//        qno = new JLabel();
//        qno.setBounds(100, 450, 50, 30);
//        qno.setFont(new Font("Tahoma", Font.BOLD, 24));
//        add(qno);
//
//        question = new JLabel();
//        question.setBounds(150, 450, 800, 30);
//        question.setFont(new Font("Tahoma", Font.BOLD, 24));
//        add(question);
//
//        timerLabel = new JLabel("Time left - 15 seconds");
//        timerLabel.setBounds(1100, 500, 300, 30);
//        timerLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
//        timerLabel.setForeground(Color.RED);
//        add(timerLabel);
//
//        opt1 = new JRadioButton();
//        opt1.setBounds(170, 520, 700, 30);
//        opt1.setBackground(Color.WHITE);
//        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
//        add(opt1);
//
//        opt2 = new JRadioButton();
//        opt2.setBounds(170, 560, 700, 30);
//        opt2.setBackground(Color.WHITE);
//        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
//        add(opt2);
//
//        opt3 = new JRadioButton();
//        opt3.setBounds(170, 600, 700, 30);
//        opt3.setBackground(Color.WHITE);
//        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
//        add(opt3);
//
//        opt4 = new JRadioButton();
//        opt4.setBounds(170, 640, 700, 30);
//        opt4.setBackground(Color.WHITE);
//        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
//        add(opt4);
//
//        group = new ButtonGroup();
//        group.add(opt1);
//        group.add(opt2);
//        group.add(opt3);
//        group.add(opt4);
//
//        next = new JButton("Next");
//        next.setBounds(700, 750, 200, 30);
//        next.setBackground(new Color(22, 99, 54));
//        next.setForeground(Color.WHITE);
//        next.addActionListener(this);
//        add(next);
//
//        previous = new JButton("Previous");
//        previous.setBounds(450, 750, 200, 30);
//        previous.setBackground(new Color(22, 99, 54));
//        previous.setForeground(Color.WHITE);
//        previous.addActionListener(this);
//        add(previous);
//
//        submit = new JButton("Submit");
//        submit.setBounds(1150, 750, 200, 30);
//        submit.setBackground(new Color(255, 215, 0));
//        submit.setForeground(Color.BLACK);
//        submit.addActionListener(this);
//        submit.setEnabled(false);
//        add(submit);
//
//        setSize(1440, 850);
//        getContentPane().setBackground(Color.WHITE);
//        setUndecorated(true);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setVisible(true);
//
//        loadQuestions();
//        resetQuiz();
//    }
//
//    void loadQuestions() {
//        questions[0][0] = "How many primitive data types are there in Java?";
//        questions[0][1] = "6";
//        questions[0][2] = "7";
//        questions[0][3] = "8";
//        questions[0][4] = "9";
//
//        questions[1][0] = "What is the size of float and double in Java?";
//        questions[1][1] = "32 and 64";
//        questions[1][2] = "32 and 32";
//        questions[1][3] = "64 and 64";
//        questions[1][4] = "64 and 32";
//
//        questions[2][0] = "Automatic type conversion is possible in which case?";
//        questions[2][1] = "Byte to int";
//        questions[2][2] = "Int to Long";
//        questions[2][3] = "Long to int";
//        questions[2][4] = "Short to int";
//
//        questions[3][0] = "When an array is passed to a method, what does the method receive?";
//        questions[3][1] = "The reference of the array";
//        questions[3][2] = "A copy of the array";
//        questions[3][3] = "Length of the array";
//        questions[3][4] = "Copy of first element";
//
//        questions[4][0] = "What are arrays in Java?";
//        questions[4][1] = "Object References";
//        questions[4][2] = "Objects";
//        questions[4][3] = "Primitive data type";
//        questions[4][4] = "None";
//
//        questions[5][0] = "When is the object created with new keyword?";
//        questions[5][1] = "At run time";
//        questions[5][2] = "At compile time";
//        questions[5][3] = "Depends on the code";
//        questions[5][4] = "None";
//
//        questions[6][0] = "Identify the correct definition of a package.";
//        questions[6][1] = "A package is a collection of editing tools";
//        questions[6][2] = "A package is a collection of Classes";
//        questions[6][3] = "A package is a collection of Classes and interfaces";
//        questions[6][4] = "A package is a collection of interfaces";
//
//        questions[7][0] = "What does compareTo() return?";
//        questions[7][1] = "True";
//        questions[7][2] = "False";
//        questions[7][3] = "An int value";
//        questions[7][4] = "None";
//
//        questions[8][0] = "To which package does the String class belong?";
//        questions[8][1] = "java.lang";
//        questions[8][2] = "java.awt";
//        questions[8][3] = "java.applet";
//        questions[8][4] = "java.String";
//
//        questions[9][0] = "How many constructors does the String class have?";
//        questions[9][1] = "3";
//        questions[9][2] = "7";
//        questions[9][3] = "13";
//        questions[9][4] = "20";
//
//        answers[0][1] = "8";
//        answers[1][1] = "32 and 64";
//        answers[2][1] = "Int to Long";
//        answers[3][1] = "The reference of the array";
//        answers[4][1] = "Objects";
//        answers[5][1] = "At run time";
//        answers[6][1] = "A package is a collection of Classes and interfaces";
//        answers[7][1] = "An int value";
//        answers[8][1] = "java.lang";
//        answers[9][1] = "13";
//    }
//
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == next) {
//            recordAnswer();
//            if (count == 8) {
//                next.setEnabled(false);
//                submit.setEnabled(true);
//            }
//            count++;
//            start(count);
//        } else if (e.getSource() == previous) {
//            if (count > 0) {
//                count--;
//                start(count);
//            }
//        } else if (e.getSource() == submit) {
//            recordAnswer();
//            calculateScore();
//            setVisible(false);
//            new Score(name, score);
//        }
//    }
//
//    void recordAnswer() {
//        ans_given = 1;
//        if (group.getSelection() == null) {
//            useranswers[count][0] = "";
//        } else {
//            useranswers[count][0] = group.getSelection().getActionCommand();
//        }
//    }
//
//    void calculateScore() {
//        score = 0;
//        for (int i = 0; i < useranswers.length; i++) {
//            if (useranswers[i][0] != null && useranswers[i][0].equals(answers[i][1])) {
//                score += 10;
//            }
//        }
//    }
//
//    void start(int count) {
//        qno.setText((count + 1) + ". ");
//        question.setText(questions[count][0]);
//        opt1.setText(questions[count][1]);
//        opt1.setActionCommand(questions[count][1]);
//
//        opt2.setText(questions[count][2]);
//        opt2.setActionCommand(questions[count][2]);
//
//        opt3.setText(questions[count][3]);
//        opt3.setActionCommand(questions[count][3]);
//
//        opt4.setText(questions[count][4]);
//        opt4.setActionCommand(questions[count][4]);
//
//        group.clearSelection();
//
//        // Restore previous selection if exists
//        if (useranswers[count][0] != null) {
//            String savedAnswer = useranswers[count][0];
//            if (opt1.getActionCommand().equals(savedAnswer)) opt1.setSelected(true);
//            else if (opt2.getActionCommand().equals(savedAnswer)) opt2.setSelected(true);
//            else if (opt3.getActionCommand().equals(savedAnswer)) opt3.setSelected(true);
//            else if (opt4.getActionCommand().equals(savedAnswer)) opt4.setSelected(true);
//        }
//
//        timer = 15;
//        timer = 15;
//    }
//
//    void startTimer() {
//        swingTimer = new Timer(1000, new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                timerLabel.setText("Time left - " + timer + " seconds");
//                timer--;
//
//                if (timer < 0) {
//                    recordAnswer();
//                    if (count == 9) {
//                        swingTimer.stop();
//                        calculateScore();
//                        setVisible(false);
//                        new Score(name, score);
//                    } else {
//                        count++;
//                        start(count);
//                    }
//                }
//            }
//        });
//        swingTimer.start();
//    }
//
//    void resetQuiz() {
//        for (int i = 0; i < useranswers.length; i++) {
//            useranswers[i][0] = "";
//        }
//        count = 0;
//        score = 0;
//        timer = 15;
//        next.setEnabled(true);
//        submit.setEnabled(false);
//        start(count);
//        startTimer();
//    }
// 4th gen code
package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Quiz extends JFrame implements ActionListener {

    String[][] questions = new String[10][5];
    String[][] answers = new String[10][2];
    String[][] useranswers = new String[10][1];

    JLabel qno, timerLabel;
    JTextArea question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup group;

    JButton next, submit, previous;

    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;
    String name;

    Timer swingTimer;

    Quiz(String name) {
        this.name = name;
        setLayout(null);
        setTitle("Quiz");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/top.png"));
//        JLabel img = new JLabel(i1);
//        img.setBounds(0, 0, 1440, 300);
//        add(img);

        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(null);
        leftPanel.setBounds(10, 50, 500, 600);
        leftPanel.setOpaque(false);
//        leftPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        leftPanel.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
        add(leftPanel);

        JPanel middlePanel = new JPanel();
        middlePanel.setLayout(null);
        middlePanel.setBounds(515, 50, 500, 600);
        middlePanel.setOpaque(false);
//        leftPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        middlePanel.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
        add(middlePanel);

        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(null);
        rightPanel.setBounds(1020, 50, 400, 600);
        rightPanel.setOpaque(false);
//        leftPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        rightPanel.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
        add(rightPanel);

        for (int i = 0; i < 10; i++) {
            JButton numBtn = new JButton(String.valueOf(i + 1));
            numBtn.setBounds(20 + (i % 5) * 70, 20 + (i / 5) * 70, 50, 50); // 5 buttons per row
            numBtn.setFont(new Font("Tahoma", Font.BOLD, 16));
            numBtn.setBackground(new Color(59, 60, 136));
            numBtn.setForeground(Color.WHITE);
            int index = i; // for use in lambda
            numBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    count = index;
                    if(count < 9) {
                        next.setEnabled(true);
                        submit.setVisible(false);
                    }else if(count == 9) {
                        next.setEnabled(false);
                        submit.setVisible(true);
                    }
                    start(count);
                }
            });
            rightPanel.add(numBtn);
        }


        JLabel instructions = new JLabel("    Select the correct answer");
        instructions.setBounds(0,0,500,40);
        instructions.setFont(new Font("Viner Hand ITC",Font.BOLD,20));
        instructions.setOpaque(true);
        instructions.setBackground(new Color(59, 60, 136));
        instructions.setForeground(Color.WHITE);
        leftPanel.add(instructions);

        qno = new JLabel();
        qno.setBounds(20, 80, 50, 30);
        qno.setFont(new Font("Tahoma", Font.BOLD, 20));
        qno.setForeground(Color.BLACK);
        leftPanel.add(qno);


        question = new JTextArea();
        question.setBounds(60, 80, 400, 80);  // Fit in leftPanel (850 - some margin)
        question.setFont(new Font("Tahoma", Font.BOLD, 20));
        question.setLineWrap(true);            // Enable word wrapping ✅
        question.setWrapStyleWord(true);       // Wrap on word boundary
        question.setEditable(false);           // Read-only
        question.setOpaque(false);             // Transparent background to blend in
        question.setFocusable(false);          // Prevent focus highlight
        leftPanel.add(question);




//        question = new JLabel();
//        question.setBounds(40, 40, 800, 30);
//        question.setFont(new Font("Tahoma", Font.BOLD, 19));
//        question.setForeground(Color.BLACK);
//        leftPanel.add(question);

        timerLabel = new JLabel("Time left - 15 seconds");
        timerLabel.setBounds(1100, 20, 300, 30);
        timerLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        timerLabel.setForeground(Color.ORANGE);
        add(timerLabel);

        opt1 = new JRadioButton();
        opt1.setBounds(530, 100, 400, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 15));
        add(opt1);

        opt2 = new JRadioButton();
        opt2.setBounds(530, 150, 400, 30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 15));
        add(opt2);

        opt3 = new JRadioButton();
        opt3.setBounds(530, 200, 400, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 15));
        add(opt3);

        opt4 = new JRadioButton();
        opt4.setBounds(530, 250, 400, 30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 15));
        add(opt4);

        group = new ButtonGroup();
        group.add(opt1);
        group.add(opt2);
        group.add(opt3);
        group.add(opt4);

        next = new JButton("Next");
        next.setBounds(780, 700, 100, 30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        previous = new JButton("Previous");
        previous.setBounds(660, 700, 100, 30);
        previous.setBackground(Color.BLACK);
        previous.setForeground(Color.WHITE);
        previous.addActionListener(this);
        add(previous);

        submit = new JButton("Finish");
        submit.setBounds(1100, 700, 200, 30);
        submit.setBackground(Color.RED);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setVisible(false);
        submit.setEnabled(false);
        add(submit);
        add(leftPanel);

        setSize(1440, 900);

        getContentPane().setBackground(Color.WHITE);
//        setUndecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        loadQuestions();
        resetQuiz();
    }

    void loadQuestions() {
        questions[0][0] = "Which package is used for creating GUI in Java?";
        questions[0][1] = "java.io";
        questions[0][2] = "java.util";
        questions[0][3] = "java.awt";
        questions[0][4] = "java.sql";

        questions[1][0] = "Which of these is a top-level container in Swing?";
        questions[1][1] = "JPanel";
        questions[1][2] = "JFrame";
        questions[1][3] = "JButton";
        questions[1][4] = "JTextField";

        questions[2][0] = "Which method is used to add components to a JFrame?";
        questions[2][1] = "put()";
        questions[2][2] = "insert()";
        questions[2][3] = "add()";
        questions[2][4] = "include()";

        questions[3][0] = "What layout arranges components in a row, and wraps to the next row?";
        questions[3][1] = "BorderLayout";
        questions[3][2] = "GridLayout";
        questions[3][3] = "FlowLayout";
        questions[3][4] = "BoxLayout";

        questions[4][0] = "What does setBounds(x, y, width, height) define?";
        questions[4][1] = "The layout manager";
        questions[4][2] = "The color of a component";
        questions[4][3] = "The size and position of a component";
        questions[4][4] = "The event listener";

        questions[5][0] = "Which event listener is used for handling button clicks?";
        questions[5][1] = "ItemListener";
        questions[5][2] = "MouseListener";
        questions[5][3] = "KeyListener";
        questions[5][4] = "ActionListener";

        questions[6][0] = "Which of these components allows text input from the user?";
        questions[6][1] = "JLabel";
        questions[6][2] = "JTextField";
        questions[6][3] = "JButton";
        questions[6][4] = "JRadioButton";

        questions[7][0] = "What is the default layout manager for a JFrame?";
        questions[7][1] = "GridLayout";
        questions[7][2] = "BorderLayout";
        questions[7][3] = "FlowLayout";
        questions[7][4] = "CardLayout";

        questions[8][0] = "What does setVisible(true) do in a Java GUI?";
        questions[8][1] = "Closes the application";
        questions[8][2] = "Makes the component invisible";
        questions[8][3] = "Displays the component/window";
        questions[8][4] = "Changes the background color";

        questions[9][0] = "Which method is used to close the JFrame on exit?";
        questions[9][1] = "setCloseOperation()";
        questions[9][2] = "closeFrame()";
        questions[9][3] = "setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)";
        questions[9][4] = "dispose()";

        answers[0][1] = "java.awt";
        answers[1][1] = "JFrame";
        answers[2][1] = "add()";
        answers[3][1] = "FlowLayout";
        answers[4][1] = "The size and position of a component";
        answers[5][1] = "ActionListener";
        answers[6][1] = "JTextField";
        answers[7][1] = "BorderLayout";
        answers[8][1] = "Displays the component/window";
        answers[9][1] = "setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)";
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next) {
            recordAnswer();
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
                submit.setVisible(true);
            }
            count++;
            start(count);
        } else if (e.getSource() == previous) {
            if (count > 0) {
                next.setEnabled(true);
                count--;
                start(count);
            }
            if(count < 9){
                submit.setVisible(false);
            }
        } else if (e.getSource() == submit) {
            recordAnswer();
            calculateScore();
            setVisible(false);
            new Score(name, score);
        }
    }

    void recordAnswer() {
        ans_given = 1;
        if (group.getSelection() == null) {
            useranswers[count][0] = "";
        } else {
            useranswers[count][0] = group.getSelection().getActionCommand();
        }
    }

    void calculateScore() {
        score = 0;
        for (int i = 0; i < useranswers.length; i++) {
            if (useranswers[i][0] != null && useranswers[i][0].equals(answers[i][1])) {
                score += 10;
            }
        }
    }

    void start(int count) {
        qno.setText((count + 1) + ". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);

        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);

        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);

        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);

        group.clearSelection();


        if (useranswers[count][0] != null) {
            String savedAnswer = useranswers[count][0];
            if (opt1.getActionCommand().equals(savedAnswer)) opt1.setSelected(true);
            else if (opt2.getActionCommand().equals(savedAnswer)) opt2.setSelected(true);
            else if (opt3.getActionCommand().equals(savedAnswer)) opt3.setSelected(true);
            else if (opt4.getActionCommand().equals(savedAnswer)) opt4.setSelected(true);
        }

        timer = 15;
        timer = 15;
    }

    void startTimer() {
        if (swingTimer != null && swingTimer.isRunning()) {
            swingTimer.stop();
        }

        swingTimer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timerLabel.setText("Time Remaining - 00:" + timer );
                timer--;

                if (timer < 0) {
                    swingTimer.stop();
                    recordAnswer();
                    if (count == 9) {
                        calculateScore();     // if timer less than 0 swingtimer.stop() and it will record ans
                        setVisible(false);    //then it check it is the last question if yes it cal score
                        new Score(name, score); // if it not last question count++ and startTimer
                    } else {
                        count++;
                        start(count);
                        startTimer();
                    }
                }
            }
        });
        swingTimer.start();
    }

    void resetQuiz() {
        for (int i = 0; i < useranswers.length; i++) {
            useranswers[i][0] = "";
        }
        count = 0;
        score = 0;
        timer = 15;
        next.setEnabled(true);
        submit.setEnabled(false);
        start(count);
        startTimer();
    }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        new Quiz("User");
    }
}