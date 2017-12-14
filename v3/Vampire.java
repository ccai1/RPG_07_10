
public class Vampire extends Monster {

    public Vampire() {
        super();
        hp = 250;
        race = "Vampire";
        defense = 80;
    }

    public Vampire(String nameIn) {
        super(nameIn);
        hp = 250;
                race = "Vampire";
        defense = 80;
    }

    public Vampire(String nameIn, int hpIn, int strIn, int defIn, int attackIn) {
        super(nameIn, hpIn, strIn, defIn, attackIn);
            race = "Vampire";
    }

    public String toString() {
        return "This is a Vampire named " + name + ".";
     
    }

}
