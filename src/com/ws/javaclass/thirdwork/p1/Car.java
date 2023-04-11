package com.ws.javaclass.thirdwork.p1;

import com.ws.javaclass.secondwork.p2.p2;

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
    public void speedUp(double addSpeed) {
        super.speedUp(addSpeed);
        if (speed >= maxSpeed) {
            System.out.println("超速！");
            license -= 3;
        }
    }

    @Override
    public void showInfo() {
        System.out.println("剩余驾照分 : " + license);
    }
}
