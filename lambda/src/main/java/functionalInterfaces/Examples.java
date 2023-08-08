package functionalInterfaces;

import java.util.function.*;

public class Examples {
    public static void main(String[] args) {
        //============PREDICATE================
//        Predicate<Integer> lessThan = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer<18;
//            }
//        };
//        lessThan.test(19);

        Predicate<Integer> lessThan = i->i<18; //Implementation of test method that belongs to Predicate interface
        System.out.println(lessThan.test(50));

        //============CONSUMER================
        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(10);

        //============BICONSUMER================
        BiConsumer<Integer,Integer> addTwo = (x,y)-> System.out.println(x+y);
        addTwo.accept(100,200);

        //============FUNCTION================
        Function<String,String> fun = s->"Hello "+s;
        System.out.println(fun.apply("java"));

        //============SUPPLIER================
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

    }
}
