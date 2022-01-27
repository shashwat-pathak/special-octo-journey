package com.shashwat;

public class ConeTest {
    public static void main(String[] args) {
        Cone obj1 = new Cone(12,23);
        double slheight = Cone.slantHeight() ;
        System.out.format("The Slant height is :: %.3f\n",slheight);
        double angle = Cone.angle();
        System.out.printf("The Angle is :: %.3f",angle);
    }

}
