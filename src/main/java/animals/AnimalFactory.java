package animals;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author Evgeny Borisov
 */
public class AnimalFactory {
    List<Supplier<Animal>> animalSuppliers = new ArrayList<>();
    Random random = new Random();
    public AnimalFactory() {
        animalSuppliers.add(Cat::new);
        animalSuppliers.add(Dog::new);
    }

    public Animal createRandom() {
        int i = random.nextInt(2);
        return animalSuppliers.get(i).get();
    }


    public static void main(String[] args) {


        AnimalFactory animalFactory = new AnimalFactory();
        ArrayList<Animal> animals = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Animal animal = animalFactory.createRandom();
            animal.makeVoice();
            animals.add(animal);
        }

        List<String> allClassNamesList = animals.stream()
                .map(animal -> animal.getClass().getSimpleName())
                .collect(toList());

        allClassNamesList.stream()
                .filter(a -> a.startsWith("C"))
                .forEach(System.out::println);

        allClassNamesList.stream()
                .filter(a -> a.startsWith("D"))
                .forEach(System.out::println);

        OptionalDouble average = allClassNamesList.stream()
                .mapToInt(String::length).average();
        System.out.println(average.getAsDouble());


        /*animals.parallelStream().filter().filter().sequential()
                .sorted().map().parallel().map()*/












    }
}
