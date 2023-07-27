package abstractPractice;

import java.text.DecimalFormat;

public abstract class Shape {

    private String name;
    protected double area;

    protected DecimalFormat df = new DecimalFormat("0.00");

    public Shape(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void getArea();

}
