import tasks.Dish;
import tasks.Type;

import java.util.*;
import java.util.stream.Collectors;

public class JavaCollectors {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,4,5,6,6,70);
        //toCollection(Supplier) : is used to create a collection using collector

        System.out.println("**********toCollection()**********");
       List<Integer> numberList = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(numberList);

        Set<Integer> numberSet = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println(numberSet);

        //toList(): returns a Collector interface that gathers the input data into a new list
        System.out.println("**********toList()**********");
       List<Integer> numLst2 = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toList());
        System.out.println(numLst2);

        //T=toSet(): returns a Collector interface that gathers the input data into a anew set

        System.out.println("**********toSet()**********");
        Set<Integer> numSet2 = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toSet());

        System.out.println(numSet2);

        //toMap(Function,Function): returns a Collector interface that gathers the input data into a new map
        System.out.println("**********toMap()**********");

        List<Dish> menu = Arrays.asList(
                new Dish("lamb",false,750, Type.MEAT),
                new Dish("beef",false,700,Type.MEAT),
                new Dish("chicken",false,400,Type.MEAT),
                new Dish("fries",true,530,Type.OTHER),
                new Dish("rice",true,350,Type.OTHER),
                new Dish("fruit",true,120,Type.OTHER),
                new Dish("pizza",true,550,Type.OTHER),
                new Dish("prawns",false,300,Type.FISH),
                new Dish("salmon",false,450,Type.FISH)
        );
        Map<String,Integer> dishMap =
        menu.stream().collect(Collectors.toMap(Dish::getName,Dish::getCalories));

        System.out.println(dishMap);

        //counting(): returns a Collectorf that counts the number of the elements
        System.out.println("**********counting()**********");

        Long evenCount = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.counting());
        System.out.println("evenCount = " + evenCount);


    }
}
