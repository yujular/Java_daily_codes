package online.pratice.code.sixth;

/**
 * @author yujular
 * @title: CounterTest
 * @date 2020/11/13
 */

import java.io.*;
import java.util.Scanner;

/**
 * 自定义异常类
 * 用于检测用户输入是否为整数
 */


class InputException extends Exception {
    private String exceptionMessage;

    public InputException(String message) {
        this.exceptionMessage = message;
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }
}
/**
 * 计算类
 * 通过文件名创建或直接创建，控制台中输出
 * 通过调用Menu方法获取菜单
*/

class Counter {
    public static double PI = Math.PI;
    public static double E = Math.E;
    private int a;
    private int b;
    private double ans;
    private String fileName;
    private Scanner scan;

    public Counter() {//默认控制台输出
        scan = new Scanner(System.in);
    }

    public Counter(String fileName)  {
        this();
        this.fileName = fileName;
    }

    public void Menu() {
        System.out.println("*******菜单系统*******");
        System.out.println("请输入0-4中");
        System.out.println("--【1】、加法训练");
        System.out.println("--【2】、减法训练");
        System.out.println("--【3】、乘法训练");
        System.out.println("--【4】、除法训练");
        System.out.println("--【0】、退出程序");
        System.out.print("请选择：");
        int mode = scan.nextInt();
        switch (mode) {
            case 0:
                System.out.println("谢谢使用，再见!");//退出
                break;
            case 1:
                this.Add();
                break;
            case 2:
                this.Subtract();
                break;
            case 3:
                this.Multiply();
                break;
            case 4:
                this.Divide();
                break;
            default:
                System.out.println("输出模式不正确");
                this.Menu();
        }
    }
    private void InputNumber() {
        while (true){
            try {
                a = getInput();
                break;
            }catch (InputException e){
                System.out.println(e.getExceptionMessage());
            }
        }
        System.out.println("请输入第二个数：");
        while (true) {
            try {
                b = getInput();
                break;
            } catch (InputException e) {
                System.out.println(e.getExceptionMessage());
            }
        }
    }
    private int getInput() throws InputException{
        String input = scan.next();
        if(input.matches("^\\d+$")){
            return Integer.valueOf(input);
        }else{
            throw new InputException("请输入一个整数");
        }
    }
    private void isNext() {
        System.out.println("已计算完成。");
        System.out.println("是否继续使用？使用请输入1，返回输入2，退出请输任意数字:");
        int nextMode;
        while (true){
            try {
                nextMode = getInput();
                break;
            }catch (InputException e){
                System.out.println(e.getExceptionMessage());
            }
        }
        if(nextMode == 1){
            this.Add();
        }else if(nextMode == 2){
            this.Menu();
        }else{
            System.out.println("谢谢使用，再见!");//退出
        }
    }
    public void Add() {
        System.out.println("进入加法运算，请输入第一个数：");
        InputNumber();
        ans = a + b;
        System.out.println(a + "+" + b + "=" + ans);
        if (fileName != null) {
            try (
                    BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));
            ) {
                out.write(a + "+" + b + "=" + ans);
                out.newLine();
                out.flush();
            } catch (IOException e) {
                System.out.println("打开文件失败!请检查文件名");
            }
        }
        isNext();
    }
    public void Subtract() {
        System.out.println("进入减法运算，请输入第一个数：");
        InputNumber();
        ans = a - b;
        System.out.println(a + "-" + b +  "=" + ans);
        if (fileName != null) {
            try (
                    BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));
            ) {
                out.write(a + "-" + b  + "=" + ans);
                out.newLine();
                out.flush();
            } catch (IOException e) {
                System.out.println("打开文件失败!请检查文件名");
            }
        }

        isNext();
    }

    public void Multiply() {
        System.out.println("进入乘法运算，请输入第一个数：");
        InputNumber();
        ans = a * b;
        System.out.println(a + "*" + b +  "=" + ans);
        if (fileName != null) {
            try (
                    BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));
            ) {
                out.write(a + "*" + b  + "=" + ans);
                out.newLine();
                out.flush();
            } catch (IOException e) {
                System.out.println("打开文件失败!请检查文件名");
            }
        }

        isNext();
    }

    public void Divide()  {
        System.out.println("进入除法运算，请输入第一个数：");
        InputNumber();
        ans = (double)a / (double) b;
        System.out.println(a + "/" + b +  "=" + ans);
        if (fileName != null) {
            try (
                    BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));
            ) {
                out.write(a + "/" + b  + "=" + ans);
                out.newLine();
                out.flush();
            } catch (IOException e) {
                System.out.println("打开文件失败!请检查文件名");
            }
        }

        isNext();
    }
}

public class CounterTest {
    public static void main(String[] args) {
         Counter counter = new Counter("javaCounterAns.txt");
         counter.Menu();
    }
}
