public class Mage extends Protagonist {

    public Mage() {
	super();
        role = "Mage";
	hp = 250;
	attackrating = 0.8;
    }

    public Mage(String nameIn) {
	super(nameIn);
        role = "Mage";
        hp = 250;
	attackrating = 0.8;
    }

    public Mage(String nameIn, int hpIn, int strIn, int defIn, int attackIn) {
        super(nameIn, hpIn, strIn, defIn, attackIn);
        role = "Mage";
    }

public String toString(){
        return "Hello, " + name + ". You are a Mage.";
    }


}
