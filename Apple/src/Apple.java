interface Food {
    public float getTotalCalories();

    public String getOrigin();
}

abstract class Fruit implements Food {
    public float getTotalCalories() {
        return 0.50f;
    }

    public abstract String getOrigin();
}

public class Apple extends Fruit {
    public float getTotalCalories() {
        return 0.40f;
    }

    public String getOrigin() {
        return "apple";
    }

    public static void main(String[] args) {
        Fruit fruit = new Apple();
        Apple castedApple = (Apple) fruit;

        System.out.println(castedApple.getOrigin());
    }
}

// class Orange extends Fruit {
// public float getTotalCalories() {
// return 0.30f;
// }
//
// public String getOrigin() {
// return "someOtherCity";
// }
// }