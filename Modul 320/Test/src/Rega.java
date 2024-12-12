
import java.util.List;

public class Rega {

    private String anschrift;
    private List<Ausweis> ausweise;
    private List<Goenner> goenner;

    // Getters and Setters
    public String getAnschrift() {
        return anschrift;
    }

    public void setAnschrift(String anschrift) {
        this.anschrift = anschrift;
    }

    public List<Ausweis> getAusweise() {
        return ausweise;
    }

    public void setAusweise(List<Ausweis> ausweise) {
        this.ausweise = ausweise;
    }

    public List<Goenner> getGoenner() {
        return goenner;
    }

    public void setGoenner(List<Goenner> goenner) {
        this.goenner = goenner;
    }
}
