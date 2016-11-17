package fr.uvsq.coo.exo3_3.exercice3_3;

import javax.swing.text.Position;

public class RobotStatique extends Robot{

	public RobotStatique(Position position, Direction direction) {
		super(position, direction);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void tourne(){
		System.out.println("je suis un robot qui sais tourner");
	}
	
	
}
