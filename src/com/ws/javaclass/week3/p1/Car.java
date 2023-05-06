package com.ws.javaclass.week3.p1;

import com.ws.javaclass.week2.p2.p2;

/**
 * @author WS
 * @CreateTime 9:25
 */
public class Car extends p2.Vehicle {
    private final int maxSpeed = 100;
    private int license = 12;

    public Car(double speed) {
        super();
        this.speed = speed;
    }

    @Override
    public void speedUp(double reSetSpeed) {
        super.speedUp(reSetSpeed);
        if (speed >= maxSpeed) {
            System.out.println("Car超速！限速100，当前速度 " + speed);
            license -= 3;
        }
        else{
            System.out.println("Car正常行驶！当前速度 " + speed);
        }
    }

    @Override
    public void showInfo() {
        System.out.println("剩余驾照分 : " + license);
    }
}
