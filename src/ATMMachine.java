package ATMMachine;

import java.util.Scanner;

class  ATM{

    float Balance;
    int PIN = 3366;

    public void cheakpin(){
        System.out.println("Enter your PIN:");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin==PIN){
            System.out.println("Welcome,Rohit Raj");
            menu();
        }
        else {
            System.out.println("Enter the Vaild PIN.");
        }
    }
    public void menu(){
        System.out.println("Enter Your Choice:");
        System.out.println("1. Cheak A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposite Money");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt == 1){
            CheakBalance();
        } else if (opt == 2) {
            WithdrawMoney();

        } else if (opt == 3) {
            DepositeMoney();

        } else if (opt == 4){
            return;
        }
        else{
            System.out.println("Enter the valid choice.");
        }
    }
    public void CheakBalance(){
        System.out.println("Balance:" + Balance);
        menu();

    }
    public void WithdrawMoney(){
        System.out.println("Enter Amount for Withdraw:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Funds");
        }
        else{
            Balance = Balance - amount;
            System.out.println("Money Withdraw Successful.");
        }
        menu();

    }

    public void DepositeMoney(){
        System.out.println("Enter Amount for Deposite:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Deposite Money Successful.");
        menu();

    }


}


public class ATMMachine {
    public static void main(String[] args) {

        ATM obj = new ATM();
        obj.cheakpin();


    }
}