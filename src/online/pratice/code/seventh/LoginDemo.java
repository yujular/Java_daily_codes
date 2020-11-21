package online.pratice.code.seventh;

import java.awt.*;
public class LoginDemo
{
    public static void main(String arg[])
    {
        Frame f = new Frame("User Login");
        f.setSize(280,180);
        f.setBackground(Color.lightGray);
        f.setLocation(300,240);
        f.setLayout(new FlowLayout());

        Label t1 = new Label("userid");
        TextField tf1 = new TextField("Please input your ID",20);
        Label t2 = new Label("password");
        TextField tf2 = new TextField(20);
        tf2.setText("Please input your PW");
        Button b1 = new Button("OK");
        Button b2 = new Button("Canel");
        //tf2.setEchoChar(‘*');    //作为密码框，设置回显字符
        //System.out.printf(tf1.getText()+"\n");
        //System.out.printf(tf2.getText());
        f.add(t1);    f.add(tf1);
        f.add(t2);    f.add(tf2);
        f.add(b1);    f.add(b2);
        f.setVisible(true);
    }
}
