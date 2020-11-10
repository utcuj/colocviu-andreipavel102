package colocviu;
import java.util.*;
public class Guru extends Client{
	static int tarif;
	public Guru(String nume, int nivel){
		super(nume, nivel);
	}
	public void calculeazaPret(int nr_ore_inchiriate) {
		int pret = tarif*nr_ore_inchiriate;
		pret -=(super.getNivel() == 1)?300:400;
		System.out.println(pret);
	}
	public void vizualizareElicoptere(LinkedList<Sucursala> sucursale) {
		int nr_sucursale = sucursale.size();
		for(int i = 0;i<nr_sucursale;i++) {
			sucursale.get(i).afiseazaElicoptere();
		}
	}
}
