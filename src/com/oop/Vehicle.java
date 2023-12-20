public interface Vehicle {
    final int gears = 5;

    void speedUp(int a);

    void changeGear(int a);

    void slowDown(int a);

    // Non-static
    default void out() {
        System.out.println("Default method");
    }

    // static
    static String help() {
        return "A vehicle is a machine that helps you move around";
    }
}
