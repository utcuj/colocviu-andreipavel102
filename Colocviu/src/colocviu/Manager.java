package colocviu;

public class Manager {
	private String manager;

	public Manager(String manager) {
		this.manager = manager;
	}
	public void adaugaElicopter(Sucursala sucursala,Elicopter elicopter) {
		sucursala.getElicoptere().add(elicopter);
		System.out.println("Elicopterul a fost adaugat");
	}
	public void stergeElicopter(Sucursala sucursala,String nume) {
		int nr_elicoptere = sucursala.getElicoptere().size();
		for(int i = 0;i<nr_elicoptere;i++) {
			if(sucursala.getElicoptere().get(i).getNume() == nume) {
				System.out.println("Elicopterul a fost sters");
				sucursala.getElicoptere().remove(i);
				return;
			}
		}
		System.out.println("Elicopterul nu se afla in aceasta sucursala");
	}
	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}
	
}
