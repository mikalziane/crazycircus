package crazyCircus;

public class Circus {
	Pile[] piles = new Pile[2];
	private Pile rouge,bleu;
	public Circus(String positions) {
		setPositions(positions);
		rouge = piles[0];
		bleu = piles[1];
	} 
	public void so() {
		Animal r = rouge.dépiler();
		ki();
		bleu.empiler(r);
	}
	public void ma() {
		rouge.remonter();
	}
	public void ni() {
		bleu.remonter();
	}
	public void ki() {
		rouge.empiler(bleu.dépiler());
	}
	public void lo() {
		bleu.empiler(rouge.dépiler());
	}
	public void setPositions(String s) {
		String[] positions = s.split("-");
		piles[0]= new Pile(positions[0]);
		piles[1]= new Pile(positions[1]);
	}
	@Override
	public String toString() {
		return ""+rouge+"-"+bleu;
	}
}
