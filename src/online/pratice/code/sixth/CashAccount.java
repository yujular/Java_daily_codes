package online.pratice.code.sixth;

abstract class Account {
    private String name;
    public String id;
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public Account(String name, String id, double balance) {
        super();
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public Account(String name, String id) {
        super();
        this.name = name;
        this.id = id;
    }
    public void deposit(double amount){
        this.balance+=amount;
    }

    abstract void withdraw(double amount) throws WithdrawException;
}
public class CashAccount extends Account {
    public String cashsort;
    public String getCashsort() {
        return cashsort;
    }
    public void setCashsort(String cashsort) {
        this.cashsort = cashsort;
    }
    public CashAccount(String name, String id, double balance, String cashsort) {
        super(name, id, balance);
        this.cashsort = cashsort;
    }
    public void  withdraw(double amount)throws WithdrawException{
        if(this.getBalance()>=amount){
            this.setBalance(this.getBalance()-amount);
        }
        else{
            throw new WithdrawException("现金取款错误");
        }
    }
}
