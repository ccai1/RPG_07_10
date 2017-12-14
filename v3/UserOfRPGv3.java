public class UserOfRPGv3 {

    public static void main(String[] args) {
	/*Character[] agents = new Character[]
	    {new Protagonist("Protagonist"), new Archer("Archer"), new Knight("Knight"), new Mage("Mage"),
	    new Monster("Monster"), new Cyclops("Cyclops"), new Witch("Witch"), new Vampire("Vampire")};*/

	//I think I am doing this wrong, but there is no error?
	Character[] agents = new Character[]
	    {new Cyclops("Cyclop"), new Vampire("Vlad"), new Witch("Wicked"), new Archer("Robinhood"),
            new Knight("Shovel"), new Mage("Fire")};

	System.out.println("List of Characters:");
	for (Character agent: agents) {
	    System.out.println (agent);
            System.out.println(agent.stats());
	}

	//error: cannot find symbol


	/*
	  error: cannot find symbol
	  System.out.println (agent.getName());
	  
	  symbol:   method getName()
	  location: variable agent of type Character
	*/
    }
}
