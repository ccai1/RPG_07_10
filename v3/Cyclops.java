
public class Cyclops extends Monster {

    public Cyclops() {
        super();
        hp = 250;
        attackrating = 0.8;
                race = "Cyclops";
    }

    public Cyclops(String nameIn) {
        super(nameIn);
        hp = 250;
        race = "Cyclops";
        attackrating = 0.8;
    }

    public Cyclops(String nameIn, int hpIn, int strIn, int defIn, int attackIn) {
        super(nameIn, hpIn, strIn, defIn, attackIn);
    race = "Cyclops";
    }

    public String toString() {
        return "This is a Cyclop named " + name + ".";
    }

}
