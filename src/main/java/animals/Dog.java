package animals;

import java.util.stream.IntStream;

/**
 * @author Evgeny Borisov
 */
public class Dog implements Animal {
    private int counter = 3;

    @Override
    public void makeVoice() {
//        IntStream.range(0,counter).forEach(value -> System.out.println("bark"));

        for (int i = 0; i < counter; i++) {
            System.out.print("bark ");

        }
        counter--;
        System.out.println();
    }



}
