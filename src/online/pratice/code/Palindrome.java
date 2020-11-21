package online.pratice.code;

public class Palindrome {
    public static void main(String[] args) {
        String str1 = "僧游云隐寺";   //字符串常量类对象
        String str2 = reverse(str1);  //调用串倒转方法
        System.out.println(str1 + "," + str2);
        str1 = "人过大佛寺";
        str2 = reverse(str1);
        System.out.println(str1+","+str2);
    }

    public static String reverse(String s){  //串倒转方法
        int len = s.length();      //串常量长度
        StringBuffer sb = new StringBuffer();  //字符串变量类对象
        for (int i = len-1 ; i>=0 ; i-- ) {
                sb.append(s.charAt(i));  //串变量对象追加串常量的第i个字符s.charAt(i)
        }
        return sb.toString();
    }
}
