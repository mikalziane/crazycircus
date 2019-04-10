package crazyCircus;

import java.util.HashMap;
import java.util.Map;

// Etape 1 cr�er l'�num�ration Animal

// pour �viter de manipuler les noms complets ce qui serait fastidieux
// pour afficher, tester, d�bugger ou initialiser des piles
// on introduit une correspondance entre les noms complets 
// et les lettres Lion <--> L etc.
// Ainsi g�rer les instances de piles est tr�s simples � pr�sent
// avec "OLE" "ELO" etc.

public enum Animal {
	Elephant, Lion, Ours;
	private static Map<Character,Animal> c2a;
	static  {
		c2a = new HashMap<>();
		for(Animal a : Animal.values())
			c2a.put(a.name().charAt(0), a);
	}
	public static Animal getAnimal(char c) {
		assert c2a.containsKey(c);
		return c2a.get(c);
	}
}
