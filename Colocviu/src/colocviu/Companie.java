package colocviu;
import java.util.*;
public class Companie {
	private LinkedList<Sucursala> sucursale;

	public Companie() {
		sucursale = new LinkedList<Sucursala>();
	}

	public LinkedList<Sucursala> getSucursale() {
		return sucursale;
	}

	public void setSucursale(LinkedList<Sucursala> sucursale) {
		this.sucursale = sucursale;
	}
	public void afiseazaToateElicopterele() {
		for(int i = 0;i<sucursale.size();i++) {
			sucursale.get(i).afiseazaElicoptere();
		}
	}
	public void afiseazaElicoptereClienti(Client[] clienti) {
		for(int i = 0;i<sucursale.size();i++) {
			sucursale.get(i).afiseazaClienti(clienti);
			System.out.println("");
		}
	}
}
