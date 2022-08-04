package com.fdmgroup.misc.mavenjunit5;

/**
 * Hello world!
 *
 */
public class MavenJUnit5 
{
    public String getHello() {
        return "Hello";
    }

    public int getNegativeOne() {
        return -1;
    }

    public boolean getTrue() {
        return true;
    }

    public ArithmeticException getArithmeticException() {
        throw new ArithmeticException();
        // return null;
    } 

    public String getName() {
        return "Hello";
    }
}
