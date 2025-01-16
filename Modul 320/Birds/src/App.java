
public class App {

    public static void main(String[] args) throws Exception {
        Vogel markus = new Vogel("Markus", "blau");
        Huhn tom = new Huhn("Tom", "rot");
        Ente andy = new Ente("Andy", "gelb");

        printEverything(markus, tom, andy);
    }

    public static void printEverything(Vogel markus, Huhn tom, Ente andy) {
        System.out.println();

        markus.fliegen();
        markus.flattern();

        System.out.println();

        tom.fliegen();
        tom.flattern();

        System.out.println();

        andy.fliegen();
        andy.flattern();
        andy.schwimmen();

        System.out.println();
    }
}
