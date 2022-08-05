/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hash;

/**
 *
 * @author JasonDGR
 */
public class pruebacolision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int getIndex[] = {2,8,5,6,2};
        int x,i, indice=5;
        boolean collision = false;
        

            for(i=0; i<5; i++){
                if(indice!=getIndex[i]){
                    collision=false;
                    
                }else{
                    collision=true;
                    break;
                }
                System.out.println("Hay colision? " + collision);
            }
            System.out.println("REsultado final Hay colision? " + collision);
            
            
        }        
}
    

