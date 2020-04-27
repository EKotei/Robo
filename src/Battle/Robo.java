package Battle;
import robocode.ScannedRobotEvent;
import robocode.Robocode;

import java.awt.Color;

import robocode.*;

//Robo uses AdvancedRobot methods
public class Robo extends AdvancedRobot {
	
	//sets colors for robot
	public void run() {
		setBodyColor(Color.pink);
		setGunColor(Color.black);
		setRadarColor(Color.pink);
		setScanColor(Color.pink);
		setBulletColor(Color.pink);
		
			
		
		
		//movement pattern for robot
		while (true) {	
			 					
					 

					
					ahead(100);
					turnGunRight(360);
					scan();
					back(75);
					ahead(150);
					back(150);
					turnRight(90);
					turnGunRight(360);
					scan();
					back(150);
					turnRight(90);
					setTurnRadarLeft(360);
					turnGunRight(360);
					scan();
					
			
	}
			
	
					
		
}

	
//fires a bullet when enemy robot is scanned
	 public void onScannedRobot(ScannedRobotEvent e) {
		 e.getBearingRadians(); 
		  if (getEnergy() > 50) {
			fire(3.0);  
		  }
		  else
		  {
			  fire(1.0);
		  }
		 setTurnRadarRightRadians(getRadarTurnRemainingRadians());
		
	    }
	
		 
	public void onHitByBullet(HitByBulletEvent e){
		turnRight(45);
		back(100);
		turnRight(45);
		ahead(50);
		}							
	

		
		
		
		
	}
		


