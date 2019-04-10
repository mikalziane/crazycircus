package crazyCircus;

import java.util.LinkedList;

/** Etape 2 d�finir le type Pile
 * *:
 * @author mikal
 * @brief  
	On choisit une structure de donn�es pour faciliter
	le codage des ordres MA NI KI LO SO
 	qu'on d�composera en 3 op�rations remonter, d�piler et empiler.
 	On pourrait prendre un tableau circulaire de char ou d'Animal
 	mais pour r�viser les listes on choisit LinkedList<Animal>
 */

public class Pile {
	private LinkedList<Animal> animaux;
	public Pile(String s) {
		animaux = new LinkedList<>();
		for(char c : s.toCharArray()) {
			animaux.addLast(Animal.getAnimal(c));
		}
	}
	@Override
	public String toString() {
		String s = "";
		for (Animal a : animaux)
			s+=a.name().charAt(0);
		return s;
	}
	// l'animal du bas passe au sommet (MA et NI)
	public void remonter() {
		assert !animaux.isEmpty();
		animaux.addLast(animaux.removeFirst());
	}
	// oter l'animal du haut (KI LO)
 	public Animal d�piler() {
 		assert !animaux.isEmpty();
 		Animal a = animaux.getLast();
 		animaux.removeLast();
 		return a;
 	}
 	// ajouter un animal au sommet (SO KI LO)
 	void empiler(Animal a) {
 		animaux.addLast(a);
 	}
}
