package collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class MainBuildMapOfEmployeeBySeniority {
    public static void main(String[] args) {
        Stream<Employee> stream = Stream.of(
                new Employee("Avishay", 50000),
                new Employee("Dina", 25000),
                new Employee("Hirsh", 25000),
                new Employee("Moshe", 200000));


        Map<Integer, List<Employee>> map = stream.collect(Collectors.groupingBy(Employee::getSalary));
        System.out.println(map);
    }

    

}






