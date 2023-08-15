import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {

        //Print all email - one to one
        EmployeeData.readAll().map(Employee::getEmpEmail).forEach(System.out::println);

        //print all phone numbers
        System.out.println("==================================");

        EmployeeData.readAll().map(Employee::getEmpPhoneNumber).forEach(System.out::println);

        System.out.println("==================================");

        EmployeeData.readAll().flatMap(employee -> employee.getEmpPhoneNumber().stream())
                .forEach(System.out::println);

        System.out.println("==================================");
        EmployeeData.readAll().map(Employee::getEmpPhoneNumber).flatMap(List::stream).forEach(System.out::println);

        List<Integer> n1 = List.of(1,2,3);
        List<Integer> n2 = List.of(3,4);

        System.out.println("==================================");
        n1.stream().flatMap((l1->n2.stream().map(l2->l1+","+l2))).forEach(System.out::println);

    }
}
