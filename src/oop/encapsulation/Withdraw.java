package oop.encapsulation;

import java.util.Scanner;

public class Withdraw{
    public void withdraw(){
        Money witMoney = new Money();


    Scanner scanner= new Scanner(System.in);
    System.out.println("Enter amount to withdraw");
    double withdraw =scanner.nextDouble();

    double wit_total=witMoney.getMoney(withdraw);



}

}
