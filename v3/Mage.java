public class Mage extends Protagonist {

    public Mage() {
	super();
	hp = 250;
	attackrating = 0.8;
    }

    public Mage(String nameIn) {
	super(nameIn);
        hp = 250;
	attackrating = 0.8;
    }

    public Mage(String nameIn, int hpIn, int strIn, int defIn, int attackIn) {
        super(nameIn, hpIn, strIn, defIn, attackIn);
    }

    public String toString() {
	return
	"Name: " + name + System.lineSeparator() +
	"hp: " + hp + System.lineSeparator() +
	"strength: " + strength + System.lineSeparator() +
	"defense: " + defense + System.lineSeparator() +
	"attack: " + attackrating;	
    }
}
