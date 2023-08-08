package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {

        List<User> users = List.of(new User("Halzat","Halike",26),
                new User("Mark","Elon",46),
                new User("Frank","Ean",46),
                new User("Jack","Pot",46),
                new User("David","Mali",46),
                new User("Clark","Son",46));
        //Print all elements in the list
        System.out.println(filter(users, p -> true));
        System.out.println("================");
        //Print all users that last name starts with E
        System.out.println(filter(users, user -> user.getLastName().startsWith("E")));

    }

    private static <T> List<T> filter (List<T> users, Predicate<T> predicate){
        List<T> result = new ArrayList<>();
        for (T user : users) {
            if (predicate.test(user)){
                result.add(user);
            }
        }
        return result;
    }
}
