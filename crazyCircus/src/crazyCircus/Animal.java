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
	public static Animal getAnimal(char c) {
		for(Animal a : Animal.values())
			if (a.name().charAt(0) == c)
				return a;
		throw new IllegalArgumentException();
	}
}
