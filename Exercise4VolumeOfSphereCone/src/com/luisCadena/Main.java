package com.luisCadena;

public class Main {

    public static void main(String[] args) {
        System.out.println("Volume of cone = " + returnVolume(10,20));
        System.out.println("Volume of sphere = " + returnVolume(10));
    }



    private static double returnVolume(double radius, double height){

    double volume = 3.141592 * (Math.pow(radius,2)) * (height/3);
    if (radius >= 0 && height >= 0){

        return volume;

    } else {return 0;}

    }



    private static double returnVolume(double radius){

        double volume = (4d/3d) * (3.141592d) * (Math.pow(radius,3));
        if (radius >= 0){

            return volume;

        } else {return 0;}

    }





}
