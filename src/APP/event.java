package APP;
import javax.swing.*;
import java.io.IOException;
import java.net.Socket;
import java.util.*;

public class event extends gui{
    TCP_NET tools;
    static String host="192.168.1.8";
    static int port_attendance=5555,port_signIn=2222,port_signUp=3333;
    String subject;


    event(){
        tools=new TCP_NET();

        //setting the default state of the checkboxes to unchecked:-
        c1.setSelected(false);
        c2.setSelected(false);
        c3.setSelected(false);
        c4.setSelected(false);
        c5.setSelected(false);
        c6.setSelected(false);
        c7.setSelected(false);
        c8.setSelected(false);
        c9.setSelected(false);
        c10.setSelected(false);
        c11.setSelected(false);
        c12.setSelected(false);
        c13.setSelected(false);
        c14.setSelected(false);
        c15.setSelected(false);
        c16.setSelected(false);
        c17.setSelected(false);
        c18.setSelected(false);
        c19.setSelected(false);
        c20.setSelected(false);
        c21.setSelected(false);
        c22.setSelected(false);
        c23.setSelected(false);
        c24.setSelected(false);
        c25.setSelected(false);
        c26.setSelected(false);
        c27.setSelected(false);
        c28.setSelected(false);
        c29.setSelected(false);
        c30.setSelected(false);
        c31.setSelected(false);
        c32.setSelected(false);


        //creating events handlers for each component:-
        exit_btn.addActionListener(e -> System.exit(1));

        submit_btn.addActionListener(e -> {
            ArrayList<String>students=new ArrayList<>();
            if(c1.isSelected()){
                students.add("احمد اشرف\n");
            }
            if(c2.isSelected()){
                students.add("احمد خالد\n");
            }
            if(c3.isSelected()){
                students.add("احمد سلامة\n");
            }
            if(c4.isSelected()){
                students.add("ايه ايمن\n");
            }
            if(c5.isSelected()){
                students.add("ايه علاء\n");
            }
            if(c6.isSelected()){
                students.add("بيتر باسم\n");
            }
            if(c7.isSelected()){
                students.add("جوزيف ماجد\n");
            }
            if(c8.isSelected()){
                students.add("حبيبة ناجي\n");
            }
            if(c9.isSelected()){
                students.add("حسن محمد\n");
            }
            if(c10.isSelected()){
                students.add("خالد محمد\n");
            }
            if(c11.isSelected()){
                students.add("عبد الرحمن اسامة\n");
            }
            if(c12.isSelected()){
                students.add("عبد الرحمن رجب\n");
            }
            if(c13.isSelected()){
                students.add("عبد الله اشرف\n");
            }
            if(c14.isSelected()){
                students.add("كريم احمد\n");
            }
            if(c15.isSelected()){
                students.add("كريم طارق\n");
            }
            if(c16.isSelected()){
                students.add("مازن طارق\n");
            }
            if(c17.isSelected()){
                students.add("محمد احمد محمد\n");
            }
            if(c18.isSelected()){
                students.add("محمد حسام فؤاد\n");
            }
            if(c19.isSelected()){
                students.add("محمد حسام محمد\n");
            }
            if(c20.isSelected()){
                students.add("محمد هشام\n");
            }
            if(c21.isSelected()){
                students.add("محمد يوسف\n");
            }
            if(c22.isSelected()){
                students.add("محمود محمد فقير\n");
            }
            if(c23.isSelected()){
                students.add("مصطفي مرسي\n");
            }
            if(c24.isSelected()){
                students.add("هبه جمعة\n");
            }
            if(c25.isSelected()){
                students.add("همسة سامح\n");
            }
            if(c26.isSelected()){
                students.add("وسام احمد\n");
            }
            if(c27.isSelected()){
                students.add("ياسمين احمد\n");
            }
            if(c28.isSelected()){
                students.add("ياسمين مجدي\n");
            }
            if(c29.isSelected()){
                students.add("يوسف احمد\n");
            }
            if(c30.isSelected()){
                students.add("يوسف طارق حسين\n");
            }
            if(c31.isSelected()){
                students.add("يوسف طارق عبد المنعم\n");
            }
            if(c32.isSelected()){
                students.add("يوسف عبد الله\n");
            }
            //sw_btn,advancedCpp_btn,algo_btn,networkProgramming_btn,android_btn,embedded_btn;
            if(sw_btn.isSelected()){
                subject="Software Engineering";
            }
            if(advancedCpp_btn.isSelected()){
                subject="Advanced C++";
            }
            if(algo_btn.isSelected()){
                subject="Algorithms";
            }
            if(networkProgramming_btn.isSelected()){
                subject="Network Programming";
            }
            if(android_btn.isSelected()){
                subject="Android Development";
            }
            if(embedded_btn.isSelected()){
                subject="Embedded Systems";
            }

            String msg=Arrays.toString(students.toArray());
            //setting the default state of the checkboxes to unchecked:-
            c1.setSelected(false);
            c2.setSelected(false);
            c3.setSelected(false);
            c4.setSelected(false);
            c5.setSelected(false);
            c6.setSelected(false);
            c7.setSelected(false);
            c8.setSelected(false);
            c9.setSelected(false);
            c10.setSelected(false);
            c11.setSelected(false);
            c12.setSelected(false);
            c13.setSelected(false);
            c14.setSelected(false);
            c15.setSelected(false);
            c16.setSelected(false);
            c17.setSelected(false);
            c18.setSelected(false);
            c19.setSelected(false);
            c20.setSelected(false);
            c21.setSelected(false);
            c22.setSelected(false);
            c23.setSelected(false);
            c24.setSelected(false);
            c25.setSelected(false);
            c26.setSelected(false);
            c27.setSelected(false);
            c28.setSelected(false);
            c29.setSelected(false);
            c30.setSelected(false);
            c31.setSelected(false);
            c32.setSelected(false);

            sw_btn.setSelected(false);
            advancedCpp_btn.setSelected(false);
            algo_btn.setSelected(false);
            networkProgramming_btn.setSelected(false);
            android_btn.setSelected(false);
            embedded_btn.setSelected(false);


            try {
                tools.send(new Socket(host,port_attendance),msg);
                tools.send(new Socket(host,port_attendance),subject);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });



        signIn_btn.addActionListener((e)->{
            if(!username_signIn_txt.getText().equals("") && !password_signIn_txt.getText().equals("")){
                String username=username_signIn_txt.getText();
                String password=new String(password_signIn_txt.getPassword());

                //sending the data to the server to handle:-
                try {
                    tools.send(new Socket(host,port_signIn),username);
                    tools.send(new Socket(host,port_signIn),password);
                    System.out.println("signIn");
                    System.out.println("username:"+username+" password:"+password);
                    String res=tools.receive(new Socket(host,port_signIn));
                    System.out.println("ServerResponse:"+res);
                    if(res.equals("yes")){
                        signIn.setVisible(false);
                        app.setVisible(true);
                    }else if(res.equals("no")){
                        JOptionPane.showMessageDialog(new JFrame("Error Message"), "Invalid!");
                    }
                } catch (Exception ex) {JOptionPane.showMessageDialog(new JFrame("Error Message"), "Error Signing-In!");}

                username_signIn_txt.setText("");
                password_signIn_txt.setText("");
            }
        });

        signUp_signUp_btn.addActionListener((e)->{
            if(!username_signUp_txt.getText().equals("") && !password_signUp_txt.getText().equals("")){
                String username=username_signUp_txt.getText();
                String password=new String(password_signUp_txt.getPassword());

                //sending the data to the server to handle:-
                try {
                    tools.send(new Socket(host,port_signUp),username);
                    tools.send(new Socket(host,port_signUp),password);
                    System.out.println("signUp");
                    System.out.println("username:"+username+" password:"+password);
                    String res=tools.receive(new Socket(host,port_signUp));
                    System.out.println("ServerResponse:"+res);
                    if(res.equals("yes")){
                        signUp.setVisible(false);
                        signIn.setVisible(true);
                    }else if(res.equals("no")){
                        JOptionPane.showMessageDialog(new JFrame("Error Message"), "Invalid!");
                    }
                } catch (IOException ex) {JOptionPane.showMessageDialog(new JFrame("Error Message"), "Error Signing-Up!");}

                username_signUp_txt.setText("");
                password_signUp_txt.setText("");
            }
        });


        signUp_btn.addActionListener((e)->{
            signIn.setVisible(false);
            signUp.setVisible(true);
        });

        back_signUp_btn.addActionListener((e)->{
            signIn.setVisible(true);
            signUp.setVisible(false);
        });


        Signout_attendance_btn.addActionListener((e)->{
            //setting the default state of the checkboxes to unchecked:-
            c1.setSelected(false);
            c2.setSelected(false);
            c3.setSelected(false);
            c4.setSelected(false);
            c5.setSelected(false);
            c6.setSelected(false);
            c7.setSelected(false);
            c8.setSelected(false);
            c9.setSelected(false);
            c10.setSelected(false);
            c11.setSelected(false);
            c12.setSelected(false);
            c13.setSelected(false);
            c14.setSelected(false);
            c15.setSelected(false);
            c16.setSelected(false);
            c17.setSelected(false);
            c18.setSelected(false);
            c19.setSelected(false);
            c20.setSelected(false);
            c21.setSelected(false);
            c22.setSelected(false);
            c23.setSelected(false);
            c24.setSelected(false);
            c25.setSelected(false);
            c26.setSelected(false);
            c27.setSelected(false);
            c28.setSelected(false);
            c29.setSelected(false);
            c30.setSelected(false);
            c31.setSelected(false);
            c32.setSelected(false);

            //go back :-
            app.setVisible(false);
            signIn.setVisible(true);
        });


    }

}
