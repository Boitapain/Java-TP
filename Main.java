public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota");

        car.accelerate(50);
        car.move(1); // Move for 1 hour
        System.out.println(car);

        car.brake(20);
        car.move(0.5); // Move for 0.5 hours
        System.out.println(car);

        car.accelerate(30);
        car.move(2); // Move for 2 hours
        System.out.println(car);
    }
}