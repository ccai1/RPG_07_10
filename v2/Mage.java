public class Mage extends Protagonist {

    public Mage(String nameIn) {
	super(nameIn);
	hp = 250;
	attackrating = 0.8;
    }

    public Mage(String nameIn, int hpIn, int strIn, int defIn, int attackIn) {
	name = nameIn;
	hp = hpIn;
	strength = strIn;
	defense = defIn;
	attackrating = attackIn;
    }
}
