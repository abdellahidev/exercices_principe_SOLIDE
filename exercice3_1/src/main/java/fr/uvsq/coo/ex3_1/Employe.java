package fr.uvsq.coo.ex3_1;

public class Employe {
	private final
	String nom ;
	String adresse ;
	public Employe(String nom, String adresse){
		this.nom=nom;
		this.adresse=adresse;
	}
	public void afficheCoordonnees(){System.out.println(nom+ "," +adresse);}
}