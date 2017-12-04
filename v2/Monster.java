public class Monster {
    
    private int health;
    private int strength;
    private int defense;
    private double attackrating;
    
    public Monster (){
        health = 125;
        strength = (int) (Math.random() * 45 + 20);
        defense = 40;
        attackrating = 0.4;
    }
    
    public boolean isAlive() {
        return health > 0;
    }
    
    public int getDefense() {
        return defense;
    }
    
    public void lowerHP(int dec) {
        health -= dec;
    }
    
    public int attack(Protagonist charac) {
	int damage = (int) (strength * attackrating - charac.getDefense());
	charac.lowerHP(damage);
	return damage;
    }
    
}
