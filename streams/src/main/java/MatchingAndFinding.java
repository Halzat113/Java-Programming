import tasks.Dish;
import tasks.Type;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MatchingAndFinding {
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
        System.out.println(menu.stream().allMatch(dish -> dish.getCalories() < 1000));

        //Any Match
        if (menu.stream().anyMatch(Dish::isVegetarian)) System.out.println("The menu is vegetarian friendly");

        System.out.println("================================");
        boolean isHealthy = menu.stream().noneMatch(dish->dish.getCalories()>=1000);
        System.out.println(isHealthy);

        //Find any
        System.out.println("================================");
        Optional<Dish> dish =  menu.stream().filter(Dish::isVegetarian).findAny(); //returns optional
        System.out.println(dish.get());

        //Find First
        System.out.println("================================");
        Optional<Dish> dish2 = menu.stream().filter(Dish::isVegetarian)
                .findFirst();
        System.out.println(dish2.get());

    }
}
