package online.pratice.code.fifth;

interface IA{
    public abstract void show();
}
class A implements IA{
    public void show() {
        System.out.println("AAAA");
    }
}
class B implements IA{
    public void show() {
        System.out.println("BBBB");
    }
}
public class Test{
    public static void main(String[] args){
        IA[] a = new IA[4];
        a[0] = new A();
        a[1] = new B();
        a[2] = new B();
        a[3] = new A();
        for(int i=0;i<a.length;i++)
            a[i].show();
    }
}
