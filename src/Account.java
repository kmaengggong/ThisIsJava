package src;

public class Account{
    // Constants
    private static final int MAX_BALANCE = 1000000;
    private static final int MIN_BALANCE = 0;

    // Field
    private String accountNumber;
    private String accountName;
    private int balance;
    
    // Constructors
    public Account(){

    }

    // Setters, Getters
    public void setAccoutNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public String getAccoutNumber(){
        return this.accountNumber;
    }
    public void setAccoutName(String accountName){
        this.accountName = accountName;
    }
    public String getAccoutName(){
        return this.accountName;
    }
    public void setBalance(int balance){
        if(balance <= MIN_BALANCE || balance >= MAX_BALANCE) return;
        else this.balance = balance;
    }
    public int getBalance(){
        return this.balance;
    }
    
}