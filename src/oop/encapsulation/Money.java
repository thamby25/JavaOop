package oop.encapsulation;

public class Money {


//    public void transaction() {
private static double balance = 200;
       // protected double new_balance;

        // }
        public double getMoney(double amount_withdraw){
                if(balance>amount_withdraw){
                        balance = balance - amount_withdraw;
                        return amount_withdraw;
//                        System.out.println("total: "+wit_total);
//                        witMoney.balance = wit_total;
                }
                else{
                        System.out.println("insufficient");
                        return 0;
                }


        }

        public double addMoney(double add_money){
               balance += add_money;
               return balance;
        }



}

