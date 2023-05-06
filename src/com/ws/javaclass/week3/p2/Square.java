package com.ws.javaclass.week3.p2;

import java.awt.*;

/**
 * @author WS
 * @CreateTime 9:19
 */
public class Square extends Rectangle {
    public Square(int sideLength) {
        width = sideLength;
        height =sideLength;
    }
    public void getDiagonal(){
        double diagonal = Math.sqrt(2 * getWidth() * getWidth());
        System.out.println("正方形对角线为 : " + diagonal);
    }
}
