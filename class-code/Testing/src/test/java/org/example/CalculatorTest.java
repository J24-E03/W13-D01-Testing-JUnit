package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;


class CalculatorTest {

    /*
        assertEquals(expected,actual)
        assertNotEquals(expected, actual)
        assertTrue(condition)
        assertFalse(condition)
        assertNull(object)
        assertNotNull(object)
        assertIterableEquals()
        assertArrayEquals(): better feedback on the failure
        assertSame(): references the same object address in memory
        assertNotSame()
        assertThrows(exceptionClass, executable)


        Exercise 1:
            1. For our calculator we do not return negative numbers (it's used for values that cant be negative)
            2. In the method for subtract: it should take 2 numbers and if the result is negative than return 0
            3. write 2 tests one to check when the result should be negative and 1 to check when the result is negative and should return 0
    */

    Calculator calculator;


    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Adding two positive numbers")
//    @RepeatedTest(5)
    void add() {
        System.out.println("Test add");
//        expected should equal the actual value

        int actualValue = calculator.add(1,4);
        int expectedValue = 5;

        assertEquals(expectedValue,actualValue);
    }

    @Test
    @DisplayName("Subtracting result positive value")
    void subtract() {
        assertEquals(10,calculator.subtract(20,10));


    }
    @Test
    @DisplayName("Subtracting result Negative value")
    void subtractingTwoNumbersWithNegativeResult() {

        assertEquals(0,calculator.subtract(4,10));

    }


    @Test
    void multiply() {
        System.out.println(3);

        int actualValue = calculator.multiply(10,2);
        int expectedValue = 20;

        assertEquals(expectedValue,actualValue);

    }

    @Test
    void divide() {

        assertEquals(2,calculator.divide(10,5));
    }

    @Test
    @DisplayName("When denominator is 0")
    void divideByZero(){

        assertThrows(ArithmeticException.class,()->{
            calculator.divide(10,0);
        });

    }


    @Test
    @Disabled
    void additionalTests(){
        boolean isAmerican = true;
        assertTrue(isAmerican);
        assertNotNull(calculator);


        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(1,2,3,4));

        System.out.println(nums1);
        System.out.println(nums2);

        assertIterableEquals(nums1,nums2);
        assertNotSame(nums1,nums2);


    }


    @Test
    @Order(2)
    void assertJMethods(){
        ArrayList<String> students = new ArrayList<>(Arrays.asList("Kai","Maryam","Marcel","Mihai","Sumayya"));

        assertThat(students)
                .isNotEmpty()
                .contains("Maryam")
                .doesNotContain("Hasan")
                .containsExactly("Kai","Maryam","Marcel","Mihai","Sumayya")
                .containsSequence("Kai","Maryam");


        String name = "Aron";
        assertThat(name)
                .isNotNull()
                .isNotEmpty()
                .startsWith("A")
                .doesNotStartWith("B")
                .contains("ro")
                .hasSize(4)
                .endsWith("on")
                .hasSizeGreaterThan(2);

        assertThat(50)
                .isBetween(40,60)
                .isGreaterThan(20)
                .isLessThanOrEqualTo(51);


    }

    @Test
    @Order(1)
    void testingObjects(){

        User user1 = new User("John","1234");
        User user2 = new User("John","1234");

        assertThat(user1).isInstanceOf(User.class);

        assertThat(user1).usingRecursiveComparison().isEqualTo(user2);

    }


    @ParameterizedTest
    @ValueSource(ints = {2,4,6,8})
    void isDivisibleBy2(int value){
        System.out.println("divible test " + value);
    }

}