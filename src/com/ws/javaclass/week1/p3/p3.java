package com.ws.javaclass.week1.p3;

/**
 * @author WS
 * @CreateTime 21:36
 */
public class p3 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= 4/2 - i; j++) {
                System.out.print(" ");
            }
            int cnd = 0;
            while(cnd <= i){
                System.out.print("* ");
                cnd++;
            }
            System.out.println();
        }
    }
}

