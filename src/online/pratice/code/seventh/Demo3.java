package online.pratice.code.seventh;


import java.awt.*;
import java.awt.event.*;
public class Demo3 implements ActionListener
{   Frame f;     TextField tf1;    Button b1,b2,b3,b4;
    public void display()
    {  f = new Frame("Calculation");
        f.setSize(260,150);       f.setLocation(320,240);
        f.setBackground(Color.lightGray);
        f.setLayout(new FlowLayout(FlowLayout.LEFT));
        tf1 = new TextField(30);      tf1.setEditable(false);   f.add(tf1);
        b1 = new Button("1");          b2 = new Button("2");
        b3 = new Button("+");          b4 = new Button("C");
        f.add(b1);        f.add(b2);   f.add(b3);        f.add(b4);
        b1.addActionListener(this);    b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        f.addWindowListener(new WinClose());
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {  if (e.getSource()==b4)
        tf1.setText("");
    else
        tf1.setText(tf1.getText()+e.getActionCommand());
    }
    public static void main(String arg[])
    {      (new Demo3()).display();  }
}
class WinClose  implements WindowListener
{  public void windowClosing(WindowEvent e)
{
    System.exit(0);
}
    public void windowOpened(WindowEvent e){ }       //窗口打开时调用
    public void windowIconified(WindowEvent e){ }      //窗口图标化时调用
    public void windowDeiconified(WindowEvent e){ }  //窗口非图标化时调用
    public void windowClosed(WindowEvent e){ }          //窗口关闭时调用
    public void windowActivated(WindowEvent e){ }      //窗口激活时调用
    public void windowDeactivated(WindowEvent e){ }   //窗口非激活时调用
}

