public class Archer extends Protagonist {

    public Archer() {
	super();
	hp = 250;
	defense = 80;
    }

    public Archer(String nameIn) {
	super(nameIn);
	hp = 250;
	defense = 80;
    }

    public Archer(String nameIn, int hpIn, int strIn, int defIn, int attackIn) {
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
