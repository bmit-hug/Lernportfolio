
public class Vogel {

    String name;
    String farbe;

    public Vogel(String name, String farbe) {
        this.name = name;
        this.farbe = farbe;
    }

    public void fliegen() {
        System.out.println("Der Vogel " + name + " fliegt");
    }

    public void flattern() {
        System.out.println("Der Vogel " + name + " flattert mit seinen " + farbe + "en Flügeln");
    }
}
