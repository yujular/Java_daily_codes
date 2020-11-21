package online.pratice.code.sixth;

public class TestBoxType {
    public static void main(String[] args)
    {
        int a = 1;
        String str = "123";
        Integer b = a;  //自动装箱
        int c = b;//自动拆箱
        Integer d = new Integer(a);  //手动装箱
        int e = d.intValue();//手动拆箱
        /*
         * int类型与String类型之间的互转
         */
        //int转换String
        int i = 123;
        //转换开始
        String s1 = i+"";//第一种方法
        String s2 = String.valueOf(i);//第二种方法
        String s3 = Integer.toString(i);//第三种方法
        //下面用于输出转换结果
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        //String转换int
        String s = "456";
        //开始转换
        int i1 = Integer.valueOf(s);//第一种方法
        int i2 = Integer.parseInt(s);//第二种方法
        //下面输出转换结果
        System.out.println(i1);
        System.out.println(i2);
    }
}
