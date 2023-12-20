public class Main {
    public static void main(String[] args) {
        Car ford = new Car();

        ford.speedUp(20);
        ford.changeGear(2);

        ford.display();

        String vHelp = Vehicle.help();
        System.out.println(vHelp);
    }
}
