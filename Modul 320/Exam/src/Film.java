
public class Film {

    // Attributes
    String name;
    int minAge;
    double length;

    // Constructor
    public Film(String name, int minAge, double length) {
        this.name = name;
        this.minAge = minAge;
        this.length = length;
    }

    // Getter
    public String getName() {return name;}
    public int getMinAge() {return minAge;}
}
