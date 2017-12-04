public class Protagonist {
    private String name;
    private int hp;
    private int strength;
    private int defense;
    private double attackrating;

    public Protagonist(String nameIn) {
	name = nameIn;
	hp = 125;
	strength = 100;
	defense = 40;
	attackrating = 0.4;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public int getDefense() {
	return defense;
    }

    public String getName() {
	return name;
    }

    public void lowerHP(int lower) {
	hp -= lower;
    }

    public int attack(Monster monster) {
	int damage = (int)(strength * attackrating) - monster.getDefense();
	monster.lowerHP(damage);
	return damage;
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
