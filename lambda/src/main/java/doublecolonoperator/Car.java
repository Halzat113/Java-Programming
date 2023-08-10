package doublecolonoperator;

public class Car {
    private String make;
    private int model;

    public Car(){}

    public Car(int model){this.model = model;}

    public Car(String make,int model){
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }
}
