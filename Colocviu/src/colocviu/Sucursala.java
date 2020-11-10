package colocviu;
import java.util.*;
public class Sucursala {
	private LinkedList<Elicopter> elicoptere;
	
	public Sucursala() {
		elicoptere = new LinkedList<Elicopter>();
	}
	public LinkedList<Elicopter> getElicoptere() {
		return elicoptere;
	}

	public void setElicoptere(LinkedList<Elicopter> elicoptere) {
		this.elicoptere = elicoptere;
	}
	public void afiseazaElicoptere() {
		for(int i = 0;i<elicoptere.size();i++) {
			if(elicoptere.get(i).isInchiriat())
				System.out.println(elicoptere.get(i).getNume()+ " inchiriat");
			else
				System.out.println(elicoptere.get(i).getNume()+ " neinchiriat");
		}
	}
	public void afiseazaClienti(Client[] clienti) {
		int nr_elicoptere = elicoptere.size();
		
		for(int i = 0;i<nr_elicoptere;i++) {
			System.out.print(elicoptere.get(i).getNume() + "-" );
			for(int j = 0;j<clienti.length;j++) {
				for(int k = 0;k<clienti[j].getElicoptere_inchiriate().size();k++) {
					if(elicoptere.get(i).getNume() == clienti[j].getElicoptere_inchiriate().get(k).getNume()) {
						System.out.println(clienti[j].getNume());
					}
				}
			}
		}
	}
}
