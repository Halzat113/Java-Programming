package doublecolonoperator;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {
    public static void main(String[] args) {

        //Zero-arg
        Supplier<Car> c1 = () -> new Car();
        System.out.println(c1.get().getModel());

        Supplier<Car> c2 = Car::new;
        System.out.println(c2.get().getModel());

        //One Arg

        Function<Integer,Car> f1 =(model)->new Car(model);
        System.out.println(f1.apply(2018).getModel());

        Function<Integer,Car> f2 = Car::new;
        System.out.println(f2.apply(2010).getModel());

        //Two arg

        BiFunction<String,Integer,Car> b1 = (make,model)->new Car(make,model);
        System.out.println(b1.apply("Honda",2010));

        BiFunction<String,Integer,Car> b2 = Car::new;
        System.out.println(b2.apply("Nissan", 2020));
    }
}