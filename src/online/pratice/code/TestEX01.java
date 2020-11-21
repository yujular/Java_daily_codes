package online.pratice.code;

class A{
    int x = 1;//被隐藏
    void print(){//被覆盖
        System.out.println("这里是父类方法，x="+x);//父类A的方法中访问的变量必然是A类或A的父类的，不可能访问B类的。
        m();//父类A的方法中调用的实例方法m()是子类B的，由于发生了覆盖
    }
    void m(){//被覆盖
        System.out.println("这里是父类的实例方法m()");
    }
    static void m2(){//被隐藏
        System.out.println("这里是父类的静态方法m2()");
    }
}
class B extends A{
    int x = 2;
    void print(){
        System.out.println("这里是子类方法，x="+x);//子类方法访问的变量是子类对象的（当然条件是子类中声明了这个变量）
        System.out.println("这里是子类方法，super.x="+super.x);//super.x是父类对象的
        super.print();//调用父类的print()方法
        m();//调用本对象的m()方法
    }
    void m(){
        System.out.println("这里是子类的实例方法m()");
    }
    static void m2(){
        System.out.println("这里是子类的静态方法m2()");
    }
}
public class TestEX01{
    public static void main(String []s){
        A p = new B();
        System.out.println(p.x);//通过引用变量p来访问变量或静态方法，要看p的声明类型。所以x是A类的。
        p.m2();//同上。静态方法m2()是A类的。
        p.print();//通过引用变量p来访问实例方法，要看p指向的对象的实际类型。由于覆盖，调用的print()方法是子类的。
    }
}
