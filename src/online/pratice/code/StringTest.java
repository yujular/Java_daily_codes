package online.pratice.code;

public class StringTest {
    public static void main(String[] args) {
        StringTest st = new StringTest();
        st.testString();
    }
    /*
     * 介绍String的常用方法
     */
    public void testString(){
        String str = "This is a test string!";
        System.out.println("\n用于被测试的字符串为："+str);
        System.out.println("\n方法length()返回字符串的长度为：");
        int length = str.length();
        System.out.println(String.valueOf(length));
        System.out.println("\n方法equals(Object o)判断字符串内容是否相同，与字符串\"test\"进行比较的结果为：");
        boolean b = str.equals("test");
        System.out.println(b?"相等":"不相等");
        System.out.println("equalsIgnoreCase(Object o)比较\"test\"与\"Test\"比较的结果:");
        b = "test".equalsIgnoreCase("Test");
        System.out.println(b?"相等":"不相等");
        System.out.println("\ncharAt(int index)方法：某个位置的字符");
        char c = str.charAt(5);
        System.out.println("\n测试字符串第5个位置的字符为："+String.valueOf(c)+".注意索引从0开始");
        System.out.println("\n获取子串方法：subString(int fromindex)和substring(int fromindex,int endindex)");
        System.out.println("第一个方法从fromindex开始，第二个方法从fromindex开始到endindex结束的子串，索引从0开始,包含fromindex，不包含endindex。");
        String strSub = str.substring(3);
        System.out.println("str.substring(3)的结果为："+strSub);
        strSub = str.substring(3,6);
        System.out.println("str.substring(3,6)的结果为："+strSub);
        System.out.println("\n去除字符串前面或者后面的空格，可以使用trim()方法：");
        System.out.println("字符串\"100 01 \"原来的长度为："+"100 01 ".length()+"使用trim()方法之后的长度为："+"100 01 ".trim().length());
        printContent("\n\n判断一个字符在字符串中的位置，可以使用indexOf(int ch)和indexOf(int ch,int from)方法" +
                "，\n如果不存在返回0，第一个方法从字符串开头查找，第二个方法从form为置开始查找，包含该位置");
        int index = str.indexOf('s');
        printMethod("str.indexOf('s')");
        printResult(String.valueOf(index));
        index = str.indexOf('s',6);
        printMethod("\nstr.indexOf('s',6)");
        printResult(String.valueOf(index));
        printContent("\n\n判断一个字符在字符串中的位置，可以使用indexOf(String str)和indexOf(String str,int from)方法" +
                "，\n如果不存在返回0，第一个方法从字符串开头查找，第二个方法从form为置开始查找，包含该位置");
        index = str.indexOf("is");
        printMethod("str.indexOf(\"is\")");
        printResult(String.valueOf(index));
        index = str.indexOf("is",3);
        printMethod("\nstr.indexOf(\"is\",3)");
        printResult(String.valueOf(index));
        index = str.indexOf("is",7);
        printMethod("\nstr.indexOf(\"is\",7)");
        printResult(String.valueOf(index));
        printContent("\n与indexOf方法相似，还有lastIndexOf方法，用法基本相同，不同的是开始查找的位置不同，一个从前，一个从后");
        printContent("\n判断字符串是否以某个子串为后缀，使用endsWith(String str)");
        b = str.endsWith("test");
        printMethod("str.endsWith(\"test\")");
        printResult(String.valueOf(b));
        b = str.endsWith("string!");
        printMethod("\nstr.endsWith(\"string!\")");
        printResult(String.valueOf(b));
        printContent("\n\n与endsWith方法功能相似，startWith(String prefix)和" +
                "\nstartWith(String prefix,int toffset)用于判断是否以某个子串为前缀");
        printContent("\n\n替换字符串中的字符，使用replace(char oldChar,char newChar)方法");
        String str2 = str.replace('s','S');
        printMethod("str.replace('s','S')");
        printResult(str2);
        printContent("\n\n替换字符串中的第一次出现的某个字串，使用replaceFirst(String oldStr,String newStr)方法");
        str2 = str.replaceFirst("is","IS");
        printMethod("str.replaceFirst(\"is\",\"IS\")");
        printResult(str2);
        printContent("\n\n替换字符串中的所有的出现的某个字串，使用replaceAll(String oldStr,String newStr)方法");
        str2 = str.replaceAll("is","IS");
        printMethod("str.replaceAll(\"is\",\"IS\")");
        printResult(str2);
        printContent("\n\n可以根据某个特定的格式把字符串分成多个子串，使用split方法," +
                "\n使用的测试字符串为zhangsan-lisi-wangwu");
        str2 = "zhangsan-lisi-wangwu";
        String strSplit[] = str2.split("-");
        printMethod("str.split(\"-\")");
        for(int i=0;i<strSplit.length;i++)
            printResult(strSplit[i]+" ");
    }
    /*
     * 显示注释的内容
     */
    public void printContent(String str){
        System.out.println(str);
    }
    /*
     * 显示代码
     */
    public void printMethod(String str){
        System.out.print(str);
        for(int i=0;i<30-str.length();i++)
            System.out.print(" ");
    }
    /*
     * 显示结果
     */
    public void printResult(String str){
        System.out.print(str);
    }

}
