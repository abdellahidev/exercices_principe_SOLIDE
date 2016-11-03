public class Employe{
	private double salaireBase=1500;
	private double salaireAnciennete=20;
	private int nbranne;

	public Employe(double salaireBase, double salaireAnciennete, int nbranne){
		this.salaireBase=salaireBase;
		this.salaireAnciennete=salaireAnciennete;
		this.nbranne=nbranne;
	}

	public double calculSalaire(){return salaireBase+ (nbranne*salaireAnciennete);}
}