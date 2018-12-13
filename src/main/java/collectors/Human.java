package collectors;

import lombok.Builder;
import lombok.Data;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder

public class Human {
    private String email;
    private String name;
    private int salary;
}
