/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hash;

import hash.DatosTabla;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author JasonDGR
 */
public class TestHash {

    
//    int getIndex[] = {2,9,5,6,2};
    
    public static void main(String[] args) {
        TestHash th = new TestHash();
        Scanner entrada= new Scanner (System.in);
        

        String opcion;
        int multi=1, indice, noRegistro=0;
        boolean colision = false;
        
        String[] claves = new String [' '];
        
        
        int[] getSubIndex = new int [' '];
        
        
        int  x, sum=0, espacio;
        
        
        
        System.out.print ("Ingrese el numero de espacios:  ");
        espacio = entrada.nextInt();
        System.out.println("\n\n");
        
        do{
            multi=1; sum=0; ;
            
        
            System.out.println("Ingrese la clave: ");
            claves[noRegistro] = entrada.next();
            th.procesos(claves[noRegistro], multi, espacio);
            System.out.println("\n");
            System.out.println("\nDesea ingresar mas claves? [y/n]");
            opcion=entrada.next();
            System.out.print("\n\n");
            noRegistro++;
        }while(!"n".equals(opcion));
        
        System.out.println("total de registros "+ noRegistro+"\n"+Arrays.toString(claves));
        
        for(x=0; x<noRegistro; x++){
            getSubIndex[x] = 0;
            
        }
        
        
        System.out.println("Obteniendo index");
        
        
        System.out.println("Index encontrados\n\n");
        
        
        
        do{
            
            
            for(x=0; x<noRegistro; x++){
                indice = th.obtenerIndex(claves[x], espacio);
            
                colision = th.verificarColision(noRegistro, indice, getSubIndex);
                
                if(colision == true){
                    System.out.println("Procesos terminado por colision");
                    
                    break;
                }
                getSubIndex[x] = indice;   
            }
            
            if(colision == true){
                System.out.println("Ingresa un nuevo espacio");
                espacio = entrada.nextInt();
                for(x=0; x<noRegistro; x++){
                    getSubIndex[x] = 0;
                }
            }else{
                colision = false;
            }
            
            
            System.out.println("\n\n");
            
            
        }while(colision!=false);
        
        for(x=0; x<noRegistro; x++){
            System.out.println("el indice de "+claves[x]+" es "+getSubIndex[x]);
        }
        
        
        
    }
    
    public boolean verificarColision(int noRegistro, int indice, int getIndex[]){
        boolean colision = false;
        int i;
        
        for(i=0; i<noRegistro; i++){
            if(indice==getIndex[i]){
                colision = true;
                break;
            }
        }
        
        
        return colision;
    }
    
    
    
    public void procesos(String clave, int multi, int espacio){
        int i,sum=0, letra, indice=0;
        System.out.println("\t\t"+clave+"\n");
        for(i=0;i<clave.length(); i++){
            sum += (clave.charAt(i))*multi;
            System.out.println("Letra:"+clave.charAt(i)+"-->"+  "Valor ASCCI: "+ (letra=clave.charAt(i)));
            multi++;
        }
        System.out.println ("Suma ASCCI : " +sum);
        
        indice = sum%espacio;
        
    }
    
    public int obtenerIndex(String clave, int espacio){
        
        int i,sum=0, letra, indice=0, multi=1;
        
        for(i=0;i<clave.length(); i++){
            sum += (clave.charAt(i))*multi;   
            multi++;
        }
        
        indice = sum%espacio;
        return indice;
    }
    
}
