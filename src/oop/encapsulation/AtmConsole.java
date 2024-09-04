package oop.encapsulation;

public class AtmConsole {
    public static void main(String[] args) {
        Money obj= new Money();
        Withdraw obj1= new Withdraw();
        Deposit obj2=new Deposit();
//        Money.balance = 20;

//        obj.balance();
        obj1.withdraw();
        obj2.deposit();
    }

}


