public class Protagonist extends Character{

    protected String name;

    public Protagonist() {
	hp = 125;
	strength = (int)(Math.random() * 45 + 20);
	defense = 40;
	attackrating = 0.4;
    }

    public Protagonist(String nameIn) {
	this();
	name = nameIn;
    }

    public Protagonist(String nameIn, int hpIn, int strIn, int defIn, int attackIn) {
	name = nameIn;
	hp = hpIn;
	strength = strIn;
	defense = defIn;
	attackrating = attackIn;
    }

    public String getName() {
	return name;
    }

    public void specialize() {
	defense -= 3;
	attackrating += 3;
    }

    public void normalize() {
	defense = 40;
	attackrating = 0.4; 
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
