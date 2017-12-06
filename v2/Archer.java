public class Archer extends Protagonist {

    public Archer(String nameIn) {
	super(nameIn);
	hp = 250;
	defense = 80;
    }

    public Archer(String nameIn, int hpIn, int strIn, int defIn, int attackIn) {
	super(nameIn, hpIn, strIn, defIn, attackIn);
    }
}
