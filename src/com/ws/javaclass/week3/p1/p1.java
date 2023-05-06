package com.ws.javaclass.week3.p1;

/**
 * @author WS
 * @CreateTime 8:05
 */
public class p1 {
    public static void main(String[] args) {
        Bike bike = new Bike(30);

        Car car = new Car(120);

        bike.speedUp(10);
        bike.showInfo();

        car.speedUp(120);
        car.showInfo();
    }
}



