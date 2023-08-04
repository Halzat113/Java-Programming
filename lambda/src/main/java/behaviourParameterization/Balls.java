package behaviourParameterization;

public class Balls {

    private String color;
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Balls(String color,int weight) {
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Balls{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
