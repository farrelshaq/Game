
package game;


public class Player {
    String name ;
    int speed, damage, healthPoin, armor; //variabel global
    
    
    void run(){
        System.out.println(name+ " is running... ");
        System.out.println("Speed"+ speed);
    }
    boolean isDead(){
        if(healthPoin <= 0) return true;
        return false;
    
    }
    void attack(String name){
        System.out.println(name+" is attacking ");
        System.out.println("Damage"+ damage);
        
    }
    void defending(){
        System.out.println(name+ " hit -25 ");
        System.out.println("Armor"+ armor);
    }
    void healthPoin(){
        System.out.println(name+ " is full ");
    }
}
    
