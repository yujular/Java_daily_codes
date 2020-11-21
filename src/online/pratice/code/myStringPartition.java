package online.pratice.code;

import java.io.*;

/**
 * @author yujular
 * @title: myStringPartition
 * @projectName daily_codes
 * @description: TODO
 * @date 2020/10/29
 */
public class myStringPartition {
    public static void main(String[] args) {
        try {
            BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入一串逗号分隔的数字，例如 123,456,789");
            String str = in.readLine();
            int sum = 0;
            String[] strSplit = str.split("(\\s|,)+");
            for (String s:strSplit) {
                System.out.println("分割为 "+s);
                sum += Integer.parseInt(s);
            }
            System.out.println("总和是： "+sum);
        }
        catch (Exception e){
            System.out.println("输入异常"+e);
        }
    }
}
