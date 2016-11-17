package fr.uvsq.coo.ex3_2;

public abstract class Employe extends Travailleur{
	private double salaireAnciennete=20;
	private int nbrAnne;
	public Employe(double salaireAnciennete, int nbrAnne){
		this.salaireAnciennete=salaireAnciennete;
		this.nbrAnne=nbrAnne;
	}
	public int getNbranne(){return nbrAnne; }
	public double getSalaireAnciennete(){return salaireAnciennete; }

	public int getNbrAnne() {
		return nbrAnne;
	}
	public void setNbrAnne(int nbrAnne) {
		this.nbrAnne = nbrAnne;
	}
	public void setSalaireAnciennete(double salaireAnciennete) {
		this.salaireAnciennete = salaireAnciennete;
	}
	public abstract double calculSalaire();
} 