package lombok_examples;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        PolicyService policyService =
                PolicyService.builder()
                        .beer("Tuborg", 1)
                        .beer("Goldstar", 2)
                        .age(12).numberOfClaims(1).build();
        policyService = policyService.withNumberOfClaims(2);

policyService.help("");
        System.out.println("policyService = " + policyService);
    }
}
