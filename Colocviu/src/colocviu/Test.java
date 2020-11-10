package colocviu;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nr_elicoptere = scanner.nextInt();
		System.out.println(nr_elicoptere);
		scanner.close();
		
		Companie companie = new Companie();
		Manager manager = new Manager("Mihai");
		
		Sucursala sucursala1 = new Sucursala();
		Sucursala sucursala2 = new Sucursala();
		Sucursala sucursala3 = new Sucursala();
		
		companie.getSucursale().add(sucursala1);
		companie.getSucursale().add(sucursala2);
		companie.getSucursale().add(sucursala3);
		
		manager.adaugaElicopter(companie.getSucursale().get(0), new Elicopter("Elicopter1","alb",1998));
		manager.adaugaElicopter(companie.getSucursale().get(0), new Elicopter("Elicopter2","negru",2000));
		manager.adaugaElicopter(companie.getSucursale().get(1), new Elicopter("Elicopter3","albastru",2005));
		manager.adaugaElicopter(companie.getSucursale().get(1), new Elicopter("Elicopter4","negru",2008));
		manager.adaugaElicopter(companie.getSucursale().get(1), new Elicopter("Elicopter5","portocaliu",2004));
		manager.adaugaElicopter(companie.getSucursale().get(2), new Elicopter("Elicopter6","gri",2015));
		manager.adaugaElicopter(companie.getSucursale().get(2), new Elicopter("Elicopter7","rosu",2018));
		
		System.out.println("");
		companie.getSucursale().get(0).afiseazaElicoptere();
		
		System.out.println("");
		manager.stergeElicopter(companie.getSucursale().get(1), "Elicopter4");
		
		System.out.println("");
		companie.getSucursale().get(1).afiseazaElicoptere();
		
		Basic.tarif = 20;
		Premium.tarif = 30;
		Guru.tarif = 20;
		
		Client []clienti = new Client[3];
		clienti[0] = new Basic("Mihai",1);
		clienti[1] = new Premium("Andrei",2);
		clienti[2] = new Guru("Mircea",2);
		
		
		companie.afiseazaToateElicopterele();
		
		System.out.println("");
		
		clienti[0].inchiriaza(companie.getSucursale().get(0), "Elicopter1");
		System.out.print(clienti[0]+" "+clienti[0].tipClient()+" ");
		clienti[0].calculeazaPret(72);
		
		System.out.println("");
		
		clienti[1].inchiriaza(companie.getSucursale().get(1), "Elicopter3");
		System.out.print(clienti[1]+" "+clienti[1].tipClient()+" ");
		clienti[1].calculeazaPret(72);
		
		System.out.println("");
		
		clienti[0].inchiriaza(companie.getSucursale().get(0), "Elicopter2");
		System.out.print(clienti[0]+" "+clienti[0].tipClient()+" ");
		clienti[0].calculeazaPret(72);
		
		System.out.println("");
		companie.afiseazaToateElicopterele();
		
		System.out.println("");
		companie.afiseazaElicoptereClienti(clienti);
		
		System.out.println("");
		clienti[0].returnare(companie.getSucursale().get(0), "Elicopter1");
		clienti[1].returnare(companie.getSucursale().get(1), "Elicopter3");
		clienti[2].returnare(companie.getSucursale().get(0), "Elicopter2");
		
		System.out.println("");
		companie.afiseazaToateElicopterele();
		
		System.out.println("");
		((Guru) clienti[2]).vizualizareElicoptere(companie.getSucursale());
	}
}
