/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hash;


/**
 *
 * @author JasonDGR
 */


public class DatosTabla {
    private int noRegistros;
    private String[] name;
    private int limite;

    public int getNoRegistros() {
        return noRegistros;
    }

    public void setNoRegistros(int noRegistros) {
        this.noRegistros = noRegistros;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    

    
    public void getSumCode(){
        int x,j, indice, code=0, avoidCol=1;
        int value=0;

        for(j=0; j<noRegistros; j++){
            String name = getName()[j];
            indice=0;
            code=0;
            avoidCol=1;
            for(x=0; x< name.length(); x++){
                value= (name.charAt(x))*avoidCol;
                code += (name.charAt(x))* avoidCol;
                System.out.println(name.charAt(x) + " valor ->" + value);
                avoidCol++;
            }
            indice = code%getLimite();
        
            System.out.println("El indice de "+getName()[j]+ " es -> "+ indice);
        }
    }
    
    public String getIndex(int regPosition){
        int x, index, code=0, avoidCol=1;
        String indice;
        String name = getName()[regPosition];
        
        for(x=0; x<name.length(); x++){
            code += (name.charAt(x))* avoidCol;
            avoidCol++;
        }
        index = code%getLimite();
        indice = "El indice de "+getName()[regPosition]+ " es -> "+ index;
        
        return indice;
    }
    
    public int getIndexInt(int regPosition){
        int x, index, code=0, avoidCol=1;
        
        String name = getName()[regPosition];
        
        for(x=0; x<name.length(); x++){
            code += (name.charAt(x))* avoidCol;
            avoidCol++;
        }
        index = code%getLimite();
        return index;
    }
}
