package unidad3_colasdobles;

import java.util.*;

public class Unidad3_ColasDobles {

    static Scanner leer = new Scanner(System.in);
    static int frente = -1, fin = -1, max = 3;
    static int[] arreglo = new int[4];

    public static void Insertar() {
        if (fin == max && frente == 0 || (fin + 1) == frente) {
            System.out.println("Arreglo lleno");
        } else{
        if(fin==max){
        fin=0;
        }
        else{
        fin++;
        }
            System.out.println("Ingresa un dato");
        arreglo[fin]=leer.nextInt();
        if(frente==-1){
        frente=0;
        }
        }
    }

    public static void Eliminar() {
        if (frente == -1) {
            System.out.println("Arreglo vacio");
        }else{
        arreglo[frente]=0;
        if(frente==fin){
        frente=-1;
        fin=-1;
        }
        else{
            if(frente==max){
            frente=0;
            }
            else{
            frente++;
            }
        }
        } 
    }



public static void main(String[] args) {
        // TODO code application logic here
        String opc="";
        
        while (!opc.equals("3")){
            System.out.println("Menu de opciones                 ["+arreglo[0]+"]");
            System.out.println("1-Insertar un dato               ["+arreglo[1]+"]");
            System.out.println("2-Eliminar un dato               ["+arreglo[2]+"]");
            System.out.println("3-Finalizar el programa          ["+arreglo[3]+"]1");
            opc=leer.next();
            switch(opc){
                case "1":{
                Insertar();
                }break;
                case "2":{
                Eliminar();
                }break;
                case"3":{
                    System.out.println("Se a finalizado el programa");
                }break;
                default:{
                    System.out.println("Opcion no valida");
                }
            }
        }
    }
    
}

