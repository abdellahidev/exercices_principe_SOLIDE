package fr.uvsq.coo.exo3_3.exercice3_3;

import java.util.ArrayList;

import javax.swing.text.Position;

public class RobotMobile extends Robot{

	public RobotMobile(Position position, Direction direction) {
		super(position, direction);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void tourne(){
		System.out.println("je suis un robot qui sais tourner");
	}
	
	public void avance(){
		System.out.println("je suis un robot qui sais avancer");
	}
	public static void avanceTous(ArrayList<RobotMobile> listrobot){
		for(RobotMobile robot: listrobot){
		robot.avance();
		}
	}
}
