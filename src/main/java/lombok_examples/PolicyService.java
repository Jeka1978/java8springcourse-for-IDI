package lombok_examples;

import lombok.*;
import lombok.experimental.Wither;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Wither
@Slf4j
public class PolicyService {
    private PolicyHelper policyHelper;
    private int age;
//    @NonNull
    private Integer vetek;
    private int numberOfClaims;
    @NonNull
    @Singular
    private Map<String,Integer> beers;


    private PolicyService(int age, int vetek, int numberOfClaims) {
        log.info("");
        this.age = age;
        this.vetek = vetek;
        this.numberOfClaims = numberOfClaims;

    }

    @SneakyThrows
    public void doX() {
        new FileOutputStream("");
        this.policyHelper.doX();
    }

    public void help(String string) {
        this.policyHelper.help(string);
    }
}
