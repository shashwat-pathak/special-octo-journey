package com.shashwat;

public class Cone {
    private double radius;
    private double height;

    Cone(double radius , double height){
      this.radius = radius;
      this.height = height;
    }

    public double slantHeight(){
        double s = Math.sqrt(Math.pow(radius,2)) + Math.sqrt(Math.pow(height,2));
        return s;
    }

    public double angle(){
       double theta = Math.atan(radius/height);
       return theta;
    }

}
