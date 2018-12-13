package collectors;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Evgeny Borisov
 */
@Data
@AllArgsConstructor
public class Employee {
    private String name;
    private int salary;
}
