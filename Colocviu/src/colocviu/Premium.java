package colocviu;

public class Premium extends Client{
	static int tarif;
	public Premium(String nume, int nivel){
		super(nume, nivel);
	}
	public void calculeazaPret(int nr_ore_inchiriate) {
		int pret = tarif*nr_ore_inchiriate;
		pret -=(super.getNivel() == 1)?200:300;
		System.out.println(pret);
	}
	public void vizualizareElicoptere(Sucursala sucursala) {
		sucursala.afiseazaElicoptere();
	}

}
