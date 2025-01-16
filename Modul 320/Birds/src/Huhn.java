
public class Huhn extends Vogel {

    public Huhn(String name, String farbe) {
        super(name, farbe);
    }

    @Override
    public void fliegen() {
        System.out.println("Das Huhn " + name + " fliegt nicht");
    }

    @Override
    public void flattern() {
        System.out.println("Das Huhn " + name + " flattert mit seinen " + farbe + "en Flügeln");
    }
}