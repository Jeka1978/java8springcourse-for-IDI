package collectors;

import lombok.RequiredArgsConstructor;

import static java.lang.Integer.MAX_VALUE;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
public enum  Seniority {
    JUNIOR(0,10000),MIDDLE(10001,20000), SENIOR(20001, MAX_VALUE);
    private final int min;
    private final int max;


}
