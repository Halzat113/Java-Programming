package abstractPractice;

import java.text.DecimalFormat;

public class Circle extends Shape{

    private final double r;
    final double pi = 3.14;
    public Circle(double r){
        super("Circle");
        this.r = r;
        getArea();
    }

    public double getR() {
        return r;
    }

    @Override
    public void getArea() {
        area = pi * Math.sqrt(r);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", name='" + getName() + '\'' +
                ", area=" + df.format(area) +
                '}';
    }
}
