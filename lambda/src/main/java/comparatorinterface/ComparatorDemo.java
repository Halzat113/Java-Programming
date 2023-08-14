package comparatorinterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(10,0,15,5,20);
        System.out.println(lst);

        //Ascending sort
        Collections.sort(lst);
        System.out.println(lst);

        //Descending order
        Collections.sort(lst,new MyComparator());
        System.out.println(lst);

        Collections.sort(lst,((o1,o2)->(o1>o2)?-1:(o2>o1)?1:0));

        //Ascending
        lst.sort((o1,o2)-> o1.compareTo(o2));
        System.out.println(lst);

        //Descending
        lst.sort((o1,o2)->o2.compareTo(o1));
        System.out.println(lst);

        List<Apple> myInventory = Arrays.asList(
                new Apple(80,Color.GREEN),
                new Apple(155,Color.RED),
                new Apple(120,Color.GREEN)
        );

        Comparator<Apple> sortApple = comparing( apple->apple.getWeight());
        myInventory.sort(sortApple);
        System.out.println("myInventory = " + myInventory);

        myInventory.sort(comparing(apple->apple.getWeight()));
        myInventory.sort(comparing(Apple::getWeight));

        //Reversed
        myInventory.sort(comparing(Apple::getWeight).reversed());
        System.out.println("myInventory = " + myInventory);

        //Chaining
        myInventory.sort(comparing(Apple::getWeight).reversed().thenComparing(Apple::getColor));
        System.out.println("myInventory = " + myInventory);
    }
}
