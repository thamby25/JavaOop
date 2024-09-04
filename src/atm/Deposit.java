package atm;

import java.util.Scanner;

public class Deposit{
    public void deposit(){
        Money depMoney= new Money();

    Scanner scanner= new Scanner(System.in);
    System.out.println("enter amount to deposit");
    double deposit= scanner.nextDouble();

    double dep_total= depMoney.balance+deposit;
    System.out.println(dep_total);
    //new_balance=dep_total;

}
}
