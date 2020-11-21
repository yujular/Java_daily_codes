package online.pratice.code.fifth;

/**
 * @author yujular
 * @date 2020/11/6
 */
interface shape{
    float PI = 3.1415926f;
    void draw(); //绘制图形，在程序中用信息输出表示
    double getArea();      // 获取面积
    double getCircumference();  // 周长
}
class Circle implements shape{
    private double r;
    Circle(double r){
        this.r = r;
    }
    public double getArea(){
        return PI*r*r;
    }
    public double getCircumference(){
        return 2*PI*r;
    }
    public void draw(){
        System.out.println("圆的半径："+r);
        System.out.println("圆的面积: "+getArea());
        System.out.println("圆的周长: "+getCircumference());
    }
}
class Eclipse implements shape{
    private double a;//长半轴
    private double b;//短半轴
    Eclipse(double a,double b){
        this.a = Math.max(a,b);
        this.b = Math.min(a,b);
    }
    public double getArea(){
        return PI*a*b;
    }
    public double getCircumference(){
        return 2*PI*b+4*(a-b);
    }
    public void draw(){
        System.out.println("椭圆的长轴："+a);
        System.out.println("椭圆的短轴: "+b);
        System.out.println("椭圆的面积: "+getArea());
        System.out.println("椭圆的周长: "+getCircumference());
    }
}
class Rectangle implements shape{
    private double a;
    private double b;
    Rectangle(double a,double b){
        this.a = Math.max(a,b);
        this.b = Math.min(a,b);
    }
    public double getArea(){
        return a*b;
    }
    public double getCircumference(){
        return 2*(a+b);
    }
    public void draw(){
        System.out.println("矩形的长："+a);
        System.out.println("矩形的宽: "+b);
        System.out.println("矩形的面积: "+getArea());
        System.out.println("矩形的周长: "+getCircumference());
    }
}
class Triangle implements shape{
    private double a;
    private double b;
    private double c;
    Triangle(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getArea(){
        double p = 0.5*(a+b+c);
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public double getCircumference(){
        return a+b+c;
    }
    public void draw(){
        System.out.println("三角形的边："+a+"  "+b+"  "+c);
        System.out.println("三角形的面积: "+getArea());
        System.out.println("三角形的周长: "+getCircumference());
    }
}
public class TestShape {
    public static void main(String[] args) {
          Circle c = new Circle(5);
          Eclipse e = new Eclipse(5,3);
          Rectangle r = new Rectangle(4,5);
          Triangle t = new Triangle(3,4,5);
          c.draw();
          e.draw();
          r.draw();
          t.draw();
    }
}
