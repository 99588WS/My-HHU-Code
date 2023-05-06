package com.ws.javaclass.week2.p1;

import java.io.IOException;

/**
 * @author WS
 * @CreateTime 8:05
 */
public class p1 {
    public static void main(String[] args) throws IOException {
        int a = (int)System.in.read()-'0';
        char b = (char) System.in.read();
        int c = (int) System.in.read()-'0';

        if(b == '+') {
            System.out.println("a + b = " + add(a,c));
        }
        if(b == '-') {
            System.out.println("a - b = " + sub(a,c));
        }
        if(b == '*') {
            System.out.println("a * b = " + mul(a,c));
        }
        if(b == '/') {
            System.out.println("a / b = " + div(a,c));
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

}

