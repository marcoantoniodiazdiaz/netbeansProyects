/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colascirculares;

import java.util.Scanner;

/**
 *
 * @author 52392
 */
public class Cola {
    Scanner  leer=new Scanner (System.in);
    // Variable contador ini(inicio) y fin (fin) 
    int ini=-1,fin=0,n=5;
    // Variable que guarda los datos del arreglo
    String dat;
    // Metodo agregar por el frente
    // Arreglo para colas circulares 
    String ColaCircular[]= new String[n];
    public void AgregarFrente(){
       
        System.out.println("Inicio:"+ini);
        System.out.println("Fin:"+fin);
        
        if(fin==ini && ini == -1) {
            System.out.println("Cola llena ");
            return;
        }
        
        if (ini == -1) ini ++;
         
        if(ini < n) {
        
            System.out.println("Ingresa un dato");
            dat=leer.next();
            ColaCircular[ini]=dat;
            ini++;

            System.out.println("Inicio:"+ini);
            System.out.println("Fin:"+fin);
       
            Mostrar();
            
      
        } else {
            ini = 0;
            System.out.println("Ingresa un dato");
            dat=leer.next();
            ColaCircular[ini]=dat;
            ini++;
            
            System.out.println("Inicio:"+ini);
            System.out.println("Fin:"+fin);
       
            Mostrar();
        }
    }
    
    public void Mostrar() {
        for (int i = 0; i <=4; i++) {
            if (ColaCircular[i]==null){
                ColaCircular[i]=" ";
            }
        }
        for (int i = 0; i <=4; i++) {
            System.out.println("Dato en la posicion  "+i);
            System.out.println(ColaCircular[i]);
        }
    }
   
    public void Eliminar(){
        
        if(fin<=4){
        ColaCircular[fin]=" ";
         if (ini==4 & fin>=0){
            ini=-1;
        }
       
        System.out.println("Elemento eliminado");
         System.out.println("Inicio:"+ini);
        System.out.println("Fin:"+fin);
         for (int i = 0; i <=4; i++) {
              if(ColaCircular[i]==null){
                  ColaCircular[i]=" ";
              }
       }
               for (int i = 0; i<=4; i++) {
                  System.out.println("Dato en la posicion  "+i);
                  System.out.println(ColaCircular[i]);
              }
                       fin ++;

    }else{
          
           
            System.out.println("Cola vacia");
        }
       
        
}
}
