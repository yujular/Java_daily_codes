package online.pratice.code.sixth;


public class Test {
    public static void main(String[] args) {
        Account credit=new CreditAccount("zqq","20094070149",0,500,0);
        Account debit=new CashAccount("zsq","20094070101",0,"借记卡");

        credit.deposit(500);
        debit.deposit(500);
        try{
        credit.withdraw(200);
        credit.withdraw(400);}
        catch (WithdrawException e){
            System.out.println(e.getMessage());
        }
        try {
        debit.withdraw(200);
        debit.withdraw(400);
        }catch (WithdrawException e){
            System.out.println(e.getMessage());
        }

        System.out.println("credit balance  "+credit.getBalance());
        System.out.println("cash balance "+debit.getBalance());
    }
}
