package online.pratice.code;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumCheck {
    public static void main(String[] args) {
        /**
         * 1.第一位为1
         * 2.13+任意
         * 3.14+0,1,4-9
         * 4.15+除了4以外的数字
         * 5.16+2,5,6,7
         * 6.17+除了9以外的数字
         * 18+任意
         * 19+除了4以外的数字
         */
        final String PhoneNumReg = "^((13[0-9])|(14[0,1,4-9])|(15[0-3,5-9])|(16[2,5,6,7])|(17[0-8])|(18[0-9])|(19[0-3,5-9]))\\d{8}$";
        Scanner scan = new Scanner(System.in);
        Pattern p = Pattern.compile(PhoneNumReg);
        Matcher m = p.matcher(scan.nextLine());
        if(m.matches()) {
            System.out.println("该号码是正确的电话号码");
        }else {
            System.out.println("该号码不是正确的电话号码");
        }
    }
}
