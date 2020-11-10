package colocviu;


public class Basic extends Client{
	static int tarif;
	public Basic(String nume, int nivel) {
		super(nume, nivel);
	}

	@Override
	public void calculeazaPret(int nr_ore_inchiriate) {
		int pret = tarif*nr_ore_inchiriate;
		pret -=(super.getNivel() == 1)?100:200;
		System.out.println(pret);
	}
	
	public void vizualizareElicoptere(Sucursala sucursala) {
		sucursala.afiseazaElicoptere();
	}


	
}
