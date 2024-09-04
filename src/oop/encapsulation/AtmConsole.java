package oop.encapsulation;

public class AtmConsole {
    public static void main(String[] args) {
        Withdraw bankUser = new Withdraw();
        Deposit sameUser = new Deposit();
        bankUser.withdraw();
        sameUser.deposit();
    }

}


