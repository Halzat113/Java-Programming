package behaviourParameterization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CarTest {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(List.of(new Car("Audi", "Green", 2022),
                new Car("Mercedes","White",2021 ),
                new Car("BMW","Black",2020)));
        System.out.println(filterCars(cars,car->car.getBrand().equalsIgnoreCase("audi")));
        System.out.println(filterCars(cars,car->car.getYear()<2022));
        System.out.println(genericFilter(cars,car->car.getYear()==2022));
        System.out.println("=================================");
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9);
        System.out.println(genericFilter(nums,num->num%2==0));
    }

    private static List<Car> filterCars(List<Car>cars, CarPredicate carPredicate){
        List<Car> filterCars = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)){
                filterCars.add(car);
            }
        }
        return filterCars;
    }

    private static <T> List<T> genericFilter(List<T>lst, Predicate<T> predicate){
        List<T> result = new ArrayList<>();
        for (T e : lst) {
            if(predicate.test(e)){
                result.add(e);
            }
        }
        return result;
    }
}
