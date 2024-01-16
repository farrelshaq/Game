
package game;


public class Game {

  
    public static void main(String[] args) {
        //buat objek
        Player hero = new Player();
        Player enemy = new Player ();
        
        hero.name = "alel";
        hero.speed = 100;
        hero.healthPoin = 100;
        hero.armor = 50;
        hero.damage = 25;
        hero.defending(); //menjalankan program
        
        enemy.name = "ab shadow";
        enemy.speed = 100;
        enemy.healthPoin = 100;
        enemy.armor = 50;
        enemy.damage = 25;
        
        hero.name = "haris";
        hero.kecepatan = ""
        
        
        
        
        hero.run();
        hero.attack(enemy.name);
     
         if(hero.isDead()){
            System.out.println("Game Over :(");
        }
        if(enemy.isDead()){
            System.out.println("Anjay menangg");
        }
        
               hero.name = "Haris";
            
               

               
       

    }
    
}
