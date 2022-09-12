interface Vehicle {

    String getBrand();

    String speedUp();

    String slowDown();

    default String turnon() {
        return "Turning the vehicle on ! ";
    }

    default String turnof() {
        return "Turning the vehicle off ! ";
    }
}

class Car implements Vehicle {
    private String brand;

    Car(String a) {
        this.brand = a;
    }

    public String getBrand() {
        return brand;
    }

    public String speedUp() {
        return "The car is speeding up.";
    }

    public String slowDown() {
        return "The car is slowing down.";
    }
}

public class Defaultinterface {
    public static void main(String[] args) {
        Vehicle car = new Car("Tesla");
        System.out.println(car.getBrand());
        System.out.println(car.speedUp());
        System.out.println(car.slowDown());
        System.out.println(car.turnon());
        System.out.println(car.turnof());
        System.out.println("Created by Harsh Patel  ID NO. 21CE090");
    }
}