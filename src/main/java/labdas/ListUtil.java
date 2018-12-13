package labdas;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author Evgeny Borisov
 */
public class ListUtil {
    public static <T> int countDuplicates(T t, List<T> list, Equalator<T> equalator) {
        int counter = 0;
        for (T t1 : list) {
            if (equalator.isEqual(t,t1)) {
                counter++;
            }
        }
        return counter;
    }


    public static void main(String[] args) {
   /*     List<String> list = asList("java","scala","Java","JAVA");
        countDuplicates("java", list, (s1, s2) -> s1.equalsIgnoreCase(s2));
        list.forEach(System.out::println);*/


        ArrayList<String> names = new ArrayList<>();
        names.add("Stallone");
        names.add("Chuck");
        names.add("Arnold");

        names.removeIf(s -> s.equalsIgnoreCase("arnold"));

        System.out.println("names = " + names);

    }















}
