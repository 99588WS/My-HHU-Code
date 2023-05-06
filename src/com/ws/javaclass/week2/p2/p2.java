package com.ws.javaclass.week2.p2;

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

    public static class Vehicle {
        public double speed;
        public double dist;
        public double time;

        public Vehicle() {
        }

        public Vehicle(double speed) {
            this.speed = speed;
        }
        //重新设定速度
        public void speedUp(double reSetSpeed) {
            this.speed = reSetSpeed;
        }

        public void drive(double time) {
            this.time = time;
            dist += this.time * speed;
        }

        public void showInfo() {
            System.out.println("一共行驶了 ：" + dist + "公里");
        }
    }
}
