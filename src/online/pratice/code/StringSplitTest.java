package online.pratice.code;

import java.util.Scanner;

public class StringSplitTest {
    public static void main(String[] args) {
        StringBuffer strBuf = new StringBuffer();
        Scanner scan = new Scanner(System.in);
        int[] vowel_num = new int[5];
        String vowel = "aeiou";
        //读入多行数据 以end结束
        while (true){
            String newStr = scan.nextLine();
            if(newStr.equals("end")){
                break;
            }
            strBuf.append(newStr);
        };
        for(int i=0;i<strBuf.length();i++){
            switch (strBuf.charAt(i)){
                case 'a':
                case 'A':
                    vowel_num[0]++;
                    break;
                case 'e':
                case 'E':
                    vowel_num[1]++;
                    break;
                case 'i':
                case 'I':
                    vowel_num[2]++;
                    break;
                case 'o':
                case 'O':
                    vowel_num[3]++;
                    break;
                case 'u':
                case 'U':
                    vowel_num[4]++;
                    break;
            }
        }
        for (int i=0; i<5;i++) {
            System.out.println(vowel.charAt(i)+"的个数是:"+vowel_num[i]);
        }
        String[] strArray = strBuf.toString().split("(\\s|[,.])+");
        for (String s:strArray) {
            System.out.println("单词"+s+"的长度是："+s.length());
        }
    }
}
