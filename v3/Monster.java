public class Monster extends Character{

    protected String name;
    
    public Monster() {
        hp = 125;
        strength = (int) (Math.random() * 45 + 20);
        defense = 40;
        attackrating = 0.4;
    }

    public Monster(String nameIn) {
	this();
	name = nameIn;
    }

    public Monster(String nameIn, int hpIn, int strIn, int defIn, int attackIn) {
	name = nameIn;
	hp = hpIn;
	strength = strIn;
	defense = defIn;
	attackrating = attackIn;
    }

    public String toString() {
	return
	    "name: " + name + System.lineSeparator() +
	    "hp: " + hp + System.lineSeparator() +
	    "strength: " + strength + System.lineSeparator() +
	    "defense: " + defense + System.lineSeparator() +
	    "attack: " + attackrating;							     
    }
    
}
