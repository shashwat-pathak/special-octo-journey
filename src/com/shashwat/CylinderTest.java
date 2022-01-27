package com.shashwat;

public class CylinderTest{
    public static void main(String[] args) {
        Cylinder obj = new Cylinder();
        obj.setHeight(12);
        obj.setRadius(3);
//        obj.getSurfaceArea();
//        obj.getVolume();
        double vol = obj.getVolume();
        double sa = obj.getSurfaceArea();
        System.out.printf("The Volume is :: %.3f\n",vol);
        System.out.format("The Surface Area is :: %.3f",sa);
    }

}
