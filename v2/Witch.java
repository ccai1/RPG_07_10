public class Witch extends Monster {

    public Witch() {
	super();
	hp = 250;
	strength = (int)(Math.random() * 90 + 20);
    }

    public Witch(String nameIn) {
        super(nameIn);
      	hp = 250;
	strength = (int)(Math.random() * 90 + 20);
    }

    public Witch(String nameIn, int hpIn, int strIn, int defIn, int attackIn) {
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
