package tasks;

import java.util.Arrays;
import java.util.List;

public class DishTest {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("lamb",false,750,Type.MEAT),
                new Dish("beef",false,700,Type.MEAT),
                new Dish("chicken",false,400,Type.MEAT),
                new Dish("fries",true,530,Type.OTHER),
                new Dish("rice",true,350,Type.OTHER),
                new Dish("fruit",true,120,Type.OTHER),
                new Dish("pizza",true,550,Type.OTHER),
                new Dish("prawns",false,300,Type.FISH),
                new Dish("salmon",false,450,Type.FISH)
        );
        // print all dish's name that has less than 400 calories
        menu.stream().filter(p->p.getCalories()<400).forEach(p-> System.out.println(p.getName()));

        //print the length of the name of each dish
        menu.stream().map(f->f.getName()+" has "+f.getName().length()+" characters").forEach(System.out::println);
    }
}
