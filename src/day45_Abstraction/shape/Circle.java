package day45_Abstraction.shape;

public class Circle {

    private double radius;

    public final static double pi;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius < 0){
            throw new RuntimeException("Invalid Radius: "+radius);
        }
        this.radius = radius;
    }




}
