package online.pratice.code.fifth;

/**
 * @author yujular
 * @title: Graduate
 * @date 2020/11/6
 */
interface StudentManageInterface{
    void setFee(double fee);
    double getFee();
}
interface TeacherInterface{
    void setPay(double fee);
    double getPay();
}

public class Graduate implements StudentManageInterface,TeacherInterface{
    String name;
    String xingbie;
    int age;
    double fee;
    double pay;
    Graduate(String name,String xingbie,int age,double fee,double pay){
        this.name = name;
        this.xingbie = xingbie;
        this.age = age;
        setFee(fee);
        setPay(pay);
    }
    public void setFee(double fee){
        this.fee = fee;
    }
    public double getFee(){
        return this.fee;
    }
    public void setPay(double pay){
        this.pay = pay;
    }
    public double getPay(){
        return this.pay;
    }
    public String getName(){
        return this.name;
    }
    public String getXingbie(){
        return this.xingbie;
    }
    public int getAge(){
        return this.age;
    }
    public boolean is_loan(){
        if(this.pay-this.fee<2000){
            System.out.println("provide a loan");
            return true;
        }else{
            System.out.println("no need a loan");
            return false;
        }
    }

    public static void main(String[] args) {
        Graduate gra = new Graduate("zhangsan","男",23,5000,2000);
        System.out.println("名字"+gra.getName());
        System.out.println("性别"+gra.getXingbie());
        System.out.println("年龄"+gra.getAge());
        System.out.println("花费"+gra.getFee());
        System.out.println("收入"+gra.getPay());
        gra.is_loan();
    }
}
