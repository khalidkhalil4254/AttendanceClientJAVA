package APP;
import javax.swing.*;
import java.io.*;
import java.net.*;

public class event extends gui{
    TCP_NET tools;
    static String host="192.168.1.8";
    static int port_attendance=5678,port_signIn=2345,port_signUp=3456;
    String subject;

    void sendAttend(String host,int port,String student,String sub,int isAttend){
        try {
            Thread.sleep(600);
            tools.send(new Socket(host,port),student);
            tools.send(new Socket(host,port),sub);
            tools.send(new Socket(host,port),String.valueOf(isAttend));
        } catch (Exception ex) {
            System.out.println("Error sendAttend:"+ex);
        }
    }

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


                    //sw_btn,advancedCpp_btn,algo_btn,networkProgramming_btn,android_btn,embedded_btn;
                    if (sw_btn.isSelected()) {
                        subject = "Software Engineering";
                    }
                    if (advancedCpp_btn.isSelected()) {
                        subject = "Advanced C++";
                    }
                    if (algo_btn.isSelected()) {
                        subject = "Algorithms";
                    }
                    if (networkProgramming_btn.isSelected()) {
                        subject = "Network Programming";
                    }
                    if (android_btn.isSelected()) {
                        subject = "Android Development";
                    }
                    if (embedded_btn.isSelected()) {
                        subject = "Embedded Systems";
                    }






            if (c1.isSelected()) {
                sendAttend(host, port_attendance, "AhmedAshraf", subject,1);
            }
            else {
                sendAttend(host, port_attendance, "AhmedAshraf", subject,0);
            }
            if (c2.isSelected()) {
                sendAttend(host, port_attendance, "AhmedKhaled", subject,1);
            }
            else {
                sendAttend(host, port_attendance, "AhmedKhaled", subject,0);
            }
            if (c3.isSelected()) {
                sendAttend(host, port_attendance, "AhmedSalama", subject,1);
            }
            else {
                sendAttend(host, port_attendance, "AhmedSalama", subject,0);
            }
            if (c4.isSelected()) {
                sendAttend(host, port_attendance, "ayaAyman", subject,1);
            }
            else {
                sendAttend(host, port_attendance, "ayaAyman", subject,0);
            }
            if (c5.isSelected()) {
                sendAttend(host, port_attendance, "AyaAlaa", subject,1);
            }
            else {
                sendAttend(host, port_attendance, "AyaAlaa", subject,0);
            }
            if (c6.isSelected()) {
                sendAttend(host, port_attendance, "PeterBassem", subject,1);
            }
            else {
                sendAttend(host, port_attendance, "PeterBassem", subject,0);
            }
            if (c7.isSelected()) {
                sendAttend(host, port_attendance, "JosephMagid", subject,1);
            }
            else {
                sendAttend(host, port_attendance, "JosephMagid", subject,0);
            }
            if (c8.isSelected()) {
                sendAttend(host, port_attendance, "HabibaNagi", subject,1);
            }
            else {
                sendAttend(host, port_attendance, "HabibaNagi", subject,0);
            }
            if (c9.isSelected()) {
                sendAttend(host, port_attendance, "HassanMuhammed", subject,1);
            }
            else {
                sendAttend(host, port_attendance, "HassanMuhammed", subject,0);
            }
            if (c10.isSelected()) {
                sendAttend(host, port_attendance, "KhalidMuhammad", subject,1);
            }
            else {
                sendAttend(host, port_attendance, "KhalidMuhammad", subject,0);
            }
            if (c11.isSelected()) {
                sendAttend(host, port_attendance, "AbdulRahmanOsama", subject,1);
            }
            else {
                sendAttend(host, port_attendance, "AbdulRahmanOsama", subject,0);
            }
            if (c12.isSelected()) {
                sendAttend(host, port_attendance, "AbdulRahmanRajab", subject,1);
            }
            else {
                sendAttend(host, port_attendance, "AbdulRahmanRajab", subject,0);
            }
            if (c13.isSelected()) {
                sendAttend(host, port_attendance, "AbdullahAsher", subject,1);
            }
            else {
                sendAttend(host, port_attendance, "AbdullahAsher", subject,0);
            }
            if (c14.isSelected()) {
                sendAttend(host, port_attendance, "KarimAhmed", subject,1);
            }
            else {
                sendAttend(host, port_attendance, "KarimAhmed", subject,0);
            }
            if (c15.isSelected()) {
                sendAttend(host, port_attendance, "KarimTarek", subject,1);
            }
            else {
                sendAttend(host, port_attendance, "KarimTarek", subject,0);
            }
            if (c16.isSelected()) {
                sendAttend(host, port_attendance, "MazenTarek", subject,1);
            }
            else {
                sendAttend(host, port_attendance, "MazenTarek", subject,0);
            }
            if (c17.isSelected()) {
                sendAttend(host, port_attendance, "MuhammadAhmadMuhammad", subject,1);
            }
            else {
                sendAttend(host, port_attendance, "MuhammadAhmadMuhammad", subject,0);
            }
            if (c18.isSelected()) {
                sendAttend(host, port_attendance, "MohammedHossamFouad", subject,1);
            }
            else {
                sendAttend(host, port_attendance, "MohamedHossamFouad", subject,0);
            }
            if (c19.isSelected()) {
                sendAttend(host, port_attendance, "MuhammadHusamMuhammad", subject,1);
            }
            else {
                sendAttend(host, port_attendance, "MuhammadHusamMuhammad", subject,0);
            }
            if (c20.isSelected()) {
                sendAttend(host, port_attendance, "MuhammadHisham", subject,1);
            }
            else {
                sendAttend(host, port_attendance, "MuhammadHisham", subject,0);
            }
            if (c21.isSelected()) {
                sendAttend(host, port_attendance, "MuhammadYusuf", subject,1);
            }
            else {
                sendAttend(host, port_attendance, "MuhammadYusuf", subject,0);
            }
            if (c22.isSelected()) {
                sendAttend(host, port_attendance, "MahmoudMohamedFakir", subject,1);
            }
            else {
                sendAttend(host, port_attendance, "MahmoudMohamedFakir", subject,0);
            }
            if (c23.isSelected()) {
                sendAttend(host, port_attendance, "MustafaMorsi", subject,1);
            }
            else {
                sendAttend(host, port_attendance, "MustafaMorsi", subject,0);
            }
            if (c24.isSelected()) {
                sendAttend(host, port_attendance, "HebaGomaa", subject,1);
            }
            else {
                sendAttend(host, port_attendance, "HebaGomaa", subject,0);
            }
            if (c25.isSelected()) {
                sendAttend(host, port_attendance, "HamsaSameh", subject,1);
            }
            else {
                sendAttend(host, port_attendance, "HamsaSameh", subject,0);
            }
            if (c26.isSelected()) {
                sendAttend(host, port_attendance, "WesamAhmed", subject,1);
            }
            else {
                sendAttend(host, port_attendance, "WesamAhmed", subject,0);
            }
            if (c27.isSelected()) {
                sendAttend(host, port_attendance, "YasminAhmed", subject,1);
            }
            else {
                sendAttend(host, port_attendance, "YasminAhmed", subject,0);
            }
            if (c28.isSelected()) {
                sendAttend(host, port_attendance, "YasmineMagdy", subject,1);
            }
            else {
                sendAttend(host, port_attendance, "YasmineMagdy", subject,0);
            }
            if (c29.isSelected()) {
                sendAttend(host, port_attendance, "YoussefAhmed", subject,1);
            }
            else {
                sendAttend(host, port_attendance, "YoussefAhmed", subject,0);
            }
            if (c30.isSelected()) {
                sendAttend(host, port_attendance, "YoussefTariqHussein", subject,1);
            }
            else {
                sendAttend(host, port_attendance, "YoussefTariqHussein", subject,0);
            }
            if (c31.isSelected()) {
                sendAttend(host, port_attendance, "YoussefTariqAbdelMoneim", subject,1);
            }
            else {
                sendAttend(host, port_attendance, "YoussefTariqAbdelMoneim", subject,0);
            }
            if (c32.isSelected()) {
                sendAttend(host, port_attendance, "YoussefAbdullah", subject,1);
            }
            else {
                sendAttend(host, port_attendance, "YoussefAbdullah", subject,0);
            }



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


            sw_btn.setSelected(false);
            advancedCpp_btn.setSelected(false);
            algo_btn.setSelected(false);
            networkProgramming_btn.setSelected(false);
            android_btn.setSelected(false);
            embedded_btn.setSelected(false);


            //go back :-
            app.setVisible(false);
            signIn.setVisible(true);
        });


    }

}



