package colocviu;
import java.util.*;
public abstract class Client {
	private String nume;
	private int nivel;
	public LinkedList<Elicopter> elicoptere_inchiriate;
	public Client(String nume,int nivel) {
		this.nume = nume;
		this.nivel = nivel;
		elicoptere_inchiriate = new LinkedList<Elicopter>();
	}
	public abstract void calculeazaPret(int nr_ore_inchiriate);
	public void inchiriaza(Sucursala sucursala,String nume) {
		int nr_elicoptere = sucursala.getElicoptere().size();
		for(int i = 0;i<nr_elicoptere;i++) {
			if(sucursala.getElicoptere().get(i).getNume() == nume) {
				sucursala.getElicoptere().get(i).setInchiriat(true);
				elicoptere_inchiriate.add(sucursala.getElicoptere().get(i));
				System.out.println("Elicopterul a fost inchiriat");
				return;
			}
		}
		System.out.println("Nu exista acest elicopter");
	}
	public void returnare(Sucursala sucursala,String nume) {
		int nr_elicoptere = sucursala.getElicoptere().size();
		for(int i = 0;i<nr_elicoptere;i++) {
			if(sucursala.getElicoptere().get(i).getNume() == nume) {
				sucursala.getElicoptere().get(i).setInchiriat(false);
				elicoptere_inchiriate.add(sucursala.getElicoptere().get(i));
				System.out.println("Elicopterul a fost returnat");
				return;
			}
		}
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public LinkedList<Elicopter> getElicoptere_inchiriate() {
		return elicoptere_inchiriate;
	}
	public void setElicoptere_inchiriate(LinkedList<Elicopter> elicoptere_inchiriate) {
		this.elicoptere_inchiriate = elicoptere_inchiriate;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	@Override
	public String toString() {
		return "Nume client:"+nume;
	}
	public String tipClient() {
		if(this instanceof Basic)
			return "Basic";
		else if(this instanceof Premium)
			return "Premium";
		return "Guru";
	}
}
