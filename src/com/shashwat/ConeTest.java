package com.shashwat;

public class ConeTest {
    public static void main(String[] args) {
        Cone obj1 = new Cone(12,23);
        double slheight = obj1.slantHeight() ;
        System.out.format("The Slant height is :: %.3f\n",slheight);
        double angle = obj1.angle();
        System.out.printf("The Angle is :: %.3f",angle);
    }

}
