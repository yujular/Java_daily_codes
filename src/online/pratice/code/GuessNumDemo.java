package online.pratice.code;

import java.util.Random;
import java.util.Scanner;
class GuessNum{
    /**
     * 掷骰子总次数
     */
    private int totalNum ;
    /**
     * 需要猜的骰子的点数
     */
    private int nowNum;
    private Random randomNum ;
    GuessNum(){
        randomNum=new Random();
        totalNum = 0;
        nowNum = randomNum.nextInt(6) + 1;
    }
    GuessNum(long seed){
        randomNum = new Random(seed);
        totalNum = 0;
        nowNum = randomNum.nextInt(6) + 1;
    }
    boolean Guess(int num){
        totalNum++;
        if(num == nowNum){
            return true;
        }else{
            return false;
        }
    }
    int getTotalNum(){
        return totalNum;
    }
    int getNowNum(){
        return nowNum;
    }
    void getNextNum(){
        totalNum = 0;
        nowNum = randomNum.nextInt(6)+1;
    }
}
/**
 * @author yujular
 * @title: GuessNumDemo
 * @date 2020/10/21
 */
public class GuessNumDemo {
    public static void main(String[] args) {
        GuessNum guessNum = new GuessNum();
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            // 判断输入的值是否为整数类型，当为整数类型时执行循环
            if (scan.hasNextInt()) {
                int num = scan.nextInt();
                if (!guessNum.Guess(num)) {
                    System.out.println("未猜中，继续加油...");
                } else {
                    System.out.println("你猜中了，点数是" + guessNum.getNowNum() + "点，共猜" + guessNum.getTotalNum() + "次");
                    guessNum.getNextNum();
                }
            } else {
                System.out.println("请输入数字哦");
                scan.next();
                continue;
            }
        }
    }
}