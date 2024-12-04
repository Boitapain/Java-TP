public class Car {
    private String model;
    private double speed;
    private double distance;

    public Car(String model) {
        this.model = model;
        this.speed = 0;
        this.distance = 0;
    }

    public void accelerate(double amount) {
        speed += amount;
    }

    public void brake(double amount) {
        speed -= amount;
        if (speed < 0) {
            speed = 0;
        }
    }

    public void move(double time) {
        distance += speed * time;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Car model: " + model + ", Speed: " + speed + " km/h, Distance: " + distance + " km";
    }
}