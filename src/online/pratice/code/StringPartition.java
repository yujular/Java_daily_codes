package online.pratice.code;

import java.io.*;
public class StringPartition {
    public static void main(String[] args) {
        try {
            BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入一串逗号分隔的数字，例如 123,456,789");
            String str = in.readLine();
            String s = "";
            int sum = 0;
            for (int i = 0; i<str.length(); i++) {
                if (str.charAt(i) != ',') {
                    s += str.charAt(i) ;     //字符串s连接字符串str的第i个字符
                }
                else {
                    System.out.println("分割为 " + s);
                    sum += Integer.parseInt(s);
                    s = "";
                }
            }
            if(s.length()>0){
                System.out.println("分割为 " + s);
                sum += Integer.parseInt(s);
                s = "";
            }
            System.out.println("总和是：" + sum);
        }
        catch(Exception e){
            System.out.println("输入异常：" + e);
        }
    }
}
