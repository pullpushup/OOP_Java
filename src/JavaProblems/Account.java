package JavaProblems;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;


    public Account(String number, double balance, String customerName, String customerPhoneNumber, String customerEmailAddress){
        System.out.println("Account information");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerEmailAddress = customerEmailAddress;

    }

    public void deposit(double depositAmount){
        balance += depositAmount;
        System.out.println("Deposit of "+ depositAmount + "made. New balance is "+ this.balance);
    }
    public void withdrawal(double withdrawalAmount){
        if(this.balance - withdrawalAmount <=0){
            System.out.println("Only "+ balance+ " available. Withdrawal not processed");
        }else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of "+ withdrawalAmount+ " processed. Remaining balance = " + balance);
        }
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
