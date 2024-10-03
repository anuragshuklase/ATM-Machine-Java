import java.util.Scanner;
class  ATM{
    float Balance;
    int PIN = 2023;
    public void checkPin(){
        System.out.println("Enter your pin");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
    if(enteredpin == PIN){
            menu();
        }
        else{
            System.out.println("Enter a valid pin");
            menu();
        }
    }
    public void menu(){
        System.out.println("Enter Your Choice");
        System.out.println("1. check account balance");
        System.out.println("2. Withraw money");
        System.out.println("3.Deposit money");
        System.out.println("4.Exit");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if(opt != 1 )if(opt == 2){
            withrawMoney();
        }
        else if(opt == 3){
            depositMoney();
        }
        else if (opt == 4){
        }
        else{
            System.out.println("Enter a valid choice");
        }
        else {
            checkBalance();
        }
    }
    public void checkBalance(){
        System.out.println("Balance"+ Balance);
        menu();
    }
    public void withrawMoney(){
        System.out.println("Enter amount to withraw");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        // int amount = sc.nextInt();
        if(amount>Balance){
            System.out.println("Insufficient balance");
        }
        else{
            Balance = Balance-amount;
            System.out.println("Money Withdraw Sucesful");
        }
        menu();
    }
    public void depositMoney(){
        System.out.println("Enter the Amount");
        Scanner sc = new Scanner(System.in);
        // int amount = sc.nextInt();
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money deposit successful");
        menu();
    }
}
public class ATMMachine{
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkPin();
    }
}
