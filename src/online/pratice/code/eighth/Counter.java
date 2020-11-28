package online.pratice.code.eighth;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author yujular
 * @title: Counter
 * @date 2020/11/28
 */
public class Counter extends WindowAdapter implements ActionListener {
    Frame frame;
    Panel p1,p2;
    Panel p21,p22,p23;
    Button add,mul,sub,div;
    Button b3;
    TextField num1,num2,ans;
    Dialog myDialog;
    void show(){
        frame = new Frame("简单计算器");
        frame.setSize(280,180);
        frame.setBackground(Color.white);
        frame.setLayout(new BorderLayout());
        //按钮区
        add = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("÷");
        p1 = new Panel();
        p1.setLayout(new GridLayout(4,1));
        p1.add(add);
        p1.add(sub);
        p1.add(mul);
        p1.add(div);
        //计算区
        num1 = new TextField(20);
        num2 = new TextField(20);
        ans = new TextField(20);
        p21 =new Panel();
        p22 =new Panel();
        p23 =new Panel();
        p21.setLayout(new FlowLayout());
        p22.setLayout(new FlowLayout());
        p23.setLayout(new FlowLayout());
        p21.add(new Label("操作数"));
        p21.add(num1);
        p22.add(new Label("操作数"));
        p22.add(num2);
        p23.add(new Label("结果"));
        p23.add(ans);
        p2 = new Panel();
        p2.setLayout(new FlowLayout());
        p2.add(p21);
        p2.add(p22);
        p2.add(p23);
        //主窗口
        frame.add(p2,BorderLayout.CENTER);
        frame.add(p1,BorderLayout.EAST);
        frame.setVisible(true);
        //监听器
        frame.addWindowListener(this);
        add.addActionListener(this::actionPerformed);
        sub.addActionListener(this::actionPerformed);
        mul.addActionListener(this::actionPerformed);
        div.addActionListener(this::actionPerformed);
    }

    private void showMessageDialog(String message){
        myDialog = new Dialog(frame,"警告",true);
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

    @Override
    public void windowClosing(WindowEvent e) {
        if(e.getSource()==frame) {
            System.exit(0);
        }else if(e.getSource()==myDialog){
            myDialog.dispose();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b3){
            myDialog.dispose();
            return;
        }
        String s1 = num1.getText();
        String s2 = num2.getText();
        double n1,n2;
        try {
            n1 = Double.parseDouble(s1);
            n2 = Double.parseDouble(s2);
            if(e.getSource()==add){
                ans.setText(n1+"+"+n2+"="+(n1+n2));
            }else if(e.getSource()==sub){
                ans.setText(n1+"-"+n2+"="+(n1-n2));
            }else if(e.getSource()==mul){
                ans.setText(n1+"*"+n2+"="+(n1*n2));
            }else{
                ans.setText(n1+"÷"+n2+"="+(n1/n2));
            }
        }catch (NumberFormatException exc){
            showMessageDialog("请输入正确的值");
        }catch (ArithmeticException exc){
            showMessageDialog("除数不能为0！");
        }
    }

    public static void main(String[] args) {
        (new Counter()).show();
    }
}
