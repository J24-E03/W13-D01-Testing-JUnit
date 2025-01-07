package org.dcistudent.lab1;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ExampleTest {
    @BeforeAll
    static void setUp() {
        System.out.println("I am setup method");
    }

    @AfterEach
    void tearDown() {
        System.out.println("I am teardown method");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("I am teardown method");
    }

    @Test
    @Order(1)
    void task1Test() {
        System.out.println("Welcome to Junit");
    }

    @Test
    @Order(2)
    void task21Test() {
        System.out.println("Im am test method 1");
    }

    @Test
    @Order(3)
    void task22Test() {
        System.out.println("Im am test method 2");
    }

    @Test
    @Order(4)
    void task3Test() {
        System.out.println("Im am test method 1");
    }

    @Test
    @Order(5)
    void test41Test() {
        System.out.println("Im am test method 1");
    }

    @Test
    @Order(6)
    void test42Test() {
        System.out.println("Im am test method 2");
    }

    @Test
    @Order(7)
    void test51Test() {
        System.out.println("Im am test method 1");
    }

    @Test
    @Order(8)
    void test52Test() {
        System.out.println("Im am test method 2");
    }

    @Test
    @Order(9)
    void test61Test() {
        System.out.println("Im am test method 1");
    }

    @Test
    @Order(10)
    void test62Test() {
        System.out.println("Im am test method 2");
    }

    @Test
    @Order(11)
    void test71Test() {
        System.out.println("Im am test method 1");
    }

    @Test
    @Order(12)
    void test72Test() {
        System.out.println("Im am test method 2");
    }

    @Test
    @Order(13)
    @Disabled
    void test81Test() {
        System.out.println("Im am test method 1");
    }

    @Test
    @Order(14)
    void test82Test() {
        System.out.println("Im am test method 2");
    }

    @Test
    @Order(15)
    @DisplayName("Method-1")
    void test91Test() {
        System.out.println("Im am test method 1");
    }

    @Test
    @Order(16)
    @DisplayName("Method-2")
    void test92Test() {
        System.out.println("Im am test method 2");
    }

    @ParameterizedTest
    @Order(17)
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void test10Test(int number) {
        System.out.println("Im am test method " + number);
    }

    @ParameterizedTest
    @Order(18)
    @ValueSource(ints = {1, 1, 1, 1, 1})
    void test11Test(int number) {
        System.out.println("Im am test method " + number);
    }

    @Test
    @Order(21)
    void test121Test() {
        System.out.println("Im am test method 1");
    }

    @Test
    @Order(19)
    void test122Test() {
        System.out.println("Im am test method 2");
    }

    @Test
    @Order(20)
    void test123Test() {
        System.out.println("Im am test method 3");
    }
}
