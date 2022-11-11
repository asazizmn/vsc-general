public class Primitives {

    public static void main(String[] args) {

        // primitive types ////////////////

        byte byteVar = 127;
        System.out.println(byteVar);

        short shortVar = 32767;
        System.out.println(shortVar);

        int intVar = -2_147_483_648;
        System.out.println(intVar);

        // long longVar = 2_147_483_647_000_000_000L;
        long longVar = 2_147_483_647_999_999_999L;
        System.out.println(longVar);
        System.out.println((float)longVar);


        // how to calculate range of float variables
        // https://www.youtube.com/watch?v=YYIeMM8By6Y&t=174s
        // float floatVar = 2_147_483_647_000_000_000_000_000_000_000_000_000F;
        float floatVar = 32.0F;
        System.out.println(floatVar);

        double doubleVar = 64.0;
        System.out.println(doubleVar);


        // String Comparison ///////////////

        // returns difference in characters
        // >0, left is larger | <0, left is smaller | 0, equal
        // int difference = "catfish".compareTo("cat");
        // System.out.println(difference);
    }
}
