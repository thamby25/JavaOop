package oop.encapsulation;

import java.util.Scanner;

public class Deposit{
    public void deposit(){
        Money bank = new Money();

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter amount to deposit");
        double deposit= scanner.nextDouble();

        double dep_total= bank.addMoney(deposit);
        System.out.println(dep_total);
    }
}
