package oop.encapsulation;

public class Money {

        private static double balance = 200;

        public double getMoney(double amountWithdraw) {
                if (balance > amountWithdraw) {
                        balance -= amountWithdraw;
                        return amountWithdraw;
                } else {
                        System.out.println("insufficient");
                        return 0;
                }
        }

        public double addMoney(double addNewMoney) {
                balance += addNewMoney;
                return balance;
        }

}
