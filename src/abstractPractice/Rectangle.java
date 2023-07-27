package abstractPractice;

public class Rectangle extends Shape{
    private final int a;
    private final int b;
    public Rectangle(int a,int b){
        super("Rectangle");
        this.a = a;
        this.b = b;
        getArea();
    }

    @Override
    public void getArea() {
        area = a*b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", area=" + area +
                '}';
    }
}
