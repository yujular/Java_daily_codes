package online.pratice.code;

/**
 * @author yujular
 * @date 2020/10/21
 */
import java.util.*;//加载包
public class Demo{
    public static void main(String []args){
        Cat cat=new Cat();
        Cat.scan1();
    }
}
class Cat{
    //输入方法
    public static void scan1(){
        System.out.println("题目类型如下");
        System.out.println("1、四则运算");
        System.out.println("2、面积运算");
        System.out.println("3、体积运算");
        System.out.println("0、退出程序");
        System.out.print("请选择要做题的类型，请入0-3：");
        Scanner sr=new Scanner(System.in);
        int x=sr.nextInt();
        switch(x){
            case 0:
                System.out.println("谢谢使用，再见!");//退出
                break;
            case 1:
                Cat.szys();
                break;
            case 2:
                Cat.mjys();
                break;
            case 3:
                Cat.tjys();
                break;
            default:
                System.out.println("输入有误，请重新输入!");
                Cat.scan1();//重复调用目录
        }
    }
    //四则运算方法
    public static void szys(){
        System.out.println("四则运算");
        System.out.println("1、加法运算");
        System.out.println("2、减法运算");
        System.out.println("3、乘法程序");
        System.out.println("4、除法程序");
        System.out.println("0、返回上级");
        System.out.print("请选择要做题的类型，请入0-4：");
        Scanner sr=new Scanner(System.in);
        int y=sr.nextInt();
        switch(y){
            case 0:
                System.out.println("返回上级");
                Cat.scan1();//调用主目录
                break;
            case 1:
                System.out.println("进入加法运算，请输入第一个数：");
                Scanner jf1=new Scanner(System.in);
                int jf01=jf1.nextInt();
                System.out.println("进入加法运算，请输入第二个数：");
                Scanner jf2=new Scanner(System.in);
                int jf02=jf2.nextInt();
                float jfh=(float)jf01+(float)jf02;
                System.out.println(jf01+"+"+jf02+"="+jfh);
                System.out.println("已计算完成。");
                System.out.println("是否继续使用？使用请输入1，返回输入2，退出请输任意数字:");
                Scanner cz01=new Scanner(System.in);
                int cz001=cz01.nextInt();
                if(cz001==1){
                    Cat.szys();
                }else if(cz001==2){
                    Cat.scan1();
                }else if(cz001!=1||cz001!=2){
                    System.out.println("谢谢使用，再见!");
                }
                break;
            case 2:
                System.out.println("进入减法运算，请输入第一个数：");
                Scanner jjf1=new Scanner(System.in);
                int jjf01=jjf1.nextInt();
                System.out.println("进入减法运算，请输入第二个数：");
                Scanner jjf2=new Scanner(System.in);
                int jjf02=jjf2.nextInt();
                float jjfh=(float)jjf01-(float)jjf02;
                System.out.println(jjf01+"-"+jjf02+"="+jjfh);
                System.out.println("已计算完成。");
                System.out.println("是否继续使用？使用请输入1，返回输入2，退出输任意数字:");
                Scanner cz02=new Scanner(System.in);
                int cz002=cz02.nextInt();
                if(cz002==1){
                    Cat.szys();
                }else if(cz002==2){
                    Cat.scan1();
                }else if(cz002!=1||cz002!=2){
                    System.out.println("谢谢使用，再见!");
                }
                break;
            case 3:
                System.out.println("进入乘法运算，请输入第一个数：");
                Scanner cff1=new Scanner(System.in);
                int cff01=cff1.nextInt();
                System.out.println("进入乘法运算，请输入第二个数：");
                Scanner cff2=new Scanner(System.in);
                int cff02=cff2.nextInt();
                float cffh=(float)cff01*(float)cff02;
                System.out.println(cff01+"×"+cff02+"="+cffh);
                System.out.println("已计算完成。");
                System.out.println("是否继续使用？使用请输入1，返回输入2，退出输入任意数字:");
                Scanner cz03=new Scanner(System.in);
                int cz003=cz03.nextInt();
                if(cz003==1){
                    Cat.szys();
                }else if(cz003==2){
                    Cat.scan1();
                }else if(cz003!=1||cz003!=2){
                    System.out.println("谢谢使用，再见!");
                }
                break;
            case 4:
                System.out.println("进入除法运算，请输入第一个数：");
                Scanner cf1=new Scanner(System.in);
                int cf01=cf1.nextInt();
                System.out.println("进入除法运算，请输入第二个数：");
                Scanner cf2=new Scanner(System.in);
                int cf02=cf2.nextInt();
                float cfh=(float)cf01/(float)cf02;
                System.out.println(cf01+"÷"+cf02+"="+cfh);
                System.out.println("已计算完成。");
                System.out.println("是否继续使用？使用请输入1，返回输入2，退出输入任意数字:");
                Scanner cf03=new Scanner(System.in);
                int cf003=cf03.nextInt();
                if(cf003==1){
                    Cat.szys();
                }else if(cf003==2){
                    Cat.scan1();
                }else if(cf003!=1||cf003!=2){
                    System.out.println("谢谢使用，再见!");
                }
                break;
            default:
                System.out.println("输入有误，请重新输入!");
                Cat.szys();//循环调用子目录
        }
    }
    //面积运算方法
    public static void mjys(){
        System.out.println("面积运算");
        System.out.println("1、三角形面积计算");
        System.out.println("2、圆形面积计算");
        System.out.println("3、方形面积计算");
        System.out.println("0、返回上级");
        System.out.print("请选择要做题的类型，请入0-3：");
        Scanner sr=new Scanner(System.in);
        int z=sr.nextInt();
        switch(z){
            case 0:
                System.out.println("返回上级");
                Cat.scan1();//调用主目录
                break;
            case 1:
                System.out.println("进入三角形面积计算，请输入底：");
                Scanner sj1=new Scanner(System.in);
                int sjx01=sj1.nextInt();
                System.out.println("进入三角形面积计算，请输入高：");
                Scanner sj2=new Scanner(System.in);
                int sjx02=sj2.nextInt();
                float sjxh=((float)sjx01*(float)sjx02)/2;
                System.out.println("底"+sjx01+" 高："+sjx02+" 面积="+sjxh);
                System.out.println("已计算完成。");
                System.out.println("是否继续使用？使用请输入1，返回输入2，退出输入任意数字:");
                Scanner sj03=new Scanner(System.in);
                int sj003=sj03.nextInt();
                if(sj003==1){
                    Cat.mjys();
                }else if(sj003==2){
                    Cat.scan1();
                }else if(sj003!=1||sj003!=2){
                    System.out.println("谢谢使用，再见!");
                }
                break;
            case 2:
                System.out.println("进入圆形面积计算，请输入半径：");
                Scanner y1=new Scanner(System.in);
                int bj=y1.nextInt();
                float ymjh=(float)bj*(float)bj*3.1415926f;
                System.out.println("半径:"+bj+" 面积:"+ymjh);
                System.out.println("已计算完成。");
                System.out.println("是否继续使用？使用请输入1，返回输入2，退出输入任意数字:");
                Scanner y01=new Scanner(System.in);
                int y001=y01.nextInt();
                if(y001==1){
                    Cat.mjys();
                }else if(y001==2){
                    Cat.scan1();
                }else if(y001!=1||y001!=2){
                    System.out.println("谢谢使用，再见!");
                }
                break;
            case 3:
                System.out.println("进入方形面积计算，请输入长：");
                Scanner c1=new Scanner(System.in);
                int c01=c1.nextInt();
                System.out.println("进入方形面积计算，请输入宽：");
                Scanner k2=new Scanner(System.in);
                int k02=k2.nextInt();
                float mjh=(float)c01*(float)k02;
                System.out.println("长:"+c01+" 宽："+k02+" 面积:"+mjh);
                System.out.println("已计算完成。");
                System.out.println("是否继续使用？使用请输入1，返回输入2，退出输入任意数字:");
                Scanner m03=new Scanner(System.in);
                int m003=m03.nextInt();
                if(m003==1){
                    Cat.mjys();
                }else if(m003==2){
                    Cat.scan1();
                }else if(m003!=1||m003!=2){
                    System.out.println("谢谢使用，再见!");
                }
                break;
            default:
                System.out.println("输入有误，请重新输入!");
                Cat.mjys();//循环调用子目录
        }
    }
    //体积运算方法
    public static void tjys()
    {
        System.out.println("体积运算");
        System.out.println("1、长方体体积计算");
        System.out.println("2、圆柱体积计算");
        System.out.println("3、圆锥体积计算");
        System.out.println("0、返回上级");
        System.out.print("请选择要做题的类型，请入0-3：");
        Scanner sr=new Scanner(System.in);
        int x=sr.nextInt();
        switch(x){
            case 0:
                System.out.println("返回上级");
                Cat.scan1();//调用主目录
                break;
            case  1:
                System.out.println("进入长方体体积计算，请输入长：");
                Scanner cft_scan=new Scanner(System.in);
                int cft01=cft_scan.nextInt();
                System.out.println("进入长方体体积计算，请输入宽：");
                int cft02=cft_scan.nextInt();
                System.out.println("进入长方体体积计算，请输入高：");
                int cft03=cft_scan.nextInt();
                float cft_tj=((float)cft01*(float)cft02*(float)cft03);
                System.out.println("长"+cft01+" 宽："+cft02+" 高： "+cft03+" 体积="+cft_tj);
                System.out.println("已计算完成。");
                System.out.println("是否继续使用？使用请输入1，返回输入2，退出输入任意数字:");
                int cft003=cft_scan.nextInt();
                if(cft003==1){
                    Cat.tjys();
                }else if(cft003==2){
                    Cat.scan1();
                }else if(cft003!=1||cft003!=2){
                    System.out.println("谢谢使用，再见!");
                }
                break;
            case 2:
                System.out.println("进入圆柱体体积计算，请输入底面半径：");
                Scanner yzt_scan=new Scanner(System.in);
                int yzt_r=yzt_scan.nextInt();
                System.out.println("进入圆柱体体积计算，请输入高：");
                int yzt_h=yzt_scan.nextInt();
                float yzt_tj=((float)yzt_r*(float)yzt_r*(float)yzt_h*3.1415926f);
                System.out.println("底面半径"+yzt_r+" 高： "+yzt_h+" 体积="+yzt_tj);
                System.out.println("已计算完成。");
                System.out.println("是否继续使用？使用请输入1，返回输入2，退出输入任意数字:");
                int yzt003=yzt_scan.nextInt();
                if(yzt003==1){
                    Cat.tjys();
                }else if(yzt003==2){
                    Cat.scan1();
                }else if(yzt003!=1||yzt003!=2){
                    System.out.println("谢谢使用，再见!");
                }
                break;
            case 3:
                System.out.println("进入圆锥体体积计算，请输入底面半径：");
                Scanner yz_scan=new Scanner(System.in);
                int yz_r=yz_scan.nextInt();
                System.out.println("进入圆锥体体积计算，请输入高：");
                int yz_h=yz_scan.nextInt();
                float yz_tj=((float)yz_r*(float)yz_r*(float)yz_h*3.1415926f/3f);
                System.out.println("底面半径"+yz_r+" 高： "+yz_h+" 体积="+yz_tj);
                System.out.println("已计算完成。");
                System.out.println("是否继续使用？使用请输入1，返回输入2，退出输入任意数字:");
                int yz003=yz_scan.nextInt();
                if(yz003==1){
                    Cat.tjys();
                }else if(yz003==2){
                    Cat.scan1();
                }else if(yz003!=1||yz003!=2){
                    System.out.println("谢谢使用，再见!");
                }
                break;
            default:
                System.out.println("输入有误，请重新输入!");
                Cat.tjys();//循环调用子目录
        }
    }
}
