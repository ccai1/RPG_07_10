public class Knight extends Protagonist {

    public Knight(String nameIn) {
	super(nameIn);
	hp = 250;
	strength = (int)(Math.random() * 90 + 20);
    }

    public Knight(String nameIn, int hpIn, int strIn, int defIn, int attackIn) {
	name = nameIn;
	hp = hpIn;
	strength = strIn;
	defense = defIn;
	attackrating = attackIn;
    }
}
