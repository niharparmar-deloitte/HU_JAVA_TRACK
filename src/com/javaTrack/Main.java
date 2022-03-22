package com.javaTrack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FindingArea fa = new FindingArea();
        fa.area(sc.nextDouble());
        fa.area(sc.nextFloat());
        fa.area(sc.nextFloat(), sc.nextFloat());
        fa.area(sc.nextDouble(),sc.nextDouble());
    }
}
class FindingArea
{
    void area(double x)
    {
        double z = x*x*3.14;
        System.out.println("Area of circle:"+z);
    }
    void area(float x)
    {
        System.out.println("Area of square:"+x*x);
    }
    void area(float x, float y)
    {
        System.out.println("Area of rectangle:"+x*y);
    }
    void area(double b, double h)
    {
        double m = (b*h/2);
        System.out.println("Area of triangle:"+m);
    }
}
