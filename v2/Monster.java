public class Monster extends Character{
    
    public Monster() {
        hp = 125;
        strength = (int) (Math.random() * 45 + 20);
        defense = 40;
        attackrating = 0.4;
    }

    public Monster(int hpIn, int strIn, int defIn, int attackIn) {
	hp = hpIn;
	strength = strIn;
	defense = defIn;
	attackrating = attackIn;
    }
    
}
