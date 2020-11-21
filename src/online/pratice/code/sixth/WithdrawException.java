package online.pratice.code.sixth;

/**
 * @author yujular
 * @title: CreditException
 * @date 2020/11/12
 */
public class WithdrawException extends Exception {
    private String message;
    public WithdrawException(String message){
        this.message = message;
    }
    public String getMessage(){
        return message;
    }
}
