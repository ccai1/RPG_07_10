
public class Witch extends Monster {

    public Witch() {
        super();
        hp = 250;
        strength = (int) (Math.random() * 90 + 20);
        race = "Human";
    }

    public Witch(String nameIn) {
        super(nameIn);
        hp = 250;
        strength = (int) (Math.random() * 90 + 20);
               race = "Human";
    }

    public Witch(String nameIn, int hpIn, int strIn, int defIn, int attackIn) {
        super(nameIn, hpIn, strIn, defIn, attackIn);
               race = "Human";
    }

    public String toString() {
        return "This is a Witch named " + name + ".";
    }

}
