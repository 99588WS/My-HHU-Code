package com.ws.javaclass.week5.p1;

/**
 * @author WS
 * @CreateTime 8:12
 */
public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setAccount(1000);

        bank.deposit(5000);
        try {
            bank.withdraw(900);
            bank.withdraw(90000);
        } catch (BankException e) {
            e.printStackTrace();
        }
    }
}