import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {
    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(100,"Mike","mike@gmail.com", Arrays.asList("2029123473","2023415432")),
                new Employee(101,"Ozzy","Ozzy@gmail.com", Arrays.asList("7042306152","7033415422")),
                new Employee(100,"Mike","mike@gmail.com", Arrays.asList("5899123445","58934154"))
        );
    }
}
