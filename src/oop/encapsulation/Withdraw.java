package oop.encapsulation;

import java.util.Scanner;

public class Withdraw{
    public void withdraw(){
        Money bank = new Money();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount to withdraw");
        double withdraw = scanner.nextDouble();
        System.out.println("Amount Withdrawn: "+ bank.getMoney(withdraw));
    }
}
