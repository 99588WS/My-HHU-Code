package com.ws.javaclass.thirdwork.p1;

import com.ws.javaclass.secondwork.p2.p2;

/**
 * @author WS
 * @CreateTime 8:05
 */
public class p1 {
    public static void main(String[] args) {
       /* Scanner myScanner = new Scanner(System.in);
        System.out.println("please set bike speed : ");
        double bikeSpeed = myScanner.nextDouble();*/
        Bike bike = new Bike(50);

        /*System.out.println("please set car speed : ");
        double carSpeed = myScanner.nextDouble();*/
        Car car = new Car(120);

        bike.speedUp(60);
        bike.showInfo();

        car.speedUp(120);
        car.showInfo();
    }
}



