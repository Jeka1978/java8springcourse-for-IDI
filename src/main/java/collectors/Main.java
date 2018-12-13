package collectors;

import labdas.Person;
import org.fluttercode.datafactory.impl.DataFactory;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        DataFactory dataFactory = new DataFactory();

        Stream<Human> stream = Stream.of(
                Human.builder().name("Eladad").salary(31000).email(dataFactory.getEmailAddress()).build(),
                Human.builder().name("Dima").salary(3000).email(dataFactory.getEmailAddress()).build(),
                Human.builder().name("Dima").salary(47000).email(dataFactory.getEmailAddress()).build()
        );

        Map<String, Integer> map = stream.collect(toMap(Human::getName, Human::getSalary,
                (integer, integer2) -> integer>integer2?integer:integer2));
        System.out.println("map = " + map);


    }
}
