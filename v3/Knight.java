public class Knight extends Protagonist {

    public Knight() {
	super();
	hp = 250;
                role = "Knight";
	strength = (int)(Math.random() * 90 + 20);
    }

    public Knight(String nameIn) {
        super(nameIn);
	hp = 250;
        role = "Knight";
	strength = (int)(Math.random() * 90 + 20);
    }

    public Knight(String nameIn, int hpIn, int strIn, int defIn, int attackIn) {
        super(nameIn, hpIn, strIn, defIn, attackIn);
        role = "Knight";
    }

    public String toString(){
        return "Hello, " + name + ". You are a Knight.";
    }
    

}
