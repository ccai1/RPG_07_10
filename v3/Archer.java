public class Archer extends Protagonist {

    public Archer() {
	super();
                role = "Archer";
	hp = 250;
	defense = 80;
    }

    public Archer(String nameIn) {
	super(nameIn);
        role = "Archer";
	hp = 250;
	defense = 80;
    }

    public Archer(String nameIn, int hpIn, int strIn, int defIn, int attackIn) {
	super(nameIn, hpIn, strIn, defIn, attackIn);
                role = "Archer";
    }

    
    public String toString(){
        return "Hello, " + name + ". You are an Archer.";
    }
    

    /*  error: Archer is not abstract and does not override
	abstract method toString() in Protagonist
    */
    
    /*
    public String toString() {
	return
	"Name: " + name + System.lineSeparator() +
	"hp: " + hp + System.lineSeparator() +
	"strength: " + strength + System.lineSeparator() +
	"defense: " + defense + System.lineSeparator() +
	"attack: " + attackrating;	
    }
    */
}
