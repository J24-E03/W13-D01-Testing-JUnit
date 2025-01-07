package java.com.dci.testing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Solution_Task10_ParameterizedTest {
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void testMethod1(int number) {
        System.out.println("I am test method " + number);
    }
}
