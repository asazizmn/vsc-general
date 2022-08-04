package test.com.fdmgroup.misc.junit5;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import main.com.fdmgroup.misc.junit5.FirstJunit5;

public class FirstJunit5Test {

    FirstJunit5 firstJunit5 ;


    @BeforeEach
    void initEach() {
        // arrange
        firstJunit5 = new FirstJunit5();
    }

    @Test
    void testGetTwo() {

        // act
        int expected = 2;
        int actual = firstJunit5.getTwo();

        // assert
        assertEquals(expected, actual);
    }

    @Test
    void testGetHello() {
        // arrange
        FirstJunit5 firstJunit5 = new FirstJunit5();

        // act
        String expected = "Hello";
        String actual = firstJunit5.getHello();

        // assert
        assertEquals(expected, actual);
    }

    @Disabled("This message seems not to be printed... Only here for developer's understanding")
    @Test
    void testGetTrue() {
        // act & arrange
        assertTrue(firstJunit5.getTrue(), "This should've been try, but it failed to be so!");
    }
}
