package fr.uvsq.coo.ex3_2;

import java.util.List;

public class SommeTotSalaire {
 public double SalaireTotal(List<Employe> employes){
	 double salairetotal=0;
	 for(Employe emp:employes){
		 salairetotal+=emp.calculSalaire();
	 }
	 return salairetotal;
 }
}
