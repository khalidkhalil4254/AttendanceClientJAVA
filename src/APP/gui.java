package APP;
import javax.swing.*;
import java.awt.*;

public class gui {
    JFrame app,signIn,signUp;
    JLabel students_lbl,attendance_lbl,subject_attendance_lbl,signIn_lbl,username_signIn_lbl,username_signUp_lbl,password_signIn_lbl,password_signUp_lbl,signUp_signUp_lbl;
    JTextField username_signIn_txt,username_signUp_txt;
    JPasswordField password_signIn_txt,password_signUp_txt;
    JCheckBox  c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26,c27,c28,c29,c30,c31,c32;
    JButton exit_btn,submit_btn,signIn_btn,signUp_btn,back_signUp_btn,signUp_signUp_btn,Signout_attendance_btn;
    JRadioButton sw_btn,advancedCpp_btn,algo_btn,networkProgramming_btn,android_btn,embedded_btn;
    ButtonGroup subjectSelect_btn;


    gui(){

        //defining the main frame of the app:-
        app=new JFrame("Attendance-Application");
        app.setLayout(null);
        app.setResizable(false);
        app.setSize(800,1000);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        signIn=new JFrame("SignIn");
        signIn.setLayout(null);
        signIn.setResizable(false);
        signIn.setSize(620,520);
        signIn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        signUp=new JFrame("SignUp");
        signUp.setLayout(null);
        signUp.setResizable(false);
        signUp.setSize(620,520);
        signUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        //creating signIn components:-

        String dep[]={"ICT","Renewable-energy","Mechatronics","Auto"};
        JComboBox cb=new JComboBox(dep);
        cb.setBounds(220,260,180,30);

        signIn_lbl=new JLabel("SignIn :-");
        signIn_lbl.setFont(new Font("segueUI",Font.BOLD,25));
        signIn_lbl.setBounds(30,20,100,30);

        username_signIn_lbl=new JLabel("Username :");
        username_signIn_lbl.setFont(new Font("segueUI",Font.BOLD,14));
        username_signIn_lbl.setBounds(50,120,120,30);

        username_signIn_txt=new JTextField();
        username_signIn_txt.setFont(new Font("segueUI",Font.BOLD,16));
        username_signIn_txt.setBounds(180,120,280,30);

        password_signIn_lbl=new JLabel("Password :");
        password_signIn_lbl.setFont(new Font("segueUI",Font.BOLD,14));
        password_signIn_lbl.setBounds(50,180,120,30);

        password_signIn_txt=new JPasswordField();
        password_signIn_txt.setFont(new Font("segueUI",Font.BOLD,16));
        password_signIn_txt.setBounds(180,180,280,30);

        signIn_btn=new JButton("LogIn");
        signIn_btn.setFont(new Font("segueUI",Font.PLAIN,18));
        signIn_btn.setBounds(320,360,120,50);

        signUp_btn=new JButton("SignUp");
        signUp_btn.setFont(new Font("segueUI",Font.PLAIN,18));
        signUp_btn.setBounds(180,360,120,50);


        //adding signIn components:-
        signIn.add(cb);
        signIn.add(signIn_lbl);
        signIn.add(username_signIn_lbl);
        signIn.add(username_signIn_txt);
        signIn.add(password_signIn_lbl);
        signIn.add(password_signIn_txt);
        signIn.add(signIn_btn);
        signIn.add(signUp_btn);



        //Creating signUp components:-
        signUp_signUp_lbl=new JLabel("SignUp :-");
        signUp_signUp_lbl.setFont(new Font("segueUI",Font.BOLD,25));
        signUp_signUp_lbl.setBounds(30,20,150,30);

        username_signUp_lbl=new JLabel("Username :");
        username_signUp_lbl.setFont(new Font("segueUI",Font.BOLD,14));
        username_signUp_lbl.setBounds(50,120,120,30);

        username_signUp_txt=new JTextField();
        username_signUp_txt.setFont(new Font("segueUI",Font.BOLD,16));
        username_signUp_txt.setBounds(180,120,280,30);

        password_signUp_lbl=new JLabel("Password :");
        password_signUp_lbl.setFont(new Font("segueUI",Font.BOLD,14));
        password_signUp_lbl.setBounds(50,180,120,30);

        password_signUp_txt=new JPasswordField();
        password_signUp_txt.setFont(new Font("segueUI",Font.BOLD,16));
        password_signUp_txt.setBounds(180,180,280,30);

        signUp_signUp_btn=new JButton("signUp");
        signUp_signUp_btn.setFont(new Font("segueUI",Font.PLAIN,18));
        signUp_signUp_btn.setBounds(250,275,120,50);

        back_signUp_btn=new JButton("back");
        back_signUp_btn.setFont(new Font("segueUI",Font.PLAIN,18));
        back_signUp_btn.setBounds(250,360,120,50);


        //Adding signIn components:-
        signUp.add(signUp_signUp_lbl);
        signUp.add(username_signUp_lbl);
        signUp.add(username_signUp_txt);
        signUp.add(password_signUp_lbl);
        signUp.add(password_signUp_txt);
        signUp.add(signUp_signUp_btn);
        signUp.add(back_signUp_btn);



        //defining labels:-
        students_lbl=new JLabel("Students:-");
        students_lbl.setFont(new Font("Verdana", Font.BOLD, 16));
        students_lbl.setBounds(30,120,180,35);
        attendance_lbl=new JLabel("Attendance");
        attendance_lbl.setFont(new Font("Verdana", Font.BOLD, 26));
        attendance_lbl.setBounds(280,30,180,35);


        //defining checkboxes:-
        //part one:-
        c1=new JCheckBox("Ahmed Ashraf");
        c1.setBounds(80,200,200,30);
        c1.setFont(new Font("Verdana", Font.PLAIN, 15));
        c2=new JCheckBox("Ahmed khalid");
        c2.setBounds(80,225,200,30);
        c2.setFont(new Font("Verdana", Font.PLAIN, 15));
        c3=new JCheckBox("Ahmed salama");
        c3.setBounds(80,250,200,30);
        c3.setFont(new Font("Verdana", Font.PLAIN, 15));
        c4=new JCheckBox("Aya Ayman");
        c4.setBounds(80,275,200,30);
        c4.setFont(new Font("Verdana", Font.PLAIN, 15));
        c5=new JCheckBox("Aya alaa");
        c5.setBounds(80,300,200,30);
        c5.setFont(new Font("Verdana", Font.PLAIN, 15));
        c6=new JCheckBox("Peter bassem");
        c6.setBounds(80,325,200,30);
        c6.setFont(new Font("Verdana", Font.PLAIN, 15));
        c7=new JCheckBox("Joseph maged");
        c7.setBounds(80,350,200,30);
        c7.setFont(new Font("Verdana", Font.PLAIN, 15));
        c8=new JCheckBox("Habiba nagi");
        c8.setBounds(80,375,200,30);
        c8.setFont(new Font("Verdana", Font.PLAIN, 15));
        c9=new JCheckBox("Hassan mohammed");
        c9.setBounds(80,400,200,30);
        c9.setFont(new Font("Verdana", Font.PLAIN, 15));
        c10=new JCheckBox("Khalid mohammed");
        c10.setBounds(80,425,200,30);
        c10.setFont(new Font("Verdana", Font.PLAIN, 15));
        c11=new JCheckBox("Abd el rahman osama");
        c11.setBounds(80,450,200,30);
        c11.setFont(new Font("Verdana", Font.PLAIN, 15));
        c12=new JCheckBox("Abd el rahman ragab");
        c12.setBounds(80,475,200,30);
        c12.setFont(new Font("Verdana", Font.PLAIN, 15));
        c13=new JCheckBox("Abd allah ashraf");
        c13.setBounds(80,500,200,30);
        c13.setFont(new Font("Verdana", Font.PLAIN, 15));
        c14=new JCheckBox("Karem ahmed");
        c14.setBounds(80,525,200,30);
        c14.setFont(new Font("Verdana", Font.PLAIN, 15));
        c15=new JCheckBox("Karem tarek");
        c15.setBounds(80,550,200,30);
        c15.setFont(new Font("Verdana", Font.PLAIN, 15));
        c16=new JCheckBox("Mazen tarek");
        c16.setBounds(80,575,200,30);
        c16.setFont(new Font("Verdana", Font.PLAIN, 15));

        //part two:-
        c17=new JCheckBox("Mohammed hesham");
        c17.setBounds(500,200,200,30);
        c17.setFont(new Font("Verdana", Font.PLAIN, 15));
        c18=new JCheckBox("Mohammed hossam foaad");
        c18.setBounds(500,225,200,30);
        c18.setFont(new Font("Verdana", Font.PLAIN, 15));
        c19=new JCheckBox("Mohammed hossam mohammed");
        c19.setBounds(500,250,200,30);
        c19.setFont(new Font("Verdana", Font.PLAIN, 15));
        c20=new JCheckBox("Mohammed hesham");
        c20.setBounds(500,275,200,30);
        c20.setFont(new Font("Verdana", Font.PLAIN, 15));
        c21=new JCheckBox("Mohammed yousif");
        c21.setBounds(500,300,200,30);
        c21.setFont(new Font("Verdana", Font.PLAIN, 15));
        c22=new JCheckBox("Mahmoud mohammed faqeer");
        c22.setBounds(500,325,200,30);
        c22.setFont(new Font("Verdana", Font.PLAIN, 15));
        c23=new JCheckBox("Mustafa morsy");
        c23.setBounds(500,350,200,30);
        c23.setFont(new Font("Verdana", Font.PLAIN, 15));
        c24=new JCheckBox("Heba gomaa");
        c24.setBounds(500,375,200,30);
        c24.setFont(new Font("Verdana", Font.PLAIN, 15));
        c25=new JCheckBox("Hamsa sameh");
        c25.setBounds(500,400,200,30);
        c25.setFont(new Font("Verdana", Font.PLAIN, 15));
        c26=new JCheckBox("Wessam ahmed");
        c26.setBounds(500,425,200,30);
        c26.setFont(new Font("Verdana", Font.PLAIN, 15));
        c27=new JCheckBox("Yasmin ahmed");
        c27.setBounds(500,450,200,30);
        c27.setFont(new Font("Verdana", Font.PLAIN, 15));
        c28=new JCheckBox("Yasmin magdy");
        c28.setBounds(500,475,200,30);
        c28.setFont(new Font("Verdana", Font.PLAIN, 15));
        c29=new JCheckBox("Yousif ahmed");
        c29.setBounds(500,500,200,30);
        c29.setFont(new Font("Verdana", Font.PLAIN, 15));
        c30=new JCheckBox("Yousif tarek hosin");
        c30.setBounds(500,525,200,30);
        c30.setFont(new Font("Verdana", Font.PLAIN, 15));
        c31=new JCheckBox("Yousif tarek abdel monim");
        c31.setBounds(500,550,200,30);
        c31.setFont(new Font("Verdana", Font.PLAIN, 15));
        c32=new JCheckBox("Yousif abdullah");
        c32.setBounds(500,575,200,30);
        c32.setFont(new Font("Verdana", Font.PLAIN, 15));

        subject_attendance_lbl=new JLabel("Subjects :-");
        subject_attendance_lbl.setFont(new Font("Verdana", Font.BOLD, 16));
        subject_attendance_lbl.setBounds(30,650,120,30);

        //sw_btn,advancedCpp_btn,algo_btn,networkProgramming_btn,android_btn,embedded_btn;
        sw_btn=new JRadioButton("Software Engineering");
        sw_btn.setFont(new Font("Verdana", Font.PLAIN, 15));
        sw_btn.setBounds(100,700,220,30);
        advancedCpp_btn=new JRadioButton("Advanced C++");
        advancedCpp_btn.setFont(new Font("Verdana", Font.PLAIN, 15));
        advancedCpp_btn.setBounds(340,700,220,30);
        algo_btn=new JRadioButton("Algorithms");
        algo_btn.setFont(new Font("Verdana", Font.PLAIN, 15));
        algo_btn.setBounds(560,700,220,30);
        networkProgramming_btn=new JRadioButton("Network Programming");
        networkProgramming_btn.setFont(new Font("Verdana", Font.PLAIN, 15));
        networkProgramming_btn.setBounds(100,750,220,30);
        android_btn=new JRadioButton("Mobile Development");
        android_btn.setFont(new Font("Verdana", Font.PLAIN, 15));
        android_btn.setBounds(340,750,220,30);
        embedded_btn=new JRadioButton("Embedded Systems");
        embedded_btn.setFont(new Font("Verdana", Font.PLAIN, 15));
        embedded_btn.setBounds(560,750,220,30);

        subjectSelect_btn=new ButtonGroup();
        subjectSelect_btn.add(sw_btn);
        subjectSelect_btn.add(advancedCpp_btn);
        subjectSelect_btn.add(algo_btn);
        subjectSelect_btn.add(networkProgramming_btn);
        subjectSelect_btn.add(android_btn);
        subjectSelect_btn.add(embedded_btn);

        //defining the buttons:-
        exit_btn=new JButton("Exit");
        exit_btn.setBounds(30,870,80,50);
        submit_btn=new JButton("Submit");
        submit_btn.setBounds(680,870,80,50);
        Signout_attendance_btn=new JButton("Sign-out");
        Signout_attendance_btn.setBounds(315,870,120,50);


        //adding elements or components into the frame:-
        app.add(students_lbl);
        app.add(attendance_lbl);
        app.add(c1);
        app.add(c2);
        app.add(c3);
        app.add(c4);
        app.add(c5);
        app.add(c6);
        app.add(c7);
        app.add(c8);
        app.add(c9);
        app.add(c10);
        app.add(c11);
        app.add(c12);
        app.add(c13);
        app.add(c14);
        app.add(c15);
        app.add(c16);
        app.add(c17);
        app.add(c18);
        app.add(c19);
        app.add(c20);
        app.add(c21);
        app.add(c22);
        app.add(c23);
        app.add(c24);
        app.add(c25);
        app.add(c26);
        app.add(c27);
        app.add(c28);
        app.add(c29);
        app.add(c30);
        app.add(c31);
        app.add(c32);
        app.add(Signout_attendance_btn);
        app.add(exit_btn);
        app.add(submit_btn);
        app.add(subject_attendance_lbl);
        app.add(sw_btn);
        app.add(advancedCpp_btn);
        app.add(algo_btn);
        app.add(networkProgramming_btn);
        app.add(android_btn);
        app.add(embedded_btn);


        //set the main application frame to be displayed to user:-
        signIn.setVisible(true);

    }

}
