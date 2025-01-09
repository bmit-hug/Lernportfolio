
public class Weapon extends Item {

    public int damage;

    public Weapon(int id, String name, int damage) {
        super(id, name);
        this.damage = damage;
    }
}
