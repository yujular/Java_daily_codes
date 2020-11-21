package online.pratice.code.seventh;

import java.awt.*;
public class TestFrameWithPanel
{
    public static void main(String args[])
    {
        Frame f = new Frame("My FrameWithPanel Test ");   //创建带标题的窗口容器组件对象实例
        Panel pan = new Panel();   //在窗口容器上创建面板容器对象
        f.setSize(180,100);        //设臵Frame组件窗口大小（宽﹑高）
        f.setBackground(Color.blue); //设臵Frame组件背景色为蓝色

        f.setLayout(null);         // 取消布局管理器（可同时看到窗口和面板组件）
        pan.setSize(100,60);      //面板容器大小（宽﹑高）

        pan.setBackground(Color.green);  //设臵面板容器组件背景色为绿色
        f.add(pan);                    //在窗口容器组件中添加面板容器对象
        f.setVisible(true);              //设臵Frame组件为可视
    }
}
