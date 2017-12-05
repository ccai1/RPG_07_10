public class Strong extends Protagonist {

    public Strong(String nameIn) {
	super(nameIn);
	hp = 250;
	strength = (int)(Math.random() * 90 + 20);
    }

    public Strong(String nameIn, int hpIn, int strIn, int defIn, int attackIn) {
	name = nameIn;
	hp = hpIn;
	strength = strIn;
	defense = defIn;
	attackrating = attackIn;
    }
}
