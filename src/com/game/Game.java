public class Game {
    public static void main(String[] args) {
        Level lvl = Level.HIGH;
        System.out.println(Level.valueOf("LOW"));

        lvl.setLvl(5);

        System.out.println(lvl.getLvl());
    }
}
