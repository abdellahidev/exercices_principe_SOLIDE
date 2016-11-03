public class Vendeur{
	private double salaireBase=1500;
	private double salaireCommision=20;
	

	public Vendeur(double salaireBase, double salaireCommision){
		this.salaireBase=salaireBase;
		this.salaireCommision=salaireCommision;
		
	}

	public double calculSalaire(){return salaireBase+ salaireCommision;}
}