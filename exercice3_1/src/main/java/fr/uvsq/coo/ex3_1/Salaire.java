public class Salaire{
	private double salaireBase;
	private double salaireAnciennete;
	private int anne;

	public Salaire(double salaireBase, double salaireAnciennete, int anne){
		this.salaireBase=salaireBase;
		this.salaireAnciennete=salaireAnciennete;
		this.anne=anne;
	}

	public double calculSalaire(){return salaireBase + (anne*salaireAnciennete);}
}