package labdas;

/**
 * @author Evgeny Borisov
 */
public class Person implements Father,Mother {
    @Override
    public void talk() {
        Mother.super.talk();
        Father.super.talk();
    }
}
