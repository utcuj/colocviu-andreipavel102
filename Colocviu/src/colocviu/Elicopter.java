package colocviu;

public class Elicopter {
	private String nume;
	private String culoare;
	private int anul;
	private boolean inchiriat;
	public Elicopter(String nume, String culoare, int anul) {
		this.nume = nume;
		this.culoare = culoare;
		this.anul = anul;
		this.inchiriat = false;
	}
	public boolean isInchiriat() {
		return inchiriat;
	}
	public void setInchiriat(boolean inchiriat) {
		this.inchiriat = inchiriat;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getCuloare() {
		return culoare;
	}
	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}
	public int getAnul() {
		return anul;
	}
	public void setAnul(int anul) {
		this.anul = anul;
	}
	
}
