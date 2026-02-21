class Car {
    String make;
    String model;
    int year;
    double currentSpeed;

    void accelerate(double speedIncrease) {
        currentSpeed += speedIncrease;
    }

    void brake(double speedDecrease) {
        currentSpeed -= speedDecrease;
        if (currentSpeed < 0) currentSpeed = 0;
    }
}

public class CarTest {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.make = "Toyota";
        car1.currentSpeed = 0;

        Car car2 = new Car();
        car2.make = "BMW";
        car2.currentSpeed = 0;

        car1.accelerate(50);
        car2.accelerate(100);

        System.out.println("Car1 Speed: " + car1.currentSpeed);
        System.out.println("Car2 Speed: " + car2.currentSpeed);
    }
}
