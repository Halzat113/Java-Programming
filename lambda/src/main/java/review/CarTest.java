package review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("Honda",180,2021);
        Car car1 = Car.builder().make("Banz").topSpeed(180).year(2010).build();
        Car car2 = new Car("BMW",210,2020);
        Car car3 = new Car("Nissan",150,2018);
        List<Car> cars = new ArrayList<>(Arrays.asList(car,car3,car2,car1));
//      System.out.println(filterCars(cars, new CarFastPredicate()));
        filterCars(cars,c -> c.getTopSpeed()>160);
    }

    private static List<Car> filterCars(List<Car>cars,CarPredicate carPredicate){
        List<Car> carLst = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)){
                carLst.add(car);
            }
        }
        return carLst;
    }
}
