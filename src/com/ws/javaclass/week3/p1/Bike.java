package com.ws.javaclass.week3.p1;

import com.ws.javaclass.week2.p2.p2;

/**
 * @author WS
 * @CreateTime 9:23
 */
public class Bike extends p2.Vehicle {
    private final double maxSpeed = 50;
    private int license = 12;

    public Bike(double speed) {
        super();
        this.speed = speed;
    }

    @Override
    public void speedUp(double reSetSpeed) {
        super.speedUp(reSetSpeed);
        if (speed >= maxSpeed) {
            System.out.println("Bike超速！当前速度 " + speed);
            license -= 3;
        }
        else{
            System.out.println("Bike正常行驶！当前速度 " + speed);
        }
    }

    @Override
    public void showInfo() {
        System.out.println("剩余驾照分 : " + license);
    }
}