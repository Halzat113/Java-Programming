import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class CreatingStream {
    public static void main(String[] args) {
        //Creating stream from Array
        String[] courses = {"Java","JS","TS"};
        Stream<String> courseStream =  Arrays.stream(courses);

        //Creating Stream from Collection
        List<String> courseLst = Arrays.asList("Java","DS","Spring");
        Stream<String> courseStream2 = courseLst.stream();

        List<Course> myCourses = Arrays.asList(
                new Course("Java",100),
                new Course("DS",101),
                new Course("Spring",102),
                new Course("Microservices",103)
        );

        Stream<Course>myCourseStream = myCourses.stream();


        //Creating Stream from Values. However, this is not common
        Stream<Integer> stream = Stream.of(1,2,3,4);


    }
}
