package com.ws.javaclass.week5.p2;

/**
 * @author WS
 * @CreateTime 17:29
 */
public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setAccount(200);

        Husband husband = new Husband(bank);
        Wife wife = new Wife(bank);

        husband.start();
        wife.start();
    }
}
