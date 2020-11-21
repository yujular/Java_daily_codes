package online.pratice.code.seventh;

import java.awt.*;
import java.awt.event.*;
public class TestMultiListener implements MouseMotionListener, MouseListener {
    Frame f = new Frame("多重监听器测试");    //创建窗口框架容器组件对象
    TextField tf = new TextField(30);   //创建文本框对象，长度为30个字符
    public TestMultiListener(){      //定义多重监听构造方法
        f.add(new Label("请按下鼠标左键并拖动"), "North");  //在窗口容器中添加标签
        f.add(tf, "South");    //在窗口容器中添加文本框（底部）
        f.setBackground(new Color(120,175,175));   //设置窗口背景色
//在窗口容器中注册(添加)鼠标移动监听器（this代表窗口实例），实现多重监听
        f.addMouseMotionListener(this);
//在窗口容器中注册(添加)鼠标监听器（this代表窗口），实现多重监听
        f.addMouseListener(this);
        f.setSize(300, 200);	         //设置窗口容器大小
        f.setVisible(true);              //设为可视
    }

    public static void main(String[] args) {
        TestMultiListener t = new TestMultiListener();  //创建TestMultiListener类的对象实例
    }
    public void mouseDragged(MouseEvent e) {    //定义鼠标拖动方法
        String s = "鼠标拖动到位置（" + e.getX() + "," + e.getY() + ")"; //取得鼠标坐标
        tf.setText(s);        //设置文本框显示鼠标拖动坐标
    }
    public void mouseEntered(MouseEvent e) {    //定义鼠标进入窗体方法
        String s = "鼠标已进入窗体";
        tf.setText(s);      //设置文本框显示鼠标已进入窗体字符串
    }
    public void mouseExited(MouseEvent e) {    //定义鼠标退出窗体方法
        String s = "鼠标已移出窗体";
        tf.setText(s);
    }
    public void mouseMoved(MouseEvent e) { }  //鼠标移动方法
    public void mousePressed(MouseEvent e) { }   //鼠标按下方法
    public void mouseClicked(MouseEvent e) { }   //鼠标点击方法
    public void mouseReleased(MouseEvent e) { }  //鼠标释放组件方法
}
