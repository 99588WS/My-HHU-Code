package com.ws.javaclass.week5.p2;

import com.ws.javaclass.week5.p1.BankException;

/**
 * @author WS
 * @CreateTime 9:07
 */
public class Bank {
    private double account;

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }

    /**
     * 存钱方法
     */
    public void deposit(double input) {
        System.out.println("存入" + input);
        account += input;
        System.out.println("剩余" + account);
    }

    /**
     * 取钱方法
     */
    public void withdraw(double output) throws BankException {
        if (account < 0  || output >= account) {
            try {
                throw new BankException("余额不足");
            } catch (BankException e) {
                e.printStackTrace();
            }
        }
        if (output >= 1000){
            throw new BankException("超出额度");
        }
        System.out.println("取出" + output);
        account -= output;
        System.out.println("剩余" + account);
    }
}
