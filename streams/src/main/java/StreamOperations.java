import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamOperations {
    public static void main(String[] args) {

        List<Integer> myLst = Arrays.asList(1,2,2,3,4,5,3,2,6);
        myLst.forEach(System.out::println);

        //Filter
        System.out.println("***********FILTER************");
        myLst.stream().filter(i->i%2==0).distinct().forEach(System.out::println);


        //LIMIT
        System.out.println("***********LIMIT***************");
        myLst.stream().filter(i->i%2==0).limit(1).forEach(System.out::println);

        //SKIP
        System.out.println("***********SKIP***************");
        myLst.stream().filter(i->i%2==0).skip(2).forEach(System.out::println);

        //MAP
        System.out.println("***********MAP***************");
        myLst.stream().map(p->p*2).filter(i->i%3==0).forEach(System.out::println);


    }
}
