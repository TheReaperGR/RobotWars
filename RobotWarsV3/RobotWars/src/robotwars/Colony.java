/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robotwars;

/**
 *
 * @author any
 */
public class Colony {
    private int energy;
    final private int masterRoom = 0;
    private int[] entryRooms = {};
    private int[] tunnelLenght = {};
    
    
    
    public Colony(){
        //may backfire
    }
    
    public Colony(int tL, int cL, int en){
    
    energy = en;
    entryRooms = new int[cL];
    tunnelLenght = new int [tL];    
    }
    
    public int numTunnels(){
        
        return entryRooms.length;      
    }
    
    
    public int tunnelLength(){
        
        return tunnelLenght.length;    
    }

}
