package online.pratice.code.sixth;

public class CreditAccount extends Account {
    double staticoverdraw;
    double overdraw;

    public CreditAccount(String name, String id, double balance,
                         double staticoverdraw, double overdraw) {
        super(name, id, balance);

        this.staticoverdraw = staticoverdraw;
        this.overdraw = overdraw;
    }
    public void  findOverdraw(){
        if(this.getBalance()<0){
            System.out.print("透支");
            overdraw=-(this.getBalance());
        }
        else {
            System.out.println("未透支");

        }
    }
    public void  withdraw(double amount) throws WithdrawException {
        if(this.getBalance()+staticoverdraw>=amount){
            this.setBalance(this.getBalance()-amount);

        }
        else{
            throw new WithdrawException("信用卡取款错误");
        }
    }
}
