public class Protagonist extends Character{

    public String name;

    public Protagonist(String nameIn) {
	name = nameIn;
	hp = 125;
	strength = (int)(Math.random() * 45 + 20);
	defense = 40;
	attackrating = 0.4;
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

}
