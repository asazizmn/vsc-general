package com.fdmgroup.misc.mavenjunit5;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


public class MavenJUnit5Test {

    // arrange
    MavenJUnit5 mavenJUnit5;


    @BeforeEach
    void initEach() {
        // arrange
        mavenJUnit5 = new MavenJUnit5();
    }


    @Test
    void testGetHello() {

        // act
        String expected = "Hello";
        String actual = mavenJUnit5.getHello();

        // assert
        assertEquals(expected, actual);
    }


    @Test
    void testGetNegativeOne() {

        // act
        int expected = -1;
        int actual = mavenJUnit5.getNegativeOne();

        // assert
        assertEquals(expected, actual);
    }


    @Test
    void testGetTrue() {

        // act & assert
        assertTrue(mavenJUnit5.getTrue());
    }


    @Disabled
    @Test
    void testThrowArithmeticException() {
        
        // act & assert
        assertThrows(ArithmeticException.class, () -> mavenJUnit5.getArithmeticException());
    }

    @Disabled("Just testing!!")
    @Test
    void testFullName() {

        // act & assert - individually, if one assert fails, the entire block fails and so any other asserts will not be reached
        // assertEquals("Hello0", mavenJUnit5.getName());
        // assertEquals("Hell1o", mavenJUnit5.getName());


        // act & assertAll - ensures all asserts are tested, even if prior one fails
        assertAll(
            () -> assertEquals("Hello", mavenJUnit5.getName()),
            () -> assertEquals("Hello", mavenJUnit5.getName())
        );
    }
}
