import java.util.ArrayList;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));

//        List<Apple> heavyApple = filterApples(inventory, new AppleHeavyPredicate());
//        System.out.println(heavyApple);

        // with lambda
        List<Apple> heavyApple = filterApples(inventory,apple -> apple.getWeight()>200);
        System.out.println(heavyApple);

//        List<Apple> greenApple = filterApples(inventory,new AppleGreenColorPredicate());
//        System.out.println(greenApple);

        List<Apple> greenApple = filterApples(inventory,apple -> apple.getColor().equals(Color.GREEN));
        System.out.println(greenApple);
        System.out.println("===============Format===============");
       prettyPrintApple(inventory,apple -> {String result = apple.getWeight()>=100?"Heavy":"Light";
            return "A "+result+" "+apple.getColor()+" apple";});

    }

    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (applePredicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }

    static void prettyPrintApple(List<Apple> inventory, AppleFormatter appleFormatter){
        for (Apple apple : inventory) {
            String output = appleFormatter.test(apple);
            System.out.println(output);
        }
    }
}
