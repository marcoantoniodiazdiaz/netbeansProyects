/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colascirculares;

import java.util.Scanner;

/**
 *
 * @author Sandra Barragan Torres 
 */
public class ColasCirculares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner  leer=new Scanner (System.in);
        
        // Mandar llamar la clase con g
        Cola h =new Cola();
        int opc=0;
        do{
        System.out.println("---Menu---");
        System.out.println("1-Agregar  ");
        System.out.println("2-Eliminar ");
        System.out.println("3-Finalizar");
        opc=leer.nextInt();
        switch(opc){
            case 1:
                h.AgregarFrente();
                break;
            
            case 2:
                h.Eliminar();
                break;
           
            case 3:
                System.exit(0);
                break;
        }
        }while(opc!=3);
    }
    
    
}
