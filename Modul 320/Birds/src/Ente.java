
public class Ente extends Vogel {

    public Ente(String name, String farbe) {
        super(name, farbe);
    }

    @Override
    public void fliegen() {
        System.out.println("Die Ente " + name + " fliegt nicht");
    }

    @Override
    public void flattern() {
        System.out.println("Die Ente " + name + " flattert mit seinen " + farbe + "en Flügeln");
    }

    public void schwimmen() {
        System.out.println("Die Ente " + name + " schwimmt");
    }
}
