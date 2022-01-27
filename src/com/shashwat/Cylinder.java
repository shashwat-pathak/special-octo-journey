package com.shashwat;

public class Cylinder {

    private double radius;
    private double height;

    public void setHeight(double r){
        this.radius = r;
    }
    public void setRadius(double h){
        this.height = h;
    }

    public double getVolume(){
        double v = Math.PI * Math.pow(radius,2) * height;
        return v;
        //System.out.printf("The volume is :: %.3f" ,v);
    }

    public double getSurfaceArea() {
         double sArea = 2 * Math.PI * Math.pow(radius,2)  + 2 * Math.PI * radius * height;
         return sArea;
        //System.out.printf("The Surface area is :: %.3f\n", sArea);
    }
}
