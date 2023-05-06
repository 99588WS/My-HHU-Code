package com.ws.javaclass.week5.p2;

import com.ws.javaclass.week5.p1.BankException;

/**
 * @author WS
 * @CreateTime 17:06
 */
public class Wife extends Thread {
    Bank bank;
    Wife(Bank bank){
        this.bank = bank;
    }
    @Override
    public void run (){
        while (true){
            try {
                bank.withdraw((int)(Math.random()*(1100 - 0 + 1)));
            } catch (BankException e) {
                e.printStackTrace();
            }
            try{
                sleep((long)(Math.random()*1000));
            }catch (InterruptedException e){}
        }
    }
}
