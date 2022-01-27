package com.shashwat;

public class Cone {
    private static double radius ;
    private static double height ;

    Cone(double radius , double height){
      this.radius = Math.pow(radius,2);
      this.height = Math.pow(height,2);
    }

    public static double slantHeight(){
        double s = Math.sqrt(radius) + Math.sqrt(height);
        return s;
    }

    public static double angle(){
       double theta = Math.atan(radius/height);
       return theta;
    }

}
