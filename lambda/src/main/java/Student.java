import lombok.*;

import java.util.Objects;
//@NoArgsConstructor
@AllArgsConstructor
//@ToString
//@EqualsAndHashCode
//@Setter
//@Getter
@Data
public class Student {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private int age;

}