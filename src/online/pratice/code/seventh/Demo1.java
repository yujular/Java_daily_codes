package online.pratice.code.seventh;

/**
 * @author yujular
 * @title: Demo1
 * @projectName daily_codes
 * @description: TODO
 * @date 2020/11/20
 */
import java.awt.*;
public class Demo1 extends Frame
{
    public Demo1 (String str)
    {
        super(str);
    }
    public static void main (String args[])
    {
        Demo1 fr = new Demo1("Blue Window");
        fr.setSize(500,500);
        fr.setLocation(300,300);
        fr.setBackground(Color.blue);
        fr.setVisible(true);
        //System.out.printf(fr.getTitle());
    }
}
