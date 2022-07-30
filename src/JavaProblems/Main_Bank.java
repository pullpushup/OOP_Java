package JavaProblems;

public class Main_Bank {
    public static void main(String[] args){
        //Sub class Account
        Account RajsAccount = new Account("10051",0.00,"Raj","Raj@gmail.com","90 50 02 508");



        RajsAccount.withdrawal(100.0);

        RajsAccount.deposit(50.0);
        RajsAccount.withdrawal(75.0);
        //It still now withdrawal given message "Only 50.0 available. Withdrawal not processed"
        //which is good means it's working

        RajsAccount.deposit(100);
        RajsAccount.withdrawal(120.0);
        //Given message "Withdrawal of 120.0 processed. Remaining balance = 30.0"


    }

}
