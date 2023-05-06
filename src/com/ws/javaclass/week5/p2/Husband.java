package com.ws.javaclass.week5.p2;

/**
 * @author WS
 * @CreateTime 17:02
 */
public class Husband extends Thread{
    Bank bank;
    Husband(Bank bank){
        this.bank = bank;
    }
    @Override
    public void run (){
        while (true){
            bank.deposit(5000);
            try{
                sleep((long)(Math.random()*5000));
            }catch (InterruptedException e){}
        }
    }
}
