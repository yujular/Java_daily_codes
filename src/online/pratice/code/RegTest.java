package online.pratice.code;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegTest
{
    static void test()
    {
        Pattern p = null; //正则表达式
        Matcher m = null; //操作的字符串
        boolean b = false;
//正则表达式表示15位或者18位数字的一串数字
        p = Pattern.compile("[1-9]\\d{14}|[1-9]\\d{17}");
        m = p.matcher("120101198506020080");
        b = m.matches();
        System.out.println("身份证号码正确："+b); //输出：true
        p = Pattern.compile("[1-9]\\d{14}|[1-9]\\d{17}");
        m = p.matcher("020101198506020080");//错误 首位为0
        b = m.matches();
        System.out.println("身份证号码错误："+b); //输出：false
    }
    public static void main(String argus[])
    {   test();}
}
