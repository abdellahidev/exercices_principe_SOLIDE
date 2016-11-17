package fr.uvsq.coo.ex3_2;

public class Vendeur extends Employe{
	private double commision;
	

	public Vendeur(double salaireAnciennete,int nbrAnne, double salaireCommision){
		super(salaireAnciennete,nbrAnne);
		this.commision=commision;
		
	}

	public double getCommision() {
		return commision;
	}

	public void setCommision(double commision) {
		this.commision = commision;
	}

	public double calculSalaire(){
		return 1500 + getSalaireAnciennete()*getNbranne()+commision;
		}
}