public class Archer extends Protagonist {

    public Archer(String nameIn) {
	super(nameIn);
	hp = 250;
	defense = 80;
    }

    public Archer(String nameIn, int hpIn, int strIn, int defIn, int attackIn) {
	name = nameIn;
	hp = hpIn;
	strength = strIn;
	defense = defIn;
	attackrating = attackIn;
    }
}
