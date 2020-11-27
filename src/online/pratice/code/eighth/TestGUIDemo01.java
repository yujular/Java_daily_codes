package online.pratice.code.eighth;


import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class TestGUIDemo01 extends Frame implements ItemListener
{

    Panel lpanel1,lpanel2;
    Panel checkboxpanel1,checkboxpanel2;
    CheckboxGroup lcheckboxgroup,lcheckboxgroup2;
    Checkbox plain,bold,italic;
    Checkbox red,blue,yellow,blcak;
    Button lbutton;
    TextArea ta;
    public TestGUIDemo01(String title)
    {
        super(title);
    }
    public void creat()
    {
        lpanel1=new Panel();
        lpanel2=new Panel();
        checkboxpanel1 = new Panel();
        checkboxpanel2 = new Panel();
        ta = new TextArea("西南交通大学",7,30);
        lpanel1.setLayout(new GridLayout(2,1));
        lpanel2.setLayout(new FlowLayout());
        checkboxpanel1.setLayout(new FlowLayout());
        checkboxpanel2.setLayout(new FlowLayout());
        //字体
        lcheckboxgroup=new CheckboxGroup();
        plain=new Checkbox("普通",lcheckboxgroup,true);
        plain.addItemListener(this);
        bold=new Checkbox("黑体",lcheckboxgroup,false);
        bold.addItemListener(this);
        italic=new Checkbox("斜体",lcheckboxgroup,false);
        italic.addItemListener(this);
        //颜色
        lcheckboxgroup2 = new CheckboxGroup();
        blcak = new Checkbox("黑色",lcheckboxgroup2,true);
        blcak.addItemListener(this);
        red = new Checkbox("红色",lcheckboxgroup2,false);
        red.addItemListener(this);
        blue = new Checkbox("蓝色",lcheckboxgroup2,false);
        blue.addItemListener(this);
        yellow = new Checkbox("黄色",lcheckboxgroup2,false);
        yellow.addItemListener(this);
        lbutton=new Button("西南交通大学");
        lpanel2.add(lbutton);
        lpanel2.add(ta);
        checkboxpanel1.add(plain);
        checkboxpanel1.add(bold);
        checkboxpanel1.add(italic);
        checkboxpanel2.add(blcak);
        checkboxpanel2.add(red);
        checkboxpanel2.add(yellow);
        checkboxpanel2.add(blue);
        lpanel1.add(checkboxpanel1);
        lpanel1.add(checkboxpanel2);
        //lpanel1.add(plain);
        //lpanel1.add(bold);
        //lpanel1.add(italic);
        //setLayout(new GridLayout(2,1));
        setLayout(new BorderLayout());
        add(lpanel1,BorderLayout.SOUTH);
        add(lpanel2,BorderLayout.CENTER);
        setSize(300,400);
        setVisible(true);
        //匿名内部类完成事件处理
        addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

    }
    @Override
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource()==plain)
        {
            lbutton.setFont(new Font("SansSerf",Font.PLAIN,14));
            ta.setFont(new Font("SansSerf",Font.PLAIN,14));
        }
        else if(e.getSource()==bold)
        {
            lbutton.setFont(new Font("SansSerf",Font.BOLD,14));
            ta.setFont(new Font("SansSerf",Font.BOLD,14));
        }else if(e.getSource()==italic){
            lbutton.setFont(new Font("SansSerf",Font.ITALIC,14));
            ta.setFont(new Font("SansSerf",Font.ITALIC,14));
        }
        if(e.getSource()==red){
            lbutton.setForeground(Color.red);
            ta.setForeground(Color.red);
        }else if(e.getSource()==blue){
            lbutton.setForeground(Color.blue);
            ta.setForeground(Color.blue);
        }else if(e.getSource()==yellow){
            lbutton.setForeground(Color.yellow);
            ta.setForeground(Color.yellow);
        }else if(e.getSource()==blcak){
            lbutton.setForeground(Color.black);
            ta.setForeground(Color.black);
        }
    }

    public static void main(String[] args)
    {
        TestGUIDemo01 fr=new TestGUIDemo01("GUI测试实例");
        fr.creat();

    }

}
