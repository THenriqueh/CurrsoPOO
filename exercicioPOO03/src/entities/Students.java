package entities;

public class Students {

	public String nome;
	public double grade1;
	public double grade2;
	public double grade3;

	public double nota() {
		return grade1 + grade2 + grade3;
	}
	public double falta() {
		return 60 - nota();
	}

}
