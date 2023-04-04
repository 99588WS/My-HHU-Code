package com.ws.javaclass.firstwork;

import java.util.Scanner;

/**
 * @author WS
 * @CreateTime 21:31
 */
public class p2 {
    static Scanner myscanner = new Scanner(System.in);
    public static void main(String[] args) {
        int speed;
        String s1 = "正常";
        String s2 = "违章";
        String result;
        speed = myscanner.nextInt();
        if(speed <= 60 || speed >= 120){
            result = s2;
        }
        else {
            result =s1;
        }
        System.out.println(result);
    }
}
