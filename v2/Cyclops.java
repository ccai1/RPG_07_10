public class Cyclops extends Monster {

    public Cyclops(String nameIn) {
	    super(nameIn);
      hp = 250;
	    attackrating = 0.8;
    }

    public Cyclops(String nameIn, int hpIn, int strIn, int defIn, int attackIn) {
        super(nameIn, hpIn, strIn, defIn, attackIn);
    }

}
