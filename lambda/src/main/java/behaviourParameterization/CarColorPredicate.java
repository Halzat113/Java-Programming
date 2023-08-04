package behaviourParameterization;

public class CarColorPredicate implements CarPredicate{
    @Override
    public boolean test(Car car) {
        return car.getColor().equalsIgnoreCase("green");
    }
}
