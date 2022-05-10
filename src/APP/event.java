package APP;
import java.net.Socket;
import java.util.*;

public class event extends gui{

    TCP_NET tools;
    static String host="localhost";


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
                students.add("احمد اشرف");
            }
            if(c2.isSelected()){
                students.add("احمد خالد");
            }
            if(c3.isSelected()){
                students.add("احمد سلامة");
            }
            if(c4.isSelected()){
                students.add("ايه ايمن");
            }
            if(c5.isSelected()){
                students.add("ايه علاء");
            }
            if(c6.isSelected()){
                students.add("بيتر باسم");
            }
            if(c7.isSelected()){
                students.add("جوزيف ماجد");
            }
            if(c8.isSelected()){
                students.add("حبيبة ناجي");
            }
            if(c9.isSelected()){
                students.add("حسن محمد");
            }
            if(c10.isSelected()){
                students.add("خالد محمد");
            }
            if(c11.isSelected()){
                students.add("عبد الرحمن اسامة");
            }
            if(c12.isSelected()){
                students.add("عبد الرحمن رجب");
            }
            if(c13.isSelected()){
                students.add("عبد الله اشرف");
            }
            if(c14.isSelected()){
                students.add("كريم احمد");
            }
            if(c15.isSelected()){
                students.add("كريم طارق");
            }
            if(c16.isSelected()){
                students.add("مازن طارق");
            }
            if(c17.isSelected()){
                students.add("محمد احمد محمد");
            }
            if(c18.isSelected()){
                students.add("محمد حسام فؤاد");
            }
            if(c19.isSelected()){
                students.add("محمد حسام محمد");
            }
            if(c20.isSelected()){
                students.add("محمد هشام");
            }
            if(c21.isSelected()){
                students.add("محمد يوسف");
            }
            if(c22.isSelected()){
                students.add("محمود محمد فقير");
            }
            if(c23.isSelected()){
                students.add("مصطفي مرسي");
            }
            if(c24.isSelected()){
                students.add("هبه جمعة");
            }
            if(c25.isSelected()){
                students.add("همسة سامح");
            }
            if(c26.isSelected()){
                students.add("وسام احمد");
            }
            if(c27.isSelected()){
                students.add("ياسمين احمد");
            }
            if(c28.isSelected()){
                students.add("ياسمين مجدي");
            }
            if(c29.isSelected()){
                students.add("يوسف احمد");
            }
            if(c30.isSelected()){
                students.add("يوسف طارق حسين");
            }
            if(c31.isSelected()){
                students.add("يوسف طارق عبد المنعم");
            }
            if(c32.isSelected()){
                students.add("يوسف عبد الله");
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

            try {
                tools.send(new Socket(host,5555),msg);
            } catch (Exception ex) {
                System.out.println(ex);
            }

        });



    }

}
