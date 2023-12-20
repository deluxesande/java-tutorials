public class Car implements Vehicle {

    private int gear = 0;
    private int speed = 0;

    @Override
    public void speedUp(int change) {
        this.speed += change;
    }

    @Override
    public void changeGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void slowDown(int change) {
        this.speed -= change;
    }

    public void display() {
        System.out.println("I am a car, speed: " + this.speed + "km/h, gear: " + this.gear);
        out();
    }

}
