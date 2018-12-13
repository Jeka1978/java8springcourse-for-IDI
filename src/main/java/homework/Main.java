package homework;

import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Stream<String> lines = Files.lines(Paths.get("data/yest.txt"));
        List<String> allText = lines.collect(Collectors.toList());
        lines = allText.stream();
        IntStream intStream = lines.mapToInt(String::length);
        int totalCharacters = intStream.sum();
        System.out.println("totalCharacters = " + totalCharacters);
        lines = allText.stream();

        long numberOfWords = lines
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .peek(System.out::println).count();
        System.out.println("numberOfWords = " + numberOfWords);


    }




}
