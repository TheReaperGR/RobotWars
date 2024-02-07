

package robotwars;



public class Actor{
    
    private int room;
    private int stamina;
    Colony colony = new Colony();
    
    
    public Actor (){
        
        //may backfire
        
    }
    public Actor(int r, int s){
        
        room=r;
        stamina=s;
        
        
    }
    
    public void leaveRoom(){
        
        room = -1;
        
        
        
    }
    
    
    public void reduceStamina(int amount){
        
       if(stamina-amount<=0){
           leaveRoom();
       }else{
           stamina =-amount;
       }
        
        
    }
    
    public void act(Colony colony){
        
        
        
        
    }
    
    
    
}
