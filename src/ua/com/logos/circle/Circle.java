package ua.com.logos.circle;

public class Circle {
    private double radius;
    private double diametr;

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diametr=" + diametr +
                '}';
    }
public Circle(){}
    public Circle (double radius, double diametr) {this.radius=radius; this.diametr=diametr;}
    public double getArea() {return (3.14*(diametr*diametr))/4;}
    public double getLength(){return 3.14*2*radius;}
}
