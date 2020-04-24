package Battle;
import robocode.ScannedRobotEvent;
import robocode.Robocode;

import java.awt.Color;

import robocode.*;

public class Robo extends Robot {
	
	public void run() {
		setBodyColor(Color.pink);
		setGunColor(Color.black);
		setRadarColor(Color.pink);
		setScanColor(Color.pink);
		setBulletColor(Color.pink);
			
		setAdjustGunForRobotTurn(true);
			
		while (true) {
					ahead(100);
					turnGunRight(360);
					back(75);
					turnGunRight(360);
					ahead(50);
					turnGunRight(180);
					ahead(150);
					turnGunRight(180);
					back(150);
					turnGunRight(180);					
					turnLeft(90);
					ahead(100);
	}	
			 
				 
			
	}		

	 public void onScannedRobot(ScannedRobotEvent e) {
	        fire(3);
	    }
	
		 
	 

}		



