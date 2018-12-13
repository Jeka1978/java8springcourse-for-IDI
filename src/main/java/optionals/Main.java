package optionals;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        Optional<String> optionalS = Arrays.stream(args).reduce((s, s2) -> s + s2);
        if (optionalS.isPresent()) {
            System.out.println(optionalS.get());
        }
    }
}
