
package RobotTypes;

import robotwars.Robot;


public class ShooterRobot extends Robot {
    
    
    
     private final int rhp;
     private final int range;
     private final int DAMAGE;
     private final int cooldown;
     
     public ShooterRobot(int tunnelLength){
         
       super.engergyNeeded = 4;
        rhp = 1;
        DAMAGE = 3;
        cooldown = 3;
        range = tunnelLength;
       
   }
    
    
    
}
