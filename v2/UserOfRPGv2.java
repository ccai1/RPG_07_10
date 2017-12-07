public class UserOfRPGv2 {

    public static void main(String[] args) {
	/*Character[] agents = new Character[]
	    {new Protagonist("Protagonist"), new Archer("Archer"), new Knight("Knight"), new Mage("Mage"),
	    new Monster("Monster"), new Cyclops("Cyclops"), new Witch("Witch"), new Vampire("Vampire")};*/

	//I think I am doing this wrong, but there is no error?
	Character[] agents = new Character[]
	    {new Monster("m1"), new Monster("m2"), new Monster("m3")};

	System.out.println("CHARACTERISTICS:");
	for (Character agent: agents) {
	    System.out.println (agent + System.lineSeparator());
	}

	//error: cannot find symbol
        System.out.println("GETTING NAME");
	for (Character agent: agents) {
	    System.out.println (agent.getName());
	}
    }
}
