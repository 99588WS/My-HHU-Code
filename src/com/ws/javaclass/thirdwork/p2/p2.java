package com.ws.javaclass.thirdwork.p2;
import java.awt.Rectangle;
/**
 * @author WS
 * @CreateTime 8:24
 */
public class p2 {
    public static void main(String[] args) {
        //第一个
        Rectangle rectangle01 = new Rectangle(0, 0, 20, 10);
        System.out.println("width01 = " + rectangle01.getWidth() + "height01 = " + rectangle01.getHeight());

        //第二个
        Rectangle rectangle02 = new Rectangle(1,1,30,20);
        System.out.println("width02 = " + rectangle02.getWidth() + "height02 = " + rectangle02.getHeight());

        //重合面积
        if(rectangle01.intersects(rectangle02)){
            Rectangle newRectangle = rectangle01.intersection(rectangle02);
            double space = newRectangle.getHeight() * newRectangle.getWidth();
            System.out.println("重合部分面积为 : " + space);
        }
        else{
            System.out.println("两长方形没有重合");
        }

        //正方形
        Square square = new Square(1);
        square.getDiagonal();
    }
}