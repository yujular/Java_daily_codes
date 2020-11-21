package online.pratice.code;

/**
 * @author yujular
 * @title: EmaliDemo
 * @projectName daily_codes
 * @description: TODO
 * @date 2020/10/28
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailDemo {
    public static void main(String[] args) {
        /**
         * 邮箱规则
         * 1.邮箱首字符和末尾字符必须为字母或数字，邮箱名可以全是字母或数字，或者是两者的组合；
         * 2.连字符"-"、下划线"_"和英文句号点"."，仅能放在字母或数字中间，且不能连续出现（即其单个符号的左右只能是字母或数字）；
         * 3.域名可以带连字符"-"， 且可以是多级域名 ,还可以有多个域名后缀；
         * 4.不区分大小写；
         * 5.不限定邮箱字符串的具体长度。
         */
        /**
         * \\w+ 第一个字母必须是数字或字母、下划线
         * (?:\.{0,1}[\w-]+)* 第二支字母以后 支持数字字母下划线，或至多出现一次的.
         * @ 有且仅有一个
         * [a-zA-Z0-9]+ 第一个字符不能是下划线
         * (?:[-.][a-zA-Z0-9]+)* 允许出现-.
         * \.[a-zA-Z]+ 允许出现.加上至少一个字母，不允许.结尾
         */
        String reg = "\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+";
        Pattern p;
        Matcher m;
        Scanner scan = new Scanner(System.in);
        String inputStr = scan.nextLine();
        p = Pattern.compile(reg);
        m = p.matcher(inputStr);
        while (m.find()){
            System.out.println("找到正确邮箱："+m.group());
        }
    }
}
