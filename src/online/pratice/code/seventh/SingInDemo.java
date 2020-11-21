package online.pratice.code.seventh;

import java.awt.*;
import java.awt.event.*;

/**
 * @author yujular
 * @title: SingInDemo
 * @projectName daily_codes
 * @date 2020/11/21
 */
public class SingInDemo extends WindowAdapter implements ActionListener {
    static String user_name = "admin";
    static String user_pass = "123456";
    Frame f;
    TextField tf1;
    TextField tf2;
    Button b1;
    Button b2;
    Button b3;
    Dialog d1;
    public void display() {
         f = new Frame("登录");
         f.setSize(280,180);
         f.setBackground(Color.gray);
         f.setLayout(new FlowLayout());
         f.setVisible(true);
         tf1 = new TextField(25);
         tf2 = new TextField(25);
         tf2.setEchoChar('*');
         b1 = new Button("登录");
         b2 = new Button("清空");
         f.add(new Label("用户名"));
         f.add(tf1);
         f.add(new Label("密码"));
         f.add(tf2);
         f.add(b1);
         f.add(b2);
         b1.addActionListener(this);
         b2.addActionListener(this);
         f.addWindowListener(this);
    }

    private void displayDialog(boolean type){
        d1 = new Dialog(f,"信息",true);//模式对话框
        d1.setSize(180,100);
        d1.setLayout(new FlowLayout());
        b3 = new Button("确定");
        if(type){
            d1.add(new Label("恭喜您，登录成功!!!"));
        }else{
            d1.add(new Label("很抱歉，登陆失败！"));
        }
        d1.add(b3);
        d1.addWindowListener(this);
        b3.addActionListener(this);
        d1.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            String name = tf1.getText();
            String password = tf2.getText();
            if(name.equals(user_name)&&password.equals(user_pass)){
                displayDialog(true);
            }else{
                displayDialog(false);
            }
        }else if(e.getSource() == b2){
            tf1.setText("");
            tf2.setText("");
        }else if(e.getSource() == b3){
            d1.dispose();
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        if(e.getSource()==f){
            System.exit(0);
        }else if(e.getSource()==d1){
            d1.dispose();//关闭对话框
        }
    }


    public static void main(String[] args) {
        (new SingInDemo()).display();
    }
}
