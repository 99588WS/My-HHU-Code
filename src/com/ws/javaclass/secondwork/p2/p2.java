package com.ws.javaclass.secondwork.p2;

/**
 * @author WS
 * @CreateTime 8:24
 */
public class p2 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(10);
        vehicle.drive(10);
        vehicle.speedUp(20);
        vehicle.drive(15);
        vehicle.showInfo();
    }

}
class Vehicle {
    public double speed;
    public double dist;
    public double time;

    public Vehicle(double speed) {
        this.speed = speed;
    }
    public double speedUp(double addSpeed) {
        return this.speed = addSpeed;
    }
    public void drive(double time) {
        this.time = time;
        dist += this.time * speed;
    }
    public void showInfo() {
        System.out.println("一共行驶了 ：" + dist + "公里");
    }
}