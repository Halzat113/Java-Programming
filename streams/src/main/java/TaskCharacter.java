import java.util.List;
import java.util.stream.Collectors;

public class TaskCharacter {
    public static void main(String[] args) {
        List<String> words = List.of("Java","Apple","Honda","Developer");
        words.stream().map(String::length).forEach(System.out::println);

        //More advanced
        words.stream().map(p->p+" has "+p.length()+" characters").forEach(System.out::println);




    }
}
