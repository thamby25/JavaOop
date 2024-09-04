package atm;

import java.util.Scanner;

public class Withdraw{
    public void withdraw(){
        Money witMoney = new Money();


    Scanner scanner= new Scanner(System.in);
    System.out.println("Enter amount to withdraw");
    double withdraw =scanner.nextDouble();

    double wit_total=witMoney.balance - withdraw;

    if(wit_total>=0){
        System.out.println("total: "+wit_total);
        witMoney.balance = wit_total;
    }
    else{
        System.out.println("insufficient");
    }

}

}
