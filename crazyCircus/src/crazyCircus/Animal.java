package crazyCircus;

import java.util.HashMap;
import java.util.Map;

// Etape 1 créer l'énumération Animal

// pour éviter de manipuler les noms complets ce qui serait fastidieux
// pour afficher, tester, débugger ou initialiser des piles
// on introduit une correspondance entre les noms complets 
// et les lettres Lion <--> L etc.
// Ainsi gérer les instances de piles est très simples à présent
// avec "OLE" "ELO" etc.

public enum Animal {
	Elephant, Lion, Ours;
	public static Animal getAnimal(char c) {
		for(Animal a : Animal.values())
			if (a.name().charAt(0) == c)
				return a;
		throw new IllegalArgumentException();
	}
}
