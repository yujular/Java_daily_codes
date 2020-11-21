package online.pratice.code.sixth;

import java.io.*;
import java.util.*;
class InsufficientFundsException extends Exception
{
    private double amount;
    public InsufficientFundsException(double amount)
    {
        this.amount = amount;
    }
    public double getAmount()
    {
        return amount;
    }
}

// File Name CheckingAccount.java

class CheckingAccount
{
    private double balance;
    private int number;
    public CheckingAccount(int number)
    {
        this.number = number;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }
    public void withdraw(double amount) throws
            InsufficientFundsException
    {
        if(amount <= balance)
        {
            balance -= amount;
        }
        else
        {
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }
    public double getBalance()
    {
        return balance;
    }
    public int getNumber()
    {
        return number;
    }
}


// File Name BankDemo.java
public class TestException3
{
    public static void main(String [] args)
    {
        CheckingAccount c = new CheckingAccount(101);
        Scanner reader=new Scanner(System.in);
        System.out.println("请输入存款数：");
        c.deposit(reader.nextDouble());

        try
        {
            System.out.println("Withdrawing $100...");
            c.withdraw(100.00);
            System.out.println("Withdrawing $600...");
            c.withdraw(600.00);
        }catch(InsufficientFundsException e)
        {
            System.out.println("Sorry, but you are short $" + e.getAmount());
            e.printStackTrace();
        }
    }
}
