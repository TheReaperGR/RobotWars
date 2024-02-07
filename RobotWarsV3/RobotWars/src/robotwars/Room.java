/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robotwars;
 

public class Room {
     private String RobotType;
     private int SoldiersCount;
     private Boolean RobotExistance = false;

     
     public void InsertRobot(String RT){
         RobotType=RT;
         RobotExistance = true;
           
     }
     public void RemoveRobot(){
         RobotExistance = false;
         RobotType="soul";
     }
     public int SoldiersIncrese(int am){
         SoldiersCount =+ am;
         return SoldiersCount;
         
         
     }
     
      public int SoldiersDecrese(int am){
         SoldiersCount =- am;
         return SoldiersCount;
         
         
     }
 
      
}


