package labdas;

/**
 * @author Evgeny Borisov
 */
public interface Mother {
    default void talk() {
        System.out.println("COME TO ME SON!!!!!");
    }
   default void x(){
       System.out.println("XXXXXXXx");
   };
}
