package online.pratice.code.seventh;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author yujular
 * @title: Counter
 * @projectName daily_codes
 * @date 2020/11/21
 */
public class Counter extends WindowAdapter implements ActionListener {
    static String FLOAT_REG = "\\d*[.]\\d*";
    static String NUMBER_REG = "^(\\-|\\+)?\\d+(\\.\\d+)?$";
    Frame f;
    TextField tf1;
    TextField tf2;
    TextField tf3;
    Button b1;
    Button b2;
    Button b3;
    Dialog myDialog;
    public void display(){
        f = new Frame("一个简单的计算器");
        f.setSize(280,180);
        f.setBackground(Color.gray);
        f.setLayout(new FlowLayout());
        f.setResizable(false);
        tf1 = new TextField(35);
        tf1.setBackground(Color.lightGray);
        //文本框不可编辑
        tf1.setEditable(false);
        tf2 = new TextField(12);
        tf3 = new TextField(12);
        b1 = new Button("=");
        b2 = new Button("clear");
        f.add(tf1);
        f.add(tf2);
        f.add(new Label("+"));
        f.add(tf3);
        f.add(b1);
        f.add(b2);
        //注册监听器
        f.setVisible(true);
        f.addWindowListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    @Override
    public void windowClosing(WindowEvent e) {
        if(e.getSource()==f){
            System.exit(0);
        }else if(e.getSource()==myDialog){
            myDialog.dispose();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            String s1 = tf2.getText();
            String s2 = tf3.getText();
            try {
                tf1.setText(addNum(s1,s2));
            }catch (AddNumberTypeException exception){
                exception.showMessage();
                showMessageDialog(exception.getMessage());
            }
        }else if(e.getSource()==b2){
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
        }else if(e.getSource()==b3){
            myDialog.dispose();
        }
    }

    private void showMessageDialog(String message){
        myDialog = new Dialog(f,"警告",true);
        myDialog.setResizable(false);
        myDialog.setSize(180,100);
        myDialog.setLayout(new BorderLayout());
        myDialog.add(new Label(message),BorderLayout.CENTER);
        b3 = new Button("确认");
        myDialog.add(b3,BorderLayout.SOUTH);
        myDialog.addWindowListener(this);
        b3.addActionListener(this);
        myDialog.setVisible(true);
    }

    private String addNum(String s1,String s2)throws AddNumberTypeException{
        if(s1.matches(NUMBER_REG)&&s2.matches(NUMBER_REG)){
            double a1 = Double.parseDouble(s1);
            double a2 = Double.parseDouble(s2);
            if(a2>0){
                //处理-0.0
                if(a1+a2!=0) {
                    return a1 + "+" + a2 + "=" + (a1 + a2);
                }
                else{
                    return a1 +"+"+a2+"="+"0.0";
                }
            }else if(a2<0){
                if(a1+a2!=0) {
                    return a1 +"+"+"("+a2+")"+"="+(a1+a2);
                }
                else{
                    return a1 +"+"+"("+a2+")"+"="+"0.0";
                }
            }else {
                //防止出现-0导致格式错误
                if(a1+a2!=0) {
                    return a1 +"+"+"0.0"+"="+(a1+a2);
                }
                else{
                    return a1 +"+"+"0.0"+"="+"0.0";
                }

            }
        }else {
            throw new AddNumberTypeException("输入数据不合法,请检查输入");
        }
    }

    public static void main(String[] args) {
        (new Counter()).display();
    }

}

class AddNumberTypeException extends Exception{
    String message;
    Dialog messageDialog;
    AddNumberTypeException(String message){
        this.message = message;
    }
    /**
     * 控制台显示错误信息
     */
    void showMessage(){
        System.out.println(message);
    }
    /**
     * 获取异常信息
     */
    @Override
    public String getMessage(){
        return message;
    }
}